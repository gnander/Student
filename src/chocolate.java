import java.util.ArrayList;

public class chocolate {
    public static void main(String[] args) {
        DairyMilk a = new DairyMilk("Cadbury", "Bar", "ChocolateMILK", 130, 96);
        System.out.println(a);
        DairyMilk b = new DairyMilk("Cadbury", "Bar", "ChocolateMILK", 9, 5);
        System.out.println(b);
        DairyMilk c = new DairyMilk("Cadbury", "Bar", "ChocolateMILK", 17, 10);
        System.out.println(c);
        DairyMilk d = new DairyMilk("Cadbury", "Shots", "ChocolateMILK", 18, 10);
        System.out.println(d);
        DairyMilk e = new DairyMilk("Cadbury", "Bar", "ChocolateMILK", 38, 22);
        System.out.println(e);

        DairyMilk f = new DairyMilk("Cadbury", "Bar", "RoastAlmond", 42, 35);
        DairyMilk g = new DairyMilk("Cadbury", "Bar", "Fruit&Nuts", 42, 35);
        DairyMilk h = new DairyMilk("Cadbury", "Bar", "Silk", 60, 55);
        ArrayList<DairyMilk> d1 = new ArrayList<>();
        d1.add(f);
        d1.add(g);
        d1.add(h);
        System.out.println(d1);
        for (int i = 0; i < d1.size(); i++) {
            System.out.println(d1.get(i).Cost);
        }
        a.eat();

        drawLine();

        Fivestar s1 = new Fivestar("Cadbury", "Bar", "CaramelChocolate", 10.1, 5);
        System.out.println(s1);
        Fivestar s2 = new Fivestar("Cadbury", "Bar", "CaramelChocolate", 20, 10);
        System.out.println(s2);
        Fivestar s3 = new Fivestar("Cadbury", "Pouch", "DarkChocolateCaramel", 191.9, 135);
        System.out.println(s3);
        s1.eat();

        drawLine();

        Fuse f1 = new Fuse("Cadbury", "Bar", "Peanut & Caramel filled Chocolate", 27.5, 20);
        System.out.println(f1);
        Fuse f2 = new Fuse("Cadbury", "Bar", "Almonds and Peanuts filled Chocolate", 40, 50);
        System.out.println(f2);
        Fuse f3 = new Fuse("Cadbury", "Pouch", "Peanut & Caramel filled Chocolate", 170, 96);
        System.out.println(f3);
        f1.eat();

        drawLine();

        Nutties n1 = new Nutties("Cadbury", "Ball", "Chocolate", 30, 13);
        System.out.println(n1);
        n1.eat();

        drawLine();

        Chocobakes c1 = new Chocobakes("Cadbury", "Cake", "Chocolate", 114, 47);
        Chocobakes c2 = new Chocobakes("Cadbury", "Cookies", "Chocolate", 150, 48);
        System.out.println(c1);
        System.out.println(c2);
        c1.eat();

        drawLine();

        Lickables l1 = new Lickables("Cadbury", "Cup", "superman", "Chocolate", 20, 40);
        System.out.println(l1);
        l1.eat();

        drawLine();

        Oreo o1 = new Oreo("Cadbury", "Cream biscuit", "Vanilla ", 96.25, 25);
        System.out.println(o1);
        Oreo o2 = new Oreo("Cadbury", "Cream biscuit", "Chocolate", 96.25, 25);
        System.out.println(o2);
        Oreo o3 = new Oreo("Cadbury", "Cream biscuit", "Strawberry", 43.75, 10);
        System.out.println(o3);
        o1.eat();

        drawLine();

    }
    public static void drawLine() {
        System.out.println("<-------------------------------------------------------------------------------------------------------------------------------->");
    }
}
interface Cadbury{
    public void eat();
}
class DairyMilk implements Cadbury{
    String Brand;
    String ItemForm;
    String Flavour;
    int Weight;
    int Cost;

    public DairyMilk(String brand, String itemForm, String flavour, int weight, int cost) {
        Brand = brand;
        ItemForm = itemForm;
        Flavour = flavour;
        Weight = weight;
        Cost = cost;
    }

