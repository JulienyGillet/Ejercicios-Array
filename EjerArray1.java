import java.util.Vector;

public class EjerArray1 {
    public static void main(String[] args) {
        int[] G = {1, 40,60,90};
        int[] G2 = {20, 72,44,};
        System.out.printf("%.2f\n", euclidiana(G, G2));

    }

    static double euclidiana(int[] coord1, int[] coord2) {
        double elevado=0;
        double ins=0;
        for (int i = 0; i < coord1.length; i++) {
            elevado = elevado + Math.pow(coord1[i] - coord2[i], 2.0);
            ins = Math.sqrt(elevado);
        }return ins;
    }
}
