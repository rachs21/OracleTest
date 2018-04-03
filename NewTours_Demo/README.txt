Three testcases have been automated:

1. To login successfully into Mercury Tew Tours webpage
2. Flight booking from London to Paris with departure and arrival date as 20th April and 30th April, respectively
3. Flight booking from Zurich to Portland with departure and arrival date as 20th May and 30th May, respectively

Tools Used: MAVEN(Build tool), SELENIUM WEBDRIVER, CUCUMBER, JUNIT, JAVA(Programming Language)

Reporting: Four Types of reports are generated, can be found under output folder
			1. Cucumber Extent Reports - result.html
			2. Cucumber JSON Reports - cucumber.json
			3. Cucumber HTML Reports - index.html
			4. Cucumber JUNIT XML Report - cucumber.xml

Logging:	1.	Logs are generated using Log4j api.
			2.	Logs generated during automation run can be found in Logs folder 
			

How to Run:

1. Double click  on Newtours.bat
or
2. Run as junit test(in eclipse/intelliJ) from the runner TestRunner.java( present at NewTours_Demo\src\test\java\com\newtours\framework)

Please note:
1. Code has been successfully tested on IE(11) and mozilla firefox and the results from execution have been shared along with the code. Present in folders outpyt_ie and out_firefox respectively.

