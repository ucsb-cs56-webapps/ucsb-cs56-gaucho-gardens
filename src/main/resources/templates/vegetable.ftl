<!DOCTYPE html>
<html>
 <head>
   <title>Seasonal Plants</title>
   <#include "head.ftl" />
   <meta name="viewport" content="width=device-width, initial-scale=1">

 </head>
 <body>
   <#include "navbar.ftl" />

 <!--template, replaces plant name and picture with the object variables  -->

	<h1>${plant.name}</h1>


  <#if (plant.imageURL) ??> 
	  <img src="${plant.imageURL}" class="img-thumbnail" alt="${plant.name}"  width="200" height="156"></img>	
	</#if> 

	<#if (plant.text) ??>
		${plant.text}
	</#if>

	<#if (plant.recipeURL) ??>
		<a href= "${plant.recipeURL}">Recipe Link</a>
	</#if>
 <br>
 <br>


<!--	<a href="https://cs56-f18-gauchogardens.herokuapp.com/cucumber">
		<img src="pictures/cucumber.jpg" class="img-thumbnail" alt="cucumber"  width="200" height="156"></img>
	</a>
	<br>
	<br>

	<a href="https://cs56-f18-gauchogardens.herokuapp.com/beet">
		<img src="pictures/beet.jpg" class="img-thumbnail" alt="beet"  width="200" height="156"></img>
	</a>
	<br>
	<br>

	<a href="https://cs56-f18-gauchogardens.herokuapp.com/broccoli">
		<img src="pictures/broccoli.jpeg" class="img-thumbnail" alt="broccoli"  width="200" height="156"></img>
	</a>
	<br>
	<br>
-->


 </body>
</html>
