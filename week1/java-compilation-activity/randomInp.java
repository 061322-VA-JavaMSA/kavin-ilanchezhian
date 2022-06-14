import java.util.*;
public class randomInp{

    public static void main(String[] args) {
        if(args.length == 1){
            System.out.println(Math.floor(Math.random()*(1000000)));
        }    
        else if(args.length == 2){
            for(int i = 0; i < Integer.parseInt(args[0]); i++){
                System.out.println(args[1]);
            }
        }
        else{
            System.out.println("Invalid number of inputs");
        }
    }
}
