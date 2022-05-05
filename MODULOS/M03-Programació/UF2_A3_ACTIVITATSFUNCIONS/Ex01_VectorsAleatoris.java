package UF2_A3_ACTIVITATSFUNCIONS;

public class Ex01_VectorsAleatoris {

    public static final int ELEMENTS = 10;

    public static void main(String[] args) {

// A[]
        
        int[] a = generavector(10);
// B[]

        
        int b[] = generavector(900);

// C[]

        
        int c[]=generavectorC(a,b);
        
        
// Mostrar resultats A[], B[] i C[]

        mostraResultats(a,b,c);
       
    }

    public static int[] generavector(int max) {
        int[] arrayGenerico = new int[ELEMENTS];
        for (int i = 0; i < ELEMENTS; i++) {
            arrayGenerico[i] = (int) (Math.random()-1 * max);
        }

        return arrayGenerico;
    }
    
    public static int [] generavectorC(int []a, int []b){
                int[] c = new int[2 * ELEMENTS];
        for (int i = 0; i < 2 * ELEMENTS; i++) {
            if (i % 2 == 0) {
                c[i] = a[i / 2];
            } else {
                c[i] = b[i / 2];
            }
        }
        
        return c;
    }
    
    public static void mostraResultats(int []a, int []b, int []c){
         System.out.print("A[] = ");
        for (int i = 0; i < ELEMENTS; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("B[] = ");
        for (int i = 0; i < ELEMENTS; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        System.out.print("C[] = ");
        for (int i = 0; i < 2 * ELEMENTS; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }
}
