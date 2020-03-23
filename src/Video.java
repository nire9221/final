public class Video extends Library {

	public Video() {
		super();
	}


	@Override
	public double fine() {
		//90 days free
		if (getLateDate() >= 90 && getLateDate() !=0) {	//Advanced tickets purchased 10 or more days
			fine = getLateDate() * 0.5;
		} 
		return fine;
	}

	@Override
	public String contentTypeString() {
		if (contentType == 3) {
		}
		return "Video"; 
	}
}
