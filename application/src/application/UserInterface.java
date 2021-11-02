package application;
import java.util.*;
public class UserInterface {
    private Scanner scanner;
    private AccountHolder accountHolder;
    private Map<String, AccountHolder> accounts;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.accounts = new HashMap<String, AccountHolder>();
    }
    
    public void start() {
        while(true) {
            System.out.println("Welcome to the bank please select from the options below by pressing the required number");
            System.out.println("1 - Create Account");
            System.out.println("2 - Log into account");
            System.out.println("3 - Quit");
            System.out.print("Please make a choice: ");
            String input = scanner.nextLine();
            switch(input) {
            case "1": 
                createAccount();
                break;
            case "2":
                login();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
            }       
        }
    }
    
    private void createAccount() {
        
        System.out.println("Please enter a username");
        String username = scanner.nextLine();
        System.out.println("Please enter a password");
        String password = scanner.nextLine();
        System.out.println("Please enter name:");
        String name = scanner.nextLine();
        System.out.println("Please enter address:");
        String address = scanner.nextLine();
        System.out.println("Please enter mobile number:");
        String number = scanner.nextLine();
        System.out.println("Please enter an initial deposit ammount");
        double deposit = scanner.nextDouble();
        
        accountHolder = new AccountHolder(username, password, name, address, number, deposit);
        accounts.put(username, accountHolder);
        scanner.nextLine();
    }
    
    private void login() {
        System.out.println("Please enter your username");
        String username = scanner.nextLine();
        System.out.println("Please enter your password");
        String password = scanner.nextLine();
        
        if(accounts.containsKey(username)) {
            accountHolder = accounts.get(username);
            if(accountHolder.getPassword().equals(password)) {
                
                while(true) {
                    System.out.println("Please make a choice");
                    System.out.println("1 - Deposit");
                    System.out.println("2 - Withdraw");
                    System.out.println("3 - Balance");
                    System.out.println("4 - User information");
                    System.out.println("5 - Logout");
                    System.out.print("Please make a choice: ");
                    
                    String choice = scanner.nextLine();
                    switch(choice) {
                    case "1": 
                        System.out.println("Please enter an ammount to deposit");
                        double deposit = scanner.nextDouble();
                        accountHolder.deposit(deposit);
                        break;
                    case "2":
                        System.out.println("Please enter an ammount to withdraw");
                        double withdraw = scanner.nextDouble();
                        accountHolder.withdraw(withdraw);
                        break;
                    case "3":
                        System.out.println("Your current balance is: " + accountHolder.getBalance());
                        break;
                    case "4":
                        System.out.println(accountHolder);
                        break;
                    case "5":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option");
                            
                    }       
                }
                
                
                
            }
        }
    
    }


}