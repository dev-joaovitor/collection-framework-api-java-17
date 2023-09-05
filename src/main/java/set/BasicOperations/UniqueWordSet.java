package main.java.set.BasicOperations;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordSet {
    private Set<String> uniqueWordSet;

    public UniqueWordSet() {
        this.uniqueWordSet = new HashSet<>();
    }

    public void addWord(String word) {
        if (hasWord(word)){
            System.out.println("The set cannot have duplicate values");
            return;
        }
        uniqueWordSet.add(word);
    }

    public void removeWord(String word) {
        if (hasWord(word)) {
            uniqueWordSet.remove(word);
            return;
        }
        System.out.println("The word doesn't exist on set");
    }

    public boolean hasWord(String word) {
        return uniqueWordSet.contains(word);
    }

    public void showWords() {
        System.out.println(uniqueWordSet);
    }

    public static void main(String[] args) {
        UniqueWordSet uniqueWordSet = new UniqueWordSet();

        uniqueWordSet.addWord("Pato");
        uniqueWordSet.addWord("Carlo");
        uniqueWordSet.addWord("Devorame");
        uniqueWordSet.addWord("Eltrozo");

        uniqueWordSet.showWords();
        System.out.println(uniqueWordSet.hasWord("Pato"));
        uniqueWordSet.removeWord("Carlo");
        uniqueWordSet.removeWord("Chumasso");
        uniqueWordSet.showWords();
    }
}
