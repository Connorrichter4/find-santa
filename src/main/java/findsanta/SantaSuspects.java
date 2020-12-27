package findsanta;

public class SantaSuspects {
	
	String[] suspects;
	int nextIndex = 0;
	int arraySize = 0;
	
	public SantaSuspects(int size) {
		this.arraySize = size;
		this.suspects = new String[size];
	}
	
	public void addSuspects(String suspect) {
		this.suspects[this.nextIndex] = suspect;
		this.nextIndex++;
		if(this.nextIndex == this.arraySize) {
			this.nextIndex = 0;
		}
	}
	
	public boolean foundMatch(String input) {
		for (int i = 0; i < this.suspects.length; i++) {
			if(null == this.suspects[i]) {
				continue;
			}
			if(this.suspects[i].matches(input)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void printSuspects() {
		for (int i = 0; i < this.suspects.length; i++) {
			if(null == this.suspects[i]) {
				continue;
			}
			System.out.println(this.suspects[i]);
		}
	}
	
}
