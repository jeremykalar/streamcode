import time
def timer(hours, minutes, seconds):
    total_seconds = hours * 3600 + minutes * 60 + seconds
    while total_seconds:
        hours, remainder = divmod(total_seconds, 3600)
        mins, secs = divmod(remainder, 60)
        time_left = f"{hours:02d}:{mins:02d}:{secs:02d}"
        print(time_left, end="\n")
        time.sleep(1)
        f= open("../timer.txt", "w")
        f.write(time_left)
        f.close()
        total_seconds -= 1
    print("Time's up!")



