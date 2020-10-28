public class Main {
    public static void main( String[] args) {

        System.out.println("Change this instead");
    }
    public static int getIntegerSum (int i, int j) {
        return i + j;
    }
    public void writeText() {
        int localVariable1 = 1;
        int localVariable2 = 2;

        System.out.println( localVariable1 + localVariable2 );
    }
    public String concat(String string1, String string2, boolean reverseOrder){

        if(reverseOrder) {
            return string2 + string1;
        }
        return string1 + string2;
    }
}
