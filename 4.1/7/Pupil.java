public class Pupil extends Learner {
	Pupil(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return "Pupil";
	}
}