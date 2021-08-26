import java.util.*;

public class prob17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String[] input = s.nextLine().split(" ");
		String[] startArr = input[0].split(":");
		String[] endArr = input[1].split(":");
		int start = Integer.parseInt(startArr[0])*3600 + Integer.parseInt(startArr[1])*60 + Integer.parseInt(startArr[2]);
		int end = Integer.parseInt(endArr[0])*3600 + Integer.parseInt(endArr[1])*60 + Integer.parseInt(endArr[2]);
		int time = end-start;
		time += 40;
		double width = 5.0;
		width -= time * 0.01;
		int outWid = (int)((width+0.005)*100);
		double resWid = ((double)outWid)/100.0;
		System.out.println(resWid >= 0 ? resWid : "0.00");
		int dots = (int)Math.floor(width / 0.2);
		String topLines = "|";
		int copy = dots;
		while(copy > 0) {
			topLines += " ";
			copy--;
		}
		topLines += "|";
		System.out.println(topLines);
		System.out.println(topLines);
		System.out.println(topLines);
		System.out.println(topLines);
		System.out.println(topLines);
		String bot = "|";
		while(dots > 0) {
			bot += ".";
			dots--;
		}
		bot += "|";
		System.out.println(bot);
		if(resWid < 0.2) {
			System.out.println("CURSE MY METAL BODY, I WASN'T FAST ENOUGH!");
		} else if(resWid == 0.2) {
			System.out.println("THIS IS SOME RESCUE!");
		} else {
			System.out.println("THE FORCE WAS WITH YOU");
		}
		
	}

}