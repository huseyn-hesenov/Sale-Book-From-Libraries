import java.util.HashMap;
import java.util.Map;

public class Kitablar {public  void axtaris() {
    System.out.println("KITABLAR : ");
   Yazici eserler =new Yazici();
   eserler.kitablar();
    System.out.println("***************************");
}public static void axtaris1(int a) {
    System.out.println("KITABLAR : ");
    Map<Integer,String>yazicilar =new HashMap<>();

    yazicilar.put(1,"Xosrov və Şirin");
    yazicilar.put(2,"Leyli və Məcnun");
    yazicilar.put(3,"Sirlər Xəzinəsi");
    yazicilar.put(4,"7 Gözəl");

    yazicilar.put(5,"Görünməyən izlər");
    yazicilar.put(6,"Xəstə ruhlar");
    yazicilar.put(7,"Məhəbbətin gizli kodu");
    yazicilar.put(8,"Cəhənnəmdən gələn səs");

    yazicilar.put(9,"Qağayı");
    yazicilar.put(10,"Yatmadığım gecələrdə");
    yazicilar.put(11,"Günlərin bir günü");
    yazicilar.put(12,"Gül ömrü");
    yazicilar.put(13," ");
    System.out.println(yazicilar.get(a));

}
}
