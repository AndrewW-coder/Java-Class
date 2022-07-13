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

`abstraction`: focusing on an item's essential properties while ignoring its inner details

`class invariants`: a logical statement about an object's state that is always true 
for the lifetime of that object

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

WARNING: 
- when creating a constructor, make sure there is no return value
- when creating a constructor, don't restate the data type

## Encapsulation

### Private Data Fields

```java
private int x;
private int y;
```

`System.out.println(p1.x)` will no longer work, since its encapsulated

Instead, we will do something else in order to access this data

```java
public int getX() {
    return x;
}

public int getY() {
    return y;
}
//This code will work with encapsulated data
```

A benefit of this system is that it give the user 
read-only access 

### Class Invariants

```java
public void setLocation(int newX, int newY) {
        if (newX < 0 || newY < 0) {
            throw new IllegalArgumentException();
        }        
        
        x = newX;
        y = newY;
    }
```

If the point class wasn't encapsulated, we wouldnt be able to
properly enforce this invariant

## More Instance Methods

### The Equals Method

```java
point p1 = new Point(7, 2);
point p2 = new Point(7, 2);
point p3 = p2;
```

In Class, `a == b` refers to whether the two variables share
the same object

In that case, `p1.equals(p2)` would result with `false`,
 while `p2.equals(p3)` would result with `true`

If you want to compare two objects, you usually will have to type

```java
public boolean equals(Object o) {
    if (!(o instanceof <type>)) {
        return false;
    }
    
    <type> other = (<type>) o;
    //<compare the data and return the result>
}
```


