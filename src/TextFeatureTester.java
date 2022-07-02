public class TextFeatureTester {
    public static void main(String[]args) {
        TextFeature textFeature = new TextFeature();
        TextFeature textFeature1 = new TextFeature();
        TextFeature textFeature2 = new TextFeature("data/docset110.txt");


        textFeature.setARI(11);
        textFeature.setNumWord(392);
        textFeature.setNumSentence(45);
        textFeature.setNumCharacter(1192);
        textFeature.setNumVowel(674);

        textFeature1.setARI(10);
        textFeature1.setNumWord(391);
        textFeature1.setNumSentence(44);
        textFeature1.setNumCharacter(1191);
        textFeature1.setNumVowel(673);


        System.out.println("\ntextFeature.getDocID(): " + textFeature.getDocID());
        System.out.println("\ntextFeature.getARI(): " + textFeature.getARI());
        System.out.println("\ntextFeature.getNumWord(): " + textFeature.getNumWord());
        System.out.println("\ntextFeature.getNumSentence(): " + textFeature.getNumSentence());
        System.out.println("\ntextFeature.getNumCharacter(): " + textFeature.getNumCharacter());
        System.out.println("\ntextFeature.getNumVowel(): " + textFeature.getNumVowel());
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println(textFeature.toString());
        System.out.println("\ntextFeature1.getDocID(): " + textFeature.getDocID());
        System.out.println("\ntextFeature1.getARI(): " + textFeature.getARI());
        System.out.println("\ntextFeature1.getNumWord(): " + textFeature.getNumWord());
        System.out.println("\ntextFeature1.getNumSentence(): " + textFeature.getNumSentence());
        System.out.println("\ntextFeature1.getNumCharacter(): " + textFeature.getNumCharacter());
        System.out.println("\ntextFeature1.getNumVowel(): " + textFeature.getNumVowel());
        System.out.println("\n-------------------------------------------------------------------");
        System.out.println(textFeature1.toString());
        System.out.println("\n-------------------------------------------------------------------");
        System.out.printf("%ntextFeature2.getARI(): GL%02d%n", textFeature2.getARI());
}
}
