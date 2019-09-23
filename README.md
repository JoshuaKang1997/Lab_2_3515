# Lab 2 SignUpForm Joshua Kang

This is my implementation of the SignUpForm form. I was able to get every condition to work per the
instructions and every use case seems to work.

First I added the necessary views and constraints to the activity_main.xml and renamed each ID to 
fit their respective uses.

Then I declared every editText and the button view as an ![object](/screenshots/objectDec.PNG) and 
assigned it to their respective ID's

Finally I added the if statements. My logic was to compare each editText Object to an empty string ""
to see if it was null using

```getText().toString().matches("");```

getText is self explanatory as it gets the values of the text within the editText box. toString changes
that value to be a valid string able to be read in Java, and matches simply returns true if the string
returned from toString() is null. I used this in conjunction with the || operator to check multiple
texts, if one of them we're empty the app would Toast the "Empty message


