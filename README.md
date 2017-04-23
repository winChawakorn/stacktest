# stacktest

`StackTest` is a JUnit test for testing the methods in `Stack` class. It is created to help the programmers fix the bug(s) in their `Stack` class.

Stack			| Error description
------------------------|------------------------------------------------------------------------------------------------------------------
StackFactory Type 0	| found 1 error. <br>1.) overflowStack<br>`push()` allow user to push the object more than stack's capacity<br>instead of throws IllegalStateException.<br><br>found 1 method that have to fixed: `push()`<br>
StackFactory Type 1	| found 5 errors.<br>1.) stackIsFull<br>`isFull()` doesn't return true when the stack is full.<br>Number of capacity is not equal to `size()` when the stack is full.<br>2.) testPushNull<br>`push()` doesn't throw the correct exception when user try to push null to the stack.<br>3.) testPush<br>`size()` doesn't return 1 when there is one object pushed.<br>4.) testPop<br>`size()` after `pop()` one time is not equal to `size()` before `pop()` minus 1.<br>5.) overflowStack<br>`push()` allow user to push the object more than stack's capacity<br>instead of throws IllegalStateException.<br><br>found 3 methods that have to fixed: `isFull()`, `push()`, `size()`

## author: Chawakorn Suphepre
