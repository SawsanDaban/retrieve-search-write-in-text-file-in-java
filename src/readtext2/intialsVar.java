
package readtext2;

public class intialsVar {
    //Initials
    String word2search = ""; //Word to search for
    String line = ""; //Line of texts
    int count = 0; //Word counter
    int lineCount = 0; //Line counter
    String filePath = "";
        
    //List of words
    String[] words;

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

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String[] getWords() {
        return words;
    }

    public void setWords(String[] words) {
        this.words = words;
    }
    
    
}
