# Java Object-Oriented Programming Demo System

This project demonstrates advanced Object-Oriented Programming concepts in Java through two interconnected systems: an E-commerce Product Management System and a Zoo Animal Classification System. The implementation showcases inheritance, interfaces, abstraction, and polymorphism.

## Features

### E-commerce Product Management System
- Abstract product classification with support for Electronics, Clothing, and Groceries
- Discount management system with product-specific discount rules
- Return policy implementation for eligible products
- Price calculation and product details display

### Zoo Animal Classification System
- Classification system for different animal types (Mammals, Birds, Reptiles)
- Behavior implementation through interfaces (Soundable, Movable)
- Detailed animal characteristics including species, habitat, and diet
- Interactive display of animal behaviors and details

## Class Structure

### E-commerce System
- `Product2` (Abstract Class)
  - `Electronics2` (Implements Discountable, Returnable)
  - `Clothing2` (Implements Discountable)
  - `Groceries2` (Implements Discountable)

### Zoo System
- `Animal2` (Abstract Class)
  - `Mammal` (Implements Soundable, Movable)
  - `Bird` (Implements Soundable, Movable)
  - `Reptile` (Implements Soundable, Movable)

## Interfaces
- `Discountable`: Defines discount-related operations
- `Returnable`: Defines return policy operations
- `Soundable`: Defines animal sound behaviors
- `Movable`: Defines animal movement behaviors

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java IDE (Eclipse, IntelliJ IDEA, or similar)

### Running the Application
1. Clone the repository
```bash
git clone [repository-url]
```

2. Navigate to the project directory
```bash
cd [project-directory]
```

3. Compile the Java files
```bash
javac CombinedSystem.java
```

4. Run the application
```bash
java CombinedSystem
```

## Usage Example

The system provides an interactive command-line interface where users can:

1. Create and manage products:
   - Add new products with specific details
   - Apply discounts
   - Process returns for eligible items
   - View product details

2. Interact with the zoo system:
   - View animal details
   - Observe animal behaviors
   - See movement and sound patterns

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- This project serves as an educational demonstration of OOP principles in Java
- Inspired by real-world applications of e-commerce and zoological classification systems
