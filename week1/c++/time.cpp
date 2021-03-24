
#include<iostream>

using namespace std;

int toInt();

int main()
{
    ////Defining my variablesh
    int intCurrentTime = 0;
    int intWaitingTime = 0;
    bool notInRange = true;
    int intOffTime = 0;

    ///toInt will read an int Values and also validate it
    cout << "Please enter your current time: ";
    intCurrentTime =  toInt();


    ///This while loop will make sure that my valuu is within Range
    while(notInRange)
    {
        if(intCurrentTime < 0 || intCurrentTime > 23)
        {
            cout << "You must enter a value within the range [0 - 23] " << endl;
            cout << "Please enter your current time: ";
            intCurrentTime = toInt();
        }
        else
        {
            notInRange = !notInRange;
        }
    }

    ///getting the waiting time
    cout << "Please enter your waiting time time: ";
    intWaitingTime = toInt();

    ///computing the time in which the alarm will go off
    intOffTime = intCurrentTime + intWaitingTime;

    if(intOffTime < 24)
    {
        cout << "Your alarm will go off at " << intOffTime << endl;
    }
    else
    {
        intOffTime = intOffTime % 24;
        cout << "Your alarm will go off at " << intOffTime << endl;
    }

    return 0;
}

int toInt()
{
    int intCurrentTime;

    cin  >> intCurrentTime;

    while(!cin) ///same as cin.fail()
    {
        cin.clear();
        cin.ignore(1000, '\n');
        cout << "You current time must be a number\n";
        cout << "Please enter your  time: ";
        cin  >> intCurrentTime;
    }
    return intCurrentTime;
}