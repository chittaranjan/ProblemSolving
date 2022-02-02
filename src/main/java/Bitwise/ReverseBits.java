package Bitwise;

public class ReverseBits {
    public long reverse(long A) {
        int count=32;
        long sum=0;
        long one=1;
        while(A>0){
            sum += (A&1) * (one<<(count-1));
            A >>= 1;
            count--;
        }
        return sum;
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        System.out.println(reverseBits.reverse(3));
    }
}
