#include<iostream>

using namespace std;

///function prototypes
int toInt();         ///this will read in an integer value
void rangeFunction(int lower, int upper);


int main()
{
///defining important varables
    int intCurrentDay = 0;
    int intStayDay = 0;
    int intReturnDay = 0;

///reading the currenty day
    cout << "Enter  your current day: ";
    intCurrentDay = toInt();
    ///making sure that current day is within range
    while(true)
    {
        if(intCurrentDay < 0 || intCurrentDay > 6)
        {
            string str;
            cout << "You number mumber must be between [0 -6]" << endl;
            cout << "Enter your current day: ";
            ///cin >> str;
            intCurrentDay = toInt();
        }
        else break;
    }
    
///reading the period of stay
    cout << "Enter the length of your stay: ";
    intStayDay = toInt();
    ///making sure that the length of stay is > 0
    while(true)
    {
        if(intStayDay < 0)
        {
            cout << "You must enter a positive number " << endl;
            cout << "Enter the length of your stay: "; 
            intStayDay = toInt();
        }
        else break;
    }

///printing the return day
    intReturnDay = intCurrentDay+intStayDay;
    if(intReturnDay < 7 )
    {
        cout << "You will return on day number " << intReturnDay << endl;

    }
    else
    {
        cout << "You will return on day number " << intReturnDay%7 << endl;
    }
return 0;
}

///defination of toInt()
int toInt()
{
    int intNumber = 0;
    cin  >> intNumber;
    while(!cin)
    {
        cin.clear();        ///clearing flg
        cin.ignore(1000, '\n');   ///clearing the stream buffer
        cout << "You must enter an integer " << endl;
        cout << "Enter your current day: ";
        cin >> intNumber;
    }

    return intNumber;
}