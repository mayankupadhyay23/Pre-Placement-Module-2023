import java.util.*;
public class HelloWorld{

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        Map<Integer,Boolean> hasVisited=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            hasVisited.put(arr[i],false);
        }
        Map<Integer,List<Integer>> mp=new HashMap<>();
        int x,y,l;
        l=in.nextInt();
        for(int i=0;i<l;i++)
        {
            x=in.nextInt();
            y=in.nextInt();
            if(mp.containsKey(x))
            {
                mp.get(x).add(y);
            }
            else
            {
                List<Integer> list=new ArrayList<>();
                list.add(y);
                mp.put(x,list);
            }
        }
        int src,dest;
        src=in.nextInt();
        dest=in.nextInt();
        graphIsOp(src,dest,mp,hasVisited);
        if(hasVisited.get(dest)==true)
            System.out.println("1");
        else
            System.out.println("0");
    }
    public static void graphIsOp(int src, int dest, Map<Integer,List<Integer>> mp, Map<Integer,Boolean> hasVisited)
    {
        hasVisited.put(src,true);
        if(mp.get(src)!=null)
        {
            for(int x:mp.get(src))
            {
                if(hasVisited.get(x)==false)
                    graphIsOp(x,dest,mp,hasVisited);
            }
        }
    }
}