public class Flyer {

	public static void main(String[] args) {
		
		Flyer startProgram = new Flyer();
		startProgram.createAirplaneData();
		
		
		
		AirplaneAnalysis myQuestions = new AirplaneAnalysis();
		// with the answers to the above questions, tell which airplane it might be(rule out planes it can't be
		
		
	}

	private void createAirplaneData() {
		
		AirplaneData F15 = new AirplaneData();
		F15.setEngineType("jet");
		F15.setEngineNumber(2);
		F15.setEngineLocation("body");
		
		AirplaneData F16 = new AirplaneData();
		F16.setEngineType("jet");
		F16.setEngineNumber(1);
		F16.setEngineLocation("body");
		
		AirplaneData F18 = new AirplaneData();
		F18.setEngineType("jet");
		F18.setEngineNumber(2);
		F18.setEngineLocation("body");
		
		AirplaneData F22 = new AirplaneData();
		F22.setEngineType("jet");
		F22.setEngineNumber(2);
		F22.setEngineLocation("body");
		
		AirplaneData F35 = new AirplaneData();
		F35.setEngineType("jet");
		F35.setEngineNumber(1);
		F35.setEngineLocation("body");
		
		AirplaneData A10 = new AirplaneData();
		A10.setEngineType("jet");
		A10.setEngineNumber(2);
		A10.setEngineLocation("tail");
		
		
		
		System.out.println("F16 has " + F16.getEngineNumber() + " engines");
		System.out.println("F18 has " + F18.getEngineNumber() + " engines");
		System.out.println("F35 has " + F35.getEngineNumber() + " engines");
		
		
	}

}