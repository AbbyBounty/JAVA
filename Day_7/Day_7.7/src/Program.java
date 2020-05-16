class Math
{
    public static int pow( int base, int index )
    {
        int result = 1;
        for( int count = 1; count <= index; count ++ )
            result = result * base;
        return result;
    }
}
class Program
{
    public static void main(String[] args) 
    {
       int result = Math.pow(5, 2);
       System.out.println("Result   :   "+result);
    }
}