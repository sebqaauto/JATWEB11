package abstraction;

public class MathsTeacher extends SeniorTeacherCoordinator {

	@Override
	public String shcoolStartTime() {
		
		return "7:30";
	}

	@Override
	public String shcoolEndTime() {

		return "4:30";
	}
	
	@Override
	public void arrangeParentTeacherMeet() {
		System.out.println("The MathsTeacher will arrangeParentTeacherMeet");
		
	}
	
	public static void main(String[] args) {
		
		MathsTeacher math = new MathsTeacher();
		math.arrangeParentTeacherMeet();
		math.conductAnnualExams();
		math.donotCollectCasteInfo();
		math.morningPrayer();
		System.out.println(schoolName);
		System.out.println(stateName);
		System.out.println(yearOfInception);
		//schoolName = "public school";
		System.out.println("School start time is :: "+math.shcoolStartTime());
		System.out.println("School end time is :: "+math.shcoolEndTime());
		

	}

}
