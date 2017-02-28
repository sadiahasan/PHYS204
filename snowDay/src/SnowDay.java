import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
    
    public class SnowDay{
    public static void main(String[] args) throws FileNotFoundException{
        
       
        File file = new File("morecities.txt");
        Integer[] array=new Integer[10];
        Arrays.fill(array,0);
     
        Scanner scanner = new Scanner(file);
        
        while(scanner.hasNext()){
        int x = scanner.nextInt();
        String s = Integer.toString(x);
        char t = s.charAt(0);
        int p = Character.getNumericValue(t);
        array[p]++;
         
        }
        System.out.println("HERE WE ARE");
        for(int i=0; i<=10; i++){
            System.out.println(i+" : "+array[i]);
        }
    }   
    }  


        
    
        
        
        

