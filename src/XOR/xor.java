package XOR;

public class xor {

    public int exactlyOneThree (int x, int y){

      /*  if (x==3 && y!=3 || x!=3 && y==3 ) //XOR enrevesado
            return 1;
        else
            return 0;
       */
        if (x==3 ^ y==3 ) //SHIFT + ^ + Space // XOR fácil
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {

        xor ejemplo = new xor ();
        System.out.println("El resultado es " + ejemplo.exactlyOneThree(1,3));
    }
}
