# stacktest

StackTest is a JUnit test for testing the methods in Stack class. It is created to help the programmers fix the bug(s) in their Stack class.

Stack			| Error description
------------------------|---------------------------------------------------------------------:
StackFactory Type 0	| found 1 error.
			| 1.) overflowStack
			| push() allow user to push the object more than stack's capacity
			| instead of throws IllegalStateException.
			| found 1 method that have to fixed: push()
			|
StackFactory Type 1	| found 5 errors.
			| 1.) stackIsFull
			| isFull() doesn't return true when the stack is full.
			| Number of capacity is not equal to size() when the stack is full.
			| 2.) testPushNull
			| push() doesn't throw the correct exception when user try to push null to the stack.
			| 3.) testPush
			| size() doesn't return 1 when there is one object pushed.
			| 4.) testPop
			| size() after pop() one time is not equal to size() before pop() minus 1.
			| 5.) overflowStack
			| push() allow user to push the object more than stack's capacity
			| instead of throws IllegalStateException.
			| found 3 methods that have to fixed: isFull(), push(), size()




## author: Chawakorn Suphepre
