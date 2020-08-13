package src;

import java.io.*;
import java.util.*;
public class Database{

    // ArrayList<Menu> allspecials = new ArrayList<Menu>();
    // // ArrayList<Profile> maleProfiles = new ArrayList<Profile>();
    // // ArrayList<Profile> femaleProfiles = new ArrayList<Profile>();
    // FileWriter csvWriter;

    // Database() {
    //     try {
    //         this.csvWriter = new FileWriter("swipes.csv");
    //     }
    //     catch(Exception e) {
    //         System.out.println("Error: " + e.toString());
    //     }
    // }

//     public void readFromCSV() {
//         BufferedReader br = null;
//         String line = "";
//         String cvsSplitBy = ",";
//         int i = 0;

//         try {
//             br = new BufferedReader(new FileReader("./bin/orders.csv"));
//             while ((line = br.readLine()) != null) {
//                 String[] data = line.split(cvsSplitBy);
//                 if(i>0){
//                     Menu p = new Menu(data[0], data[1], data[2], data[3]);
// //                    Menu menu = new Menu(p);
//                     this.allspecials.add(p);

//                     // if(profile.getPerson().getGender().toUpperCase().equals("MALE")) {
//                     //     this.maleProfiles.add(profile);
//                     // }
//                     // else {
//                     //     this.femaleProfiles.add(profile);
//                     // }
//                 }

//                 i++;

//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         } finally {
//             if (br != null) {
//                 try {
//                     br.close();
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//     }

    // public ArrayList<Menu> getAllSpecials() {
    //     return this.allspecials;
    // }
    // public ArrayList<Profile> getMaleProfiles() {
    //     return this.maleProfiles;
    // }
    // public ArrayList<Profile> getFemaleProfiles() {
    //     return this.femaleProfiles;
    // }
//
//    public void WritetoCSV(Menu menu){
//        Menu p = menu.getPerson();
//        List<List<String>> rows = Arrays.asList(
//                Arrays.asList(p.getName(), p.getAge()+"", p.getGender(), p.getLocation(), p.getBio())
//        );
//
//        try {
//            for (List<String> rowData : rows) {
//                this.csvWriter.append(String.join(",", rowData));
//                this.csvWriter.append("\n");
//            }
//        }
//        catch(Exception e) {
//            System.out.println("Error: " + e.toString());
//        }
//
//    }

//    public void closeFileWriting() {
//        try {
//            this.csvWriter.flush();
//            this.csvWriter.close();
//        }
//        catch(Exception e) {
//            System.out.println("Error: " + e.toString());
//        }
//
//
//    }

    // public static final String[] Dams = null;
    // public static String M;

    public static Menu[] CSVreader() {

        String csvFile = ".\\bin\\restos.csv";
        Menu[] Arrayinfo = new Menu[211];
        String line = "";
        String cvsSplitby = ",";
        int i = -1;

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        while ((line = br.readLine()) != null) {
            String[] data = line.split(cvsSplitby);

             if (i > -1) {
                 Arrayinfo[i] = new Menu(data[0].trim(), data[1], Integer.parseInt(data[2]), data[3]);
                //  System.out.println(i);
                
            }
            i++;
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return Arrayinfo;
    }
}