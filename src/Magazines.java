public class Magazines extends Library{
	
	public Magazines() {
		super();
	}


	@Override
	public double fine() {
		if (getLateDate() >= 30 && getLateDate() !=0) {	
			return fine = (getLateDate() - 30) * 0.5;
		} 
		return fine;
	}

	@Override
	public String contentTypeString() {
		if (contentType == 2) {
		}
		return "Magazine"; 
	}
}
