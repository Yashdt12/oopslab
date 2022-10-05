class HarmonicSum
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        double lrsum=0,rlsum=0;
        for(int i=1;i<=n;i++)
            lrsum=lrsum+1.0/i;
        System.out.println("Sum uptil "+n+" terms left to right is "+lrsum);
        for(int i=n;i>0;i--)
            rlsum=rlsum+1.0/i;
        System.out.println("Sum uptil "+n+" terms left to right is "+rlsum);
        System.out.println("Difference between sum from left and right is: "+(lrsum-rlsum));
    }
}