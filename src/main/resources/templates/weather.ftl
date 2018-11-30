<!DOCTYPE html>
<html>
 <head>
   <title>Weather/Map</title>
   <#include "head.ftl" />
  <meta name="viewport" content="initial-scale=1.0">
  <meta charset="utf-8">

  <link rel="stylesheet" type="text/css" href="../leaflet/leaflet.css" />
  <script type="text/javascript" src="../leaflet/leaflet.js"></script>
  <link rel="stylesheet" type="text/css" href="../leaflet/leaflet-openweathermap.css" />
  <script type="text/javascript" src="../leaflet/leaflet-openweathermap.js"></script>

  <style>
     body {
         padding: 0;
         margin: 0;
     }
     html, body, #map {
         height: 100%;
         width: 100%;
     }
  </style>
 </head>

 <body>
   <#include "navbar.ftl" />
   <h1>Weather/Map page</h1>
  <p>Check the weather! Check temperature, rain and windspeed to see if you should take your plants indoors or leave them outside!</p>


  <div id="map"></div>

  <script>
  /*I apologize in advance for the poor soul who has to maintain this mess after me. If anyone knows
  anything about frontend dev, pls throw this code into an incinerator and replace it with something less unsightly*/

  var weatherkey='28b6782e9e3fed333a392da42eb26f3a'
  var osm = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
  	maxZoom: 13, attribution: '&copy; <a href="https://www.openstreetmap.org/copyright" target="_blank">OpenStreetMap</a> contributors</a>'});

  var clouds = L.OWM.clouds({showLegend: false, opacity: 0.5, appId: weatherkey});
  var rain = L.OWM.rain({opacity: 0.5, appId: weatherkey});
  var temp = L.OWM.temperature({opacity: 0.5, appId: weatherkey});
  var wind = L.OWM.wind({opacity: 0.5, appId: weatherkey});

  var map = L.map('map', { center: new L.LatLng(34.413963, -119.848946), zoom: 25, layers: [osm] });
  var baseMaps = { "OSM Standard": osm };
  var overlayMaps = { "Clouds": clouds,"Rain": rain, "Temperature (C)": temp, "Wind": wind};
  var layerControl = L.control.layers(baseMaps, overlayMaps).addTo(map);

  </script>



    </body>

</html>
