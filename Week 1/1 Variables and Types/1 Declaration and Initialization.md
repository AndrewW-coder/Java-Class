# Variables and Types

---

### Variables

Variable: A variable stores data (numbers, 
letters, strings, arrays (like grids), etc)

```java
int year;
```

### Types

The type of data that the variable represents
`String` `boolean` `int` etc

### Declaration

Where the variable is created (type name 
followed by variable name)

```java
int variable;
```

### Initialization

Where the variable's value is set

```java
int var = 10;
String s = "This is a string";
```

---

# Implementation
```java
public class PointMain{
    public static void main(String[] args) {
        int lastYear = 2021; //Declaration and Initialization
        int thisYear; //Declaration
        thisYear = 2022; //Initialization
        String hello = "Hello World";
    }
}
```

### Reference Type and Object Initialization

Reference types AND Objects Initialize with 
type, name, equals sign, then "new", type, 
then parenthesis and parameters

`Object obj = new Object()`
`Scanner sc = new Scanner(System.in);`

### Naming Convention

All variables names are in pascalCase: 
first letter lowercase, all words after start uppercase
`String helloWorld`

All primitives types such as `int` are lowercase

All object types such as `Object`, `Scanner`, and `ArrayList`, 
are uppercase, where all first letters are capitalized

