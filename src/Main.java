import com.componu.Gennder;
import com.componu.Season;
import com.componu.Size1;
import com.componu.StudFormat;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Season season = Season.SUMMER;
        //System.out.println(season.getPogoda());

        //  Student student = new Student("Syimyk", 22, Gennder.MALE, StudFormat.OFFLINE);
        // System.out.println(student);

        // Season season = Season.SUMMER;
        //System.out.println(season.ordinal());

        Scanner scanner = new Scanner(System.in);

        while (a>3) {

            try {
                Size1 size1Cooffe = Size1.valueOf(scanner.nextLine().toUpperCase(Locale.ROOT));
                switch (size1Cooffe) {
                    case LARGE -> System.out.println("Your choise" + Size1.LARGE.getSize1());
                    case MEDIUM -> System.out.println("Your choise" + Size1.MEDIUM.getSize1());
                    case SMALL -> System.out.println("Your choise" + Size1.SMALL.getSize1());
                }
                a++;
            } catch (IllegalArgumentException e) {
                System.out.println("Myndai razmer jok !!!");

            }
        }
    }
}