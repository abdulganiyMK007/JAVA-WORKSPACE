package Chapter3;

/*
Implement a VotingMachine class that can be used for a simple election. Have methods to clear the machine state, to vote for a Democrat, to vote for a Republican, and to get the tallies for both parties.
*/
public class VotingMachine {

	private int democratVoteCount;
	private int replublicanVoteCount;
	
	public VotingMachine() {
		democratVoteCount = 0;
		replublicanVoteCount = 0;
	}
	
	public void voteForDemocrat() {
		democratVoteCount++;
	}
	
	public void voteForRepublican() {
		replublicanVoteCount++;
	}

	public void clear() {
		democratVoteCount = 0;
		replublicanVoteCount = 0;
	}
	
	public String getTally() {
		String text = "DEMOCRAT: "+ democratVoteCount;
		text += "\nREPUBLICAN: "+ replublicanVoteCount;  
		
		System.out.println(text);
		return text;
	}

}
