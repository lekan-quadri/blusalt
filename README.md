# blusalt

The Billing service is run first:
Use docker-compose to launch kafka, postgres db & billing service

Then these may follow:
run customer service on docker
run worker service on docker


call customer service
	which inturn calls the billing service
billing service inserts into db then drop on kafka topic
worker picks from kafka topic then updates records on db
