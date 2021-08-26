import java.util.*;

public class prob02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		String[] nums = line.split(" ");
		double height = Double.parseDouble(nums[0]);
		double radius = Double.parseDouble(nums[1]);
		int res = (int)((3.1415926536 * height * radius * radius + 0.005)*100);
		double result = ((double)res)/100;
		
		
		System.out.println(result + " cubic inches");
		
		
	}

}
