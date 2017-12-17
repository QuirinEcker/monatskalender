/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   --
 * Übungstitel: Monatstage
 * Autoren:     Ecker Quirin
 * Version:     1.0
 * Datum:       17.12.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Ausrechnung der Monatstage.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Ausrechnung der Monatstage mit einer verschachtelten Schleife.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_MonatsKalender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        int year;
        int weekDay;
        int numberOfDays = 0;

        System.out.print("Monat: ");
        month = scanner.nextInt();

        System.out.print("Jahr: ");
        year = scanner.nextInt();

        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numberOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numberOfDays = 30;
                break;
            case 2:
                if (year%4== 0 && (year % 100 != 0 || year % 400 == 0)){
                    numberOfDays = 29;
                }else {
                    numberOfDays = 28;
                }
                break;
        }

        if (month == 2 || month == 1) {
            month += 12;
            year--;
        }

        weekDay = ((int)(365.25 * year) + (int)(30.6001 * (month + 1)) + 5) % 7;

        System.out.println();

        System.out.println(" Mo  Di  Mi  Do  Fr  Sa  So");

        for (int i = 0; i < weekDay; i++){
                    System.out.print("    ");
                }

                for (int i = 1; i <= numberOfDays; i++){
                    weekDay += 1;
                    System.out.printf(" %2d " , i);

                    if (weekDay > 6){
                        System.out.println();
                        weekDay = 0;
            }
        }
    }
}
