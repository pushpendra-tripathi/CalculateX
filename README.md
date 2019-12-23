# CalulateX

A simple and beautiful dark theme calculator app.
Calculator is really simple project but this project will clear many topics in android app development.
Now a days craze for dark theme is almost at the top, so we decided to build the UI of our calculator app in dark theme. This calculator app will perform simple calculation task such as addition, subtraction, multiplication and division. In this blog we will explain step by step how to build this cool calculator app.

## Creating the UI
The UI has one editText for displaying input and one textView for displaying previous inputs and operations. UI is created in XML, we have used 7 rows and 4 columns in for creating the user interface which has all the necessary elements for the proper functioning of the app. Constraint layout is used so that the app is compatible with variable screen sizes. The UI is having a simple but eye catching dark mode theme.
The XML code for the UI is here:

## Creating logic (Java/Backend)
Android applications uses backend programming in Java or Kotlin. Here we will use Java for coding this app. 
* 1>	First we have to declare all the elements/views used in XML file and then connect them using findViewById() method.
* 2>	Then we have to define fuction of every button by assigning onClickListner() method to them.
* 3>	For the number input, functioning is same for every button.
* 4>	Operations buttons(+, -, *, /) we have use similar function and Equal button and Clear Button have separate logic.
* 5>	The we use computation method for doing the required calculation.
