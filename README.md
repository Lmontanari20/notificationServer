# notificationServer

This guide is written with the intention of having an SQL database and wanting to create a web API in which a front end can interact with.

It is based off of the below tutorial and Database Scheme: 
  * [Tutorial used for reference](https://spring.io/guides/gs/accessing-data-mysql/)

![New Mockup 2](https://user-images.githubusercontent.com/33431089/57663726-02994500-75aa-11e9-90d9-602b62efe9f9.png)
## Initialize Project

Go to this link to initialize the project files: 
  * [Link to initialize project](https://start.spring.io/)

Once you are at the link select a Maven project, Java Language, Spring Boot version, project metadata, and dependencies. 

Dependencies needed for this project are: 
  * JPA - used for reading MySQL data
  * MySQL - used for connecting to sql database
  * Web - used to create the web application api
  * Rest Repositories - used to allow spring data rest services on the API

Generate the project and unzip the downloaded files to save it on your computer.

You can find dependencies in the pom.xml if you need to add or delete any.

## Connect to the SQL database

Navigate to the resource folder and go to the application.properties file
  * src/main/resources/application.properties
  
Add the code to set the values of:
  * Spring.jpa.hibernate.ddl-auto (none, update, create, create-drop)
  * Spring.datasource.url
  * Spring.datasource.username
  * Spring.datasource.password

## Add the Entity Class

Navigate to src/main/java/”group”.”artifact” and create a new java class
  * This class represents the table in your database
  * The @Entity tells the project the class will be an entity
  * The @Table(name="tablename") tells the project what the table name will be
  * All variables go hand in hand with the table columns
  * All variables need getter and setter methods

## Add Repository Interface

Navigate to src/main/java/”group”.”artifact” and create a new java interface
  * In the same directory create a Java Interface that inherits the CRUD repository class. While given the Entity class     name.
  
## Add Controller

Navigate to src/main/java/"group"."artifact" and create a new java class
  * Adding the @RestController above the class declaration, declares it is a controller
  * Add an instance of the repository interface we just created in the last step.
  * By using the @GetMapping(path=”/pathname”) above a function declaration, you can return the JSON information needed corresponding to that URL.
