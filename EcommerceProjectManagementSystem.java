import java.util.Scanner;

// E-commerce Product Management
interface Discountable {
    void applyDiscount();
    double calculateFinalPrice();
}

interface Returnable {
    void returnProduct();
}

abstract class Product2 {
    private String productName;
    private double price;
    private String category;

    public Product2(String productName, double price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void displayDetails();
}

class Electronics2 extends Product2 implements Discountable, Returnable {
    private double discountRate;

    public Electronics2(String productName, double price, String category, double discountRate) {
        super(productName, price, category);
        this.discountRate = discountRate;
    }

    @Override
    public void applyDiscount() {
        double discountedPrice = getPrice() - (getPrice() * discountRate / 100);
        setPrice(discountedPrice);
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice();
    }

    @Override
    public void returnProduct() {
        System.out.println("Returning the electronic product: " + getProductName());
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getProductName() + ", Price: $" + getPrice() + ", Category: " + getCategory());
    }
}

class Clothing2 extends Product2 implements Discountable {
    private double seasonalDiscount;

    public Clothing2(String productName, double price, String category, double seasonalDiscount) {
        super(productName, price, category);
        this.seasonalDiscount = seasonalDiscount;
    }

    @Override
    public void applyDiscount() {
        double discountedPrice = getPrice() - (getPrice() * seasonalDiscount / 100);
        setPrice(discountedPrice);
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Clothing: " + getProductName() + ", Price: $" + getPrice() + ", Category: " + getCategory());
    }
}

class Groceries2 extends Product2 implements Discountable {
    public Groceries2(String productName, double price, String category) {
        super(productName, price, category);
    }

    @Override
    public void applyDiscount() {
        System.out.println("No discounts applicable for groceries.");
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice();
    }

    @Override
    public void displayDetails() {
        System.out.println("Groceries: " + getProductName() + ", Price: $" + getPrice() + ", Category: " + getCategory());
    }
}

// Zoo Animal Classification
interface Soundable {
    void makeSound();
}

interface Movable {
    void move();
}

abstract class Animal2 {
    private String species;
    private String habitat;
    private String diet;

    public Animal2(String species, String habitat, String diet) {
        this.species = species;
        this.habitat = habitat;
        this.diet = diet;
    }

    public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }

    public abstract void displayDetails();
}

class Mammal extends Animal2 implements Soundable, Movable {
    public Mammal(String species, String habitat, String diet) {
        super(species, habitat, diet);
    }

    @Override
    public void makeSound() {
        System.out.println(getSpecies() + " makes a mammal sound.");
    }

    @Override
    public void move() {
        System.out.println(getSpecies() + " runs on land.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Mammal: " + getSpecies() + ", Habitat: " + getHabitat() + ", Diet: " + getDiet());
    }
}

class Bird extends Animal2 implements Soundable, Movable {
    public Bird(String species, String habitat, String diet) {
        super(species, habitat, diet);
    }

    @Override
    public void makeSound() {
        System.out.println(getSpecies() + " chirps melodiously.");
    }

    @Override
    public void move() {
        System.out.println(getSpecies() + " flies in the sky.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Bird: " + getSpecies() + ", Habitat: " + getHabitat() + ", Diet: " + getDiet());
    }
}

class Reptile extends Animal2 implements Soundable, Movable {
    public Reptile(String species, String habitat, String diet) {
        super(species, habitat, diet);
    }

    @Override
    public void makeSound() {
        System.out.println(getSpecies() + " hisses.");
    }

    @Override
    public void move() {
        System.out.println(getSpecies() + " slithers or crawls.");
    }

    @Override
    public void displayDetails() {
        System.out.println("Reptile: " + getSpecies() + ", Habitat: " + getHabitat() + ", Diet: " + getDiet());
    }
}

// Main Class
class CombinedSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // E-commerce System
        System.out.println("E-commerce System:");
        System.out.print("Enter product type (Electronics/Clothing/Groceries): ");
        String type = scanner.nextLine().trim();

        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Category: ");
        String category = scanner.next();

        Product2 product = null;

        switch (type.toLowerCase()) {
            case "electronics":
                System.out.print("Enter Discount Rate: ");
                double discountRate = scanner.nextDouble();
                product = new Electronics2(name, price, category, discountRate);
                break;
            case "clothing":
                System.out.print("Enter Seasonal Discount: ");
                double seasonalDiscount = scanner.nextDouble();
                product = new Clothing2(name, price, category, seasonalDiscount);
                break;
            case "groceries":
                product = new Groceries2(name, price, category);
                break;
            default:
                System.out.println("Invalid product type!");
        }

        if (product != null) {
            product.displayDetails();
            if (product instanceof Discountable) {
                ((Discountable) product).applyDiscount();
                System.out.println("Final Price after Discount: $" + ((Discountable) product).calculateFinalPrice());
            }
            if (product instanceof Returnable) {
                ((Returnable) product).returnProduct();
            }
        }

        // Zoo System
        System.out.println("\nZoo Animal Classification:");
        Animal2 mammal = new Mammal("Lion", "Savannah", "Carnivore");
        Animal2 bird = new Bird("Parrot", "Forest", "Herbivore");
        Animal2 reptile = new Reptile("Snake", "Desert", "Carnivore");

        mammal.displayDetails();
        ((Soundable) mammal).makeSound();
        ((Movable) mammal).move();

        bird.displayDetails();
        ((Soundable) bird).makeSound();
        ((Movable) bird).move();

        reptile.displayDetails();
        ((Soundable) reptile).makeSound();
        ((Movable) reptile).move();

        scanner.close();
    }
}
