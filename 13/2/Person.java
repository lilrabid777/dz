public class Person {
    String surname, name, patronymic;
    Person(String surname, String name, String patronymic){
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    Person(String surname) {
        this.surname = surname;
        name = null;
        patronymic = null;
    }

    public String getSurname() {return surname;}
    public void setSurname(String surname) {this.surname = surname;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPatronymic() {return patronymic;}
    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}

    public String toString(){
        if(this.name != null && this.patronymic != null){
            return "Person: " + surname + " " + name.charAt(0)+ " " + patronymic.charAt(0);
        }
        return "Person: " + surname;
    }
}
