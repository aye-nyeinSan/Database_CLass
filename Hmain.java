//652115502 , Aye Nyein San
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;
//Part-2
public class Hmain {
    public static void main(String[] args) {
         try {
            String filename="C:/Users/aye29/OneDrive/Desktop/652115502/Java/Database/QS World University Rankings 2017.csv";
             File file=new File(filename);

                    if(file.exists()){
                        System.out.println("File is exist.");

                    }else { 
                        System.out.println("File does not exist.");
                    }

                     BufferedReader reader = new BufferedReader(new FileReader(file));
                     BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/aye29/OneDrive/Desktop/652115502/Java/Database/QS World University Rankings 2017_out.csv"));
                     Vector<UniData> unidataBox = new Vector<UniData>();
                   
                    String line;
                     while((line= reader.readLine())!= null ){
                            String data[]= line.split(","); //temp
                              UniData unidata = new UniData();
                            unidata.setYear(data[0]);
                            unidata.setRank_display(data[1]);
                            unidata.setUniversity(data[2]);
                            unidata.setScore(data[3]);
                            unidata.setLink(data[4]);
                            unidata.setCountry(data[5]);
                            unidata.setCity(data[6]);
                            unidata.setRegion(data[7]);
                            unidata.setLogo(data[8]);
                            unidataBox.add(unidata);
                            
                     }

                      UniData chiangmai = new UniData("2017","571", "Chiang Mai University", "20.7", "https://www.topuniversities.com/universities/chiang-mai-university", "Thailand", "Chiang Mai", "Mueang Chiang Mai", "https://www.topuniversities.com/sites/default/files/profiles/logos/chiang-mai-university_118_large.jpg");
                     for (UniData eachunidata : unidataBox) {
                        writer.write(eachunidata.getYear()+","
                                        +eachunidata.getRank_display()+","
                                         +eachunidata.getUniversity()+","
                                         +eachunidata.getScore()+","
                                         +eachunidata.getLink()+","
                                         +eachunidata.getCountry()+","
                                         +eachunidata.getCity()+","
                                         +eachunidata.getRegion()+","
                                         +eachunidata.getLogo()+"\n"
    
                                         );
                     }
                     writer.write(chiangmai.getYear()+" ,"
                                         +chiangmai.getRank_display()+","
                                         +chiangmai.getUniversity()+","
                                         +chiangmai.getScore()+","
                                         +chiangmai.getLink()+","
                                         +chiangmai.getCountry()+","
                                         +chiangmai.getCity()+","
                                         +chiangmai.getRegion()+","
                                         +chiangmai.getLogo()+"\n"
    
                                         );
                     
                     reader.close();
                     writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



/* 
Part - 1
   1.What are the meta data for the given data? please list all
    year,rank_display,university,score,link,Country,City,Region,Logo
    2.List all the data type of each attribute.
     All the data type attribute is String
    
     Part - 2
     (3) I have found the below reasons using tradational database is not a good choice.
     The Domain Integrity: There is no predefined rules for the data types and constraints.
     The Null values : having Null values can lead to be unexpected behaviours.
     The Data Duplication: Tradational data can be hard to control data duplication.

*/





  