public class A1 {
    public static void main(String[] args){
        Author A = new Author("Name", "Email", 'g');
        System.out.println(A.getName());
        System.out.println(A.getEmail());
        System.out.println(A.getGender());
        A.setEmail("E2");
        System.out.println(A.toString());
    }
}
