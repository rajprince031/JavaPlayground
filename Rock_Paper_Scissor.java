package Game;

import java.util.Scanner;


class gameLogic
{
    Scanner sc = new Scanner(System.in);
    String win = "";
    public int play()
    {
        System.out.println("Please Choose one of them");
        System.out.println("1. Rock\n2. Paper\n3. Scissor");
        System.out.println();
        int in = sc.nextInt();
        System.out.println();
        int com = (int)(Math.random() * (3)) + 1;
       
      
    if(in == 1)
    {
        if(com==3)
        {
            System.out.println("You Win");
            win = "you";
        }
        else if(com == 2)
        {
             System.out.println("Computer win");
             win = "com";
        }
        else
        {
             System.out.println("Match Draw");
             win = "draw";
        }
    }
    else if(in == 2)
    {
        if(com==1)
        {
            System.out.println("You Win");
            win = "you";
        }
        else if(com==3){
            System.out.println("Computer win");
            win = "com";
       }
        else{
            System.out.println("Match Draw");
            win = "draw";
       }
    }
    else if(in==3)
    {
        if(com==2)
        {
            System.out.println("You Win");
            win = "you";
        }
        else if(com==1){
            System.out.println("Computer win");
            win = "com";
       }
        else{
            System.out.println("Match Draw");
            win = "draw";
       }
    }
    System.out.println();
    String you = (in==1) ? "Rock" : (in == 2)?"Paper" : "Scissor";
    String comp = (com==1) ? "Rock" : (com==2)?"Paper" : "Scissor";
    System.out.println("You choose : - "+you);
    System.out.println("Computer choose : - "+comp);
    System.out.println();


    if(win == "you") return 1;
    else if(win=="com") return -1;
    return 0;
    }
}





class Rock_Paper_Scissor
{
    public static void main(String[] agrs)
    {
        // 1 for rock 
        // 2 for paper
        // 3 scissor

        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Do You want to play this game.\n1. Yes\n2. No");
        System.out.println();
        int a = sc.nextInt();
        if(a==1)flag = true;
        int com = 0,your = 0;
        System.out.println();
        while(flag)
        {
           gameLogic gm = new gameLogic();
           int ans = gm.play();
           if(ans == 1) your++;
           else if(ans == -1) com++;
           System.out.println("Your Score :- "+ your);
           System.out.println("Computer Score :-"+ com);
           System.out.println();
           System.out.println("Play Again\n1. Yes\n2. No");
           System.out.println();
           int res = sc.nextInt();
           if(res==1)flag = true;
           else flag = false;
           System.out.println();

        }
        System.out.println("**** Game End ****");
        System.out.println();
        System.out.println("**** Final Score ****");
        System.out.println("Your Score :- "+ your);
        System.out.println("Computer Score :-"+ com);
        System.out.println(); 
    }

}