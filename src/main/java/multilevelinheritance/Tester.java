package multilevelinheritance;

public class Tester extends Employee {

	private String specialization;

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void Print() {
		{
			display();
			System.out.println("Employee id" + getEmployeeId());
			System.out.println("Specialization " + specialization);
		}
	}

}
