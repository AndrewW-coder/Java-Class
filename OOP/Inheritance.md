# Object Inheritance

Objects are not singular; they can share features
 
Lets say you have a `Bird` class

You want to create a `Robin` and `BlueJay` class, 
and these two share same behaviors

A `Robin` is part of `Bird`, so `Robin` can inherit `Bird` traits

### Inheritance

A programming technique that allows a derived class to extend the
functionality of a base class, inheriting all of its states and behaviors

Use `protected` instead of `private` to allow a private variable to be 
accessible in the sub-class

```java
class Furniture{
    protected int durability = 100;
    public void destroy() {
        durability = 0;
    }
}

class Chair extends Furniture{
    //class Chair inherits all the 
    //same behaviors and states as furniture
    
    public int getDurability(){
        return durability;
    }
}
```

```java
class Main{
    public static void main(String[] args) {
        Furniture f = new Furniture();
        
        f.destroy(); //destroys that instance
        
        Chair c = new Chair();
        c.destroy()
        System.out.println(c.getDurability);
        //destroys chair prints 0
        //Chair inherits all of Furniture (all fiends and methods)
    }
}
```

### Superclass

The parent class in an inheritance relationship

In the example above, `Furniture` is the superclass.

### Subclass

The child, or derived, class in an inheritance relationship

In the example above, `Chair` is the subclass

# Method Overriding

What if we want to modify an inherited behavior like the `destroy()` method?

### Override

To implement a new version of a method to replace code that would otherwise 
have been inherited from a superclass

To override a method, add @Override right before the method

```java
class Furniture{
    protected int durability = 100;
    public void destroy() {
        durability = 0;
    }
}

class Chair extends Furniture{
    public int getDurability(){
        return durability;
    }
    
    @Override
    public void destroy(){ //must have same parameters
        durability -= 50;
    }
}
```

The `destroy()` method is now overidden with our new method

```java
class Main{
    public static void main(String[] args) {
        Furniture f = new Furniture();
        f.destroy(); //durability of f is 0
        
        Chair c = new Chair();
        c.destroy();//durability is 50
    }
}
```

### Super keyword

The super keyword lets you call a constructor or method from the superclass

Example:

```java
public class Furniture {
    int health;
    int numberOfLegs;
    
    public Furniture(int numberOfLegs, int health) {
        this.numberOfLegs = numberOfLegs;
        this.health = health;
        //pretend this is complicated
        //don't want to copy paste
    }
    
    public void destroy() {
        health -= 50;
        numberOfLegs = 0;
    }
}

public class Chair extends Furniture {
    boolean isOccupied;
    public Chair(int numberOfLegs, int health, boolean isOccupied) {
        super(numberOfLegs); //passes in Furnitures(numberOfLegs) constructor
        this.isOccupied = isOccupied;
    }
    
    @Override
    public void destroy() {
        super.destroy(); //need to type super.destroy because
        //the method was already implemented
        
        isOccupied = false;
    }
}


```

### `Object` class

Everything inherits the `Object` class


```java
class Main {
    //parameter Object o means that any object can be passed as the parameter
    public static void myMethod(Object o) {
        //
    }
}
```

Everything technically extends the `Object` class

Everything has `.toString()`, etc, because `object` has it
