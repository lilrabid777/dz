public class TestPerson {
    public static void main( String[] args ) {
        Person person1 = new Person();
        Person person2 = new Person(100,"X");

        person1.talk();
        person1.move();
        person2.talk();
        person2.move();
    }
}