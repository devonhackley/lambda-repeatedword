# lambda-repeatedword
This is a application that takes in a string and returns the first repeated word from the string. The application is also placed in a lambda function that is deployed on AWS API Gateway

## Author
Devon Hackley

Deployed link: https://j1dqu2jrl0.execute-api.us-east-2.amazonaws.com/demo

## Feature Tasks
- [x] A user should be able to find the first repeated word in a sentence by visiting a URL.
    - [x] That URL should use API Gateway to call a Lambda function that finds the first repeated word in a sentence.
    - [x] You should use a query string parameter to pass in the sentence data.

## Issues:
- Testing my create function, didn't occur to me initially that I had to update the handler info so that it is pointing to the correct class/method
- Could not find out where the mapping template was located, then wasn't sure what belonged in there. Once I figured that out, I didnt realize it had to be in a string format instead of an object.
