# Vehicle Rental Management System

## Goal

Complete all unfinished methods and make `MainVehicle.java` produce correct console output.

Do not redesign the project. Use the existing classes, methods, and structure.

## Student Tasks

Complete the TODO methods in:

- `Car`
- `Motorcycle`
- `Van`
- `RentalService`

## Methods To Complete

### Vehicle subclasses

Complete these methods in `Car`, `Motorcycle`, and `Van`:

```java
public String getVehicleDetails()
public double calculateRentalPrice(int days)
public void rent()
public void returnVehicle()
```

### RentalService

Complete these methods:

```java
public void addVehicle(Vehicle vehicle)
public void addCustomer(Customer customer)
public Vehicle findVehicleById(int id)
public Customer findCustomerById(int id)
public ArrayList<Vehicle> getAvailableVehicles()
public Rental rentVehicle(int customerId, int vehicleId, int days)
public boolean returnVehicle(int vehicleId)
public ArrayList<Rental> findRentalsByCustomer(int customerId)
public double calculateTotalRevenue()
public void printVehicleInformation()
```

## Rental Price Rules

Implement different pricing behavior using polymorphism.

### Car

```text
pricePerDay * days
```

### Motorcycle

Apply a 10% discount.

```text
100 * 5 = 500
Discount = 10%
Final = 450
```

### Van

Add 15%.

```text
100 * 5 = 500
Additional 15%
Final = 575
```

Do not use:

```java
if (vehicle instanceof Car)
```

Use polymorphism:

```java
vehicle.calculateRentalPrice(days);
```

## Concepts To Identify

Students should be able to explain where each OOP concept is used.

### Class

```text
Customer
Rental
Car
Motorcycle
Van
```

### Abstract Class

```text
Vehicle
```

### Interface

```text
Rentable
```

### Inheritance

```text
Car extends Vehicle
Motorcycle extends Vehicle
Van extends Vehicle
```

### Encapsulation

All fields should remain private.

### Enum

```text
VehicleStatus
VehicleType
```

### Association

```text
Rental has a Customer
Rental has a Vehicle
```

### Aggregation

```text
RentalService contains vehicles
RentalService contains customers
RentalService contains rentals
```

### Polymorphism

```java
Vehicle car = new Car(...);
Vehicle van = new Van(...);

car.calculateRentalPrice(5);
van.calculateRentalPrice(5);
```

The same method call produces different behavior depending on the real object type.

### Abstraction

Students work with:

```java
Vehicle
Rentable
```

without needing to know every implementation detail.

## Restrictions

Do not use:

```text
Stream API
Spring
Database
Hibernate
Lombok
External frameworks
```

Use:

```text
classes
objects
constructors
getters/setters
ArrayList
loops
if statements
method overriding
polymorphism
```

