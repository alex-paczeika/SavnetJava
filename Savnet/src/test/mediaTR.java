package test;

public class mediaTR {

public static void main(String[] args) {
        System.out.println(harmonicAvg(3,4));
    }
    public static double harmonicAvg(int a,int b)
    {
        
        if (a+b==0)
        {
            return 0;
        }
      return (2*a*b)/(a+b);
    }

}
