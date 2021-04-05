import java.util.Scanner;

/**
 * Time
 */
public class Time 
{
    static Scanner cin  = new Scanner(System.in);
    static int intCurrentTime = 0;
    static int intWaitingTime = 0;
    static boolean blnNotInt = true; /// asumming that the user will a non-int
    static boolean notInRange = true;

    public static void main(String[] args)
    {
        ///getting the current time
        intCurrentTime = readInPut("Please enter your current time: ");

        //making sure that the user enter current time between 0 and 23
        while(notInRange)
        {
            if(intCurrentTime < 0 || intCurrentTime > 23)
            {
                System.out.println("You must enter number in the range [0 - 23]");
                cin.nextLine();
                intCurrentTime = readInPut("Please enter your current time: ");
            }
            else
            {
                break;
            }
        }
        ///getting the Waiting time
        intWaitingTime = readInPut("Please enter your waiting time: ");

        ///making sure that waiting time is positive
        while(notInRange)
        {
            if(intWaitingTime < 0)
            {
                System.out.println("Enter a postive number");
                cin.nextLine();
                intWaitingTime = readInPut("Please enter your waiting time: ");
            }
            else
            {
                break;
            }
        }

        ///computing the off time
        int intOfftime = intCurrentTime + intWaitingTime;
        if(intOfftime < 24)
        {
            System.out.print("Your arlam will go off at ");
            System.out.println(intOfftime);
        }
        else
        {
            System.out.print("Your alarm will go off at ");
            System.out.println(intOfftime%24);
        }

        cin.close();
    }

    //// this fucntion will read the user input
    public static int readInPut(String strString)
    {
        int intNumber = 0;
        while(blnNotInt)
        { 
            System.out.print(strString);
            if(cin.hasNextInt())
            {
                intNumber = cin.nextInt();
                break;
                //blnNotInt = !blnNotInt;
            }
            else
            {
                System.out.println("You must enter a whole number");
                cin.nextLine(); /// clearing the buffer
            }
        }
        return intNumber;
    }
}   

