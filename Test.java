public class Test 
{

    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount("ayu", 1, 2, "pass");
        savings.logIn("ayu", "pass");
        System.out.println(savings.getBalance());
        savings.deposit(25);
        System.out.println(savings.toString());


    }
}