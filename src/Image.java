package src;

public class Image {

    private String url;
    private String description;
    private String title;
    private int cost;

    Image(String url, String title, String description, int cost) {
        this.url = url;
        this.description = description;
        this.title = title;
        this.cost = cost;
    }
    
}