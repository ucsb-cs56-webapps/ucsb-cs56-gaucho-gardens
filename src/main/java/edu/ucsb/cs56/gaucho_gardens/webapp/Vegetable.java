package edu.ucsb.cs56.gaucho_gardens.webapp;
import lombok.Data;
import lombok.RequiredArgsConstructor; // generates constructor for fields marked with @NonNull
import lombok.NoArgsConstructor; // @NonNull property ignored by this constructor
import org.springframework.data.annotation.Id;
import lombok.NonNull;
//All undefined methods are defined with lombok.Data
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Vegetable{
	@Id private String id;
	private String text;
	@NonNull private String name;
	//to be replaced with a list of urls or something
	@NonNull private String recipeURL;
	@NonNull private String instructions;
	@NonNull private String season;
	@NonNull private String imageURL;

}
