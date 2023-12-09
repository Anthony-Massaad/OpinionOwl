# SYSC 4806 Project - Opinion Owl <img src="/images/owl.png" height="40px" width="auto">

Build Status: ![Build Status](https://github.com/bardia-p/OpinionOwl/actions/workflows/maven.yml/badge.svg)

Deployment Status: ![Deployment Status](https://github.com/bardia-p/OpinionOwl/actions/workflows/main_opinionowl.yml/badge.svg)

### Group Members:

- [Bardia Parmoun](https://github.com/bardia-p)
- [Max Curkovic](https://github.com/maxcurkovic)
- [Dorothy Tran](https://github.com/dorothytran)
- [Anthony Massaad](https://github.com/Anthony-Massaad)
  
## Description:

A mini version of SurveyMonkey in which surveyors can create a survey with a three categories of questions. These include open-ended questions with a text-based answer,
questions where a user is asked to select a number within a range, and multiple choice questions. The surveyor can close the survey at any point which would prevent new users from responding.
If a survey is active, the surveyor can edit it by adding new questions or editing existing ones. The surveyor can also view and manage responses that were made to the active survey.
Closing the survey generates a response form that contains a compilation of all the answers given in the survey. Text answers are displayed as written, answers to ranged questions are
displayed as a histogram, and answers to multiple choice questions are displayed as a pie chart.

## Milestone 1

For milestone 1 of the project, the survey creation functionality was implemented. This includes the creation of a survey with any combination of questions, saving the survey, and
retrieving it so that users can access it and fill out information. This milestone contains the app's initial structure and also included setting up the processes and
workflows to be used throughout the project.

## Milestone 2

For milestone 2 of the project, the user account functionality was implemented. This included the ability to register a user and the ability for a user to log in and out.
This involved the creation of cookies which allow the user to remain logged in even if they cloes the tab. The cookies are deleted once the user chooses to log out. Additionally,
users are now connected to the surveys that they have created through their accounts. Users who have created a survey are able to manage them and close them so that they are no
longer visible to other users. Users who do not own a survey are able to view and answer surveys that are currently open. The team also implemented the ability to view survey 
responses as outlined in the project description. (ie. text answers are displayed as written, ranged answers are displayed as a histogram, and multiple choice answers are displayed
in a pie chart). 

Other smaller updates include security measures that were implemented to protect the endpoints from unauthorized access, configuration changes to allow for deployment on GCP, and 
the addition of CSS styling.

## Milestone 3

For Milestone 3 for the project, the main features introduced was to implement an edit surveys feature, a save survey responses feature, and replace the login check with an aspect using Spring AOP.
The edit surveys feature allows users to edit their existing surveys, whether this would be to add questions, remove questions, or edit existing questions and possible responses.
The save survey responses feature allows users to see the responses that were made to their surveys.
Replacing the login check with an aspect was also a primary new feature that was implemented. The aspect implemented utilizes tags that are defined within an annotation, and will perform the particular login check based on the tag input. 

Other changes that were also made was to add more thorough testing and resolve warnings, updating the front-end UI with more intuitive CSS styling, and adding extra validation to ensure survey titles and questions are not blank.
  
## Dependencies:

- Java JDK 17
- Spring Boot
- JUnit
- Project Lombok
- Maven
- Ajax
- AOP

## Installation

1. Clone the project from the repo and open the project in IntelliJ.
2. Ensure that the dependencies listed above are all installed and configured properly.
3. Go to the class _OpinionOwlApplication_ in src > main > com.opinionowl.opinionowl and run it. (either with green arrow or by right clicking)
4. Open your browser of choice and type in 'localhost:8080'.

## Usage

1. Opinion Owl can be accessed through https://opinionowl.azurewebsites.net/
2. To register a user, click "Register User" on the top right and enter a unique username and password.
3. Once registered, click "Login" on the top right and enter your username and password for your account.
4. Once logged in, you can act as a surveyor to add text questions, multiple choice questions, or numeric range questions by clicking the respective 'Add Question' buttons.
5. Click on 'Form Title' to edit the survey name or click on the text associated with each question to edit the content.
6. For multiple choice questions, click the '+' sign to add choices as needed. These can also be removed.
7. To save the survey, click 'Create Form'.
8. To edit an existing survey or manage survey responses, ensure you are still logged in and click your account on the top right to access these pages.

## Diagrams

- [UML diagram](diagrams/UML_Class_Diagram.png)
- [Schema diagram](diagrams/ER_Diagram.png)
