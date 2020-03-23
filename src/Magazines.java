public class Magazines extends Library{
	
	public Magazines() {
		super();
	}


	@Override
	public double fine() {
		if (getLateDate() >= 30 && getLateDate() !=0) {	//Advanced tickets purchased 10 or more days
			fine = getLateDate() * 0.5;
		} 
		return fine;
	}

	@Override
	public String contentTypeString() {
		return "Magazine";
	}
}
