import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        myClass myClass1 = new myClass();
        myClass myClass2 = new myClass();
        myClass1.print();
        myClass2.print();

        Printinterface p = new Printinterface() {
            public void print() {
                System.out.println("Hello and welcome to Anonymous class !");
            }
        };
        p.print();

        Printinterface p1 = ()-> System.out.println("Hello and welcome to My lamda Expression!");

        p1.print();

    /// Loop using Lamda Expression
        List<Integer> numbers = List.of(1, 2, 3, 4, 5); // Java 9+ List.of() for immutable list
        numbers.forEach(num -> {
            int doubled = num * 2;
            System.out.println(num + " doubled is " + doubled);
        });

        List<String> products = List.of("Laptop", "Mouse", "Keyboard", "Monitor", "Webcam");

        System.out.println("--- Processing products with forEach() ---");
        products.forEach(product -> {
            if(product.length() > 6) {
                System.out.println(product);
            }

        });










    }


}