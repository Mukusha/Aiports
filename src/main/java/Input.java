import java.util.Scanner;

public class Input {
    public static String inputStr(int NCol){// считать строку из консоли

        String filter;
        System.out.println("Введите строку:");
        try(Scanner scanner=new Scanner(System.in)) {

            if (NCol == 1 || NCol ==9 || NCol==10) { // если в столбце целочисленные значения
                while (!scanner.hasNextInt() ) { //если в строке нет целых чисел
                    scanner.nextLine();
                    System.out.println("Введите корректные данные (целочисленное значение):");
                }
                filter = scanner.nextLine();
                return filter;
            }

            if (NCol==7 || NCol == 8){ // если в столбце вещественные значения
                while (!scanner.hasNextDouble()) { //если в строке нет вещественных значений
                    scanner.nextLine();
                    System.out.println("Введите корректные данные (вещественное значение):");
                }
                filter = scanner.nextLine();
                return filter.replace(',', '.');
            }

            //если в столбце строковые значение
            filter = scanner.nextLine();
            while (filter.isEmpty()) { //если вводят пустую строку
                System.out.println("Введите корректные данные:");
                filter = scanner.nextLine();
            }
        }
        return filter;
    }
}
