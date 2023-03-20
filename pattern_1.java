class pattern_1
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=10-i*2;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        for(int i=5;i>1;i--)
        {
            for(int j=12-i*2;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=3;k<=i*2-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        for(int i=2;i<=3;i++)
        {
            for(int j=1;j<=10-i*2;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i*2-1;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}