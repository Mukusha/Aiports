import java.util.ArrayList;

public class Main {
    private static int NCol = 2; // задаем столбец по которому будет проходить фильтрация

    public static void main(String[] args) {
        if (args.length>0) {  //если столбец задан из командной строки
             if  (args[0].matches("\\d+"))  NCol=Integer.parseInt(args[0]);
             else System.out.println("Некорректно введен номер столбца. Используется столбец по умолчанию: "+NCol);
        }
        String filter = Input.inputStr(NCol);   // считать строку из консоли
        long start = System.currentTimeMillis();  //запуск таймера
        ArrayList<String> list = SearchByColumn.find(NCol,filter); //  фильтрация по столбцу
        long finish = System.currentTimeMillis();  // стоп таймер
        long timer = finish - start;
        ArrayList<String>  listSort = Sorting.sorted(NCol,list); // сортировка по столбцу
        Print.print(listSort, timer); // вывод на экран
    }
}
