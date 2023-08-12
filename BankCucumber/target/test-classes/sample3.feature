Feature: To Validate the account creation of Para Bank application.


@Smoke
Scenario: To Create new account.

When To launch the url of para bank application
And To click the create new Register button

And To pass first name in first name text box.
# one dimensional list data
|Saravanan|Murugesan|Ranjith|Gopinath|Ramesh|

And To pass last name in last name text box.
# one dimensional list data
|Krishnaoorthy|Kumar|Sriram|Sarvesh|Suresh|

And To pass address in address text box.
# one dimensional list data
|Karaikudi|Paramakudi|Chennai|Bangalore|Hydrabad|

And To pass mobile no in mobile no text box.
# One Dimensional Map data
# Key     | Value
|mobile1|1234567892|
|mobile2|9095614367|
|mobile3|9786407599| 

And To pass username in username text box.
# two dimesional list data
|abcefg|tuvzxyz|saravana|
|naanjil.murugesan|sefifsdfds|polier|
|sarvesh|remesh123|ragul123|

And To pass the password in password text box.
# Two Dimensional Map data

|password1 |password2|password3|
|abcdef    |tuvwxyz  |lmnopqr  |
|1234554567|12345    |98765    |

And To pass the conform password in conform password text box.
# Two Dimensional Map data

|password1 |password2|password3|
|abcdef    |tuvwxyz  |lmnopqr  |
|1234554567|12345    |98765    |



@Sanity
Scenario: To Validate the Login Functionality of the Para Bank application. .

When user has to launch the url of para bank application

And User to pass the username in username text box.
# one dimensional list data
|naanjil.murugesan|sarvesh@123|xcn@321|

And User to pass the password in password text box.

# One Dimensional Map data
# Key     | Value
|password1|tuvwxyz|
|password2|lmnopqr|
|password3|9786423| 

And User to hit the Login button.

