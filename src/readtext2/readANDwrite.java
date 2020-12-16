package readtext2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Scanner;

public class readANDwrite {
    //Initials
    String line = ""; //Line of texts
    int count = 0; //Word counter
    int lineCount = 0; //Line counter
    
    intialsVar var = new intialsVar();

    public readANDwrite(){
    }
    
    public void readFile() throws FileNotFoundException, IOException{
        FileReader txtFile = new FileReader(var.getFilePath());
        BufferedReader inFile = new BufferedReader(txtFile);
        while((line = inFile.readLine()) != null)
        {
            System.out.println(line);
        }
        inFile.close();
    }

    public void search4word() throws FileNotFoundException, IOException{
        FileReader txtFile = new FileReader(var.getFilePath());
        BufferedReader inFile = new BufferedReader(txtFile);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word to search for it:");
        var.setWord2search(input.next()); 
        
        System.out.format("\n--------------------------------\n");
        
        while((line = inFile.readLine()) != null)
        {
            lineCount++;
            var.setWords(line.split(" ")); //Splits words when space is found
            //Searching for the word in word2search
            for (String word : var.getWords()) 
            {
              if (word.equals(var.getWord2search())) 
                   {
                     System.out.format("The word was found at line %d.\n",lineCount);
                     count++;
                   }
            }
        }
        
        System.out.format("--------------------------------\n");
        System.out.format("\n--------------------------------\n");
        
        if(count!=0) // if count != 0 then the word is found in the file
        {
            System.out.format("The word was found %d times.\n",count);
        }
        else
        {
           System.out.println("The word is not in the file.");
        }
        System.out.format("--------------------------------\n\n");
        inFile.close();
    }
    
    public void writeINfile () throws FileNotFoundException, IOException{
        FileReader txtFile = new FileReader(var.getFilePath());
        BufferedReader inFile = new BufferedReader(txtFile);
        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter(var.getFilePath(), true);
        
        System.out.println("");
        System.out.println("Write to add to file: ");
        String in = input.nextLine();
        writer.append("\n");   // write new line
        writer.append("\n");   // write new line
        writer.append(in);
        writer.close();
        inFile.close();
        
    }
    
}
