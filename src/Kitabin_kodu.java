import java.util.Scanner;

public class Kitabin_kodu {
    public void kitabin_kodu(){
        System.out.println("KITAB KODUNU DAXIL EDIN : ");
        Scanner sc =new Scanner(System.in);
        int kod= sc.nextInt();
        Kitablar.axtaris1(kod);

        System.out.println("***************************");
    }
}
