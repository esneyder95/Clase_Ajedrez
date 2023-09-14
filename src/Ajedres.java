public class Ajedres {
    public static void main (String [] args){

        int filas;
        int columnas;

        for(columnas=0; columnas <= 3; columnas++){
            for (filas=0; filas <=3; filas++){
                System.out.print(" ");
                System.out.print("█");
            }
            System.out.println();
            for (filas=0; filas <= 3; filas++){
                System.out.print("█");
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
