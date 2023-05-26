public class User implements Shareable, Loadable {
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {

        return name;
    }

    public double getBalance() {

        return balance;
    }


    public void shareLoad(User recipient, double amount) {
        if (this == recipient) {
            System.out.println("Error: Sender and recipient cannot be the same. Please check details and try again.");
        } else if (this.balance < amount) {
            System.out.println("Error: Insufficient balance.");
        } 
        else {
            this.balance -= amount;
            recipient.loadBalance(amount);
            System.out.println(amount + " pesos successfully sent to " + recipient.getName() + ".");
        }
    }


    public void loadBalance(double amount) {
        this.balance += amount;
        System.out.println(amount + " pesos successfully loaded to your account.");
    }
}