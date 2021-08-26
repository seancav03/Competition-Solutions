import java.util.*;

public class prob06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int length = Integer.parseInt(s.nextLine());
		String cypherText = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String plaintext= "FGHIJKLMNOPQRSTUVWXYZABCDE ";
		String text = s.nextLine();
		String res = "";
		for(char c : text.toCharArray()) {
			int val = plaintext.indexOf(c);
			res += cypherText.charAt(val);
		}
		System.out.println(res);
		
		
	}

}
