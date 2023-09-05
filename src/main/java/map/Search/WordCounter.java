package main.java.map.Search;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private Map<String, Integer> counterMap;

    public WordCounter() {
        this.counterMap = new HashMap<>();
    }

    public void addWord(String word, int count) {
        counterMap.put(word, count);
    }

    public void removeWord(String word){
        counterMap.remove(word);
    }

    public void showCounter(){
        System.out.println(counterMap);
    }

    public String mostFrequentWord(){
        int highestCount = Integer.MIN_VALUE;
        String mostFrequentWord = null;

        for (Map.Entry<String, Integer> counter: counterMap.entrySet()){
            if (counter.getValue() > highestCount){
                highestCount = counter.getValue();
                mostFrequentWord = counter.getKey();
            }
        }
        return mostFrequentWord;
    }

    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();

        wordCounter.addWord("keyboard", 10);
        wordCounter.addWord("controller", 8);
        wordCounter.addWord("mouse", 2);
        wordCounter.addWord("computer", 4);
        wordCounter.addWord("banana", 0);

         wordCounter.showCounter();
         wordCounter.removeWord("banana");
         wordCounter.showCounter();

        System.out.println(wordCounter.mostFrequentWord());
    }
}
