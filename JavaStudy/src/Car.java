public class Car {
	private String run;
	
	Car(char c) {
		this.run = String.valueOf(c);
	}

	public String getRun() {
		return this.run;
	}
	public String plusRun() {
		run += '-';
		return this.run;
	}
}
