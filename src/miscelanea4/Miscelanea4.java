package miscelanea4;

import java.io.*;

public class Miscelanea4 {

    public static void main(String[] args) {
        File archivo = new File("numeros.txt");
        try {
            //se carga el contenido del archivo numeros.txt
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            //se crea una variable String "numero" que contendrá el valor de cada linea del archivo
            String numero;
            //se lee la primera linea del archivo y se asigna a "numero"
            numero = entrada.readLine();
            int suma = 0;
            //se emplea el ciclo while para recorrer todas las lineas existentes en el arhivo
            while (numero != null) {
                //System.out.println("Lectura: " + numero);
                //se convierte de String a entero
                int n = Integer.parseInt(numero);
                //se verifica que el número sea par o primo
                if ((n % 2 == 0) || esPrimo(n)){
                    //System.out.println(n);
                    //si el número cumple la condición se suma a la variable acumuladora "suma"
                    suma += n;
                }
                //se lee la próxima linea del archivo
                numero = entrada.readLine();
            }
            System.out.println("la suma de los números pares y primos contenidos en el archivos es "+suma);
            //se cierra la conexion con el archivo
            entrada.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static boolean esPrimo(int n){
        int limite = (n/2)+1;
        for (int i = 2; i <= limite; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
