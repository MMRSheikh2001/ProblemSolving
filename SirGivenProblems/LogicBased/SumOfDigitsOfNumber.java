public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        System.out.println(sumOfDigitsOfNumber(134));
        
    }

    private static int sumOfDigitsOfNumber(int num){

        int sum=0;
        while (num!=0) {
            int remain=num%10;
            sum+=remain;
            num=num-remain;
            num=num/10;
            
        }
        return sum;

    }
}
