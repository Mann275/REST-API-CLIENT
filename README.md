# REST-API-CLIENT - WEATHER DATA FETCHER

**COMPANY:** CODTECH IT SOLUTIONS  
**NAME:** PATEL MANN  
**INTERN ID:** CT04DM113  
**DOMAIN:** JAVA PROGRAMMING  
**DURATION:** 4 WEEKS  
**MENTOR:** NEELA SANTOSH  

---

## TASK DESCRIPTION

This Java program fetches real-time weather data for any city entered by the user by consuming the OpenWeatherMap REST API. It demonstrates how to:

- Read user input via the console
- Make HTTP GET requests using Java's `HttpClient`
- Parse JSON responses with the `org.json` library
- Handle API errors gracefully
- Display weather details like temperature, humidity, and description

The program is a practical example of API integration and JSON handling in Java.

---

## SETUP: Downloading and Adding `org.json` Library

1. Download the `json-20210307.jar` from the official Maven repository or here:

   [https://repo1.maven.org/maven2/org/json/json/20210307/json-20210307.jar](https://repo1.maven.org/maven2/org/json/json/20210307/json-20210307.jar)

2. Save the `json-20210307.jar` file into your project directory, for example `C:\JAVA\Codtech_Tasks-2\`.

3. When compiling and running your program, include the jar in the classpath:

   - **Compile:**
     ```
     javac -cp .;json-20210307.jar RestApiClient.java
     ```
   - **Run:**
     ```
     java -cp .;json-20210307.jar RestApiClient
     ```

*Note:* If you use PowerShell on Windows, replace `;` with `:` or use quotes as needed:  
javac -cp ".;json-20210307.jar" RestApiClient.java  
java -cp ".;json-20210307.jar" RestApiClient  

---

## Output

![Image](https://github.com/user-attachments/assets/9ca65137-10e9-409f-9a26-885820257f44)

---

## CONCLUSION

This project provided practical experience in Java HTTP communication, JSON parsing, and error handling, essential skills for backend or API-focused development. It demonstrates how to consume external REST APIs effectively in Java.

---
