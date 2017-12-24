public class Politic
{
    private static int CountOfPolitics;
    String Name;
    int ReignPeriod;
    String Position;
    String Country;
    int Rating;
//конструкторы
    Politic()
    {
        CountOfPolitics++;
        Name="Vladimir";
        ReignPeriod=8;
        Position="President";
        Country="Russia";
        Rating=21;
    }
    Politic(String Name,int ReignPeriod,String Position)
    {
        CountOfPolitics++;
        this.Name=Name;
        this.ReignPeriod=ReignPeriod;
        this.Position=Position;
        this.Country="Russia";
        this.Rating=21;
    }
    Politic(String Name,int ReignPeriod,String Position,int Raiting,String Country)
    {
        CountOfPolitics++;
        this.Name=Name;
        this.ReignPeriod=ReignPeriod;
        this.Position=Position;
        this.Country=Country;
        this.Rating=Raiting;
    }

//методы
    public void ShowNameAndReignPeriod()
    {
        System.out.println("Name is "+Name + " ReignPeriod: "+ReignPeriod);
    }
    public void ShowNameReignPeriodPosition()
    {
        System.out.println("Name is "+Name + " ReignPeriod: "+ReignPeriod + " Position:" + Position);
    }
    public void ShowNameReignPeriodPositionCountry()
    {
        System.out.println("Name is "+Name + " ReignPeriod: "+ReignPeriod + " Position:" + Position +"Country: " + Country);
    }
    public void ShowInfo()
    {
        System.out.println("Name is "+Name + " ReignPeriod: "+ReignPeriod + " Position:" + Position +"Country: " + Country + " Rating:"+Rating );
    }

    public void ShowCount()
    {
        System.out.println("Count of Politics:" + CountOfPolitics);
    }

}
