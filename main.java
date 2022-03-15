package com.example.intrest_calculator;
import java.util.Scanner;
class interest //Class defined for the purpose of interest calculation
{
    void interest(double rate)//parametrized method
    {
        double amt, si, time;
        System.out.println(" Kindly Enter the Principle Amount:"); //reading amount
        Scanner input = new Scanner(System.in);
        amt = input.nextDouble();
        System.out.println("Enter the time of repayment in Months:"); //reading time period
        time = input.nextDouble();
        si = (amt * rate * time) / 1200; //simple interest calculation
        System.out.println("Your Simple Interest is " + si+ " at the rate of interest "+rate+" % for the period of "+time +" months");
    }
}

class hdfc extends interest //class inherited
{
    interest i = new interest(); //object created for the class interest
    public void personal()
    {
        System.out.println("You have selected Personal loan");
        i.interest(12.4);//object accessed using dot operator
    }
    public void educational()
    {
        System.out.println("You have selected Educational loan");
        i.interest(8.6);
    }
    public void home()
    {
        System.out.println("You have selected Home loan");
        i.interest(7);
    }
}

class indian extends  hdfc //multilevel inheritance
{
    interest i = new interest();

    public void personal()
    {
        hdfc h = new hdfc(); //object created
        h.personal();
    }
    public void educational()
    {
        System.out.println("You have selected Educational loan");
        i.interest(11); //parameter passed for the method interest
    }
    public void home()
    {
        System.out.println("You have selected Home loan");
        i.interest(8.63);
    }
    public void vehicle( )
    {
        System.out.println("You have selected Vehicle loan");
        i.interest(6.4);
    }
}
class federal extends indian
{
    interest i = new interest();
    indian f = new indian();
    public void educational()
    {
        System.out.println("You have selected Educational loan");
        i.interest(11);
    }
    public void home()
    {
        f.home();
    } //inheriting the properties of hdfc class

    public void vehicle()
    {
        f.vehicle();
    }
    public void business()
    {
        System.out.println("You have selected Business loan");
        i.interest(13);
    }
}
class union extends interest
{
    interest i = new interest();
    public void personal()
    {
        System.out.println("You have selected Personal loan");
        i.interest(14.6);
    }
    public void gold()
    {    int gold;
        System.out.println("You have selected Gold loan\n Enter the gram of golds:");
        Scanner input = new Scanner(System.in);
        gold = input.nextInt();
        i.interest(5.7);

    }

}
public class main //main class
{
    public static void main(String[] args)
    {
        int bank,loan; //declaring variables
        System.out.println("Welcome to Interest Calculator");
        System.out.println("The available banks are \n 1.HDFC Bank \n 2.Indian Bank \n 3.Federal Bank \n 4.Union Bank");
        System.out.println("Kindly select the bank by choosing corresponding number:");
        Scanner input = new Scanner(System.in);
        bank = input.nextInt();
        switch (bank) //switch case
        {
            case 1:
                hdfc h = new hdfc(); // object created
                System.out.println("You have selected Hdfc Bank");
                System.out.println("\n Loans available in the HDFC bank are \n 1.Personal Loan \n 2.Educational Loan \n 3.Home loan");
                System.out.println("Kindly select the loan by choosing corresponding number:");
                loan = input.nextInt();
                switch (loan) //nested switch case
                {
                    case 1:
                        h.personal();
                        break; //breaks the loop immediately
                    case 2:
                        h.educational();
                        break;
                    case 3:
                        h.home();
                        break;
                    default:
                        System.out.println("SELECT AN APPROPRIATE OPTION");
                }//end of case 2
                break;

            case 2:
                indian f = new indian(); //object creation
                System.out.println("You have selected Indian Bank");
                System.out.println("\n Loans available in the Indian bank is \n 1.Personal Loan \n 2.Educational Loan \n 3.Home loan"
                        +"\n 4.Vehicle loan ");
                System.out.println("Kindly select the loan by choosing corresponding number:");
                loan = input.nextInt();
                switch (loan)
                {
                    case 1:
                        f.personal(); //object accessed
                        break;
                    case 2:
                        f.educational();
                        break;
                    case 3:
                        f.home();
                        break;
                    case 4:
                        f.vehicle();
                        break;
                    default:
                        System.out.println("SELECT AN APPROPRIATE OPTION");
                }//end of case 2
                break;

            case 3:
                federal a = new federal();
                System.out.println("You have selected Federal BANK ,\n Loans available in the federal bank are \n 1.Personal Loan \n 2.Educational Loan \n 3.Home loan " +
                        "\n 4.Vehicle loan \n 5.Business loan ");
                System.out.println("Kindly select the loan by choosing corresponding number:");
                loan = input.nextInt();
                switch (loan)
                {
                    case 1:
                        a.personal();
                        break;
                    case 2:
                        a.educational();
                        break;
                    case 3:
                        a.home();
                        break;
                    case 4:
                        a.vehicle() ;
                        break;
                    default:
                        System.out.println("SELECT AN APPROPRIATE OPTION");
                } // end of case 3
                break;
            case 4:
                union u = new union();
                System.out.println("You have selected Union Bank \n Loans available in the Union bank are, \n 1.Personal Loan \n 2.Gold Loan ");
                System.out.println("Kindly select the loan by choosing corresponding number:");
                loan = input.nextInt();
                switch (loan)
                {
                    case 1:
                        u.personal();
                        break;
                    case 2:
                        u.gold();

                        break;

                    default:
                        System.out.println("SELECT AN APPROPRIATE OPTION");
                } //end of case 4
                break;
            default:
                System.out.println("SELECT AN APPROPRIATE OPTION");
        }//end of switch case


    }



}