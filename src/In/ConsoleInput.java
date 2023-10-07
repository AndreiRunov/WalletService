package In;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleInput implements Input{
    private static Input input;
    static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    private ConsoleInput(){};

    public static Input getInstance(){
        if(input == null){
            input = new ConsoleInput();
        }
        return input;
    }

}
