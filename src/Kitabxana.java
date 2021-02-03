import java.util.Scanner;

public class Kitabxana {
    public static void main(String[] args) {
        String[] modul={"1. Yazıçılar","2. Kitablar","3. Kitabin kodu","4. Istifadəçi haqqında","5. Hesabdan cıxış"};
        int secim=0;
        Qeydiyyat qeydiyyat=new Qeydiyyat();
        qeydiyyat.qeydiyyat();

        Scanner sc= new Scanner(System.in);

        while (secim!=5){
            for(String element : modul)System.out.println(element);
              secim = sc.nextInt();
            System.out.println("***************************");
        switch (secim){
            case 1 :
                Yazici yazici =new Yazici();
                yazici.yazici();
                break;
            case 2 :
                Kitablar kitablar =new Kitablar();
                kitablar.axtaris();
                break;

            case 3 :
                Kitabin_kodu kk=new Kitabin_kodu();
                kk.kitabin_kodu();
                break;

            case 4 :
                Istifadeci istifadeci =new Istifadeci();
                istifadeci.haqqinda();
                break;
            default:
                break;
                }

        }




    }
}
