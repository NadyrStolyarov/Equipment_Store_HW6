import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Laptop laptop1 = new Laptop ("hp_pailion_g6", 16, 500, "Windows", "black", 16);
        Laptop laptop2 = new Laptop ("hp_galaxy_x64", 8, 500, "Windows", "white", 15.6);
        Laptop laptop3 = new Laptop ("samsung_a52", 8, 300, "Not OS", "black", 16);
        Laptop laptop4 = new Laptop ("lenovo_gtx76", 16, 700, "Windows", "white", 17.6);
        Laptop laptop5 = new Laptop ("macbook_14pro", 8, 1000, "ios", "white", 16);
        Set<Laptop> unicLaptop = new HashSet<Laptop> ();
        unicLaptop.add (laptop1);
        unicLaptop.add (laptop2);
        unicLaptop.add (laptop3);
        unicLaptop.add (laptop4);
        unicLaptop.add (laptop5);
        System.out.printf ("Всего уникалных ноутбуков: %d \n", unicLaptop.size ());
        Map<Integer, String> mapCrit = new HashMap<> ();
        mapCrit.put (1, "объем оперативной памяти");
        mapCrit.put (2, "объем накопителя");
        mapCrit.put (3, "ОС");
        mapCrit.put (4, "цвет");
        mapCrit.put (5, "диагональ");
        Scanner sc = new Scanner (System.in);
        System.out.println ("Введите желаемые характеристики: 1. объем оперативной памяти: ");
        int ramUser = sc.nextInt ();
        System.out.println ("объем накопителя: ");
        int storUser = sc.nextInt ();
        System.out.println ("диагональ");
        double digUser = sc.nextDouble ();
        for (Laptop lap : unicLaptop) {
            if ((lap.getRam () >= ramUser) && (lap.getStorageCap () >= storUser) && lap.getDiagonal () >= digUser) {
                System.out.println (lap.toString ());
            }
            else;
            System.out.println("Подходящих параметров нету, Просим прощения.");
            break;
        }
        sc.close ();
    }
}
