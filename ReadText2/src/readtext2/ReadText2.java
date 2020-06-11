package readtext2;

import java.io.IOException;
import java.util.Scanner;

public class ReadText2 {

    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        String filePath = "C:\\Users\\ProgS\\Desktop\\MyProfile.txt";
        readANDwrite rNw = new readANDwrite(filePath);
        int choice =0;
        
        while(choice!=3){
        System.out.format("----------------------\n"
                        + "|1.Search for word.  |\n"
                        + "|2.Write in the file.|\n"
                        + "|3.Exit.             |\n"
                        + "----------------------\n\n"
                        + "Choose a number: ");
        
        choice = input.nextInt();
        
        
        switch(choice)
        {
            case 1: rNw.search4word();break;
            case 2: rNw.writeINfile();break;
            case 3: break;
        }
        }
        
        
        
        
    }
    
}
