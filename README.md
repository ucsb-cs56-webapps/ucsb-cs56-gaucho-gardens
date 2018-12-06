# ucsb-cs56-gaucho-gardens
Welcome to GauchoGardens

GauchoGardens allows users to gain knowledge of plants that can be grown in the area based on the current season. It provides a list of recommended plants as well as basic information on how to grow these plants. In addition a link to a recipe is given so users can enjoy the fruits of their labor once they harvest their plants. A Weather Map allows users to track the temperature, cloud coverage, and predicted precipitation in their area to assist them in their gardening journey.

Setup Instructions:

Create a Heroku account and setup a new heroku app:
https://ucsb-cs56-f18.github.io/lab/lab06/

create an Mlab account and create a new deployment:
https://ucsb-cs56-pconrad.github.io/topics/mongodb_mlab/

Create an empty database and at aleast one set of user credentials

Install mongodb (needed to import database):
https://docs.mongodb.com/v3.6/installation/

Once mongodb is installed either 
-cd into the installations /bin directory or 
-set a mongo environment variable linking to the bin directory 
https://dangphongvanthanh.wordpress.com/2017/06/12/add-mongos-bin-folder-to-the-path-environment-variable/

then run the following command from your command line:

% mongorestore -h <your deployment info> -d <your dbname> -u <your dbuser> -p <your dbpassword> <input db directory>
  
where -h is your mlab deployment info 
dbuser and dbpass is the one you created in mlab
the input db directory is the directory in the root of the git repository named 'gaucho_gardens_DB_Backup'

for troubleshooting help please utilize the documentation:

https://docs.mlab.com/migrating/

note: the tools tab of your mlab deployment also contains a pre-filled mongorestore that contains your -h and -d values

<br> https://cs56-f18-gauchogardens.herokuapp.com

#For help with credentials 
see the readme <https://github.com/ucsb-cs56-pconrad/spring-boot-github-oauth-demo02>


