public class EjerArray3 {
    public static void main(String[] args) {
        int resultado1 = 3*1+6*2+4*3;
        int resultado2 = 3*4+6*5+4*6;
        int resultado3 = 8*1+2*2+1*3;
        int resultado4 = 8*4+2*5+1*6;
        int[][] matriu1={{3,6,4},{8,2,1}};
        int[][] matriu2={{1,4},{2,5},{3,6}};
        for (int i = 0; i < matriu1.length; i++) {
            int muliplicacion=0;
            for (int j = 0; j < matriu1[i].length ; j++) {
                muliplicacion = muliplicacion+matriu1[i][j]*matriu2[j][0];
            }
            System.out.printf("El resultado es %d\n",muliplicacion);

        }
        //System.out.printf("%d %d\n%d %d",resultado1,resultado2,resultado3,resultado4);
    }
}
