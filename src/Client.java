
public class Client {

	public static void main(String[] args) {

		Library book = new Books();
		book.setTitle("Netional Geography");
		book.getContentType();
		book.setCheckInDate("2020-05-24");
		book.setReturnDate("2020-02-24");
		
		System.out.println(book.toString());
		System.out.println();
		
		Library magazine = new Magazines();
		magazine.setTitle("vogue 11");
		magazine.getContentType();
		magazine.setCheckInDate("2020-05-24");
		magazine.setReturnDate("2020-02-24");
		
		System.out.println(book.toString());
		System.out.println();
		
	}

}


