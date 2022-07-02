import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadibilityScore {
    public int getARI(String filepath) {
        String line;
        File file;
        Scanner sc = null;
        int wordCount = 0;
        int sentence = 0;
        int character = 0;
        double ARI = 0;
        try {
            file = new File(filepath);
            sc = new Scanner(file);
            sc.useDelimiter("[^A-Za-z]+");
            while (sc.hasNext()) {
                line = sc.next();
                wordCount++;
                character += line.length();
            }
            sc = new Scanner(filepath);
            while (sc.hasNext()) {
                line = sc.next();
                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch == '.' || ch == '?' || ch == '!' ) {
                        sentence++;
                    }
                }
            }
            System.out.println(wordCount);
            System.out.println(character);
            System.out.println(sentence);
            //System.out.printf("The Readability of the document is: GL%02d%n",(int) character);
            ARI = 0.37 * (wordCount / sentence) + 5.84 * (character / wordCount) - 26.01;
            
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("檔案路徑不存在");
        } catch (IOException e) {
            System.out.println("I/O錯誤");
        }
        return(int)ARI;
    }
}