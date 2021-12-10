import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zad1 {
    public static void main(String[] args) throws Exception{
System.out.println(wybieranieSlow(2,"Ala","nie","ma","test","kota i","psa","papugę"));

    }
    public static String wybieranieSlow(int b, String... a ) {

        String[]tablica = a;
        List<String> nowaTablica = new ArrayList<>();

        for (int i=0; i<tablica.length; i+= b) {
 if (i% b==0)
 nowaTablica.add(tablica[i]);
        
        }
        return nowaTablica.toString();    }
}