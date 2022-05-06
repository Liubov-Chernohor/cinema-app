# Cinema App 

## It is a simple WEB application that simulates the work of cinema service. 
### *The aplication maintain the CRUD operations, authentication and registration. Based on the role of the user, this application allows to select a cinema, a session, order tickets, add / delete films, etc.* ###

## Endpoints:
- "/register" - permited for all users
- **GET requests:**   1) "/cinema-halls", "/movies", "/movie-sessions/available") permited for ADMIN and USER<br />
		      2) "/orders", "/shopping-carts/by-user" -  permited for USER<br />
		      3) "/users/by-email" -  permited for ADMIN  			 
- **POST requests:**   1) "/cinema-halls","/movies", "/movie-sessions" - permited for ADMIN<br /> 
                       2) "/orders/complete" - permited for USER<br />					 
- **PUT requests:**    1) "/movie-sessions/{id}" -  permited for ADMIN<br /> 
                       2) "/shopping-carts/movie-sessions" - permited for USER<br />		 
- **DELETE request:**   "/movie-sessions/{id}" - permited for ADMIN


## Project structure (3-layer architecture):

- **Controllers** - Presentation layer
- **Service** - Application logic layer
- **DAO** - Data access layer

## Technologies:

- Java 11
- Spring MVC
- Spring Security
- Hibernate
- Apache Tomcat 9.0.60
- Apache Maven
- MySQL
- Checkstyle plugin

## Steps to run a project
- install MySQL ;
- install and configure Apache Tomcat version 9 for your IDE;
- onfigure /src/main/resources/db.properties with your DB_URL, USERNAME, PASSWORD;
- You already have two registered users: 1) login - admin@i.ua, password - admin123 (ROLE_ADMIN;<br />
                                         2) login - user@i.ua, password - user123 (ROLE_USER).
- Go ahead and just try it!



      
