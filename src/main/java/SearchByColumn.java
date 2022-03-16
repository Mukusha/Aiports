import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchByColumn {
    protected static ArrayList<String> find(int NCol, String filter) { //поиск и сортировка //readFileByFilter
        ArrayList<String> list = null;
        Stream<String> fileRead;

       try
       {fileRead = Files.lines(Paths.get(System.getProperty("user.dir")+"\\airports.dat")); //чтение из файла (находится в одной папке с jar
                                                                                                 // или в корневой папке проекта )
           list = (ArrayList<String>) fileRead    //поиск
                   .filter(line -> {
                       String subStr = line.split(",")[NCol-1];
                       //    return subStr.contains(filter); // если есть чувствительность к регистру
                       return subStr.toLowerCase().contains(filter.toLowerCase()); // если нет чувствительности к регистру
                   })
                   .collect(Collectors.toList());
       } catch (IOException e) {
           e.printStackTrace();
       }
        return list;
    }
}
