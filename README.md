
# 📱Contacts

Team Members:

1.Arpita Avadhut Kulkarni 

Mail:- arpitakulkarnii2212@gmail.com

2.Akanksha Laxman More

Mail:-akankshalm810@gmail.com

3.Afrin Farukh Shaikh

Mail:-shaikhafrin1607@gmail.com

# 👨‍🏫👩‍🏫 Student Management System –  Console Project
The Student Management System – Java Console Project using REST API is a simple Java-based application that allows users to perform CRUD operations (Create, Read, Update, Delete) on student records via a console interface. It interacts with a backend REST API to manage student data, such as names, IDs, and grades. This project demonstrates the integration of Java with RESTful web services and is ideal for learning API communication and basic data handling.

#Project Structure
StudentManagementSystem/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── sms/
│   │   │   │       ├── model/
│   │   │   │       │   └── Student.java          
│   │   │   │       ├── service/
│   │   │   │       │   └── ApiService.java       
│   │   │   │       └── App.java                 
│   └── resources/
│       └── config.properties                     
│
├── pom.xml or build.gradle                       
└── README.md                                     

# ✨ Features

 Add Student – Register new students and send data to the backend via REST API (POST).

 View Students – Retrieve and display all or individual student records (GET).

 Update Student – Edit existing student information using the API (PUT).

 Delete Student – Remove a student from the system (DELETE).

 REST API Integration – Uses HTTP methods for seamless communication between client and server.

 # 💻 Technologies Used

 ☕ Java – Core programming language for building the console-based client.

🌐 RESTful API – For performing CRUD operations over HTTP.

🔗 Java HTTP Client (HttpURLConnection / HttpClient) – To send and receive API requests.

🧱 JSON – Data format used for request/response payloads.

📦 Maven / Gradle – Build tools to manage dependencies (e.g., Jackson for JSON parsing).

🧪 Postman (Optional) – For testing REST endpoints during development.

# 📦 Dependencies

<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.example</groupId>
        <artifactId>demo</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
</dependencies>
<dependency> 
</dependency>

## 🗃️ Database Tables
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    course VARCHAR(100) NOT NULL,
    age INT,
    registration_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

## 📸 Final Output


![src1](https://github.com/user-attachments/assets/370b9c98-5929-49ba-a27c-0e9db8dd523c)



<img width="917" height="246" alt="1" src="https://github.com/user-attachments/assets/ba479f42-04aa-470c-9368-a17610651ea3" />
