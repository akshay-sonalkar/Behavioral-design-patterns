# Behavioral Design Patterns in Java
Behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out communication.
Behavioral patterns are concerned with the assignment of responsibilities between objects and how objects communicate with each other. These patterns help in defining the communication between objects in a system and make the system more flexible and reusable.
Behavioral patterns are divided into three categories:
1. **Class Behavioral Patterns**: These design patterns deal with the relationships between classes and how they communicate.
2. **Object Behavioral Patterns**: These design patterns deal with the relationships between objects and how they communicate.
3. **Communication Patterns**: These design patterns deal with the communication between objects.
4. **Chain of Responsibility**: Passes a request along a chain of handlers.
5. **Command**: Encapsulates a request as an object.
6. **Interpreter**: Implements a specialized language.
7. **Iterator**: Provides a way to access elements of an aggregate object sequentially.
8. **Mediator**: Defines simplified communication between classes.
9. **Memento**: Captures and restores an object's internal state.
10. **Observer**: Notifies multiple objects of state changes.
11. **State**: Alters an object's behavior when its state changes.
12. **Strategy**: Encapsulates interchangeable algorithms.
13. **Template Method**: Defines the skeleton of an algorithm.
14. **Visitor**: Separates an algorithm from an object structure.
15. **Null Object**: Provides an object as a surrogate for the lack of an object of a given type.
16. **Specification**: Business rules can be recombined by chaining the business rules together using boolean logic.

This project demonstrates various behavioral design patterns in Java. Each pattern is implemented in its own module.

## Patterns Implemented

1. **Strategy Pattern**
    - **Description**: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. It allows the algorithm to vary independently from clients that use it.

2. **Observer Pattern**
    - **Description**: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

3. **Command Pattern**
    - **Description**: Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.

4. **Iterator Pattern**
    - **Description**: Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

5. **State Pattern**
    - **Description**: Allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

6. **Template Method Pattern**
    - **Description**: Defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
7. **Chain of Responsibility Pattern**
    - **Description**: Passes a request along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it along the chain.