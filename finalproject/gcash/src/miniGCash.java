import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class miniGCash {
    private static Map<String, User> users = new HashMap<>();
 
    public static void main(String[] args) {
        // Existing users
        users.put("09175861661", new User("Bob", 100.00));
        users.put("09175861662", new User("Marley", 100.00));
        users.put("09175861663", new User("Seth", 100.00));
        users.put("09175861664", new User("Ryan", 100.00));
        users.put("09175861665", new User("Fritz", 100.00));

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("\n");
            System.out.println("**************************************************************************");
            System.out.println("**************************************************************************");
            System.out.println("****------------------------------------------------------------------****");
            System.out.println("****````````````   WELCOME TO miniGCash App! :)   ````````````````````****");
            System.out.println("****-----------------------------------------------------------------****");
            System.out.println("**************************************************************************");
            System.out.println("**************************************************************************");
            System.out.println("\n");
            System.out.println("Enter 1 to Share Load, 2 to Register a new user, or any other key to exit.");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("***********  Share Load  ************");
                System.out.println("\n");
                System.out.println("Enter sender's mobile number:");
                String senderMobile = scanner.nextLine();

                if(senderMobile.length() != 11 || senderMobile.isEmpty()){
                    System.out.println("Error: Please input valid phone number format");
                }
                if (!users.containsKey(senderMobile)) {
                    System.out.println("Error: Sender is not registered.");
                }

                System.out.println("\n");
                System.out.println("Enter recipient's mobile number:");
                String recipientMobile = scanner.nextLine();

                if(recipientMobile.length() != 11 || recipientMobile.isEmpty()){
                    System.out.println("Error: Please input valid phone number format");
                }
                if (!users.containsKey(recipientMobile)) {
                    System.out.println("Error: Recipient is not registered.");
                }

                User sender = users.get(senderMobile);
                User recipient = users.get(recipientMobile);


                // SEND LOAD TO RECIPIENT if valid registration
                if(!users.containsKey(recipientMobile) || !users.containsKey(senderMobile)){
                    System.out.println("\n");
                    System.out.println("!!!!!!!############ Either Sender's or Recipient's phone number is not yet registered. Please register first before SHARING a load. #######!!!!!!");
                    System.out.println("\n");
                }
                else{
                    System.out.println("Enter amount to share:");
                    double amount = Double.valueOf(scanner.nextLine());
                    sender.shareLoad(recipient, amount);
                }

            } else if (choice.equals("2")) {
                System.out.println("***********  Register User  ************");
                System.out.println("\n");
                System.out.println("Enter new user's mobile number:");
                String mobile = scanner.nextLine();

                if(mobile.length() != 11){
                    System.out.println("Error: Please input valid phone number format");
                }

                if (users.containsKey(mobile)) {
                    System.out.println("Error: Mobile number already exists.");
                }

                if (mobile.isEmpty()) {
                    System.out.println("Error: mobile number cannot be empty.");
                }

                System.out.println("Enter new user's name:");
                String name = scanner.nextLine();

                if (name.isEmpty()) {
                    System.out.println("Error: Name cannot be empty.");
                }

                //REGISTER NEW User

                User newUser = new User(name, 100.00);
                users.put(mobile, newUser);
                System.out.println("New user " + name + " registered with 100.00 pesos balance.");
            } else {
                break;
            }
        }

        System.out.println("\n");
        System.out.println("All users and their balances:");
        System.out.println("Mobile Number | Name | Balance");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.printf("%s | %s | %.2f\n", entry.getKey(), entry.getValue().getName(), entry.getValue().getBalance());
            System.out.println("--------------------------------------------------------------------------");

        }
    }
}