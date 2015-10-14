package histograma;

import java.io.BufferedReader;
import java.io.FileReader;

public class JA1 {
    
    public static void main(String[] args){
    Histogram <String> histograma = new Histogram<>();
    String pathName = "C:\\Users\\usuario\\Desktop\\mails.txt";

        try{

        BufferedReader fileIn = new BufferedReader (new FileReader(pathName)); 
        String mail;
        
            while ((mail=fileIn.readLine()) != null){
                if(!mail.contains("@")){
                    continue;
                }
            histograma.incrementa(mail.split("@")[1]);
            }
            
        }catch(Exception e){
            System.out.println("Fichero no existe");
        }
    }
}
