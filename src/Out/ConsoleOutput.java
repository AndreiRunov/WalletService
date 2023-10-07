package Out;

import In.ConsoleInput;
import In.Input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleOutput implements Output{
    private static Output output;
    private ConsoleOutput(){};

    public static Output getInstance(){
        if(output == null){
            output = new ConsoleOutput();
        }
        return output;
    }
}
