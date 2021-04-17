import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();
        int dia = 23;
        int mes = 04;
        int ano = 2021;
        int dia2 = 25;
        int mes2= 04;
        int ano2 = 2021;
        calendario1.set(ano,(mes-1),(dia));
        calendario2.set(ano2,(mes2-1),dia2);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");

        System.out.println(sdf.format(calendario1.getTime()));
        System.out.println(sdf.format(calendario2.getTime()));

        if(calendario1.getTimeInMillis() > calendario2.getTimeInMillis()) {
            System.out.println("Essa data : "+sdf.format(calendario1.getTime())+"é maior que "+sdf.format(calendario2.getTime()));
        } else {
            System.out.println("Essa data : "+sdf.format(calendario2.getTime())+"é maior que "+sdf.format(calendario1.getTime()));
        }



    }
}
