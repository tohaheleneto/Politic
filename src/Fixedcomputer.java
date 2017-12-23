public class Fixedcomputer extends Computer
{
    int NumberOfCores;
    double CPUfrequency;
    String TypeOfCooling;
    public Fixedcomputer()
    {
        NumberOfCores=4;
        CPUfrequency=3.7d;
        TypeOfCooling="aerogenic";
    }
    public Fixedcomputer(int NumberOfCores,double CPUfrequency,String TypeOfCooling)
    {
        this.NumberOfCores=NumberOfCores;
        this.CPUfrequency=CPUfrequency;
        this.TypeOfCooling=TypeOfCooling;
    }
    public void ShowFullInfo()
    {
        System.out.print("Owner is "+OwnerName + " RAM: "+Ram + " memory:" + Memory +"color: ");
        System.out.print( Color + " memory left:"+ FreeMemory + "Number of cores " + NumberOfCores);
        System.out.print(" CPU frequency " + CPUfrequency +"Type of Cooling" + TypeOfCooling );
    }
    public void TransferMemory5GB(Computer a)
    {
        this.Memory-=5;
        this.FreeMemory+=5;
        a.Memory+=5;
        a.FreeMemory-=5;
    }

}
