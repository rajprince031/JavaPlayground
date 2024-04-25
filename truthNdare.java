import java.util.*;


class members
{
    Vector<String> game = new Vector<String>();
    int n;
    
    public members(int n, Vector<String> game)
    {
        this.n = n;
        for(int i =0;i<n;i++)
        {
            this.game.add(game.get(i));
        }       
    }
    public String display(int sel)
    {
        
        return (this.game.get(sel));
    }
    public void choose(int n)
    {
        System.out.println(game.get(n));
    }
    public int choose()
    {
        return (int)(Math.random() * (this.n));
    }

}

public class truthNdare{
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<String> name = new Vector<String>();
        for(int i=0;i<n;i++)
        {
            String s = sc.next();
            name.add(s);
        }
        members mem = new members(n,name);
        int ans = mem.choose();
        System.out.println();
        System.out.println("Turn :- "+mem.display(ans));
    }

}
