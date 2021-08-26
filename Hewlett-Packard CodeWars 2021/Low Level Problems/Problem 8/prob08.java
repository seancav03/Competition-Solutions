import java.util.*;

public class prob08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String nums = s.nextLine();
		String[] numStr = nums.split(" ");
		int tall = Integer.parseInt(numStr[0]);
		int level = Integer.parseInt(numStr[1]);
		int anger = Integer.parseInt(numStr[2]);
		
		if(level > tall || level == 0) {
			while(tall > 0) {
				System.out.println("#");
				tall--;
			}
		} else {
			int heightAbove = level-2;
			int remaining = -1 + tall - heightAbove;
			while(heightAbove > 0) {
				System.out.println("#");
				heightAbove --;
			}
			String bottom = "#";
			int dist = 0;
			int check = 10;
			while(anger > check) {
				dist++;
				check += 10;
			}
			while(dist > 0) {
				bottom += ".";
				dist--;
			}
			while(remaining > 0) {
				bottom += "#";
				remaining--;
			}
			System.out.println(bottom);
			
		}

	}

}
