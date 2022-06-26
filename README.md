# Design Patterns
 Design Patterns is a way to structuring code to solve a specific problem. <br/>
The aim is to make use of solutions to common problems and make code more elegant and flexible.
`No knowledge of obscure code is required.`

* Original idea from the Design Patterns: Elements of Reusable Object-Oriented Software
* Written by the <b> Gang of Four </b>

## Behavioral Design Patterns
These are about how objects assign responsibilities between each other.
They're concerned with how objects are connected, how they communicate with each other and
how responsibilities are assigned between them.

There are two different types of Behavioral Design Pattern, class patterns and objects patterns.</br>
You can think different between them as difference between **IS A** and **HAS A** relationships.</br>

For example:

![bhp.png](bhp.png)

| Behavioral Class Patterns | Behavioral Object Patterns |
|-----  | ----- |
|How classes share responsibilities between themselves| How different objects interact with each other|
|Focus in inheritance| Use composition|

### Chain of Responsibility Pattern
* Passes along a request until it is handled.</br>
* Decouples the sender from the receiver. </br>

| **Example Use Cases**  | **Things to Watch Out For** |
|-----  | ----- |
| Handling authentication. </br>                   | Circular chains.              |
| Servlet filters for handling HTTP requests. </br>| Requests never getting handled. |
|.| Confusing stack traces. |

### Command Pattern
* Encapsulates a request inside an object. 
* Decouples the object that invokes the behavioral.command from the object that knows how to handle it.

**Sometimes Used For** 
* Supporting undo/redo operations. 
* Queueing or logging request to be performed at different times.

### Interpreter Pattern
* The context: 
If you were translating a sentence into another language, the context would be the sentence (is often just a String).
* The abstract expression class: 
This is an interface or an abstract class that defines a method used for interpreting the context.
Each time there's interpret method is called, the context has changed in some way.
* The implementations of the abstract expression (terminal and non-terminal):
A non-terminal expression cause the interpret method, which alters the context, and then it passes the context onto another expression until it reaches the terminal expression. 
A terminal expression is the last time the interpret method gets called. 
* The client: It which will create instances of expressions to interpret the context.

![img.png](img.png)
<br> Components of Interpreter Pattern.


**Use Cases**
* Custom regular expressions
* Compilers
* Language translators

**Key Points**
* Express a problem as a sentence
* Define grammar
* Build an abstract syntax tree
* Easy to extend or implement the grammar
* Works best with simple grammar

### Iterator Pattern

* Iterators provide a way to access the items in a collection
* They hide underlying structure
* Real and often used examples in Java are the Iterable and Iterator interfaces

### Mediator Pattern

*The idea of the behavioral.mediator pattern is to haven an object that's sole purpose is to handle these interactions between all of the different objects.
If sits in the middle of them all and handles the communications between them.
The provides a loose coupling between the objects and this makes the program simpler to understand and to maintain.

### Memento Pattern

* The behavioral.memento pattern externalizes states without violating encapsulation.


First of all, you have an object whose states are going to changing and this called originator.
Then you have the object which is going to be changing it called the caretaker.
The momento object sits between these two.
So the objects during the changing has access to the behavioral.memento, which provides the save states.
The implementation of the originator stays as a black box.

![img_1.png](img_1.png)

*Can be memory intensive

*Lets you save behavioral.state and restore it later, without violating encapsulation.

### State Pattern
Interface behavioral.state where has a concrete specific implementation for different states.
![img_2.png](img_2.png)

* Is a way of avoiding large if/else blocks or switch statements
* Allow an object to change its behavior when its internal behavioral.state changes.

### Strategy Pattern
*File encryption
*Validation
*Sorting algorithms
*Saving to different file types
*And more

![img_3.png](img_3.png)

### behavioral.template Method Pattern

In code, you would define the steps for making a lasagna.  In a abstract class.
For example, with methods for making the filling, making the white sauce, and baking the lasagna.
The instructions for baking the lasagna, will be same for all of them. 

![img_4.png](img_4.png)

Problems: behavioral.template Method Pattern

* Difficult to communicate intent to users.
* The flow of the program can be complex and hard to follow.

When the Pattern is Useful

* You only want to implement the common parts of an algorithm once.
* You have classes that duplicate the same code.

### The Visitor Pattern

Say you have a tree of objects, and you want to perform an operation on all the elements of it.
The behavioral.visitor pattern allows you to do this without making changes to the elements themselves.
Instead, a separate behavioral.visitor object is passed to each object to perform the operation.

![img_5.png](img_5.png)

* Is fairly complex
* For a specific use case
* Makes use of the open-closed principle