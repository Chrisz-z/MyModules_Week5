package sg.edu.rp.c346.id22035357.mymodules;

public class Module implements java.io.Serializable{
    String code;
    String name;
    int year;
    int sem;
    int credit;
    String venue;

    Module(String code,String name,int year,int sem,int credit,String venue){
        this.code = code;
        this.name=name;
        this.year = year;
        this.sem = sem;
        this.credit = credit;
        this.venue = venue;
    }

    public String getName() {
        return name;
    }
    public String getCode(){
        return code;
    }
    public int getYear(){
        return year;
    }
    public int getSem(){
        return sem;
    }
    public int getCredit(){
        return credit;
    }
    public String getVenue(){
        return venue;
    }
}


