# People Stage 3
Everything  should work from command line and end user can create as much Persons as wont also can update persons and delete persons and terminate the program  by writing "exit"

So first you should ask what type of person user want to create 1- dancer , 2 - singer , 3 - programmer and allow only number as input otherwise you should reject user request with the following message "Person not supported!" , but allow to re-try creation , if user wasn't able to do correct request 3 time then program should be terminated   . In case of success you should go forward and start asking next questions like : name etc.

All persons will have an email(email validation) , age(0-100 years) , gender (Male, Female), surname(length less 255 and more 0 , also no number) , lastname(length less 255 and more 0 , also no number) , nickname(length less 255 and more 0), designation(length less 255 and more 0)
All methods should say what is the behavior , name and lastname 

Programmer will have also  type : Software Engineer , Hardware Engineer, Data Engineer . 
Dancer will have also type : Latino , Traditional Armenian , Contemporary 
Singer will have also type : Jazz , Pop, Rock
Programmer can code only after learning and can learn only after eating, programmer can eat unlimited
Dancer can dancing only after eating , but can eat 3 time in a day not more .
Singer can play only after walk and eat something, but can Sing only after eat

In this stage try to use : Enum , Feel free to add some additional properties to create logic , use custom exceptions which should be in exception package of corresponding part : if it is related to service exception package should be in service if it is common for core so in core etc. Add validation methods you can use helper package for validation and for example if it will be used in one class you can use nested class or  if will be common create helper package in corresponding place and add logic there