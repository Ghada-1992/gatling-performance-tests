# Performance Tests

A performance testing framework in Scala developed using [Gatling](https://gatling.io/)

The following performance tests run against a public URL: https://automationbookstore.dev/

### Tests :

* Multiple users access the home page

### Instructions :

#### Pre-Requisites :

* Maven 3.2 +

#### Get Started:

* Clone and install :
    ```
    git clone https://github.com/Ghada-1992/gatling-performance-tests.git
    cd gatling-performance-tests
    ```

* Run Tests Locally using the following maven command :
    ```
    mvn gatling:test
    ```
  or Run the Engine class and choose which simulation to run.

* View Reports for Local Run :

  After a run completion, Gatling generates a report under `target/gatling`