import java.lang.reflect.Array;
import java.util.Arrays;

public class sortprogram {
    public static void main(String[] args) {
        int[] ar = {7, -1, 4, 8, 9, -13, 5, 1, -2};
        SelectAndSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    static void SelectAndSort(int[] value) {
        for (int j = 0; j < value.length; j++) {
            int menor = value[j];
            int pos = j;
            for (int i = j; i < value.length; i++) {
                if (value[i] < menor) {
                    menor = value[i];
                    pos = i;
                }
            }
            int t = value[j];
            value[j] = menor;
            value[pos] = t;
            System.out.printf("El numero menor es %d y esta en la posicion %d\n",menor,pos);
        }
    }
}