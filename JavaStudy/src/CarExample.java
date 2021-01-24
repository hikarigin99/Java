import java.util.Scanner;

class InputView {
	private int carCnt;
	private int number;
	
	Scanner scanner = new Scanner(System.in);
	
	public void inputCarCnt() {
		this.carCnt = scanner.nextInt();
	}
	public void inputNumber() {
		this.number = scanner.nextInt();
	}
	public int getCarCnt() {
		return this.carCnt;
	}
	public int getNumber() {
		return this.number;
	}
}

class ResultView {
	public void println(Car[] car, int count) {
		Cars cars = new Cars(car);
		for(int i = 0; i < car.length; i++) 
			System.out.println(car[i].getRun());
		System.out.println();
		for(int i = 0; i < count; i++) {	
			cars.randomPlay(car);
			System.out.println();	
		}
		
	}
}

public class CarExample {
	public static void main(String[] args) {
		System.out.println("자동차 대수는 몇 대 인가요? ");
		InputView input = new InputView();
		input.inputCarCnt();
		
		System.out.println("시도할 회수는 몇 회 인가요? "); 
		input.inputNumber();
		
		Car[] car = new Car[input.getCarCnt()];
		for(int i = 0; i < car.length; i++)
			car[i] = new Car('-');
		
		System.out.println("\n실행 결과");
		ResultView result = new ResultView();
		result.println(car, input.getNumber());
	}
}

