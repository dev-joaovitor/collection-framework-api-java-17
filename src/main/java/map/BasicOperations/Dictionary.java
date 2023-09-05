package main.java.map.BasicOperations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<>();
    }

    public void addWord(String word, String definition) {
        dictionary.put(word, definition);
    }

    public void removeWord(String word) {
        if (!dictionary.isEmpty()){
            dictionary.remove(word);
        }
    }

    public void showWords(){
        System.out.println(dictionary);
    }

    public String findByWord(String word){
        if (!dictionary.isEmpty()){
            return dictionary.get(word);
        }
        return "Dictionary is empty";
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();

        dictionary.addWord("jump", "push oneself off a surface and into the air by using the muscles in one's legs and feet.");
        dictionary.addWord("take", "lay hold of (something) with one's hands; reach for and hold.");
        dictionary.addWord("keyboard", "a panel of keys that operate a computer or typewriter.");
        dictionary.addWord("joystick", "the control column of an aircraft.");
        dictionary.addWord("cup", "a small bowl-shaped container for drinking from, typically having a handle.");
        dictionary.showWords();

        dictionary.removeWord("cup");
        dictionary.removeWord("take");
        dictionary.showWords();

        System.out.println(dictionary.findByWord("joystick"));
        System.out.println(dictionary.findByWord("bababab"));
    }
}
