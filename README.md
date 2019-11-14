# MicroServices Spring Boot with docker "IderHospital"
![alt text](https://www.red-gate.com/simple-talk/wp-content/uploads/2017/09/word-image-59.png)


The project contains 4 microservices and Zuul gateway and an Eureka server placed in a docker container .


1/Patients microservice
2/Rooms microservice
3/Operation microservice
4/Staff microservice

Description:
manage patient : add patient to the system / delete patient from the system / update patient info
manage staff :  doctors and other staff management / departement management  /vacation management and contrat management 

-patient microservice is specialized in adding patient to the system and offer the opportunity to update or delete them from the system
-staff microservice is specialized in adding doctor and staff members to the system ,departement ,vacation ,contrat
-Room microservice is specialized in adding new rooms ,place patient in room and reserve rooms for operations
-operation microservice is specialized in the management of the operations (doctors who will do the operation with their patients ..)

all microservices are in one container docker  and they all use  api from each other :

patient microservice with staff microservice 
room wih operation
patient and operation 
staff and operation 
sof they can offer all the features to the user of this application.
