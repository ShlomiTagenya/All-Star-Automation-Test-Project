## JAVA - Test Automation Project - 

### Pre -Conditons :
Project has been tested and verified on `Java` & `Jmeter` in  `Windows 11`.
To run project's need Frameworks:
```
Java,Selenium,AppiumStudio,Studnets Jar File, Electron,WinappDriver,JMeter,Jnekins,Docker.
Dependecies & pligins Maven.

```
### Info
This Repo contains a WEB || MOBILE || Rest API || ELECTRON APP || DESKTOP APP || JMETER -PERFORMENCE  Tests automation project written in Java 
. It is based on ```Selenium WebDriver```,```Maven```,```TestNG```,```Appium```,```Rest-Asuured```,```Electron```,
```WinAppDriver```,```JMeter``` frameworks,
run Tests in parallel by ```JENKINS``
Or Run Suites Tests Parallel on Virtuel Machines by```DOCKER```
Page Object Design Pattern (Extensions/Work Flows/Test Cases...).
* Visual Testing - Used By  ```Sikuli```
* Performence Tests (Load , Stress Tests).
* External Files Support - ```Data Driven Testing```- CSV Files.

### List of applications were used in this project:

*  NonCommerce - Web Based Application 
*  Financial Calculator - Mobile application
*  Students API - Web API 
*  ToDoList - Electron App
*  Spotify - Desktop application
*  HBO - JMeter App



### Tests Execution &C ommands
Project contains different test files, divided into different suites.

It is possible to run one by one from ```JAVA/CMD```OR  to run in parallel by ```JENKINS``` Or on Virtuel Machines by```DOCKER```.

| Command  | Info | 
| ------------- | ------------- |
| `mvn test -P+id`  | Run Test ID From Java / Cmd |
| `mvn clean verify `  | Run Jmeter Test From Java & Cmd |
| `test -P+id`  | Run Test ID From Jenkins |
| `n --rm -ti --name zalenium -p 4444:4444 \
      -e PULL_SELENIUM_IMAGE=true \
      -v /var/run/docker.sock:/var/run/docker.sock \
      -v /tmp/videos:/home/seluser/videos \
      --privileged dosel/zalenium start`      | Run Zalenium on Docker |



### Reports

#### Listeners
 interface used to generate logs and customize the TestNG reports.

#### allure

```
Run these  command in Terminal  & open Allure report:
```
allure generate allure-results

```
![Alure-Screenshot](/video%26picture/allureRport.jpg)

#### Jmeter Report
[Listeners-Screenshot](/video%26picture/jmetetReportjpg.jpg)
[CSV FILE-Screenshot](/video%26picture/jmeterResults.jpg