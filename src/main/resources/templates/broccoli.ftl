<!DOCTYPE html>
<html>
 <head>
   <title>Broccoli</title>
   <#include "head.ftl" />
   <style>
	   img {
			float: right;
		}
		p{
			text-align: left;
		}
		
	</style>
 </head>
 <body>
   <#include "navbar.ftl" />
	<div style="text-align:left; width:100%; padding:0;">
		<button onclick="goBack()">Go Back</button>
	</div>
   <h1><br>How To Grow Broccoli</h1><br>
       <div class="container" id="jumbotext">
		<div class="jumbotron">
			<img src="pictures/broccoliGrow.jpg" class="img-thumbnail" alt="broccoliGrow" style="width:300px;height:300px;margin-left:15px;">
			<h4> Sowing</h4>
			<p>
				For fall plantings, seed 85 to 100 days before your average first fall frost. If you live in a warm climate, a fall planting is best, as broccoli thrives in cool weather. Plant seeds in mid- to late-summer in most places.
				Plant seeds ½ inch deep, or set transplants slightly deeper than they were grown originally.
			</p>
			<h4>Pricking-off</h4>
			<p>
				Within a row, space your plants 12 to 24 inches apart with 36 inches between each row.
				Space plants 12 to 24 inches apart, depending on the side heads you want to harvest.
			</p>

			<h4>Growing-on</h4>
			<p>
				Fertilize three weeks after transplanting.
				Provide consistent soil moisture with regular watering, especially in drought conditions. Some varieties of broccoli are heat tolerant, but all need moisture.
				Roots are very shallow, do not cultivate. Suffocate weeds with mulch.
				Mulch will also help to keep soil temperatures down.
			</p>
			
			<h4>Harvest</h4>
			<p>
				Harvest broccoli when the buds of the head are firm and tight before the heads flower. If you do see yellow petals, harvest immediately.
				For best taste, harvest in the morning before the soil heats up.
			</p>
		
			<br>
			<br>
				<a id= "link" href="https://cs56-f18-gauchogardens.herokuapp.com/broccolirecipe">Roasted Garlic Lemon Broccoli
				</a>
			<br>
			<br>
		</div>
   </div>
   <script src= "script.js"></script>
 </body>
</html>
