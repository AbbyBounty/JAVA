class Program
{
    public static void main(String[] args) 
    {
        final Complex c1 = new Complex(10, 20);
        c1.setReal(100);
        c1.setImag(200);
        //c1 = new Complex(50,60); //Not OK
    }
}