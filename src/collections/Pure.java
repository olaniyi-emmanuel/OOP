package collections;
import java.util.ArrayList;
import java.util.List;


public class Pure {
    public static void main(String[] args) {
       List<String> list = new ArrayList();
       list.add("Olusola");
       list.add("Abrahan");
       list.add("Jegede");
       list.add("Oke Tobi");

       list.remove(0);

        System.out.println( list);
        for(String vales:list) {
            System.out.println(vales);
        }



    }
}
