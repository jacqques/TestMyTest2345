import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void makeAccountTest(){
        assertThrows(InsufficientFundsException.class,()->{
            Account account = new Account(-200);
        });
    }

    @Test
    void deposit() {
        try{
            Account account = new Account(200);
            float temp = account.getBalance();
            account.deposit(200);
            assertEquals(account.getBalance(),temp+200);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    void withdraw() {
        try {
            Account account = new Account(200);
            float temp = account.getBalance();
            account.withdraw(50);
            assertEquals(temp-50,account.getBalance());
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void transferFunds() { //should make assertException when transfer too much
        try {
            Account account1 = new Account(500);
            Account account2 = new Account(500);
            float temp1 = account1.getBalance();
            float temp2 = account2.getBalance();
            account1.transferFunds(account2,500);
            assertEquals(temp1-500,account1.getBalance());
            assertEquals(temp2+500,account2.getBalance());
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    void getBalance(){
        try {
            Account account = new Account(500);
            assertEquals(account.getBalance(),500);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    void getMinBalane(){
        try {
            Account account = new Account(500);
            assertEquals(account.getMinimumBalance(),10.00F);
        }
        catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

    }
}