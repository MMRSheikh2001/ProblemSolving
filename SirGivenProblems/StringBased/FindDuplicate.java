import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        System.out.println(findDuplicate("Mahbub"));
        System.out.println(findDuplicate("abc"));

        
    }
    public static String findDuplicate(String s){
        s=s.toLowerCase().trim();
        Set<Character> set=new HashSet<>();

        String dupString="";

        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
               dupString=dupString+s.charAt(i);
            }else{
                set.add(s.charAt(i));
            }
        }

        return dupString;
    }
}
