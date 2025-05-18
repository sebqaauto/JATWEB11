package abstraction;

public abstract class VicePrincipal implements Principal {

	@Override
	public void processNewAdmissions() {
		System.out.println("The Vice Principal will process New Admission");
		
	}

	@Override
	public void holdStaffMeetings() {
		System.out.println("The Vice Principal will hold Staff meetings");
		
	}

	
}
