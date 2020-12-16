package readtext2;

import java.io.IOException;
import java.util.Scanner;

public class ReadText2 {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        String filePath = "/*Here you write the text file path*/"; 
        intialsVar ivar = new intialsVar(filePath);
        readANDwrite rNw = new readANDwrite();
        int choice =0;
        
        while(choice!=4){
        System.out.format("----------------------\n"
                        + "|1.Retreive the text |\n"
                        + "|2.Search for word.  |\n"
                        + "|3.Write in the file.|\n"
                        + "|4.Exit.             |\n"
                        + "----------------------\n\n"
                        + "Choose a number: ");
        
        choice = input.nextInt();
        
        switch(choice)
        {
            case 1: rNw.readFile();break;
            case 2: rNw.search4word();break;
            case 3: rNw.writeINfile();break;
            case 4: break;
        }
        }
        
    }
    
}
