import java.util.Random;

public class Cars {
	String[] cars; // 수정수정
	
	public Cars(Car[] car) {
		cars = new String[car.length];
		for(int i = 0; i<cars.length; i++) {
			cars[i] = car[i].getRun();
		}
	}

	Random random = new Random();
	
	public void randomPlay(Car[] car) {
		for(int i = 0; i < car.length; i++) {
			if(random.nextInt(10) > 4)
				car[i].plusRun();
			System.out.println(car[i].getRun());
		}
	}
	public String[] getPrint() {
		return cars;
	}
}
