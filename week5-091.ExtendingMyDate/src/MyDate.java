
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() { 
        this.day += 1; 
        if (this.day == 31) { 
            this.month +=1;
            if (this.month == 13) { 
                this.year +=1; 
                this.month = 1; 
            }
            this.day = 1; 
        }
    }
    
    public void advance(int numberOfDays) {
        int i = 0; 
        while (i != numberOfDays) { 
            advance(); 
            i++; 
        }
    }
    
    /**
     *
     * @param days
     * @return
     */
    public MyDate afterNumberOfDays(int days) { 
        MyDate newMyDate = new MyDate(this.day, this.month, this.year); 
        int i = 0; 
        while (i != days) { 
            newMyDate.advance(); 
            i++; 
        }
        return newMyDate; 
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