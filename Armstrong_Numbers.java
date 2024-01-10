class armstrong{
    public static void main(String args[])
    {
        int number = 153;
        int num_copy = number;
        int digits_count = (int) Math.round(Math.log10((double) number)+1);
        double sum =0;
        for(int i=1;i<=digits_count;i++)
        {
            int digit = num_copy%10;
            num_copy=num_copy/10;
            sum +=(int) Math.pow((double) digit, (double) digits_count);
        }
        if(sum==number)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not Armstrong");
    }
}
