// import java.util.Scanner;

// public class BankAccountDemo {

//     BankAccount save1 = new SavingsAccount();
//     BankAccount save2 = new SavingsAccount();
//     BankAccount save3 = new SavingsAccount();
//     BankAccount save4 = new SavingsAccount();
//     BankAccount save5 = new SavingsAccount();

//     BankAccount check1 = new CheckingAccount();
//     BankAccount check2 = new CheckingAccount();
//     BankAccount check3 = new CheckingAccount();
//     BankAccount check4 = new CheckingAccount();
//     BankAccount check5 = new CheckingAccount();

//     BankAccount[] accounts = { save1, save2, save3, save4, save5,
//             check1, check2, check3, check4, check5 };

//     Scanner in = new Scanner(System.in);
//     boolean done = false;

//     while (!done) {
//         System.out.print("D)eposit W)ithdraw M)onth end Q)uit: ");
//         String input = in.next();
//         if (input.equals("D") || input.equals("W")) { // Deposit or withdrawal

//             System.out.print("Enter account number and amount: ");
//             int num = in.nextInt();
//             double amount = in.nextDouble();
//             if (input.equals("D")) {
//                 accounts[num].deposit(amount);
//             } else {
//                 accounts[num].withdraw(amount);
//             }
//             System.out.println("Balance: " + accounts[num].getBalance());
//         } else if (input.equals("M")) { // Month end processing

//             for (int n = 0; n < accounts.length; n++) {
//                 accounts[n].monthEnd();
//                 System.out.println(n + " " + accounts[n].getBalance());
//             }
//         } else if (input.equals("Q")) {
//             done = true;
//         }
//     }

// }
// }
