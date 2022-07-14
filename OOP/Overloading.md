# Java Overloading

### Overloading

You have the same method but different parameters

```java
class Chair{
    int numberOfLegs;
    public void addLeg() {
        numberOfLegs++; 
    }
    
    public void addLeg(int amount) {
        numberOfLegs += amount; 
    }
}
```

It is used for different forms of the same method

This way someone can type `addLeg();` to add 
leg or `addLeg(n)` to add n amount of legs

```java
class Main{
    public static void main(String[] args) {
        Chair c = new Chair();
        c.numberOfLegs = 5;
        c.addLeg(); //adds 1 leg
        c.addLeg(4); //adds 4 legs
    }
}
```

Both methods have the same name,
but different functions

### Constructor Overloading

Having multiple constructors with different parameters

```java
class Chair{
    private int numberOfLegs;
    private boolean isOccupied;
    
    public Chair() {
        numberOflegs = 4;
        isOccupied = false;
    }
    
    public Chair(int legs) {
        numberOfLegs = legs;
        isOccupied = false;
    }
    
    public Chair(int legs, boolean occupied) {
        numberOfLegs = legs;
        isOccupied = true;
    }
}
```

Now, we can use these multiple constructors to create chairs
in different ways

```java
class Main{
    public static void main(String[] args) {
        Chair c1 = new Chair();
        //c1: numberOfLegs = 4, isOccupied = false
        Chair c2 = new Chair(2);
        //c2 numberOfLegs = 2, isOccupied = false
        Chair c3 = new Chair(3, true);
        //c3 numberOfLegs = 3, isOccupied = true
    }
    
    
}
```

