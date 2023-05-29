package may_22OOPProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utility {


    public static List<List<String>> readFromCSV(String path)  {

        List<List<String>> list = new ArrayList<>();
        try
                ( BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

                bufferedReader.readLine();
                list = bufferedReader.lines()
                .map(s -> new ArrayList<>(Arrays.asList(s.split(","))))
                .collect(Collectors.toList());
            }


        catch(IOException e){
            System.out.println("File doesn't exist");
        }
        return list;
    }
}
