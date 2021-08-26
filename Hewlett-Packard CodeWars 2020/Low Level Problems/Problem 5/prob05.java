import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class prob05 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader f = new BufferedReader(new FileReader("prob05-1-in.txt"));
		int num = Integer.parseInt(f.readLine());
		
		//Calculation
		boolean isPrime = true;
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		//Output
		if(isPrime) {
			System.out.println(num + " is PRIME");
		} else {
			System.out.println(num + " is not PRIME");
		}
		
		f.close();
	}

}