    @Override
    public String toString() {
        return "DairyMilk{" +
                "Brand='" + Brand + '\'' +
                ", ItemForm='" + ItemForm + '\'' +
                ", Flavour='" + Flavour + '\'' +
                ", Weight=" + Weight +
                ", Cost=" + Cost +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Everyone likes Dairy Milk");
    }

}


class Fivestar implements Cadbury{
    String Brand;
    String ItemForm;
    String Flavour;
    double Weight;
    int Cost;

    public Fivestar(String brand, String itemForm, String flavour, double weight, int cost) {
        Brand = brand;
        ItemForm = itemForm;
        Flavour = flavour;
        Weight = weight;
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Fivestar{" +
                "Brand='" + Brand + '\'' +
                ", ItemForm='" + ItemForm + '\'' +
                ", Flavour='" + Flavour + '\'' +
                ", Weight=" + Weight +
                ", Cost=" + Cost +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("ramesh&suresh");
    }
}

class Fuse implements Cadbury{
    String Brand;
    String ItemForm;
    String Flavour;
    double Weight;
    int Cost;

    public Fuse(String brand, String itemForm, String flavour, double weight, int cost) {
        Brand = brand;
        ItemForm = itemForm;
        Flavour = flavour;
        Weight = weight;
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Fuse{" +
                "Brand='" + Brand + '\'' +
                ", ItemForm='" + ItemForm + '\'' +
                ", Flavour='" + Flavour + '\'' +
                ", Weight=" + Weight +
                ", Cost=" + Cost +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Grab a Cadbury Fuse");

    }
}

class Nutties implements Cadbury{
    String Brand;
    String ItemForm;
    String Flavour;
    double Weight;
    int Cost;

    public Nutties(String brand, String itemForm, String flavour, double weight, int cost) {
        Brand = brand;
        ItemForm = itemForm;
        Flavour = flavour;
        Weight = weight;
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Nutties{" +
                "Brand='" + Brand + '\'' +
                ", ItemForm='" + ItemForm + '\'' +
                ", Flavour='" + Flavour + '\'' +
                ", Weight=" + Weight +
                ", Cost=" + Cost +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Take a short");
    }
}

class Chocobakes implements Cadbury{
    String Brand;
    String ItemForm;
    String Flavour;
    double Weight;
    int Cost;

    public Chocobakes(String brand, String itemForm, String flavour, double weight, int cost) {
        Brand = brand;
        ItemForm = itemForm;
        Flavour = flavour;
        Weight = weight;
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Chocobakes{" +
                "Brand='" + Brand + '\'' +
                ", ItemForm='" + ItemForm + '\'' +
                ", Flavour='" + Flavour + '\'' +
                ", Weight=" + Weight +
                ", Cost=" + Cost +
                '}';
    }

    @Override
    public void eat() {
        System.out.println(" Cake loaded with the chocolaty Cadbury inside and outside");

    }
}

class Lickables implements Cadbury{
    String Brand;
    String ItemForm;
    String Toy;
    String Flavour;
    double Weight;
    int Cost;

    @Override
    public String toString() {
        return "Lickables{" +
                "Brand='" + Brand + '\'' +
                ", ItemForm='" + ItemForm + '\'' +
                ", Toy='" + Toy + '\'' +
                ", Flavour='" + Flavour + '\'' +
                ", Weight=" + Weight +
                ", Cost=" + Cost +
                '}';
    }

    public Lickables(String brand, String itemForm, String toy, String flavour, double weight, int cost) {
        Brand = brand;
        ItemForm = itemForm;
        Toy = toy;
        Flavour = flavour;
        Weight = weight;
        Cost = cost;
    }

    @Override
    public void eat() {
        System.out.println("Lick it");
    }
}

class Oreo implements Cadbury{
    String Brand;
    String ItemForm;
    String Flavour;
    double Weight;
    int Cost;

    public Oreo(String brand, String itemForm, String flavour, double weight, int cost) {
        Brand = brand;
        ItemForm = itemForm;
        Flavour = flavour;
        Weight = weight;
        Cost = cost;
    }

    @Override
    public String toString() {
        return "Oreo{" +
                "Brand='" + Brand + '\'' +
                ", ItemForm='" + ItemForm + '\'' +
                ", Flavour='" + Flavour + '\'' +
                ", Weight=" + Weight +
                ", Cost=" + Cost +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Twist Lick Dunk");
    }
}