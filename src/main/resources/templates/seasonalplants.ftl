<!DOCTYPE html>
<html>
 <head>
   <title>Seasonal Plants</title>
   <#include "head.ftl" />
   <meta name="viewport" content="width=device-width, initial-scale=1">

 </head>
 <body>
   <#include "navbar.ftl" />
   <h1>Seasonal Plants</h1>
   <h3>Current Season: Winter</h3>

 <#list plants as plant>
 <!--template, replaces plant name and picture with the object variables  -->
<br>
 <a href="/vegetable?name=${plant.name}">
  <#if (plant.imageURL) ??>
	  <img src="${plant.imageURL}" class="img-thumbnail" alt="${plant.name}"  width="200" height="156"></img>
	</#if>
	<p><h5>${plant.name}</h5></p>

 </a>

 <br>

 </#list>

 </body>
</html>
