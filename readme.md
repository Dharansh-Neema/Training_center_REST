# REST API's for Training Center

## Overview
This project is built using Spring Boot and MongoDB. The application exposes RESTful APIs to:
- **Create a Training Center:** `POST /api/v1/create/training-center`
- **Retrieve All Training Centers:** `GET /api/v1/get/all/training-center`
- **Search Training Centers by Name:** `GET /api/v1/search/training-center?name={centerName}`

## Project Structure
The project follows a layered architecture with clear separation of concerns:
- **config:** MongoDB configuration and application settings.
- **controller:** REST controllers exposing API endpoints.
- **exception:** Custom exception handling and error response definitions.
- **model:** Domain models (TrainingCenter, Address, etc.).
- **dao/repository:** Data access interfaces using Spring Data MongoDB.
- **service:** Business logic and service layer implementations.

## Setup Instructions (Local)
1. **Clone the Repository:**
   ```bash
   git clone https://github.com/Dharansh-Neema/Backend_Traini8_Dharansh
   cd Backend_Traini8_Dharansh
   ```


2. **Build the Project:**
   Use Maven to build the project:
   ```bash
   mvn clean install
   ```

3. **Run the Application:**
   You can run the application either by executing the jar or directly from your IDE:
   ```bash
   mvn spring-boot:run
   ```

[//]: # (5. **Using Docker:**)

[//]: # (   A Dockerfile is provided to containerize the application.)

[//]: # (    - **Build the Docker image:**)

[//]: # (      ```bash)

[//]: # (      docker build -t traini8-backend .)

[//]: # (      ```)

[//]: # (    - **Run the Docker container &#40;exposing port 8097&#41;:**)

[//]: # (      ```bash)

[//]: # (      docker run -p 8097:8097 traini8-backend)
      
4. **Testing with Postman:**
   A Postman collection is included in the repository  to help test the API endpoints. Import the collection into Postman and run the available requests.

[//]: # (## API Endpoints)

[//]: # (- **POST /api/v1/create/training-center**  )

[//]: # (  Create a new training center with validated input.)

[//]: # ()
[//]: # (- **GET /api/v1/get/all/training-center**  )

[//]: # (  Retrieve all training centers stored in the database.)

[//]: # ()
[//]: # (- **GET /api/v1/search/training-center?name={centerName}**  )

[//]: # (  Search for training centers by a partial or full name &#40;case-insensitive&#41;.)

## Screenshots
Below are some screenshots from Postman demonstrating the API responses:

- **Create Training Center:**
  ![POST API Output](https://github.com/Dharansh-Neema/Backend_Traini8_Dharansh/blob/main/image/POST_training.png)

- **Get All Training Centers:**
  ![GET API Output](https://github.com/Dharansh-Neema/Backend_Traini8_Dharansh/blob/main/image/get_training.png)

- **Search Training Center:**
  ![Search API Output](https://github.com/Dharansh-Neema/Backend_Traini8_Dharansh/blob/main/image/search.png)
