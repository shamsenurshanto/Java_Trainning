import java.lang.Runnable;
import java.util.List;

public class Main {

    public static class People {
        String firstName;
        String lastName;
        double salary;

        // Constructor
        public People(String firstName, String lastName, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }


    }
    public static void displayList(List<People> peopleList) {
        for (People person : peopleList) {
            System.out.println("Name: " + person.firstName + " " + person.lastName);
            System.out.println("Salary: $" + person.salary);
            System.out.println();
        }
    }

    public static void displayListStartWithC(List<People> peopleList,IComparable comparable) {

        peopleList.forEach(people -> {
            if(comparable.compare(people)) {
                System.out.println("Name: " + people.firstName + " " + people.lastName+ " $" + people.salary);
            }
        });
    }



    public static void main(String[] args) {


        List<People> people = List.of(
                new People("John", "Coe", 50000),
                new People("Jane", "Smith", 60000),
                new People("EJane", "Sam", 60000),
                new People("Pane", "Tanith", 60000),
                new People("Ali", "Chan", 15000),
                new People("EAli", "Chowdhuri", 5000),
                new People("RTli", "Chan", 25000),
                new People("Chris", "Carter", 75000) // starts with C
        );

     //   displayList(people);
        /// / start with c

        displayListStartWithC(people, new IComparable() {
            @Override
            public boolean compare(People people) {
                if(!people.lastName.startsWith("C")) {
                    return true;
                }
                return false;
            }

    });

        displayListStartWithC(people, (people1)-> {
             if(people1.lastName.startsWith("C")) {
                 return true;
             }
           return false;
        });


















//        myClass myClass1 = new myClass();
//        myClass myClass2 = new myClass();
//        myClass1.print();
//        myClass2.print();
//
//        Printinterface p = new Printinterface() {
//            public void print() {
//                System.out.println("Hello and welcome to Anonymous class !");
//            }
//        };
//        p.print();
//
//        Printinterface p1 = ()-> System.out.println("Hello and welcome to My lamda Expression!");
//
//        p1.print();
//
//    /// Loop using Lamda Expression
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//        numbers.forEach(num -> {
//            int doubled = num * 2;
//            System.out.println(num + " doubled is " + doubled);
//        });
//
//        List<String> products = List.of("Laptop", "Mouse", "Keyboard", "Monitor", "Webcam");
//
//        System.out.println("--- Processing products with forEach() ---");
//        products.forEach(product -> {
//            if(product.length() > 6) {
//                System.out.println(product);
//            }
//
//        });
//
//
//
//
//
//
//        System.out.println("Main Thread: Starting...");
//
//        Runnable task1 = () -> {
//            for (int i = 0; i < 3; i++) {
//
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("Worker Thread 1: Count " + i);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                    System.out.println("Worker Thread 1 was interrupted.");
//                    return;
//                }
//            }
//            System.out.println("Worker Thread 1: Finished.");
//        };
//
//        Thread thread1 = new Thread((Runnable) task1);
//        thread1.start();
//
//        Thread thread2 = new Thread(() -> {
//            for (int i = 0; i < 3; i++) {
//
//                try {
//                    Thread.sleep(1000);
//                    System.out.println("Worker Thread 2: Hello " + i);
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                    System.out.println("Worker Thread 2 was interrupted.");
//                    return;
//                }
//            }
//            System.out.println("Worker Thread 2: Finished.");
//        });
//        thread2.start();
//
//        System.out.println("Main Thread: All worker threads launched. Doing other stuff...");
//        System.out.println("Main Thread: Exiting.");



















    }


}