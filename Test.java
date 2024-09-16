public class Test 
{

    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount("ayu", 1, 2, "pass");
        savings.logIn("ayu", "pass");
        savings.deposit(500);
        System.out.println(savings.getBalance());        
    }
}