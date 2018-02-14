
package letternewlineforwardsandbackwards;
public class LetterNewLineForwardsAndBackwards {
    public static void main(String[] args) {
                
        
               String word = ("Joey");
       
        System.out.println("Fowards: ");
       for (int i = 0; i < word.length(); i++){
           System.out.println(word.substring(i, i+1)); // starts printint at i (which is posotion 0) 
           // it then keeps adding one to i so it can print the next letter in that posotion untill i = wordlength
           }
       
       
        System.out.println("Backwords: ");
         for (int j = word.length()-1; j >=0; j--){ // for loop rearanges it backwords
           System.out.println(word.substring(j, j+1));  // its still + one because the backwords word still has the same posoting.
// starts printint at i (which is posotion 0) 
           // it then keeps adding one to i so it can print the next letter in that posotion untill i = wordlength
       }
    }
    
}
