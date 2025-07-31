# SOLID Principles in Object-Oriented Design

The **SOLID** principles are five design guidelines that help software developers design maintainable, scalable, and testable object-oriented systems.

---

## 1. **S - Single Responsibility Principle (SRP)**

**Definition:**

> A class should have only one reason to change.

**In Simple Terms:** One class = One responsibility.

**Example:**

```java
// ✅ Correct
class Invoice {
    double calculateTotal() {...}
}

class InvoicePrinter {
    void print(Invoice invoice) {...}
}

class InvoiceRepository {
    void save(Invoice invoice) {...}
}
```

---

## 2. **O - Open/Closed Principle (OCP)**

**Definition:**

> Classes should be open for extension but closed for modification.

**In Simple Terms:** Add new features by **adding new code**, not by changing existing code.

**Example:**

```java
// ✅ Correct
interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    public double calculateArea() {...}
}

class Rectangle implements Shape {
    public double calculateArea() {...}
}

class AreaCalculator {
    public double totalArea(List<Shape> shapes) {...}
}
```

---

## 3. **L - Liskov Substitution Principle (LSP)**

**Definition:**

> Subtypes must be substitutable for their base types.

**In Simple Terms:** If class B is a subtype of class A, we should be able to use B wherever A is used **without breaking the behavior**.

**Example:**

```java
class Bird {
    void fly() {...}
}

class Duck extends Bird {}
class Sparrow extends Bird {}
// ❌ A Penguin can't fly, so this breaks LSP
```

✅ **Solution:** Extract common behavior into an interface:

```java
interface Bird { void makeSound(); }
interface FlyingBird extends Bird { void fly(); }
```

---

## 4. **I - Interface Segregation Principle (ISP)**

**Definition:**

> Clients should not be forced to depend upon interfaces they do not use.

**In Simple Terms:** Many small interfaces are better than one fat interface.

**Example:**

```java
// ❌ Bad
interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() {...}
    public void eat() {} // not applicable
}

// ✅ Good
interface Workable { void work(); }
interface Eatable { void eat(); }
```

---

## 5. **D - Dependency Inversion Principle (DIP)**

**Definition:**

> High-level modules should not depend on low-level modules. Both should depend on abstractions.

**In Simple Terms:** Use **interfaces/abstract classes** to reduce coupling.

**Example:**

```java
// ✅ Correct
interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {...}

class UserService {
    private final Database db;
    public UserService(Database db) {
        this.db = db;
    }
    public void register(String name) {
        db.save(name);
    }
}
```

---

## ✅ Summary

| Principle | Description                                        | Goal                    |
| --------- | -------------------------------------------------- | ----------------------- |
| SRP       | One class = One responsibility                     | Maintainability         |
| OCP       | Extend behavior, don't modify existing code        | Flexibility             |
| LSP       | Subclasses shouldn't break parent behavior         | Reliability             |
| ISP       | Don't force clients to implement unnecessary stuff | Decoupling              |
| DIP       | Depend on abstractions, not concrete classes       | Testability, Modularity |

---

Next up: We’ll start applying SOLID to real-world **Low-Level Design** patterns like Notification systems, Parking Lot, Cab Booking, etc.
