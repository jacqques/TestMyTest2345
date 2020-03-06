public class Account {

    private float balance;
    private float minimumBalance = 10.00F;

    public Account(float amount) throws InsufficientFundsException{
        if (amount < minimumBalance) throw new InsufficientFundsException("not opening accoutns with not money");
        this.balance += amount;

    }
    public Account(){
        this.balance = 0;
    }

    public void deposit(float amount){
        balance +=amount;
    }
    public void withdraw(float amount) throws InsufficientFundsException {
        balance -= amount;
        if (balance < minimumBalance){
            throw new InsufficientFundsException("Not enough money ya goofball");
        }
        return;
    }

    public void transferFunds(Account destination, float amount) throws InsufficientFundsException{
        if (this.balance - amount < this.minimumBalance){
            throw new InsufficientFundsException("Not enough money ya goofball, transfer not complete");
        }
        this.withdraw(amount);
        destination.deposit(amount);
        return;
    }

//----------------------------------------------------------------------------------------------------------------------
    public float getMinimumBalance() {
        return minimumBalance;
    }

    public float getBalance() {
        return balance;
    }
}
