import sys

notValid = True

#getting current time
while notValid:
    try:
        currentTime = int(input("Please enter your current time: "))
        break

    except:
        print("invalid input, please eneter a number")
        continue

##checking if the current time is valid
if currentTime < 0 or currentTime > 23:
    print("Invalid input, Please enter a number in the range [0 - 23]")
    sys.exit(0)

#getting time to wait for the alarm
while notValid:
    try:
        timeToWait = int(input("How many hours you want to wait for the alarm: "))
        break

    except:
        print("invalid input, please enter a number")
        continue

##checking if timeToWait is valid
if timeToWait < 0:
    print("Invalid input, Please enter a positive value")
    sys.exit(0)

offTime = currentTime + timeToWait

if offTime < 24 :
    print("Your alarm will go off at ", offTime)

else:
    offTime = offTime%24
    print("Your alarm will go off at ", offTime)

