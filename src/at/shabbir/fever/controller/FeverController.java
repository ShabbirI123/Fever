package at.shabbir.fever.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FeverController {
    Scanner scanner = new Scanner(System.in);
    VitalSign vitalSign = new VitalSign();

    public FeverController() {
    }

    public void menu() {

        System.out.print("Welcome to Care Path \n" +
                "Please enter your vital signs:\n");
        end: while (true) {
            if (vitalSign()) {
                System.out.println("Please visit the nearest hospital");
            } else {
                //TODO Vital Sign Criteria is false. Add Further Nursing Assessment
                if (furtherNursing()) {

                } else {

                }
            }
            System.out.println("Menu\n" +
                    "1: Retry\n" +
                    "2: Exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break end;
                default:
                    break;
            }
        }
    }

    private boolean vitalSign() {
        while (true) {
            try {
                System.out.println("Your body temperature in °C(e.g. 37.8)");
                vitalSign.setTemp(scanner.nextDouble());
                System.out.println("Your apical heart rate (e.g. 50)");
                vitalSign.setPulse(scanner.nextDouble());
                System.out.println("Your respiratory rate per minute(e.g. 23)");
                vitalSign.setRespiratoryRate(scanner.nextDouble());
                System.out.println("Your BP (e.g. 100)");
                vitalSign.setBp(scanner.nextDouble());
                System.out.println("Your oxygen saturation in percentage(e.g. 80)");
                vitalSign.setOxygen(scanner.nextDouble());
                System.out.println("Your finger stick glucose (e.g. 100)");
                vitalSign.setDiabetics(scanner.nextDouble());

                if (controller())
                    return true;
                else
                    return false;
            } catch (InputMismatchException e) {
                System.out.println("Wrong Input! Please try again.");
            }
        }
    }

    //TODO write the method like the method above
    private boolean furtherNursing() {
        return true;
    }

    private boolean controller() {
        if ((vitalSign.getTemp() > 38.9) && (vitalSign.getPulse() > 130.0 || vitalSign.getPulse() < 50.0) &&
                (vitalSign.getRespiratoryRate()>28.0 || vitalSign.getRespiratoryRate() < 10.0) && (vitalSign.getBp() < 90 || vitalSign.getBp() >210)
        && (vitalSign.getOxygen() < 90.0) && (vitalSign.getDiabetics() <70.0 || vitalSign.getDiabetics() > 400.0)) {
            return true;
        } else {
            return false;
        }
    }
}
