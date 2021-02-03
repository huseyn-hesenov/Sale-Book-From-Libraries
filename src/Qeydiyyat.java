import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qeydiyyat {
    public void qeydiyyat(){
        Scanner sc =new Scanner(System.in);
        List<String > list=new ArrayList<>();

        try {
            FileWriter text = new FileWriter("C:\\Users\\orxan\\OneDrive\\Desktop\\qeydyat.txt");

        BufferedWriter qeydiyyat_listi=new BufferedWriter(text);

        System.out.println("Qeydiyyatdan keçmək üçün boş xanaları doldurun...");
        System.out.println("          AD : ___________");
        System.out.println("       SOYAD : ___________" );
        System.out.println("DOGUM TARIXI : ___________");
        System.out.println("Ad daxil edin : ");
        String ad=sc.next();
       qeydiyyat_listi.write("AD : "+ad);
       qeydiyyat_listi.newLine();
        System.out.println("Soyad daxil edin : ");
        String soyad=sc.next();
        qeydiyyat_listi.write("SOYAD : "+ soyad);
        qeydiyyat_listi.newLine();
        System.out.println("Dogum tarixi daxil edin(gun.ay.il) : ");
        String tarix=sc.next();
        qeydiyyat_listi.write("Təvəllüd : "+tarix);
        qeydiyyat_listi.newLine();
        qeydiyyat_listi.close();
        System.out.println("QEYDIYYAT UGURLA BAŞA ÇATDI....");
        } catch (IOException e) {
            e.printStackTrace();
        }  System.out.println("***************************");
    }
}
