//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Main-class Account*/
     Account account1 = new Account("1001", "leen",4000);
     Account account2 = new Account("1234","Renad",1000);
     Account account3 = new Account("5678","Majd",2000);
     Account account4 = new Account("9123","Abeer",3000);


        System.out.println(account1.toString());
        System.out.println("get 500 credit from account 1");
        int credit = account1.credit(500);
        if (credit == -1) {
            System.out.println("sorry no enough credit your balance is :" + account1.getBalance());
        }else {
            System.out.println("your balance is " + credit);
            ;
        }
        System.out.println("add 1000 depit to account 1");
        account1.debit(1000);
        System.out.println("your balance is " + account1.getBalance());

        System.out.println("get 500 credit from account 1");
        int credit3 = account1.credit(500);
        if (credit3 == -1) {
            System.out.println("sorry no enough credit your balance is :" + account1.getBalance());
        }else {
            System.out.println("your balance is " + account1.getBalance());
        }



        System.out.println("transfer 200 to account 2");
        int credit2 = account1.transferTo(account2,200);
        if (credit2 == -1) {
            System.out.println("sorry no enough credit");
        }else{
            System.out.println("your balance is " + credit2);
        }

     System.out.println("------------------------------------------------------------------------");
        /*Main-class Employee*/

        Employee employee2 = new Employee("3344","Ahmad",100);
        Employee employee3 = new Employee("1122","Fahad",200);
        Employee employee4 = new Employee("6677","Khalid",300);
        System.out.println(employee2.toString());
        System.out.println("your salary was raised by 2000 sr so your salary is : "+employee2.raisedSalary(2000));
        System.out.println("your annual Salary is :"+employee2.getAnnualSalary());
    }
}