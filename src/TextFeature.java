public class TextFeature {
    private static int docNum;
    private int docID;
    private int ARI;
    private int numWord;
    private int numSentence;
    private int numCharacter;
    private int numVowel;

    public TextFeature(){
        this.ARI = 0;
        this.numWord = 0 ;
        this.numSentence = 0;
        this.numCharacter = 0;
        this.numVowel = 0;
        setDocNum();
        this.docID = docNum;
    }

    public TextFeature(String filepath){
        ReadibilityScore readibilityScore = new ReadibilityScore();
        this.ARI = readibilityScore.getARI(filepath);
        this.numWord = 0;
        this.numSentence = 0 ;
        this.numCharacter = 0;
        this.numVowel = 0;
        setDocNum();
        this.docID = docNum;
    }
    public static void setDocNum(){
        docNum++;
    }
    public void setARI(int ARI){
        this.ARI = ARI;
    }
    public void setNumWord(int numWord){
        this.numWord  = numWord;
    }
    public void setNumSentence(int numSentence){
        this.numSentence = numSentence;
    }
    public void setNumCharacter(int numCharacter){
        this.numCharacter = numCharacter;
    }
    public void setNumVowel(int numVowel){
        this.numVowel = numVowel;
    }
    public int getARI(){
        return ARI;
    }
    public int getNumWord(){
        return numWord;
    }
    public int getNumSentence(){
        return numSentence;
    }
    public int getNumCharacter(){
        return numCharacter;
    }
    public int getNumVowel(){
        return numVowel;
    }
    public int getDocID(){
        return docID;
    }
    public String toString(){
        String str = "";
        str += "\nThe document ID is: \t" + docID + "\n"; 
        str += "\nThe ARI readability of the document is: \tGL" + ARI + "\n";
        str += "\nThe number of word is: \t" + numWord + "\n";
        str += "\nThe number of sentence is: \t" + numSentence + "\n";
        str += "\nThe number of character is: \t" + numCharacter + "\n";
        str += "\nThe number of vowel is: \t" + numVowel + "\n";
        return str;
    }
    }
