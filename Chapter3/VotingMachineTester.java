package Chapter3;


public class VotingMachineTester {

  public static void main(String[] args) {
		VotingMachine vt = new VotingMachine();
		
		vt.voteForDemocrat();
		vt.voteForDemocrat();
		vt.voteForDemocrat();
		vt.voteForRepublican();
		vt.voteForDemocrat();
		vt.voteForRepublican();
		vt.voteForDemocrat();
		vt.voteForDemocrat();
		vt.voteForDemocrat();
		vt.voteForRepublican();
		vt.voteForDemocrat();
		vt.voteForRepublican();
		
		vt.getTally();
		vt.clear();
		vt.getTally();
		
		
  }

}
