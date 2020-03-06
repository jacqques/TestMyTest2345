import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        System.out.println("hahahahahahaha");
        System.out.println("hahahahahahaha");
        Triangles triangle = new Triangles();
        System.out.println(triangle.triangleType(4, 4, 4));
        System.out.println(triangle.triangleType(4,4,5));
        System.out.println(triangle.triangleType(4,5,6));


        ArrayList<Account> accounts = new ArrayList<Account>();
        try {
            accounts.add(new Account(500));
            accounts.add(new Account());
            accounts.add(new Account(2000000));
            accounts.add(new Account(1));
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        try {
            accounts.get(2).transferFunds(accounts.get(1), 200);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        for (Account account : accounts){
            System.out.println(account.getBalance());
        }


    }

    public boolean isEven(int n) throws InputMismatchException {
        if (n < 0 || n > 1000){
            throw new InputMismatchException("this not okay");
        }
        return n % 2 == 0;
    }
}
