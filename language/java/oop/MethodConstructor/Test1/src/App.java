class Pembeli {

    // Data Member
    String name;
    int age;

    // Object Member
    Shirt shirt;
    Pants pants;

    // Constructor
    Pembeli(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method

    void buyShirt(Shirt shirt) {
        this.shirt = shirt;
    }

    void buyPants(Pants pants) {
        this.pants = pants;
    }

    void showPembeli() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        this.shirt.showShirt();
        this.pants.showPants();
    }
}

class Shirt {
    String shirtName;
    String size;
    double price;

    Shirt(String shirtName, String size, double price) {
        this.shirtName = shirtName;
        this.size = size;
        this.price = price;
    }

    void showShirt() {
        System.out.println("Shirt Name: " + this.shirtName);
        System.out.println("Size: " + this.size);
        System.out.println("Price: " + this.price);
    }
}

class Pants {
    String pantsName;
    String size;
    double price;

    Pants(String pantsName, String size, double price) {
        this.pantsName = pantsName;
        this.size = size;
        this.price = price;
    }

    void showPants() {
        System.out.println("Pants Name: " + pantsName);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        // Object Pembeli
        Pembeli pembeli1 = new Pembeli("Budi", 20);
        Pembeli pembeli2 = new Pembeli("Farah", 21);

        // Object Shirt
        Shirt kemejaOversize = new Shirt("Kemeja Oversize", "M", 100000);
        Shirt kemejaSlimfit = new Shirt("Kemeja Slimfit", "L", 120000);

        // Object Pants
        Pants celana = new Pants("Celana", "M", 150000);
        Pants celanaSlimFit = new Pants("Celana Slim Fit", "M", 150000);

        // Pembeli1
        pembeli1.buyShirt(kemejaOversize);
        pembeli1.buyPants(celanaSlimFit);
        pembeli1.showPembeli();

        // Pembeli2
        pembeli2.buyShirt(kemejaSlimfit);
        pembeli2.buyPants(celana);
        pembeli2.showPembeli();

    }
}
