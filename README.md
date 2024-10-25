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
### 2. Navigate to the Project Directory
Change to the project directory:
```bash
cd firstapp
```
### 3. Build the Project
Use Maven to build the project. This will compile the code and download any necessary dependencies specified in the pom.xml file:
```bash
mvn clean install
```
### 4. Run the Application
You can run the application by executing the App class. If you have a main method in your App class, use the following command:
```bash
mvn exec:java -Dexec.mainClass="com.solo.sahej.App"
```
### 5. Run the Tests
To run the unit tests and verify that everything is functioning correctly, use:
```bash
mvn test
```
## Screenshot

![Vs code image](https://github.com/sk0990670/Catalog-Assignment/blob/main/Screenshot%202024-10-25%20122025.png)
### Test Case Output for testLagrangeInterpolation
To run the test cases defined in your AppTest.java file, you'll need to execute them using Maven. Here's how you can do that and what to expect as output:

### Running the Tests
Open a Terminal: Make sure you're in the root directory of your project (where the pom.xml file is located).

Run the Tests: Execute the following command:
```bash
mvn test
```
### Expected Output
When you run the tests, you should see an output similar to the following in your terminal:
```bash
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------< com.solo.sahej:firstapp >-------------------
[INFO] Building firstapp 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.0.2:resources (default-resources) @ firstapp ---
[INFO] --- maven-compiler-plugin:3.10.1:compile (default-compile) @ firstapp ---
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ firstapp ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO] T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.solo.sahej.AppTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 s - in com.solo.sahej.AppTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] --- maven-jar-plugin:3.0.2:jar (default-jar) @ firstapp ---
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ firstapp ---
[INFO] --- maven-deploy-plugin:2.8.2:deploy (default-deploy) @ firstapp ---
[INFO] 
[INFO] BUILD SUCCESS
[INFO] 
[INFO] Total time:  5.678 s
[INFO] Finished at: 2024-10-25T12:34:56+05:30
[INFO] ------------------------------------------------------------------------
```

### The output of the second test case, testFindConstantTerm
To specifically see the output of testFindConstantTerm, you can run the tests again using Maven as follows:

Open a Terminal: Ensure you are in the root directory of your project.

Run the Tests: Use the command:
```bash
mvn test
```
### Expected Output
When running the tests, if testFindConstantTerm passes, you would see output similar to this:
```bash
[INFO] Running com.solo.sahej.AppTest
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.123 s - in com.solo.sahej.AppTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] BUILD SUCCESS
```


