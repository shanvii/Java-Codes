## Stack Data Structure Implementation with Singly Linked List

### Problem Statement

Implement a Stack Data Structure specifically to store integer data using a Singly Linked List. The data members should be private. You need to implement the following public functions:

- Constructor: It initializes the data members as required.
- push(data): This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
- pop(): It pops the element from the top of the stack and returns the element being popped or deleted. In case the stack is empty, it returns -1.
- top: It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
- size(): It returns the size of the stack at any given instance of time.
- isEmpty(): It returns a boolean value indicating whether the stack is empty or not.

#### Operations Performed on the Stack:

- Query-1(Denoted by an integer 1): Pushes an integer data to the stack.
- Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.
- Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.
- Query-4(Denoted by an integer 4): Returns the current size of the stack.
- Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.

#### Input Format

The first line contains an integer 'q' which denotes the number of queries to be run against each operation in the stack. Then the test cases follow. Every 'q' lines represent an operation that needs to be performed. For the push operation, the input line will contain two integers separated by a single space, representing the type of the operation in integer and the integer data being pushed into the stack. For the rest of the operations on the stack, the input line will contain only one integer value, representing the query being performed on the stack.

#### Constraints

- 1 <= q <= 10^5
- 1 <= x <= 5
- -2^31 <= data <= 2^31 - 1 and data != -1

#### Output Format

For Query-1, you do not need to return anything. For Query-2, prints the data being popped from the stack. For Query-3, prints the data kept on the top of the stack. For Query-4, prints the current size of the stack. For Query-5, prints 'true' or 'false' (without quotes). Output for every query will be printed in a separate line.

#### Sample Input 0
6  <br/>  
1 13  <br/>
1 47  <br/>
4  <br/>
5  <br/>
2  <br/>
3 


#### Sample Output 0
2  <br/>
false  <br/>
47  <br/>
13  <br/>


#### Sample Input 1
4  <br/>
5  <br/>
2  <br/>
1 10  <br/>
5

#### Sample Output 1
true  <br/>
-1  <br/>
false  <br/>
