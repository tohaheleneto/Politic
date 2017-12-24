public class Presidentialcandidate extends Politic
{
    byte PercentageOfSupporting;
    String consignment;
    String Status; //Goverment or Oposition
    public Presidentialcandidate()
    {
        PercentageOfSupporting=43;
        consignment="Yabloko";
        Status="Opostion";
    }
    public Presidentialcandidate(byte PercentageOfSupportinge,String consignment,String Status)
    {
        this.PercentageOfSupporting=PercentageOfSupportinge;
        this.consignment=consignment;
        this.Status=Status;
    }
    public void ShowFullInfo()
    {
        System.out.print("Name is "+Name + " ReignPeriod: "+ReignPeriod + " Position: "  );
        System.out.print( Position +"Country: " + Country + " Position left:"+ Rating);
        System.out.print(" Percentage of supporting"+PercentageOfSupporting +" consignment: " +consignment +"Status:" + Status);
    }
    public void HelpMAyorWithCriminal (Mayor a)
    {
        this.Rating+=5;
        a.Budget+=10;

    }

}
