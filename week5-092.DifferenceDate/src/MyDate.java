
import static java.lang.Math.abs;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }
    
    public int differenceInYears(MyDate comparedDate) { 
        int day1 = comparedDate.day + comparedDate.month*30 
                + comparedDate.year*360; 
        int day2 = this.day + this.month*30 + this.year*360; 
        return abs(day1 - day2)/360; 
    }
        
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
