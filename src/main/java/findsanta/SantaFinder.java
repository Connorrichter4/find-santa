package findsanta;

public class SantaFinder {

	public static void main(String[] args) {
		
		SantaSuspects santaSuspects = new SantaSuspects(10);
		santaSuspects.addSuspects("Bob Bezanga");
		santaSuspects.addSuspects("Sally Zimmers");
		santaSuspects.addSuspects("Peter Pinkelton");
		santaSuspects.addSuspects("Bobby Drop Tables");
		santaSuspects.addSuspects("Rudolph Rednose");
		santaSuspects.addSuspects("Bob Ross");
		santaSuspects.addSuspects("Ubiga Altman");
		santaSuspects.addSuspects("Tony Ross");
		santaSuspects.addSuspects("Aaron Rogers");
		santaSuspects.addSuspects("Yolo Once");
		santaSuspects.addSuspects("Yoka Yamalla");
		santaSuspects.addSuspects("Chris Cringle");
		santaSuspects.addSuspects("Doug Dimmadome");
		
		santaSuspects.printSuspects();
		
	}

}
