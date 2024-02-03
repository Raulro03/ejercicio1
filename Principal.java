import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static Scanner teclado = new Scanner (System.in);
    public static void main (String [] args) {
        System.out.println("Hola mundo");
        horayfecha();

        Usuario [] usuarios = crearArray(getInt("Dime un numero mayor de 0: "));
        
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].toString()); 
        }

    }
    
    public static void horayfecha () {
        String dateTime = DateTimeFormatter.ofPattern("dd MM yyyy, hh:mm:ss a").format(LocalDateTime.now());
        System.out.println(dateTime); 
    }   

    public static Usuario[] crearArray (int num) {
        Usuario [] usuarios = new Usuario[num];

        for (int i = 0; i < usuarios.length; i++) {

            Usuario a = new Usuario();

            System.out.println("Dime el nombre de usuario: ");
            a.nombre = teclado.nextLine();
            System.out.println("Dime los apellidos de usuario: ");
            a.apellidos = teclado.nextLine();
            System.out.println("Dime el email de usuario: ");
            a.email = teclado.nextLine();

            usuarios[i] = a;

        }

        return usuarios;
    }
    public static int getInt (String enunciado) {
        int num = 0;
        boolean ok = false;
        do {
            System.out.print(enunciado);
            try {
                
                num = Integer.parseInt(teclado.nextLine().trim());
                if (num > 0) {
                    ok = true;
                } else {
                    System.out.println("El numero tiene que ser mayor a 0");
                }
            }catch (Exception e) {
                System.out.println("Numero no valido");
            }

        } while (!ok);

        return num;
    }
}