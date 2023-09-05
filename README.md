# Tendable automation Project

This project showcases automated testing using Selenium WebDriver, written in Java and executed with JUnit.
It includes test scripts to validate the functionality of "Tendable" web application.

## Prerequisites

Before running the tests, ensure you have the following prerequisites installed:

- **Java**: [Download and install Java](https://www.oracle.com/java/technologies/javase-downloads.html) (JDK 8 or later).
- **JUnit**: [JUnit](https://junit.org/junit4/) is included as a dependency in the project, so you don't need to install it separately.
- **Maven**: [Maven](https://maven.apache.org/download.cgi) for managing project dependencies (Optional, if you want to use Maven for building).

## Getting Started

1. Clone this repository to your local machine:
   git clone https:
   
## Project Structure
src/main/java: Java source code for the application under test.
src/test/java: Test scripts organized by functionality or module.
drivers: Store the WebDriver executable for your chosen browser.
pom.xml: Maven project configuration file.
README.md: You are here!
   
## Running the Tests

To execute the automated tests, follow these steps:

1. Open the src/test/java directory to find the test classes.

2. Right-click on a specific test class or package and choose "Run" to execute the tests.

OR

1. Use the following Maven command to run the tests: mvn test {test_name}


## Test Strategy
For this project, the test strategy includes:

 1. Test Case Design: Define test cases based on the application's functionality, ensuring comprehensive coverage.
 2. Page Object Model (POM): Implement the Page Object Model design pattern to maintain test scripts and web elements separately.
 3. Test Data Preparation: Prepare necessary test data or utilize 'RandomStringUtils' for dynamic test data.
 4. Selenium WebDriver Setup: Configure Selenium WebDriver in 'BrowserPage' with desired capabilities and options.
 5. Test Execution: Write test scripts using Selenium WebDriver to interact with the application, perform actions, and make assertions.
 6. JUnit Assertions: Utilize JUnit assertions to validate test outcomes.
