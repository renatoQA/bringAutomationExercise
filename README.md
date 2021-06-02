# Bring Automation Exercise

The test was created using a JAVA language and integrated with Selenium Webdriver, Cucumber and Docker.
The site itself presents some random behaviors in the fare part, it can be presented per flight or for both flights. If the test fails, just run it again.

The entire project was developed using a pageObjects pattern and with clear and objective writing
  
Test execution mode:
 
With the Docker on the machine;

Open Windows Powershell(for windows) or linux prompt in the project folder;

Run the command: 'docker-compose -f docker-compose.yml up';

In a new PowerShell or Prompt run: 'docker-compose scale chrome=5';

After that, just access the project through an IDE (Eclipse, Netbeans or IntelliJ);

Run the RunnerTest.java file as JUnit

