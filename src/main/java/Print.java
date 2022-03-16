import java.util.ArrayList;

public class Print {
    protected static void print(ArrayList<String> aiport, long timer) { // вывод в консоль
        if (aiport==null) System.out.println("По вашему запросу ничего не найдено");// если ничего не найдено
        else {
            System.out.println("Список аэропортов:");//список строк аэропортов
            aiport.forEach(System.out::println);
            System.out.println("Количество найденных строк: " + aiport.size()); // количество найденных строк;
        }
        System.out.print("Время, затраченное на поиск: "+timer+" мс."); // время в миллисекундах, потраченное на поиск
    }
}
