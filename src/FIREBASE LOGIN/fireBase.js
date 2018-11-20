var app_fireBase = {};
(function(){


  // Initialize Firebase
  var config = {
    apiKey: "AIzaSyAHqW70DzhciKaeKJE-pbAtUxEBl0Sf4Q0",
    authDomain: "gauchogardensdb.firebaseapp.com",
    databaseURL: "https://gauchogardensdb.firebaseio.com",
    projectId: "gauchogardensdb",
    storageBucket: "gauchogardensdb.appspot.com",
    messagingSenderId: "833754351474"
  };
  firebase.initializeApp(config);
  app_fireBase = firebase;

})()

