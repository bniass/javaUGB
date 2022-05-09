import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Scanner{
    public static void main(String[] args){
        int a = 0;
        try{
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Saisir a :");
            a = Integer.parseInt(in.readLine());
        }catch(Exception e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}