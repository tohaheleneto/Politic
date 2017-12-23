public class Program
{
    public static void main(String args[] )
    {
        Laptop a = new Laptop();
        Fixedcomputer b = new Fixedcomputer();
        a.ShowInfo();
        a.ConnectForRam(b);
        a.ShowInfo();
        b.ShowInfo();
    }

}
