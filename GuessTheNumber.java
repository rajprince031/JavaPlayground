import java.util.*;
class GuessTheNumber{
 public static void main(String[] agrs)
 {

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Do You want to play this game.\n1. Yes\n2. No");
        System.out.println();
        int a = sc.nextInt();
        if(a==1)flag = true;
        int guessCount = 0;
        int ans = (int)(Math.random() * (100)) +1;
        System.out.println();
        System.out.println("Choose a Number Between 1 - 100");
        while(flag)
        {
            int n = sc.nextInt();
            guessCount++;
           game play = new game(n , ans);
           if(n==ans)
           {
            System.out.println("**** Game End ****");
            System.out.println();
            System.out.println("**** Final Score ****");
            System.out.println("Your Score :- "+ guessCount);
            System.out.println(); 
            break;
           }
          
           System.out.println("Choose again");
           System.out.println();
           
        }
        
 }

}
class game{
   
    public game(int n,int ans)
    {
        if( n == ans)
        {
            System.out.println("You choose the correct number"); 
        }
        else if(n>ans)
        {
            System.out.println("You choose the larger number"); 
            

        }
        else
        {
            System.out.println("You choose the smaller number"); 
            
        }
        System.out.println();

    }
}