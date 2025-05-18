package abstraction;

public class SeniorTeacherCoordinator extends VicePrincipal{

	@Override
	public void arrangeParentTeacherMeet() {
		System.out.println("The SenoirTeachCoordinator will arrangeParentTeacherMeet");
		
	}

	@Override
	public void morningPrayer() {
		System.out.println("The SenoirTeachCoordinator will morningPrayer");
		
	}

	@Override
	public String shcoolStartTime() {
		
		return "8:30";
	}

	@Override
	public String shcoolEndTime() {

		return "3:30";
	}

	@Override
	public void conductAnnualExams() {
		System.out.println("The SenoirTeachCoordinator will conductAnnualExams");
		
	}

	@Override
	public void donotCollectCasteInfo() {
		
		
	}
	
	

}
