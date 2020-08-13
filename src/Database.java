
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Database{

  

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
                 Arrayinfo[i] = new Menu(data[0].trim(), data[1].trim(), Integer.parseInt(data[2].trim()), data[3].trim());
                                
            }
            i++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return Arrayinfo;
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

