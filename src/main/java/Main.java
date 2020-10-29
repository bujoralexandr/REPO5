public class Main {
    public static void main( String[] args) {

        System.out.println("Change this instead");
    }
    public static int getIntegerSum (int i, int j) {
        return i + j;
    }
 Branch1
    public static int multiplyInteger (int x, int y) {
        return x * y;
    }
    private static int getSquare(int x){
        return x * x;

 Branch2
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

    public static int getIntegerSum (int i, int j) {
        return i + j;
 master
 master
    }
    public int addTwoValues(int x, int y) {

        return x + y;
    }
    public int addThreeValues(int x, int y, int z) {

        return x + y + z;
    }
    public static void showInfo() {

        System.out.println("This is Basic class");
        System.out.format("The Id is: %d%n", id);
    }
}
