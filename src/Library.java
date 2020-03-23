import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Library {

	protected String title;
	protected int contentType; // 1 = book, 2 = magazine, 3 = video, 4 = DVD/CD
	protected String status;  //available or reserved 
	protected String checkInDate;  //yyyy-mm-dd
	protected String returnDate; //yyyy-mm-dd
	double fine; //50 cents per day, 30 days free 
	double total;

	
	public abstract double fine();
	public abstract String contentTypeString();
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContentType(int contentType) {
		this.contentType = contentType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getFine() {
		  String formattedPrice = NumberFormat.getCurrencyInstance().format(fine());
		return formattedPrice;
	}
	public void setFine(double fine) {
		this.fine = fine;
	}

	public String Total() {
		total = (double) (fine());
		String formattedPrice = NumberFormat.getCurrencyInstance().format(total);
		return formattedPrice;
	}
	
	public long getLateDate() {
		LocalDate Cdate = LocalDate.parse(checkInDate);
		LocalDate Rdate = LocalDate.parse(returnDate);
		long diff = ChronoUnit.DAYS.between(Cdate, Rdate);
		return Math.abs(diff);
	}
	
	public String toString() {
		if (status == "reserved") {
			return "The item " + title +" " + contentTypeString()  + " is currently " + status;
		}
		return  "You borrowed " + title + " "+ contentTypeString() + " on " + getCheckInDate() + " and returned " + getReturnDate() + ". There will be charged " + Total() + " late fee";
	}
	
	
}
