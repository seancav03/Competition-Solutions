import java.util.*;

public class prob15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String[] gemOrder = { "Lapis", "Topaz", "Tourmaline", "Sapphire", "Peridot", "Ruby", "Pearl", "Emerald", "Diamond", "Aquamarine", "Amethyst", "Garnet" };
		ArrayList<String> ponnies = new ArrayList<String>();
		ArrayList<String> res = new ArrayList<String>();
		String line = s.nextLine();
		while(!line.equals("END")) {
			ponnies.add(line);
			line = s.nextLine();
		}
		ArrayList<String> curRank = new ArrayList<String>();
		while(ponnies.size() > 0) {
			curRank.clear();
			int highestRank = 100;
			for(String str : ponnies) {
				String[] parts = str.split(" ");
				int highest = 100;
				for(String p : parts) {
					for(int i = 0; i < gemOrder.length; i++) {
						if(p.equals(gemOrder[i])) {
							if(i < highest) {
								highest = i;
							}
						}
					}
				}
				if(highest < highestRank) {
					curRank.clear();
					curRank.add(str);
					highestRank = highest;
				} else if (highest == highestRank) {
					curRank.add(str);
				}
			}
			Collections.sort(curRank);
			ponnies.removeAll(curRank);
			for(String pon : curRank) {
				System.out.println(pon);
			}
			
		}
		

	}

}
