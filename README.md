# Lab 2 SignUpForm Joshua Kang

This is my implementation of the SignUpForm form. I was able to get every condition to work per the
instructions and every use case seems to work.

First I added the necessary views and constraints to the activity_main.xml and renamed each ID to 
fit their respective uses.

![activity](/screenshots/activity_mainXML.PNG)

Then I declared every editText and the button view as an object and 
assigned it to their respective ID's

![object](/screenshots/objectDec.PNG)

Finally I added the if statements. My logic was to compare each editText Object to an empty string ""
to see if it was null using

```getText().toString().matches("");```

![onClick](/screenshots/onClickListener.PNG)

getText is self explanatory as it gets the values of the text within the editText box. toString changes
that value to be a valid string able to be read in Java, and matches simply returns true if the string
returned from toString() is null. I used this in conjunction with the || operator to check multiple
texts 

If one of them was empty the app would Toast the Fields are Empty message.

![empty](/screenshots/emptyField.PNG)

If the passwords did not match up, then it would Toast the mismatched password message.

![password](/screenshots/password.PNG)

If everything was filled out correctly it would Toast a success message

![success](/screenshots/success.PNG)

And finally to show that the name in the success field is adaptive to the entered name in the name editText view

![success2](/screenshots/success2.PNG)