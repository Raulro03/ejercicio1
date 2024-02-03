import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Principal {
    public static void main (String [] args) {
        System.out.println("Hola mundo");
        horayfecha();
       
    }
    public static void horayfecha () {
        String dateTime = DateTimeFormatter.ofPattern("dd MM yyyy, hh:mm:ss a").format(LocalDateTime.now());
        System.out.println(dateTime); 
    }   
}