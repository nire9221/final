
public class Client {

	public static void main(String[] args) {

		Library book = new Books();
		book.setTitle("Netional Geography");
		book.setStatus("reserved");
		book.getStatus();
		book.setCheckInDate("2020-05-24");
		book.setReturnDate("2020-06-26");
		
		System.out.println(book.toString());
		System.out.println();
		
		Library magazine = new Magazines();
		magazine.setTitle("vogue 11");
		magazine.setStatus("available");
		magazine.getStatus();
		magazine.setCheckInDate("2020-05-24");
		magazine.setReturnDate("2020-05-28");
		
		System.out.println(magazine.toString());
		System.out.println();
		
		
		Library magazine2 = new Magazines();
		magazine2.setTitle("IT today");
		magazine2.setStatus("available");
		magazine2.getStatus();
		magazine2.setCheckInDate("2020-05-24");
		magazine2.setReturnDate("2020-06-28");
		
		System.out.println(magazine2.toString());
		System.out.println();
	}

}


