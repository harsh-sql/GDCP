class series_3 
{
    //First Series
    public static void series1(int n)
    {
        int c=9;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.print("8, ");
            }
            else{
                System.out.print(c+", ");
                c++;
            }
        }
    }

    //Second Series
    public static void series2(int n)
    {
        int c=45;
        for(int i=0;i<n;i++)
        {
            if(i%3==0)
            {
                c=c-3;
                System.out.print(c+", ");
            }
            else{
                c=c-2;
                System.out.print(c+", ");
            }
        }
    }


    public static void main(String[] args)
    {
        series1(20);
        System.out.println("");
        series2(20);
    }
    
}
