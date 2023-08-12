Feature: To Validate the Login Functionality of the GMail Application.

Scenario: To Validate Login with valid email id and invalid password.
Given To Launch the Chrome Browser and maximize the window.
When To launch the url of the GMail Application.
And To Pass the Valid EMail in Email Field.
And To Click the Next Button.
And To Pass the Invalid Password in the Password Field.
And To Click the Submit Button.
Then To Close the Entire Browser.

Scenario Outline: To Validate the Positive and Negative of Login Functionality of GMail Application.
Given User has to launch thebrowser and maximize the window.
When User has to hit the gmail url
And User has pass the datas "<emaildatas>" in email field.
And User has to Click the Next Button.
And User as pass the datas "<passworddatas>" in password field.
And User has to Click the Login Button.
Then User has to Close the Browser.

Examples:
|emaildatas                 |passworddatas|
|naanjil.murugesan@gmail.com|12345|
|abc@gmail.com              |12345|
|xyz@gmail.com              |12334567|
|1234567890                 |abcder|