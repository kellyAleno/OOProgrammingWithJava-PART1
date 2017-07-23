public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(24); 
        this.minutes = new BoundedCounter(60); 
        this.seconds = new BoundedCounter(60);
        hours.setValue(hoursAtBeginning);
        minutes.setValue(minutesAtBeginning); 
        seconds.setValue(secondsAtBeginning);
        // the counters that represent hours, minutes 
        // and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        seconds.next();
        if (seconds.getValue() == 60) { 
            minutes.next();
            if (minutes.getValue() == 60) { 
                hours.next();
                if(hours.getValue() == 24) { 
                    hours.setValue(0);
                }
                minutes.setValue(0);
            }
            seconds.setValue(0);
        } 
    }
    
    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
