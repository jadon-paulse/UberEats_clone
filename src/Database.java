
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Database {
    private String ordersFilepath = "orders.csv";

    private PlacedOrders[] orders;

    private Restaurant[] restaurants;


    private int rondRes;
    private int seaRes;
    private int KenRes;

    public int countLinesInFile(String filepath) {
        int amountOfLines = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath));
            String fileLine = null;

            while ((fileLine = bufferedReader.readLine()) != null) {
                amountOfLines++;
            }

            bufferedReader.close();
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return amountOfLines;
    }

    public Restaurant[] getAllRestaurants() {
        String restaurantsFilepath = "restos.csv";

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(restaurantsFilepath));

            String fileLine = null;
            int i = 0;

            this.restaurants = new Restaurant[countLinesInFile(restaurantsFilepath) - 1];

            while ((fileLine = bufferedReader.readLine()) != null) {


                if (i > 0) {

                    String[] data = fileLine.split(",");


                    Restaurant restaurant = new Restaurant(data[0].trim(), data[1].trim(), data[3].trim(), data[5].trim(), Integer.parseInt(data[2].trim()), Integer.parseInt(data[4].trim()), Integer.parseInt(data[6].trim()), data[7].trim());


                    restaurants[i - 1] = restaurant;


                    if(data[7].trim().toLowerCase().equals("rondebosch")) {
                        this.rondRes++;
                    }
                    if(data[7].trim().toLowerCase().equals("seapoint")) {
                        this.seaRes++;
                    }
                    if(data[7].trim().toLowerCase().equals("kennilworth")) {
                        this.KenRes++;
                    }
                }
                i++;
            }

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return restaurants;
    }


    public Restaurant[] getRestaurantsByLocation(String location) {
        Restaurant[] rondArea = new Restaurant[rondRes];;
        Restaurant[] seaArea  = new Restaurant[seaRes];;
        Restaurant[] kenArea = new Restaurant[KenRes];;

        int kenCount = 0;
        int seaCount = 0;
        int rondCount = 0;

        for (int i = 0; i < this.restaurants.length; i++) {


            if(this.restaurants[i].getLocation().toLowerCase().equals("rondebosch")) {
                rondArea[rondCount] = restaurants[i];
                rondCount++;
            } else if (this.restaurants[i].getLocation().toLowerCase().equals("kennilworth")) {
                kenArea[kenCount] = restaurants[i];
                kenCount++;
            } else if (this.restaurants[i].getLocation().toLowerCase().equals("seapoint")) {
                seaArea[seaCount] = restaurants[i];
                seaCount++;
            }
        }

        if(location.toLowerCase().equals("rondebosch")) { return rondArea; }

        if(location.toLowerCase().equals("seapoint")) { return seaArea; }

        return kenArea;
    }




    public Restaurant[] getRestaurants() {
        return restaurants;
    }

    public PlacedOrders[] getOrders() {
        return orders;
    }
}
