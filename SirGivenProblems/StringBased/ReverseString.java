public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverseStringII("Mahbub"));

    }

    public static String reverseStringI(String s) {

        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {

            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    public static String reverseStringII(String s){

        StringBuilder stringBuilder=new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}