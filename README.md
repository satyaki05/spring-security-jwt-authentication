# spring-security-jwt-authentication
A production-style authentication and authorization backend built using Spring Boot, Spring Security, JWT, and MariaDB.
This project demonstrates stateless authentication, secure password handling, and API protection using industry best practices.

Overview

This application provides:

Secure user registration and authentication

JWT-based stateless authorization

Protected REST endpoints

Database-backed user management

It is designed to clearly demonstrate how Spring Security works internally with JWT.

Key Features

User registration and login

Password hashing using BCrypt

JWT token generation and validation

Custom security filter for request authentication

Stateless session management

Role-ready architecture (extensible)

MariaDB integration with JPA/Hibernate

Technology Stack

Java

Spring Boot

Spring Security

JWT (jjwt)

Hibernate / JPA

MariaDB

Maven


Authentication Workflow

User Registration

Client submits user details

Password is securely encrypted

User data is persisted in database

User Login

Credentials are authenticated by Spring Security

A signed JWT is generated and returned

Accessing Protected Resources

Client sends JWT in Authorization header

JWT filter validates token and user identity

SecurityContext is populated for the request

Access is granted to protected endpoints

API Endpoints
Public Endpoints
Method	Endpoint	Description
POST	/auth/signup	Register new user
POST	/auth/login	Authenticate user and return JWT
Secured Endpoints
Method	Endpoint	Description
GET	/test/secure	Requires valid JWT
Request Example

Authorization Header

Authorization: Bearer <JWT_TOKEN>

Database Setup

Create database:

CREATE DATABASE security_db;


Configure credentials in:

application.properties


An example configuration file is provided:

application-example.properties

Security Design Notes

Stateless authentication (no HTTP sessions)

JWT validation on every request

CSRF disabled (not required for JWT)

Passwords never stored in plain text

Best Practices Followed

Separation of concerns

Clean layered architecture

Secure cryptographic standards

Token-based authorization

Environment-specific configuration handling

Satyaki De
Backend Developer | Spring Boot

License

This project is for educational and learning purposes.
