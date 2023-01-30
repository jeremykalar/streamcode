import time
def start_stopwatch():
    print("Press Enter to start the stopwatch, press Ctrl + C to stop")
    
    input()
    
    start_time = time.time()
    
    try:
        while True:
            elapsed_time = time.time() - start_time
            hours, remainder = divmod(elapsed_time, 3600)
            minutes, seconds = divmod(remainder, 60)
            stopwatch_time = "{:02}:{:02}:{:02}".format(int(hours), int(minutes), int(seconds))
            print(stopwatch_time)
            time.sleep(1)
            f= open("../timer.txt", "w")
            f.write(stopwatch_time)
            f.close()
    except KeyboardInterrupt:
        print("\nStopwatch stopped")