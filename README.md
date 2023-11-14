Automated test project for an online bookstore Oscar Sandbox 
The graduation paper of the Tel-Ran School testers' group. Practical application what I have learned at school.



Objective of the project
Creating of test documentation (testplan, testsuits, testcases, checklists)
Identification and description of bugs (bugreports)
Automating the testing of an online bookstore.
Compilation of a set of autotests for smoke testing of the pilot version of the website to regularly and effectively test the performance of the site when extending its functionality
Compilation of a set of autotests for regression testing to regularly and effectively test of the site's performance when fixing bugs and make changes to the programm code.
Description
The whole body of work was divided into four parts:

Home Page
User
Product
Basket
My colleague and I developed the Basket part. You can see the Test plan here.

Example of test-suites and test-case in the TestLink
Mind Map for the part Basket
Testing was implemented using:
Selenium 3.141	Java 11	Gradle	IntelliJ IDEA	Jenkins	Atlassian Jira	TestLink	MindMup
selenium

java

gradle

IntelliJ

jenkins

jira

testlink

mindmup

Manual testing
Manual testing of the website took approximately 6 hours.

During manual testing of the first version of the website, bugs were found, which I described in detail in the Jira software. An example of the description of some bugs can be seen here. I found a total of 10 bugs in the Basket section. 7 of them were fixed in the final version of the site and 2 are marked as features.

Automated testing
75 tests were performed for 23 min.

UI testing
UI testing was carried out on the Homepage, Book page and the Products page.

Check of the broken links on the Homepage
Check of the Breadcrumbs on Products and Book page
Check of required submenu items for the Catalogue menu on the Products page
Check of the required information on the Book page
Functional testing. What's special:
Page Object Model
Parameterized assembly
Regex
DataProvider for loading data from files
MyListener for generating reports
Autotests are run on the Jenkins server
How to run
Clone the project on your computer
Run cmd and make sure you are in the project folder Image alt
Write command to run corresponding set of autotests
gradlew testngUser
or

gradlew testngProduct
or

gradlew testngBasket
or

gradlew testngSmoky
or

gradlew testngRegression
How to use this project
In the project have been used many generic methods to access and process web page objects. Thay could be used in the another test projects. For example:

clickWithJSExecutor
typeWithJSExecutor
pause
isElementPresent
checkBrockenImages
verifyLinks
takeScreenshotMyListener
takeScreenshotWithScrollDown
...
 
