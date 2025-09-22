import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to pay: ");
        double amount = sc.nextDouble();

        System.out.println("Choose Payment Method: 1.CreditCard 2.PayPal 3.Cash");
        int choice = sc.nextInt();

        Payment p;
        switch (choice) {
            case 1: p = new CreditCard(); break;
            case 2: p = new PayPal(); break;
            case 3: p = new Cash(); break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        p.pay(amount);
        sc.close();
    }
}
