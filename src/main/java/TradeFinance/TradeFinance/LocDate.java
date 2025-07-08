package TradeFinance;

@DataType()
public class LocDate implements Comparable<LocDate> {

    @Property()
    private int day;

    @Property()
    private int month;

    @Property()
    private int year;

    public LocDate() {
    }

    public LocDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean after(LocDate other) {
        if (this.year > other.year) return true;
        if (this.year == other.year && this.month > other.month) return true;
        if (this.year == other.year && this.month == other.month && this.day > other.day) return true;
        return false;
    }

    @Override
    public int compareTo(LocDate o) {
        if (this.after(o)) return 1;
        else if (o.after(this)) return -1;
        return 0;
    }
}
