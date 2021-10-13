public class Main {
    public static final String[] validAccount = new String[] { "C0318G","A0213M" };
    public static final String[] invalidAccount = new String[] { "M0318G", "P0323A" };
    public static void main(String[] args) {
        Class c = new Class();
        for (String a:
                validAccount ) {
            boolean isvalid = c.validate(a);
            System.out.println(a +" "+isvalid);
        }
        for (String b: invalidAccount
        ) {
            boolean isvalid1 = c.validate(b);
            System.out.println(b+" "+isvalid1);
        }
    }
}
