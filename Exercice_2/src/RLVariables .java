public class RLVariables  {
      // Declare local variable here
      int mySecretNumber = 10;
       
      public void displaySecret(){
        // write your code here
        this.mySecretNumber =45 ;
    }

    public static void main(){
        RLVariables notSoPrivate = new RLVariables();
        notSoPrivate.displaySecret();
    }
    
}