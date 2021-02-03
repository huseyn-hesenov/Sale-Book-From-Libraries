import javax.swing.text.Style;
import java.util.HashMap;
import java.util.Map;

public class Yazici {
    public void yazici(){
        Map<Integer,String>yazicilar =new HashMap<>();
        String[] yazici={"Nizami Gencevi","Elxan Elatlı","Fikrət Qoca"};
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
        for (int i=1;i<yazicilar.size();i++)
        {
            if(i>=1 && i<5)
            {if(i==1)System.out.println(yazici[0]);
            System.out.println("    "+yazicilar.get(i));
            }
            else if(i>=5 && i<=8)
            {
                if(i==5)System.out.println(yazici[1]);
                System.out.println("    "+yazicilar.get(i));
            }
            else if(i>8 && i<13)
            {
                if(i==9) System.out.println(yazici[2]);
                System.out.println("    "+yazicilar.get(i));
            }
        }
System.out.println("***************************");
    }



    public void kitablar()
    {
        System.out.println(" ");

        Map<Integer,String>yazicilar =new HashMap<>();
      System.out.println("                         Kitabin kodu");
        yazicilar.put(1,"Xosrov və Şirin      ");
        yazicilar.put(2,"Leyli və Məcnun      ");
        yazicilar.put(3,"Sirlər Xəzinəsi      ");
        yazicilar.put(4,"7 Gözəl              ");

        yazicilar.put(5,"Görünməyən izlər     ");
        yazicilar.put(6,"Xəstə ruhlar         ");
        yazicilar.put(7,"Məhəbbətin gizli kodu");
        yazicilar.put(8,"Cəhənnəmdən gələn səs");

        yazicilar.put(9,"Qağayı               ");
        yazicilar.put(10,"Yatmadığım gecələrdə");
        yazicilar.put(11,"Günlərin bir günü   ");
        yazicilar.put(12,"Gül ömrü            ");
        yazicilar.put(13," ");
        for(int i=1;i<yazicilar.size();i++){System.out.println(yazicilar.get(i)+"        "+i);}
    }
}
