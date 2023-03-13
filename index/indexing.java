
import java.util.ArrayList;

public class indexing {

    public static void main(String[] args) {
        ArrayList <Integer> p1 = new ArrayList<> ();
        p1.add(2);
        p1.add(12);
        p1.add(13);
        System.out.println(p1);
        ArrayList <Integer> p2 = new ArrayList<> ();
        p2.add(1);
        p2.add(2);
        p2.add(7);
        p2.add(12);
        System.out.println(p2);
        ArrayList <Integer> p3 = new ArrayList<> ();
        p3.add(3);
        p3.add(4);
        p3.add(5);
        p3.add(12);
        p3.add(13);
        System.out.println(p3);
        Dicionario dic = new Dicionario ("arroz", p1);
        dic.add("batata", p2);
        dic.add("esparguete", p3);
        System.out.println(dic.toString());

        ArrayList<String> tosearch = new ArrayList<String>();
        tosearch.add("arroz");
        tosearch.add("batata");
        tosearch.add("esparguete");

        System.out.println(dic.search(tosearch));
    }

    
}
