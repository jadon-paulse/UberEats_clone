package src;

public class PlacedOrders {

    private String name;
    private String itemsOrdered;
    private String location;

    PlacedOrders(String name, String itemsOrdered, String location) {
        this.name = name;
        this.itemsOrdered = itemsOrdered;
        this.location = location;
    }
    
      //getters
      public String getName(){
        return this.name;
    }

    public String getSignatureDish(){
        return this.itemsOrdered;
    }

    public String getLocation(){
        return this.location;
    }

    //setters
    public void setLocation(){
        this.location = location;
    }

    public void setName(){
        this.name = name;
    }

    public void setItemsOrdered(){
        this.itemsOrdered = itemsOrdered;
    }
}