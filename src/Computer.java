public class Computer
{
    private static int CountOfComputers;
    String OwnerName;
    int Ram;
    int Memory;
    String Color;
    int FreeMemory;
//конструкторы
    Computer()
    {
        CountOfComputers++;
        OwnerName="Artem";
        Ram=8;
        Memory=450;
        Color="Black";
        FreeMemory=Memory-30;
    }
    Computer(String OwnerName,int Ram,int Memory)
    {
        CountOfComputers++;
        this.OwnerName=OwnerName;
        this.Ram=Ram;
        this.Memory=Memory;
        this.Color="Black";
        this.FreeMemory=Memory-30;
    }
    Computer(String OwnerName,int Ram,int Memory,String Color,int FreeMemory)
    {
        CountOfComputers++;
        this.OwnerName=OwnerName;
        this.Ram=Ram;
        this.Memory=Memory;
        this.Color=Color;
        this.FreeMemory=FreeMemory;
    }

//методы
    public void ShowOwnerAndRam()
    {
        System.out.println("Owner is "+OwnerName + " RAM: "+Ram);
    }
    public void ShowOwnerRamMemory()
    {
        System.out.println("Owner is "+OwnerName + " RAM: "+Ram + " memory:" + Memory);
    }
    public void ShowOwnerRamMemoryColor()
    {
        System.out.println("Owner is "+OwnerName + " RAM: "+Ram + " memory:" + Memory +"color: " + Color);
    }
    public void ShowInfo()
    {
        System.out.println("Owner is "+OwnerName + " RAM: "+Ram + " memory:" + Memory +"color: " + Color + " memory left:"+ FreeMemory);
    }

    public void ShowCount()
    {
        System.out.println("Count of computers:" + CountOfComputers);
    }

}
