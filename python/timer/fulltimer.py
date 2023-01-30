from timer import *
from stopwatch import *
import sys

def which_time():
    return input("What timer do you need? (Please enter 'timer' for a countdown or 'stopwatch'): ")

for i in range(11):
    time_type = which_time()
    if time_type == "timer":
        start()
    elif time_type == "stopwatch":
        start_stopwatch()
    elif i == 11:
        print("To many attepts")
        sys.exit()
    else:
        print("Invalid input, please try again.")
        print(i)
