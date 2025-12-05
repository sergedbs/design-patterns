# Design Patterns in Java

A simple, analogy-based implementation of common design patterns in Java. Each pattern is demonstrated with print statements to illustrate the concept without complex business logic.

---

## Creational Patterns

Patterns that deal with object creation mechanisms.

| Pattern | Analogy | Description |
|---------|---------|-------------|
| **Singleton** | One mall instance | Ensures a class has only one instance (e.g., `Mall.getInstance()`) |
| **Factory Method** | Shops creating products | Defines an interface for creating objects, letting subclasses decide which class to instantiate (`ClothesShop`, `ElectronicsShop`) |
| **Abstract Factory** | Fast-food chains | Creates families of related objects without specifying concrete classes (`KfcFactory`, `McDonaldsFactory` producing burgers and drinks) |

## Structural Patterns

Patterns that deal with object composition and relationships.

| Pattern | Analogy | Description |
|---------|---------|-------------|
| **Adapter** | Power plug adapter | Converts one interface to another (`EuroToUSAdapter` lets a US plug work with a European socket) |
| **Decorator** | Coffee add-ons | Dynamically adds behavior to objects (`MilkDecorator`, `SugarDecorator` wrap a `SimpleCoffee`) |
| **Facade** | E-commerce checkout | Provides a simplified interface to a complex subsystem (`ECommerceFacade` coordinates inventory, payment, and shipping) |

## Behavioral Patterns

Patterns that deal with object interaction and responsibility.

| Pattern | Analogy | Description |
|---------|---------|-------------|
| **Observer** | News notifications | Defines a one-to-many dependency so when one object changes, dependents are notified (`NewsChannel` notifies `PhoneUser` subscribers) |
| **Strategy** | Payment methods | Encapsulates interchangeable algorithms (`CreditCardPayment`, `PayPalPayment` used by `ShoppingCart`) |
| **Command** | Remote control | Encapsulates a request as an object (`LightOnCommand`, `LightOffCommand` executed by `RemoteControl`) |

## SOLID Principles

Check out [SOLID Principles in Java](https://github.com/sergedbs/solid-principles) for a simple example of the five SOLID principles demonstrated through a basic order checkout system analogy.

---

## License

The source code of this repository is licensed under the MIT License. See [LICENSE](LICENSE) for more details.
