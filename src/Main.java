public class Main
{

    public static void main(String[] args)
    {
	int creditBalance = 5000;
    double interestRate1 = 0;
    double totalMonth1 = 0;
    double interestRate2 = 0;

    interestRate1 = creditBalance * 0.17;
    totalMonth1 = creditBalance + interestRate1;
    interestRate2 = totalMonth1 * 0.17;

        System.out.println("The interest rate due after one month is $" + interestRate1);
        System.out.println("The interest rate due after two months is $" + interestRate2);




    }
}
