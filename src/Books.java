public class Books extends Library {

	public Books() {
		super();
	}

	@Override
	public double fine() {
		if (getLateDate() >= 30 && getLateDate() !=0) {
			return fine = (getLateDate() - 30) * 0.5;
		} 
		return fine;
	}
	
	public String contentTypeString(){
		if (contentType == 1) {
		}
		return "Book"; 
	}

}
