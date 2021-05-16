package p1;
import java.util.Scanner;
import java.util.*;
public class Dream11 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String str = sc.nextLine();
			String[] arr = str.split(",");
			boolean invalid = false;
			int budget=0;
			int total = 0;

			if(arr.length==19) {
				ArrayList<Integer> batsman = new ArrayList<Integer>(); 
				ArrayList<Integer> wicketKeeper = new ArrayList<Integer>();
				ArrayList<Integer> allRounder = new ArrayList<Integer>();
				ArrayList<Integer> bowler = new ArrayList<Integer>();
				ArrayList<Integer> extra = new ArrayList<Integer>();
				for(int i=0;i<=18;i++) {
					if(i==0) {
						budget = Integer.parseInt(arr[0]);
					}
					else if(i>=1 && i<=7) {
						batsman.add(Integer.parseInt(arr[i]));
						if(i==7) {
							Collections.sort(batsman);
							extra.add(batsman.get(3));
							extra.add(batsman.get(4));
						}
					}
					else if(i>=8 && i<=10) {
						total += batsman.get(i%8);
						wicketKeeper.add(Integer.parseInt(arr[i]));
						if(i==10) {
							Collections.sort(wicketKeeper);
							total += wicketKeeper.get(0);
							extra.add(wicketKeeper.get(1));
						}
					}
					else if(i>=11 && i<=12) {
						allRounder.add(Integer.parseInt(arr[i]));
						if(i==12) {
							Collections.sort(allRounder);
							total += allRounder.get(0);
							extra.add(allRounder.get(1));
						}
					}
					else {
						bowler.add(Integer.parseInt(arr[i]));
						if(i==18) {
							Collections.sort(bowler);
							total += bowler.get(0) + bowler.get(1) + bowler.get(2);
							extra.add(bowler.get(3));
							extra.add(bowler.get(4));
						}
					}
				}
				Collections.sort(extra);
				for(int m=0;m<3;m++){
					if(total + extra.get(m)>budget) {
						invalid = true;
						break;
					}
					total += extra.get(m);
				}
			}
			else {
				invalid = true;
			}
			
			if(invalid == true) {
				System.out.println("invalid input");
			}
			else {
				System.out.println(total);
			}
		}

	}
}
