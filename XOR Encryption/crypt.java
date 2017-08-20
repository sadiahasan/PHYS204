public class crypt {

    public crypt(){
        
    }

    public static String Encrypt(String key, String message) {
        
       String k = key;
     
        
        int length = k.length();
        String m = message;
        int mlength = m.length();
        int[] array = new int[mlength];
        int[] array1 = new int[mlength];
        String an = "";
 
        for(int i = 0; i < mlength; i++){
            array1[i] = (int) message.charAt(i);
            int encrypt = array1[i] ^ k.charAt(i % length);
            an+=encrypt;
            array[i] = encrypt;
        
     
        }
       
return an;

        
        
    }
    
    

    public static String Decrypt(String key, String message) {

        String k = key;
        String mes = message;
             
        String m = "";
        
        int s = 0;
        int c = 0;
        int[] array = new int[message.length()];
        String[] array1 = new String[message.length()];

            
           for(int j = 0; j < mes.length()-2; j++){
              
               if(s>message.length()-1) break;
               
               if(Character.isUpperCase(k.charAt(j % k.length()))){
                 
                  array1[j] = Character.toString(mes.charAt(s)) + Character.toString(mes.charAt(s+1));
                    
                    s=s+2; 
                    c++;
                }
               
               else{ array[j] = Character.getNumericValue(mes.charAt(j)); 
               s++; c++;
               }
                
               array[j] = Integer.parseInt(array1[j]);
                
            }
 
            
            for(int i = 0; i < c; i++){
                int decrypt = array[i] ^ k.charAt(i % k.length());
                m+= (char) decrypt;

            }
    
        return m;
    }

}
