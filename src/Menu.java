
public class Menu{
    public String Restaurant;
    public String signatureDish;
    public int Cost;
    public String Location;

    public Menu(String Restaurant,String signatureDish,int cost,String location){
        this.Restaurant = Restaurant;
        this.signatureDish = signatureDish;
        this.Cost = cost;
        this.Location = location;
    }

    public String getRestaurant(){
        return this.Restaurant;
    }

    public String getsignatureDish(){
        return this.signatureDish;
    }

    public int getcost(){
        return this.Cost;
    }

    public String getlocation(){
        return this.Location;
    }

    public String toString(){
        return "Restaurant:" + this.Restaurant + "\n" +  "SignatureDish:" + this.signatureDish +"\n"+ "Cost:"+ this.Cost + "\n" +"Location:" +this.Location + "\n";
    }
}