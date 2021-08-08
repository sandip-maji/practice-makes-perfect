# Getting Started

### Kafka
For further reference, please consider the following sections:

This Kafka installation comes with an inbuilt zookeeper. 
Zookeeper is mainly used to track status of nodes present in Kafka cluster and also to keep track of Kafka topics, messages, etc.


1.	Open a command prompt and start the Zookeeper-
		G:\Tool\kafka\kafka_2.13-2.8.0\bin\windows\zookeeper-server-start.bat G:\Tool\kafka\kafka_2.13-2.8.0\config\zookeeper.properties

2.	Open a new command prompt and start the Apache Kafka-
		G:\Tool\kafka\kafka_2.13-2.8.0\bin\windows\kafka-server-start.bat G:\Tool\kafka\kafka_2.13-2.8.0\config\server.properties

3.	Open a new command prompt and create a topic with name barcelona-topic, that has only one partition & one replica.
		G:\Tool\kafka\kafka_2.13-2.8.0\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic barcelona-topic
		
4.	Next Open a new command prompt and create a producer to send message to the above created maji-topic and send a message - Hello Barcelona !!
		G:\Tool\kafka\kafka_2.13-2.8.0\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic barcelona-topic Hello Barcelona !!
		
5.	Finally Open a new command prompt and start the consumer which listens to the topic barcelona-topic we just created above. We will get the message we had sent using the producer
		G:\Tool\kafka\kafka_2.13-2.8.0\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic barcelona-topic --from-beginning
		
6. show List of topic : 		
G:\Tool\kafka\kafka_2.13-2.8.0\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181

7. Call from browser : http://localhost:8080/kafka/producer?message=Lionel%20Messi



