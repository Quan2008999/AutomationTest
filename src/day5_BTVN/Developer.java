package day5_BTVN;

public class Developer extends Employee {

	public String progamingLangue;
	
	
	public String getProgamingLangue() {
		return progamingLangue;
	}
	public void setProgamingLangue(String progamingLangue) {
		this.progamingLangue = progamingLangue;
	}
	
	public void getInformation() {
		System.out.println("Developer : "+ getName()+ " " + getAge() + " " + getLevel() + " " + getProgamingLangue());
	}
}
