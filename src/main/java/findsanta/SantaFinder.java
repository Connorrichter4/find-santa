package findsanta;

import java.util.Scanner;

public class SantaFinder {

	public static void main(String[] args) {
		
		SantaSuspects santaSuspects = new SantaSuspects(20);
		santaSuspects.addSuspects("Bob@bezanga.com");
		santaSuspects.addSuspects("Sally@Zimmers.com");
		santaSuspects.addSuspects("Peter@pinkelton.com");
		santaSuspects.addSuspects("Bobby@tables.com");
		santaSuspects.addSuspects("Rudolph@rednose.com");
		santaSuspects.addSuspects("Bob@ross.com");
		santaSuspects.addSuspects("Ubiga@altman.com");
		santaSuspects.addSuspects("Tony@ross.com");
		santaSuspects.addSuspects("Aaron@rogers.com");
		santaSuspects.addSuspects("Chris@cringle.com");
		santaSuspects.addSuspects("Doug@dimmadome.com");
		
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
