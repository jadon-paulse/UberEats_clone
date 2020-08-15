
public class PlacedOrders {
    private int cost;

    private String order;
    private String location;

    private Restaurant restaurant;

    public PlacedOrders(String order, String location, Restaurant restaurant, int cost) {
        this.order = order;
        this.location = location;
        this.restaurant = restaurant;
        this.cost = cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public int getCost() {
        return cost;
    }

    public String getLocation() {
        return location;
    }

    public String getOrder() {
        return order;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order='" + order + '\'' +
                ", location='" + location + '\'' +
                ", restaurant='" + restaurant + '\'' +
                ", cost=" + cost +
                '}';
    }

}
