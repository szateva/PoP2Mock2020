public class TimePeriod {
    private int hours;
    private int minutes;

    public String toString()
    {
        return "" + hours + "h " + minutes + "m";
    }

    public TimePeriod( int h, int m )
    {
        hours = h;
        minutes = m;
        while (minutes >= 60) {
            hours++;
            minutes -= 60;
        }

    }
    public void scale( int factor )
    {
        this.minutes *= factor;
        this.hours *= factor;
        while (minutes >= 60) {
            hours++;
            minutes -= 60;
        }

    }
}
