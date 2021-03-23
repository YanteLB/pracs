
#importing the required modules
import sys

try:
    number = int(input("Enter a number: "))

except sys.exc_info()[0]:
    print("hahah")
    print(sys.exc_info()[2])