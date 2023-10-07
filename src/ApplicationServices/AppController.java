package ApplicationServices;

import DomainServices.*;
import In.*;
import Out.*;

public class AppController {
    private static AppController controller;
    private Repository repository;
    private final Input in;
    private final Output out;

    private AppController(){
            this.repository = UserRepository.getInstance();
            this.in = ConsoleInput.getInstance();
            this.out = ConsoleOutput.getInstance();
    }

    public static AppController getIstance(){
        if(controller == null){
            controller = new AppController();
        }
        return controller;
    }

    public void launch(){

    }



}
