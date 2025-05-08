public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        while (n != 0){
            count ++;
            if (n % 2 == 0){
                n /= 2;
            }else{
                n --;
            }
        }
        System.out.println(count);
    }
}
