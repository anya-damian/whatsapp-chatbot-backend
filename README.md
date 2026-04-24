# WhatsApp Chatbot Backend Simulation

This is a simple WhatsApp chatbot backend simulation built with **Java and Spring Boot**. It exposes a webhook to receive simulated WhatsApp messages in JSON format and responds with predefined replies.

## Features
- **REST API Endpoint:** `/webhook` endpoint to accept `POST` requests.
- **JSON Input:** Accepts JSON payloads containing the user's message.
- **Predefined Replies:** 
  - `Hi` -> `Hello`
  - `Bye` -> `Goodbye`
- **Logging:** Logs all incoming messages.
- **Docker Support:** Includes a `Dockerfile` for easy deployment to cloud platforms like Render.

## API Usage
**Endpoint:** `POST /webhook`

**Request Body Example:**
```json
{
  "message": "Hi",
  "sender": "User123"
}
```

**Response Example:**
```json
{
  "reply": "Hello"
}
```

## Running Locally
1. Ensure Java 21 is installed.
2. Run the application using the Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```
3. The server will start on `http://localhost:8080`.

## Deployment
This project includes a `Dockerfile` and is ready to be deployed on platforms like [Render.com](https://render.com/). Just connect your GitHub repository to Render as a "Web Service", and it will automatically build and deploy the container.
