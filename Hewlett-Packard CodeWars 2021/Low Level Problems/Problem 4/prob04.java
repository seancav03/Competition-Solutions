import java.util.*;

public class prob04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int lines = Integer.parseInt(s.nextLine());
		String[] arr = new String[lines];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextLine();
		}
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
	}

}
