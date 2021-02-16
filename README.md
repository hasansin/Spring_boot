# Preason_Spring_boot
backend


Spring Boot, MySQL, JPA, Hibernate Rest API Tutorial
Build Restful CRUD API for a simple country managing application using Spring Boot, Mysql, JPA and Hibernate.

Requirements
Java - 1.8.x

Maven - 3.x.x

Mysql - 5.x.x

Steps to Setup
1. Clone the application

   git clone https://github.com/hasansin/Preason_Spring_boot.git

2. Create Mysql database

  create database country

3. Change mysql username and password as per your installation

   open src/main/resources/application.properties

   change spring.datasource.username and spring.datasource.password as per your mysql installation

4. Build and run the app using using run as #Spring boot Applicaion option

The app will start running at http://localhost:8080.

Explore Rest APIs
The app defines following CRUD APIs.


GET 'http://localhost:8080/rest/v2/country_list' - get all details pf country

POST http://localhost:8080/rest/v2/create -  create new Country
 
PUT http://localhost:8080/rest/v2/update/{id} - update existing ccountry object

DELETE http://localhost:8080/rest/v2/deletecountry/{id} - delete country object


You can test them using postman or any other rest client.
