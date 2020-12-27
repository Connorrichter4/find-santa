package findsanta;

import java.util.Scanner;

public class SantaFinder {

	public static void main(String[] args) {
		
		SantaSuspects santaSuspects = new SantaSuspects(20);
		santaSuspects.addSuspects("Bob Bezanga");
		santaSuspects.addSuspects("Sally Zimmers");
		santaSuspects.addSuspects("Peter Pinkelton");
		santaSuspects.addSuspects("Bobby Drop Tables");
		santaSuspects.addSuspects("Rudolph Rednose");
		santaSuspects.addSuspects("Bob Ross");
		santaSuspects.addSuspects("Ubiga Altman");
		santaSuspects.addSuspects("Tony Ross");
		santaSuspects.addSuspects("Aaron Rogers");
		santaSuspects.addSuspects("Chris Cringle");
		santaSuspects.addSuspects("Doug Dimmadome");
		
		System.out.print("Provide a name to search for: ");
		Scanner scan = new Scanner(System.in);
		String searchFor = scan.nextLine();
		
		boolean foundMatch = santaSuspects.foundMatch(searchFor);
		if(foundMatch) {
			System.out.println(searchFor + " is indeed a santa suspect");
		}else {
			System.out.println(searchFor + " is not a santa suspect");
		}
		
		scan.close();
		
	}

}
