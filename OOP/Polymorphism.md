# Polymorphism

The ability for the same code to be used with several different types of 
objects and behave differently depending on the actual type of object used


```java
class Employee {
    public void askForVacation() {
        System.out.println("Use the yellow sheet");
    }
}
```

Lets say we have an Employee class shown above

We want to create different subclasses of Employees called Lawyer that uses
the pink sheet instead of the yellow sheet to ask for vacation

```java
public class Lawyer extends Employee {
    public void applyForVacation() {
        System.out.println("Use the pink sheet to apply for vacation");
    }
}
```

Because of polymorphism, we can type `Employee employee1 = new Lawyer;`

What the above does is that it creates an object with the Employee class,
but the object will still have lawyer methods

This allows us to write code that can interact with many types of objects in the same way

For example, we can write a method that accepts and Employee as a parameter, and we can substitute
any sub-class and the code will still work