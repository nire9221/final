public class Books extends Library {

	public Books() {
		super();
	}

	@Override
	public double fine() {
		if (getLateDate() >= 30 && getLateDate() !=0) {	//Advanced tickets purchased 10 or more days
			fine = getLateDate() * 0.5;
		} 
		return fine;
	}
	
	public String contentTypeString(){
		if (contentType == 1) {
		}
		return "Book"; 
	}

}
