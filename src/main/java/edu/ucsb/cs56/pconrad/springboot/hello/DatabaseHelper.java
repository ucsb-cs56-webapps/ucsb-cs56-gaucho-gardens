package edu.ucsb.cs56.pconrad.springboot.hello;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.api.core.ApiFuture;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class DatabaseHelper{
	
	private FirestoreOptions firestoreOptions;
	private Firestore db;
	public static final String PROJECTID = "gauchogardensdb";

	public DatabaseHelper(){
		/*
		firestoreOptions = FirestoreOptions.getDefaultInstance().toBuilder()
        .setProjectId(PROJECTID)
        .build();
		db = firestoreOptions.getService();
		*/
		InputStream serviceAccount = new ByteArrayInputStream(getFireBaseCredentials().getBytes("UTF-8"));
  	GoogleCredentials credentials = GoogleCredentials.fromStream(serviceAccount);
  	FirebaseOptions options = new FirebaseOptions.Builder()	
    	.setCredentials(credentials)	
    	.build();	
   FirebaseApp.initializeApp(options);
   Firestore db = FirestoreClient.getFirestore();
}

	public void writeNewVegetable(Vegetable veg){
		DocumentReference docRef = db.collection("vegetables").document(veg.getName());
		
		Map<String, Object> data = new HashMap<>();
		data.put("name", veg.getName());
		data.put("color", veg.getColor());
		data.put("season", veg.getSeason());
		data.put("imageURL", veg.getImageURL());

		ApiFuture<WriteResult> result = docRef.set(data);

	}
	@Override
	public String toString(){
		ApiFuture<QuerySnapshot> query = db.collection("vegetables").get();
		String s = "";
		try{
		QuerySnapshot querySnapshot = query.get();
		List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
		for (QueryDocumentSnapshot document : documents) {
			s += ("ID: " + document.getId());
			s += (" Name: " + document.getString("name"));
			s += (" Color: " + document.getString("color"));
			s += (" Season: " + document.getString("season"));
			s += (" ImageURL: " + document.getString("imageURL"));
			s += "\n";
		}	
		return s;
		} catch(InterruptedException e)	{}
		  catch(ExecutionException e){}
		  return s;
	} 

	public Vegetable readVegetable(String vegName){
		try{
		DocumentReference docRef = db.collection("vegetables").document(vegName);
		ApiFuture<DocumentSnapshot> future = docRef.get();
		DocumentSnapshot document = future.get();
		if (document.exists()) {
		  return new Vegetable(document.getString("name"), document.getString("color"),
							document.getString("season"), document.getString("imageURL") );
		} else {
		  System.out.println("No such document!");
		}
		/*
		ApiFuture<QuerySnapshot> query = db.collection("vegetables").get();
		try{
		QuerySnapshot querySnapshot = query.get(vegName);
		List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
		return new Vegetable(document.getString("name"), document.getString("color"),
							document.getString("season"), document.getString("imageURL") );
		} catch(InterruptedException e)	{}
		  catch(ExecutionException e){}*/
		}catch(InterruptedException e)	{}
		  catch(ExecutionException e){}
		return new Vegetable("ERROR", "ERROR","ERROR", "ERROR");
	}
	//for testing, use by running 
	//mvn exec:java -D"exec.mainClass"="edu.ucsb.cs56.pconrad.springboot.hello.DatabaseHelper"
	
	public static void main(String[] args){
	//	Vegetable v = new Vegetable("brocolli", "green", "summer", "c.jpg");
		DatabaseHelper db = new DatabaseHelper();
	//	db.writeNewVegetable(v);
		System.out.println(db.toString());
		Vegetable squash = db.readVegetable("Squash");
		System.out.println(squash.toString());
	}

	public static String getFireBaseCredentials() {
        ProcessBuilder processBuilder = new ProcessBuilder();	
        if (processBuilder.environment().get("FIREBASE_JSON") != null) {
            return processBuilder.environment().get("FIREBASE_JSON");
        }
	throw new RuntimeException("no FireBase Credential found.");
    }

}
