package at.shabbir.fever;

import at.shabbir.fever.controller.FeverController;

public class Main {
    public static void main(String[] args){
        FeverController feverController = new FeverController();

        feverController.menu();
    }
}
