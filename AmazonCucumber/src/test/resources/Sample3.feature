Feature: To Validate the account creation of Amazon application.


@Sanity
Scenario: To Create new account.
Given To Launch the Browser and maximize the window.
When To launch the url of amazon application
And To click the create new amazon account button

And To pass name in name text box.
# one dimensional list data
|Murugesan|Saravanan|Ranjith|Gopinath|Ramesh|

And To pass mobile no in mobile no text box.
# One Dimensional Map data
# Key     | Value
|mobile1|1234567892|
|mobile2|9095614367|
|mobile3|9786407599| 

And To pass email in email text box.
# two dimesional list data
|abc@gmail.com|xyz@gmail.com|def@gmail.com|
|naanjil.murugesan@gmail.com|sef@gmail.com|xcn@gmail.com|
|nan@gmail.com|lmnopqrust@gmail.com|pqrst@gmail.com|

And To pass the password in password text box.
# Two Dimensional Map data

|password1 |password2|password3|
|abcdef    |tuvwxyz  |lmnopqr  |
|1234554567|12345    |98765    |

Then To close the Chrome Browser.

@Smoke
Scenario: To Validate the Login Functionality of the Amazon application. .

Given User has to launch the Browser and maximize the window.
When user has to launch the url of amazon application
And To click the Signin Menu.
And User to pass the emailid in email text box.
# one dimensional list data
|naanjil.murugesan@gmail.com|sef@gmail.com|xcn@gmail.com|
And User to hit the Continue button.
Then User to close the entire browser.
