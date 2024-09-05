class Time {
    
    int hours;
    int minutes;
    int seconds;

   
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

   
    public Time addTime(Time t) {
        Time sum = new Time();
        sum.seconds = this.seconds + t.seconds;
        sum.minutes = this.minutes + t.minutes + sum.seconds / 60;
        sum.seconds %= 60;
        sum.hours = this.hours + t.hours + sum.minutes / 60;
        sum.minutes %= 60;
        sum.hours %= 24;
        return sum;
    }

    public static void main(String[] args) {
       
        Time t1 = new Time(5, 45, 30);    // 05:45:30
        Time t2 = new Time(3, 50, 40);    // 03:50:40

       
        System.out.print("Time 1: ");
        t1.displayTime();
        System.out.print("Time 2: ");
        t2.displayTime();

      
        Time t3 = t1.addTime(t2);

       
        System.out.print("Sum of Time 1 and Time 2: ");
        t3.displayTime();
    }
}
