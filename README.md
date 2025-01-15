# Advanced Testing with JUnit

## Project Overview

This project demonstrates the implementation and testing of three common algorithms using Java and JUnit 5. The focus is on achieving robust testing through different types of test cases and ensuring high code coverage.

### Implemented Algorithms:

1. Finding prime numbers in a range [a, b].
2. Sorting an array using the QuickSort algorithm.
3. Finding the shortest path in a graph using Dijkstra's algorithm.

## Project Structure

- **`src/main/java`**: Contains the main source code for the project.
  - `MathUtils.java`: A utility class for mathematical operations, including prime number checking.
- **`src/test/java`**: Contains JUnit 5 test cases for validating the functionality and edge cases.
  - `MathUtilsTest.java`: Unit tests for the `MathUtils` class.

## Prerequisites

- **Java 8** or later
- **Maven** as a build tool
- Any IDE like IntelliJ IDEA, Eclipse, or VSCode with Java support

## Features

- Check if a number is prime.
- Handle edge cases such as 0, 1, and negative numbers.
- Comprehensive test cases for small numbers, large numbers, even numbers, and performance scenarios.

## Running the Tests

To run the JUnit tests:

1. Clone this repository:
   ```bash
   git clone https://github.com/dunburst/unit-test.git
   cd unit-test
   ```

2. Execute the tests using Maven:
   ```bash
   mvn test
   ```

## Viewing Test Coverage

Test coverage is measured using the JaCoCo plugin. Follow these steps to generate a coverage report:

1. Run the following command:
   ```bash
   mvn jacoco:report
   ```

2. Open the generated HTML report located in the `target/site/jacoco` directory.

## Code Details

### `MathUtils` Class

- **Method**: `isPrime(int n)`
  - **Description**: Checks if a number is a prime number.
  - **Parameters**: 
    - `n`: A non-negative integer.
  - **Returns**: 
    - `true` if the number is prime.
    - `false` otherwise.
  - **Throws**:
    - `IllegalArgumentException` for negative input.

### Example Usage

```java
import com.example.MathUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.isPrime(7)); // true
        System.out.println(MathUtils.isPrime(10)); // false
    }
}
```

## Tests Overview

### Sample Test Cases

- **Simple Cases**:
  - `isPrime(2)` returns `true`.
  - `isPrime(4)` returns `false`.

- **Boundary Cases**:
  - `isPrime(0)` and `isPrime(1)` return `false`.
  - Negative numbers throw an `IllegalArgumentException`.

- **Performance Test**:
  - Validates performance for large inputs such as `999_983`.

### Running the Tests

1. Ensure JUnit 5 is configured in your project.
   - Example Maven dependency:
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

  <properties>
    <!-- Cài đặt phiên bản Java tối đa là 21 -->
    <maven.compiler.source>21</maven.compiler.source>
    <maven.compiler.target>21</maven.compiler.target>
    <maven.compiler.release>21</maven.compiler.release>
  </properties>

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
      <!-- Plugin Maven Compiler để thiết lập phiên bản Java -->
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.11.0</version>
        <configuration>
          <source>${maven.compiler.source}</source>
          <target>${maven.compiler.target}</target>
          <release>${maven.compiler.release}</release>
        </configuration>
      </plugin>

      <!-- Plugin Surefire để chạy kiểm thử -->
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.1.2</version>
        <configuration>
          <includes>
            <include>**/*Test.java</include>
          </includes>
        </configuration>
      </plugin>

      <!-- Plugin JaCoCo -->
      <plugin>
        <groupId>org.jacoco</groupId>
        <artifactId>jacoco-maven-plugin</artifactId>
        <version>0.8.11</version>
        <executions>
          <execution>
            <goals>
              <goal>prepare-agent</goal>
            </goals>
          </execution>
          <execution>
            <id>report</id>
            <phase>test</phase>
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

2. Run the tests:
   ```bash
   mvn test
   ```

### Sample Test Output

- All test results are displayed in the console.
- Coverage reports can be viewed in the `target/site/jacoco` directory.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



      


