public class Mayor extends Politic
{

    String town;
    String CriminalActivity;
    int Budget; //k$
    public Mayor()
    {
        town="Moscow";
        CriminalActivity="Drugs";
        Budget=15;

    }
    public Mayor(String town,String CriminalActivity,int Budget)
    {
        this.town=town;
        this.CriminalActivity=CriminalActivity;
        this.Budget=Budget;
    }
    public void ShowFullInfo()
    {
        System.out.print("Name is "+Name + " ReignPeriod: "+ReignPeriod + " Position: "  );
        System.out.print( Position +"Country: " + Country + " Position left: "+ Rating);
        System.out.print(" town: "+town +" CriminalActivity " +CriminalActivity +"Budget:" + Budget);
    }
    public void SupportCandidate(Presidentialcandidate a)
    {
        a.Rating++;
        this.Budget--;
    }

}
