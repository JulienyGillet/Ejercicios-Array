import java.util.Arrays;

public class EjerArray2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        girar(a);
        System.out.printf(Arrays.toString(a));
    }
    static void girar(int[] value){
        int left = 0;
        int right = value.length-1;
        for (; left<right ; left++,right--) {
            int t = value[right];
            value[right] = value[left];
            value[left] = t;
        }
    }
}
