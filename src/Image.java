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
    
      //getters
      public String getUrl(){
        return this.url;
    }

    public String getDescription(){
        return this.description;
    }

    public String getTitle(){
        return this.title;
    }

    public int getCost(){
        return this.cost;
    }

     //setters
     public void setUrl(String url) {
        this.url = url;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



}