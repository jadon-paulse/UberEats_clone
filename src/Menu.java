package src;

public class Menu {
    private String restaurant;
    private String signatureDish;
    private int cost;
    private String location;

    public Menu(String restaurant, String signatureDish, int cost, String location){
        this.restaurant = restaurant;
        this.signatureDish = signatureDish;
        this.cost = cost;
        this.location = location;
    }
    

    public void setRestaurant(){
        this.restaurant = restaurant;
    }

    public void setsignatureDish(){
        this.signatureDish = signatureDish;
    }

    public void setcost(){
        this.cost = cost;
    }
    public void setlocattion(){
        this.location = location;
    }

    public String getRestaurant(){
        return this.restaurant;
    }

    public String getsignatureDish(){
        return this.signatureDish;
    }

    public int getcost(){
        return this.cost;
    }

    public String getlocation(){
        return this.location;
    }

}