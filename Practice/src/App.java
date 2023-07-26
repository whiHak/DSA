import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            File  file = new File("file.txt");
            BufferedReader bw = new BufferedReader(new FileReader(file));
            String st;
            while((st = bw.readLine())!= null){
                System.out.println(st);
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
}
}