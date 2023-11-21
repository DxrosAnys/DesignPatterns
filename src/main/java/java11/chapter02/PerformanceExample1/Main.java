package java11.chapter02.PerformanceExample1;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Thread.sleep(20000L);
		System.out.println("starting the work...");
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
	}

}
