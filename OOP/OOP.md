# Object Oriented Programming

OOP: a method to design a program using`classes` and `objects`

---

## Vocab

`object`: a programming entity that contains state and behavior

`state`: a set of values (internal data) stored in an object

`behavior`: a set of actions an object can perform,
usually reporting or modifying itself

`client`: code that uses an object

`fields`: the data stored in each object

`methods`: the behavior each object can execute

`encapsulation`: protecting an object's data from outside access

`instance method`: a method that exists inside an object and operates on that object, making 
up part of its behavior 

`mutator`: a method of an object that modifies its internal state
(usually have a void return type)

`accesor`: an instance method that lets client code read the objects internal state 

`constructor`: a method that creates a new object and initializes its state

---

## Fields

```java
public class Point { //creates a public class point
    int x; //gives x value (an attribute/field)
    int y; //gives y value (an attribute/field)
}
```

```java
public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point(); //creates a new point
        p1.x = 7; //sets x to 7
        p1.y = 2; //sets y to 2
        
        Point p2 = new Point(); //creates new point
        p2.x = 4; //sets x to 4
        p2.y = 3; //sets y to 3

        System.out.println("p1 is (" + p1.x + ", " + p1.y + ")");
        System.out.println("p2 is (" + p2.x + ", " + p2.y + ")");
    }
}
```

## Methods

```java
public static void translate(Point p, int a, int b) {
        p.x += a;
        p.y += b;
    }
```

`Point.translate(p, a, b)` is a static method to translate a point

```java
public void translate(int a, int b) {
        x += a;
        y += b;
    }
```

`p1.translate(3, 4)` is an instance method to translate a point

We can call directly on a point, instead of referring to the class name beforehand

## Accessors and Mutators

```java
public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
```

Above is an example of an accessor

It reads the data of the point 
and decides the output based on that information

## Constructors

Constructors allow us to initialize a new object when we declare it

```java
public Point(int initialX, int initialY) {
        x = initialX;
        y = initialY;
    }
```

Now when we declare `Point p1 = new Point();`, we no longer have to add 
`p1.x = 7;` and `p1.y = 2;`, we can simply type `Point p1 = new Point(7, 2);`
