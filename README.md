# Triangle
This is a java project folder in which the :  
  - `src`: Folder contains source code -
  - `lib`: the folder to maintain dependencies  Meanwhile, 
  - the compiled output files will be generated in the `bin` folder by default. 

In Triangle.java file:
  - The first method is a default contstructor which sets initial values of triangle.
  - The subsequent other three constructors are different constructors which set value of triangle sides depending on the nubmer of inputs comming as parameter when the object is called. One parameter indicates that all sides are same and hence is equilateral triangle, while two parameter mean that it is isoscles triangle/(equaleteral if user provides same value) and finally three parameters mean that no it is isoscles(could be scalene or equaleteral also depending on parameter values).
  - The last constructor is a copy constructor of 'isoscles' object in main.
  - The set() method takes in two parameters; first the side of triangle who's value is to be changed and second the value that will replace the value on that side. It replaces the value according to parameters given. (return type void)
  - the get() method takes in one parameter; the side which is to be returned to the user. Then return that value.(return type double)
  - The parameter() method takes in no parameter but returns the sum of the sides of triangle. (return type double)
  - The isRightAngled() method takes in no parameter but returns wheter the triangle associated with the object is a right angle triangle or not.(return type boolean)
  - The object_counter() returns the number of objects used in main file.(return type int)
  - The toString() is used to print all sides of a current object.(return type string)
    
In Main.java file:
  - All the constructors and methods are called in the Main.java file.
  - Manually calling get() method for retrieving all values is tedious so better to use toString() method.
  - When a change is made by a method of an object then it is also applied to the copy constructor.
