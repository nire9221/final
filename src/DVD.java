
public class DVD extends Library{

	public DVD() {
		super();
	}

	@Override
	public double fine() {
		//60 days free 
		if (getLateDate() >= 60 && getLateDate() !=0) {	//Advanced tickets purchased 10 or more days
			fine = getLateDate() * 0.5;
		} 
		return fine;
	}

	@Override
	public String contentTypeString() {
		return "DVD";
	}
}
