package RepasoAntesNavidad.LogIn;

public class ComprobarLogin {
    int numero;
    String resultado = "Es correcta";
    String correcta = "Es valida, tiene 8 caracteres";
    String cantidadCaracteres (String pass){

        numero = pass.length();

        if (numero==8){
        return correcta;
        }
        else
            correcta="No valida";
        return correcta;
    }
    String CorrectaoNO (String pass){

        numero = pass.length();

            if (!pass.toLowerCase().equals(pass)) {
                return resultado;
            }
            else{
                resultado="Incorrecta";
            }
        return resultado;
    }
}
