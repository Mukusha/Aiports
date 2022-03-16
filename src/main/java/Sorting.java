import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sorting {
   protected static ArrayList<String> sorted(int NCol, ArrayList<String> list) {//сортировка
       if (list.size() == 0) return null;
       if (list.size() == 1) return list;

       return  (ArrayList<String>) list.stream().sorted((o1, o2) -> {
                   String subStr1 = o1.split(",")[NCol-1];
                   String subStr2 = o2.split(",")[NCol-1];

                   if (subStr1.matches("\\d+")) {  // если значение в цифрах
                       if (NCol == 7 || NCol == 8) {
                           return Double.compare(Double.parseDouble(subStr1),Double.parseDouble(subStr2));
                       }
                       if (NCol==1 || NCol ==9 || NCol ==10) return Integer.compare(Integer.parseInt(subStr1),Integer.parseInt(subStr2));//Integer.parseInt(subStr1) }
                   }

                   int i = 0; // если строковое значение
                   while (subStr1.charAt(i) == subStr2.charAt(i)){
                       i++;
                       if (i == subStr2.length()-1) return 1;// что бы не выходил за границы
                       if (i == subStr1.length()-1) return -1;

                   }
                   return Character.compare(subStr1.charAt(i), subStr2.charAt(i));

               })
               .collect(Collectors.toList());
   }
}


