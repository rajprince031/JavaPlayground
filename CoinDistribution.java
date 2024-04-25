import java.util.*;


// 1st approach --- its mine way
/* 
class CoinDistribution
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int rs5 = 0;
        int rs2 = 0;
        int rs1 = 0;
        int div = n/9;
        int rem = n%9;
        rs5 = 1*div;
        rs2 = 1*div;
        rs1 = 2*div;
        if(rem%2==0 && rem > 0)
        {
            rs2 = rs2 + ((rem/2) - 1);
            rs1 = rs1 + 2;

        }
        else
        {
            rs2 = rs2 + (rem/2);
            rs1 = rs1 + 1;
        }
        if(rs1 % 2 == 0 && rs1 > 2)
        {
            rs2 = rs2 + ((rs1/2) -1);
            rs1 = 2;
        }
        else
        {
            rs2 = rs2 + (rs1/2);
            rs1 = 1;
        }
        System.out.println("RS 5 = " + rs5);
        System.out.println("RS 2 = " + rs2);
        System.out.println("RS 1 = " + rs1);
    }
}
            
*/

// second approach -- mam's approach much better logic than me
/* 

class CoinDistribution
{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int rs5 = 0;
        int rs2 = 0;
        int rs1 = 0;
        rs5 = (n-4)/5;
        if(( n - n*rs5)%2==0) rs1 = 2;
        else rs1 = 1;
        rs2 = (n - 5*rs5-rs1)/2;
        System.out.println("RS 5 = " + rs5);
        System.out.println("RS 2 = " + rs2);
        System.out.println("RS 1 = " + rs1);
    }
}
*/