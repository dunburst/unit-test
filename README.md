# Advanced Testing with JUnit

## Project Overview

This project demonstrates the implementation and testing of three common algorithms using Java and JUnit 5. The focus is on achieving robust testing through different types of test cases and ensuring high code coverage.

### Implemented Algorithms:

1. Finding prime numbers in a range [a, b].
2. Sorting an array using the QuickSort algorithm.
3. Finding the shortest path in a graph using Dijkstra's algorithm.

## Project Structure

- `src/main/java`: Contains the source code for the algorithms.
- `src/test/java`: Contains the JUnit 5 test cases for the algorithms.

## Prerequisites

Java 8 or later
A build tool like Maven
Visual Studio Code (VSCode) with the Java Extension Pack installed

## Running the Tests

To run the JUnit tests:

```bash
$ mvn test
```


## Viewing Test Coverage

Test coverage is measured using the Jacoco plugin.

1. Run the following command to generate a coverage report:
   ```bash
   $ mvn jacoco:report
   ```
2. Open the generated HTML report located in the `target/site/jacoco` directory.

## Code Overview

### Prime Number Algorithm

#### Code

![image](https://github.com/user-attachments/assets/b1c8d2c0-ea4d-4699-91e5-a129054b0d7b)


#### Running Tests
This project includes unit tests written using JUnit 5. To run the tests:

1.Ensure JUnit 5 is configured in your project (e.g., via Maven or Gradle).

 - Maven dependency:
     ```xml
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>
  
    <groupId>com.example</groupId>
    <artifactId>unit-test</artifactId>
    <packaging>jar</packaging>
    <version>1.0-SNAPSHOT</version>
    <name>unit-test</name>
    <url>http://maven.apache.org</url>
  
    <dependencies>
      <!-- JUnit 5 -->
      <dependency>
          <groupId>org.junit.jupiter</groupId>
          <artifactId>junit-jupiter</artifactId>
          <version>5.10.0</version>
          <scope>test</scope>
      </dependency>
    </dependencies>
  
    <build>
      <plugins>
        <!-- Plugin JaCoCo -->
        <plugin>
          <groupId>org.jacoco</groupId>
          <artifactId>jacoco-maven-plugin</artifactId>
          <version>0.8.8</version>
          <executions>
            <execution>
              <goals>
                <goal>prepare-agent</goal> <!-- Chuẩn bị cho việc đo coverage -->
              </goals>
            </execution>
            <execution>
              <id>report</id>
              <phase>test</phase> <!-- Sinh báo cáo coverage sau khi test -->
              <goals>
                <goal>report</goal>
              </goals>
            </execution>
          </executions>
        </plugin>
      </plugins>
    </build>
  
    </project>

     ```
   2. Write unit tests in the AppTest class. Example:
   
  ![image](https://github.com/user-attachments/assets/03816fb2-b306-4268-9ca3-bc794cabd1d2)

  3. Alternatively, you can run the tests via the terminal:

   ```bash
   mvn clean test
   ```
  ### Sample Test Output
  The results will have the coverage report in the target/site/jacoco/index.html directory. Open this file in a browser to view a detailed report on the test coverage.
  ![image](https://github.com/user-attachments/assets/8d5a7575-f205-4fb4-89d7-023df9d2f3c0)

  link chatgpt: 
  https://chatgpt.com/share/677bc430-0bf0-800f-8da4-17ff07d878b9


      


