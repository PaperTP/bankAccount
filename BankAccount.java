public class BankAccount
{
    //instance variables
    private String name;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;

//constructor
public BankAccount(String name, int accNum, double balance, String pass)
{
    this.name = name;
    this.accountNum = accNum;
    this.balance = balance;
    this.password = pass;
    this.loggedIn = false;
}
//mutator method - change the value of a private instance variable
    //change value of loggIn but only if username and passowrd is correct
public boolean logIn(String username, String password)
{
    if (username.equals(this.name) && password.equals(this.password))
    {
        loggedIn = true;
        return true;

    }
    else
    {
        return false;
    }
}

//accessor method - allows us to access (read-only) a private instance variable
public double getBalance()
{
    if (loggedIn == true)
    {
        return balance;
    }
    else
    {
        throw new IllegalStateException("Not logged in.");
    }
}

public double deposit(double amount)
{
    if (loggedIn == true)
    {
        balance += deposit(500);
        return balance;
    }
    else
    {
        throw new IllegalStateException("Not logged in.");
    }
    
}

}

