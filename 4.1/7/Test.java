import java.util.ArrayList;

public class Test {
	public static void main(String [] args) {
		ArrayList<Learner> list = new ArrayList<>();
		list.add(new Pupil("P1"));
		list.add(new Student("S1"));
		list.add(new Student("S2"));;
		list.add(new Pupil("P2"));
		list.add(new Pupil("P3"));
		list.add(new Student("S3"));

		System.out.println("Students:");


		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDescription().equals("Student")) {
				System.out.println(list.get(i).getName());
			}
		}

		System.out.println("Pupils:");

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getDescription().equals("Pupil")) {
				System.out.println(list.get(i).getName());
			}
		}
	}
}