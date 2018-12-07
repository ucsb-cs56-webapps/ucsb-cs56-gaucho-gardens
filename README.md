# ucsb-cs56-gaucho-gardens
Welcome to GauchoGardens

GauchoGardens allows users to gain knowledge of plants that can be grown in the area based on the current season. It provides a list of recommended plants as well as basic information on how to grow these plants. In addition a link to a recipe is given so users can enjoy the fruits of their labor once they harvest their plants. A Weather Map allows users to track the temperature, cloud coverage, and predicted precipitation in their area to assist them in their gardening journey.

Setup Instructions:

Clone the branch labeled "jackie" as this is the most up to date branch

Create a Heroku account and setup a new heroku app:
<br> https://ucsb-cs56-f18.github.io/lab/lab06/

create an Mlab account and create a new deployment:
<br> https://ucsb-cs56-pconrad.github.io/topics/mongodb_mlab/

Create an empty database and at aleast one set of user credentials

Install mongodb (needed to import database):
<br> https://docs.mongodb.com/v3.6/installation/

Once mongodb is installed you need to do one of the following:
<br> -cd into the mongo installations /bin directory       OR
<br> -set a mongo environment variable linking to the bin directory 
<br> https://dangphongvanthanh.wordpress.com/2017/06/12/add-mongos-bin-folder-to-the-path-environment-variable/

then run the following command from your command line:

% mongorestore -h yourhostinfo -d yourdbname -u yourdbuser -p yourdbpassword  input db directory
  
where -h is your host info 
dbuser and dbpass is the one you created in mlab
the input db directory is the directory in the root of the git repository named 'gaucho_gardens_DB_Backup'

for troubleshooting help please utilize the documentation:
<br> https://docs.mlab.com/migrating/

note: the tools tab of your mlab console also contains a pre-filled mongorestore command that contains your -h and -d values

you need to setup your Heroku variables for the database, there are two ways to do this:
via the python file setHerokuEnv.py(you will need to store the values listed below in a file heroku.json, a template heroku.json.SAMPLE is provided)

or input them manually into the heroku console under settings/ Config Vars e.g:
Key: spring.data.mongodb.database Value: Database name 

You need to include all spring boot properties laid out under Typical properties as heroku variables:
https://ucsb-cs56-pconrad.github.io/topics/mongodb_spring_properties/

In order to run your database locally you need to setup a localhost.json file, you can use the localhost.json.SAMPLE file in the
root directory as a template
<br>once your localhost.json file is setup run the env.sh script in order to input the changes before deploying locally
<br>% . env.sh

note: the credentials are located in the oath directory of the repositroy. It currently is just skeleton with no actual functionality
For help with credentials 
see the readme <https://github.com/ucsb-cs56-pconrad/spring-boot-github-oauth-demo02>


<br> https://cs56-f18-gauchogardens.herokuapp.com
