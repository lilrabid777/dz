public class Student extends Learner {

	Student(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getDescription() {
		return "Student";
	}
}