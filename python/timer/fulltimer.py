from timer import *
from stopwatch import *

which_time = input("what timer do you need? (please put timer for a countdown or stopwatch)")


if which_time == "timer":
    start()
if which_time == "stop":
    start_stopwatch()