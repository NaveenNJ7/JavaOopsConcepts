package day13_04_10;

public class StaticNonstatic {

}


/*  Static -
            1) It can used with class, variable, method and block
            2) Class loader loads the static properties into memory location called 
               Class area or static loop
            3) Static properties can be accessed with classname
            4) Static properties can be accessed directly in same class
            5) Static properties can be accessed in other class with class name  

    Note :  1) Static properties loaded only once, therefore we have only on copy
            2) All objects pointing towards static pool so we can access static properties with 
               reference of objects but it is not good practice

             
               Access in same          Access in other        memory location         No.of copies
                same class                 class 
           |_______________________|______________________|______________________|_______________________
Static     |       direct          |    wiht Classname    |      Classname or    |     only one copy
           |    with classname     |                      |       Static pool    |       per class
___________|_______________________|______________________|______________________|____________________
           |                       |                      |                      |
Non static |    create object      |     create object    |       Heap area      |       depends on 
                                                                                      number of objects




*/