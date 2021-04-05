import java.util.Scanner;

public class Week
{

///defining my important variables
    static int intCurrentDay = 0;
    static int intStayDay = 0;
    static int intReturnDay = 0;
    static Scanner cin = new Scanner(System.in);

/// main method
    public static void main(String[] args)
    {
     ///getting current day
        System.out.print("Enter your current day: ");
        intCurrentDay = readInt();

        ///making sure that is within range
        while(true)
        {
            if(intCurrentDay < 0 || intCurrentDay > 6)
            {
                System.out.println("You must enter a day between [0 - 6]");
                System.out.print("Enter your current day:");
                intCurrentDay  = readInt();
            }
            else break;
        }

    ///getting the duation of stay
        System.out.print("How long is your holiday: ");
        intStayDay = readInt();

        ///making sure that is positive
        while(true)
        {
            if(intStayDay < 0)
            {
                System.out.println("You must enter a positive number");
                cin.nextLine();
                intStayDay = readInt();
            }
            else break;
        }

        ///computing the duration of stay
        intReturnDay = intCurrentDay+intStayDay;
        if(intReturnDay > 7)
        {
            System.out.print("You will return on day number ");
            System.out.println(intReturnDay);
        }
        else
        {

            System.out.print("You will return on day number ");
            System.out.println(intReturnDay%7);
        }
    }
//defination of read input
    public static int readInt()
    {
        int intNumber = 0;
        while(true)
        {
            if(cin.hasNextInt())
            {
                intNumber = cin.nextInt();
                break;
            }
            else
            {
                System.out.println("You must enter an integer");
                cin.nextLine();
                System.out.print("Enter your current day: ");
            }
        }
        return intNumber;
    }
}