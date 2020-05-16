class Program
{
    public static void main(String[] args) 
    {
        Complex complex = new Complex(); 
        complex.setReal( 10 );
        complex.setImag( 20 ); 
        System.out.println("Real Number :   "+complex.getReal());
        System.out.println("Imag Number :   "+complex.getImag());  
    }
}