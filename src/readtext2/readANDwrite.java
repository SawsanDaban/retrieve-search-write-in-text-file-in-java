package readtext2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.Scanner;

public class readANDwrite {
    //Initials
    String word2search = ""; //Word to search for
    String line = ""; //Line of texts
    int count = 0; //Word counter
    int lineCount = 0; //Line counter
    String filePath = ""; // Text file path
        
    //List of words
    String[] words;

    public readANDwrite(String filePath){
        this.filePath=filePath;
    }

    public String getWord2search() {
        return word2search;
    }

    public void setWord2search(String word2search) {
        this.word2search = word2search;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(int lineCount) {
        this.lineCount = lineCount;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }

    public void search4word() throws FileNotFoundException, IOException{
        FileReader txtFile = new FileReader(this.filePath);
        BufferedReader inFile = new BufferedReader(txtFile);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word to search for it:");
        word2search = input.next(); 
        
        System.out.format("\n--------------------------------\n");
        
        while((line = inFile.readLine()) != null)
        {
            lineCount++;
            words=line.split(" "); //Splits words when space is found
            //Searching for the word in word2search
            for (String word : words) 
            {
              if (word.equals(word2search)) 
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
        FileReader txtFile = new FileReader(this.filePath);
        BufferedReader inFile = new BufferedReader(txtFile);
        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter(this.filePath, true);
        
        System.out.println("");
        System.out.println("Write to add to file: ");
        String in = input.nextLine();
        writer.write("\n");   // write new line
        writer.write("\n");   // write new line
        writer.write(in);
        writer.close();
        inFile.close();
        
    }
    
}
