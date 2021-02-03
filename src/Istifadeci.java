import java.io.*;

public class Istifadeci {
public void haqqinda(){
    try {
        FileReader txt=new FileReader("C:\\Users\\orxan\\OneDrive\\Desktop\\qeydyat.txt");
        BufferedReader oxuyucu =new BufferedReader(txt);
        String line;
        while ((line=oxuyucu.readLine())!=null){System.out.println(line);}
       // System.out.println(" tarixində anadan olmusdur.");
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println("***************************");
}
}

