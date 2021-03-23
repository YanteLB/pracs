
#getting current day
currentDay = input("Enter the number of our current day: ")
currentDay = int(currentDay)

#getting the length of the holiday
holidayLength = input("How long is your holiday: ")
holidayLength = int(holidayLength)

returnDay = currentDay + holidayLength

if returnDay < 7:
    print("You will return on day number ", returnDay)

else:
    returnDay = returnDay%7
    print("You will return on day number ", returnDay)


