public class Equals {

	public static void main(String[] args) {
		Date d1=new Date(02,01,2005);
		Date d2=new Date(06,01,2005);
		System.out.println(d1==d2);
		System.out.println(d2.equals(d1));
	}

}
class Date{
	int day;
	int month;
	int year;
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}
 
	@Override
	public boolean equals(Object obj) {
		if(this==null) {
			return false;
		}
		if(this==obj) {
			return true;
		}
		if(obj instanceof Date){
			Date d2=(Date)obj;
			if(this.day==d2.day && this.month==d2.month && this.year==d2.year) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
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
	
}
