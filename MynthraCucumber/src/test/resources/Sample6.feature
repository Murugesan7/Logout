Feature: To Validate the account creation & Search Product of Mynthra application.


@Sanity
Scenario: To enter the product in search bar and search
When To launch the url of mynthra application
And To enter the iphone product and click search button
# one dimensional list data
|Iphone|Laptop|ipod|Redmi|Watch|



@Smoke
Scenario: To Validate the Login Functionality of the Mythra application. 
When user has to launch the url of mynthra application
And To click the Signin Menu.
And User to pass the mobile no in mobile no text box.
# one dimensional list data
|naanjil.murugesan@gmail.com|sef@gmail.com|xcn@gmail.com|
And User to hit the Continue button.
