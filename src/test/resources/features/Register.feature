Feature: Registration functionality

Scenario: user creates account by filling all fields
Given user navigates to registration page
When user enters below details into respective fields
|firstname					|abhi|
|lastname						|shek|
#|email							|abhi@gmail.com|
|telephone					|9090909090|
|fax								|12345|
|company						|newtech|
|address1						|nashik|
|address2						|nashik|
|city								|NASHIK|
|zipcode						|445566|
#|loginName					||
|password						|newpass|
And clicks on respective country
And clicks on respective state
And clicks on yes for subscribe
And agrees to privacy policy
And clicks on continue button
Then new user account should be created

Scenario: user creates account by filling duplicate login name
Given user navigates to registration page
When user enters below details into respective fields with duplicate login name
|firstname					|abhi|
|lastname						|shek|
#|email							|abhi@gmail.com|
|telephone					|9090909090|
|fax								|12345|
|company						|newtech|
|address1						|nashik|
|address2						|nashik|
|city								|NASHIK|
|zipcode						|445566|
|loginName					|abhishek|
|password						|newpass|
|passwordConfirm		|newpass|
And clicks on respective country
And clicks on respective state
And clicks on yes for subscribe
And agrees to privacy policy
And clicks on continue button
Then proper warning message gets displayed