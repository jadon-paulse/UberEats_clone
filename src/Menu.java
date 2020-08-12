public class Menu{
    private String Restaurant;
    private String signatureDish;
    private double Cost;
    private String Location;

    public Menu(String Restaurant,String signatureDish,double cost,String location){
        this.Restaurant = Restaurant;
        this.signatureDish = signatureDish;
        this.Cost = cost;
        this.Location = location;
    }

    public void setRestaurant(){
        this.Restaurant= Restaurant;
    }

    public void setsignatureDish(){
        this.signatureDish = signatureDish;
    }

    public void setcost(){
        this.Cost = Cost;
    }
    public void setlocattion(){
        this.Location = Location;
    }

    public String getRestaurant(){
        return Restaurant;
    }

    public String getsignatureDish(){
        return signatureDish;
    }

    public double getcost(){
        return Cost;
    }

    public String getlocation(){
        return Location;
    }
}