package chapter7;

class Time {
    private int hour, minute, second;

    Time() {
        this(12, 23, 30);
    }

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour <0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            return;
        }
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            return;
        }
        this.second = second;
    }
}


public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        System.out.println(t.getHour() + " " + t.getMinute()+" "+ t.getSecond());
    }
}
