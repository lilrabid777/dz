public class PhoneNumber {
    private String code, pt1, pt2, pt3;
    public PhoneNumber(String phone){
        code = phone.substring(0, phone.length()-10);
        pt1 = phone.substring(phone.length()-10, phone.length()-7);
        pt2 = phone.substring(phone.length()-7, phone.length()-4);
        pt3 = phone.substring(phone.length()-4);
    }
    public String toString() {
        return code + pt1 + "-" + pt2 + "-" + pt3;
    }
}
