<!DOCTYPE html>
<html>
 <head>
   <title>Weather/Map</title>
   <#include "head.ftl" />

  <meta name="viewport" content="initial-scale=1.0">
  <meta charset="utf-8">
  <style>
    /* Always set the map height explicitly to define the size of the div
     * element that contains the map. */
    #map {
      height: 100%;
      width: 50%;
    }
    /* Optional: Makes the sample page fill the window. */
    html, body {
      height: 100%;
      margin: 0;
      padding: 0;
    }
  </style>
 </head>

 <body>
   <#include "navbar.ftl" />
   <h1>Weather/Map page</h1>
  <p>Grabs recent weather forecast information for the current area of the user. This information will also be fed to the dashboard
  so the user can plan accordingly.</p>

  <div id="map"></div>
      <script>
        var map;
        function initMap() {
          map = new google.maps.Map(document.getElementById('map'), {
            center: {lat: 34.413963, lng: -119.848946},
            zoom: 8
          });
        }
      </script>
      <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCZwUYbHurkY2_LSSaavdobpIuqlLzUw1c&callback=initMap"
      async defer></script>

    </body>

</html>
