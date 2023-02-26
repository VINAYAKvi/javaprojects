import java.util.*;

class GuessTheNumber{
    
    Random r =new Random();
    int randomNo= r.nextInt(100)+1;
    int counter =0;
    Scanner sc= new Scanner(System.in);
    int num;
    
    public void userInput(){
        System.out.println("Enter any number between 0 to 100");
         num= sc.nextInt();
    }
    
    public boolean guessing(){
        counter++;

        if(counter>9){
                System.out.println("Ohh, you have finished all your attempts, Better luck next time!!");
                return true;
        }
        if(num==randomNo){
            
            System.out.println("Hurray!!, you have guessed the right one and you have guessed it at your "+counter+" th attempt");
            return true;  
        }
        
        else if(num<randomNo){
            System.out.println("Oops!, the number thst you have guessed is smaller than actual value and your attempt is "+counter);
        }
        
        else if(num>randomNo){
            System.out.println("Oops!, the number that you have guessed is greater than actual value and your attempt is "+counter);
        }
                    return false;

    }

   public void points(){
              
             if(counter==1){
                      System.out.println("Hurray!!, you have received 100 golden coins");
                 }
              else if(counter<4){
                      System.out.println("Hurray!!, you have received 100 silver coins");
                 }
             else if(counter<6){
                      System.out.println("Hurray!!, you have received 100 bronze coins");
                 }
       }
}

 class Main{
public static void main(String args[]){
  


    System.out.println("Guess the Number!!");
    System.out.println("You will get 3 Rounds to play");

for(int i=0;i<3;i++){

    System.out.println("Round "+(i+1));
    System.out.println("You have 10 attempts!!");

    GuessTheNumber obj= new GuessTheNumber();
    
    boolean b=false;
    
    while(!b){
    

        obj.userInput();
        b=obj.guessing();
    }
   
        obj.points();
}

}
}