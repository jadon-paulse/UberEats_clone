// package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Database{

  
    FileWriter csvWriter;

    public static Menu[] CSVreader() {
        
        String csvFile = "../bin/restos.csv";
        Menu[] Arrayinfo = new Menu[9];
        String line = "";
        String cvsSplitby = ",";
        int i = -1;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        while ((line = br.readLine()) != null) {
            String[] data = line.split(cvsSplitby);

             if (i > -1) {
                 Arrayinfo[i] = new Menu(data[0].trim(), data[1].trim(), Integer.parseInt(data[2].trim()), data[7].trim());
                                
            }
            i++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return Arrayinfo;
    }

    public void WritetoCSV(Menu menu){
        // Person p = menu.getPerson();
        List<List<String>> rows = Arrays.asList(
                Arrays.asList(menu.getRestaurant(), menu.getsignatureDish(), menu.getlocation())
        );

        try {
            for (List<String> rowData : rows) {
                this.csvWriter.append(String.join(",", rowData));
                this.csvWriter.append("\n");
            }
        }
        catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }

    }

    public static PlacedOrders[] CSVOrderReader(){

        String csvFile = "../bin/order.csv";
        // Menu[] Arrayinfo = new Menu[9];
        PlacedOrders[] Arrayorder = new PlacedOrders[200];
        String line = "";
        String cvsSplitby = ",";
        int i = -1;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitby);
    
                 if (i > -1) {
                    Arrayorder[i] = new PlacedOrders(data[0], data[1], data[2]);
                                    
                }
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return Arrayorder;
    }

    public void closeFileWriting() {
        try {
            this.csvWriter.flush();
            this.csvWriter.close();
        }
        catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }


    }
    public static void main(String [] args){
        Menu [] M = CSVreader();
        for (int x = 0;x< M.length;x++){
            System.out.println(M[x]);
            if (x == 10){
                break;
            }
        }
    }
}

