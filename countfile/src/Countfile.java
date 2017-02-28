import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Countfile {
public static void main(String[] args) throws IOException{
    
  
    Long[] array = new Long[30000];
    File file = new File("/Users/sadiahasan/Documents/workspace/countfile/count.txt");
    
    Scanner scanner = new Scanner(file);
    int i = 0;
 
    while(scanner.hasNextLine()){
          array[i++] = scanner.nextLong();
          String x = Long.toString(array[i]);
          System.out.println(x);
          
          scanner.nextLine();
    }
        

   
}


    
}
    
    
    
    

