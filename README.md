Type Erase When Subclassing a Class With Generic Methods
==================================


In Java and Groovy I was suprised when I found out that a subclass of a superclass with a generic method can erase the generic type.  Take the interface below:

```java
public interface MyInterface {

    <T> void method(T t);

}
```

We can create anonymous subclasses of MyInterface, the first class faithfully implements a generic method, the second erases the generic method, using the Object class in place of the generic type parameter T.

```java

    new MyInterface() {
        @Override
        public <T> void method(T t) {

        }
    };

    new MyInterface() {
        @Override
        public void method(Object t) {

        }
    };



```
