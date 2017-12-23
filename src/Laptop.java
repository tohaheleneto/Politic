public class Laptop extends Computer
{
    byte ChargePercentage;
    int RemainingTimeInHibernationMode;
    String touchscreen;
    public Laptop()
    {
       ChargePercentage=100;
       RemainingTimeInHibernationMode=ChargePercentage*10;
       touchscreen="Yes";
    }
    public Laptop(byte ChargePercentage,String touchscreen)
    {
        this.ChargePercentage=ChargePercentage;
        RemainingTimeInHibernationMode=ChargePercentage*10;
        this.touchscreen=touchscreen;
    }
    public void ShowFullInfo()
    {
        System.out.print("Owner is "+OwnerName + " RAM: "+Ram + " memory:" + Memory +"color: ");
        System.out.print( Color + " memory left:"+ FreeMemory + "Charge " + ChargePercentage);
        System.out.print(" % RemainingTimeInHibernationMode" + RemainingTimeInHibernationMode +"touchscreen" + touchscreen );
    }
    public void ConnectForRam (Computer a)
    {   a.Ram+=this.Ram;
        this.Ram=0;

    }

}
