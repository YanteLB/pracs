
#getting the data frim the user
tempFah = input("Enter your temperature in Fahrenheit: ")
tempFah = int(tempFah)   # converting into int

#doing the actual convertion and rounding
tempDeg = (tempFah - 32)*(5/9)
tempDeg = round(tempDeg, 2)

#print the results
print("Your temperature in degrees Celsius(C) is equal to ", tempDeg, sep = '')