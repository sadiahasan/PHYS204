import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
    
    public class SnowDay{
    public static void main(String[] args) throws FileNotFoundException{
        
       
        File file = new File("random.txt");
        Integer[] array=new Integer[10];
        Arrays.fill(array,0);
     
        Scanner scanner = new Scanner(file);
        int total = 0;
        while(scanner.hasNext()){
        int x = scanner.nextInt();
        String s = Integer.toString(x);
        char t = s.charAt(0);
        int p = Character.getNumericValue(t);
        array[p]++;
        total++;
         
        }
      
        for(int i=0; i<=9; i++){
            System.out.println(i+" : "+array[i]);
        
            probability(array[i],total);
        }
    }

    private static void probability(Integer integer, int total) {
        double i = ((double)integer/(double)total);
        System.out.println(i*100);
    }   
    }  


        
    
        
        
        

