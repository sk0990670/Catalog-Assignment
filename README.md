# FirstApp

This is a Java application that implements Lagrange interpolation and provides methods for parsing JSON data to extract points for interpolation. The application also includes unit tests to validate its functionality.

## Overview

The project consists of the following main components:
- **Lagrange Interpolation**: A method to find the value of a polynomial at a given point using known values.
- **JSON Parsing**: Uses the Gson library to read and interpret JSON data.
- **Unit Tests**: JUnit 5 is used to ensure the correctness of the methods.

## Prerequisites

Before you begin, ensure you have the following installed:
- Java Development Kit (JDK) 21 or higher
- Apache Maven
- An IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor
- Git (optional, for cloning the repository)

## Getting Started

### 1. Clone the Repository

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/<your-username>/firstapp.git
```
#2. Navigate to the Project Directory
Change to the project directory:
```bash
cd firstapp
```
#3. Build the Project
Use Maven to build the project. This will compile the code and download any necessary dependencies specified in the pom.xml file:
```bash
mvn clean install
```
#4. Run the Application
You can run the application by executing the App class. If you have a main method in your App class, use the following command:
```bash
mvn exec:java -Dexec.mainClass="com.solo.sahej.App"
```
#5. Run the Tests
To run the unit tests and verify that everything is functioning correctly, use:
```bash
mvn test
```
To run the test cases defined in your AppTest.java file, you'll need to execute them using Maven. Here's how you can do that and what to expect as output:

#Running the Tests
Open a Terminal: Make sure you're in the root directory of your project (where the pom.xml file is located).

Run the Tests: Execute the following command:
