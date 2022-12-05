public class Person {
    String FullName;
    int Age;

    Person(int age, String name) {
        Age = age;
        FullName = name;    }
    Person() {
        Age = 0;
        FullName = null;

    }
    public void talk(){
        System.out.println("Person " + this.FullName + " talks");
    }
    public void move(){
        System.out.println("Person " + this.FullName + " walks");
    }


}
