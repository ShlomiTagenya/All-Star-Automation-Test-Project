package utilities;

import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ManageDDT extends CommonOps{

    @DataProvider(name = "data-provider-products")
    public Object[][] getDataObject(){
        return  getDataFromCsv("./DDTFiles/products.csv");
    }

    @DataProvider(name = "data-provider-computers")
    public Object[][] getDataObject2(){
        return  getDataFromCsv("./DDTFiles/computers.csv");
    }

    @DataProvider(name = "data-provider-mobileSearch")
    public Object[][] getDataObject3(){
        return  getDataFromCsv("./DDTFiles/mobileSearch.csv");
    }

    @DataProvider(name = "data-provider-mobileNum")
    public Object[][] getDataObject4(){
        return  getDataFromCsv("./DDTFiles/numList.csv");
    }

    @DataProvider(name = "data-provider-student")
    public Object[][] getDataObjectAPI(){
        return  getDataFromCsvAPI("./DDTFiles/student.csv");
    }

    @DataProvider(name = "data-provider-courses")
    public Object[][] getDataFromCsvAPI2(){
        return  getDataFromCsvAPI2("./DDTFiles/courses.csv");
    }

    @DataProvider(name = "data-provider-tasks")
    public Object[][] getDataObjectTasks(){
        return  getDataFromCsv("./DDTFiles/tasks.csv");
    }


    public static Object [] [] getDataFromCsv(String FilePatch){
        Object [][] date = new Object[3][2];
        List<String> csvData = readCSV(FilePatch);
        for (int i=0; i<csvData.size(); i++){
            date[i][0]= csvData.get(i).split(",")[0];
            date[i][1]= csvData.get(i).split(",")[1];
        }
        return date;
    }

    public static Object [] [] getDataFromCsvAPI(String FilePatch){
        Object [][] date = new Object[5][2];
        List<String> csvData = readCSV(FilePatch);
        for (int i=0; i<csvData.size(); i++){
            date[i][0]= csvData.get(i).split(",")[0];
            date[i][1]= csvData.get(i).split(",")[1];
        }
        return date;
    }

    public static Object [] [] getDataFromCsvAPI2(String FilePatch){
        Object [][] date = new Object[4][2];
        List<String> csvData = readCSV(FilePatch);
        for (int i=0; i<csvData.size(); i++){
            date[i][0]= csvData.get(i).split(",")[0];
            date[i][1]= csvData.get(i).split(",")[1];
        }
        return date;
    }

    public static List<String> readCSV (String csvfile){
        List<String> lines =null;
        File file = new File(csvfile);
        try {
            lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        }
        catch (IOException e){
            System.out.println("Error" +e);
        }
        return lines;
    }
}

