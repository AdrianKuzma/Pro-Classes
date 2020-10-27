package exercises;

import java.util.ArrayList;

public class Shiritori {
    private ArrayList<String> words = new ArrayList<>();
    private boolean gameOver;

    public void runGame(String[] words){
        for (String word : words) {
            if(gameOver) return;
            System.out.println(play(word));
        }
    }

    public String play(String word){
        if(gameOver || words.contains(word)) {
            gameOver = true;
            return "Game Over";
        }

        if(words.isEmpty()){
            words.add(word);
            return "Correct word. Used words:" + getWords();
        }

        String word2 = words.get(words.size() - 1);
        if(word.charAt(0) == word2.charAt(word2.length() - 1 )){
            words.add(word);
            return "Correct word. Used words:" + getWords();
        }
        gameOver = true;
        return "Game Over";
    }

    public String restart(){
        gameOver = false;
        return "Game restarted";
    }

    public String getWords(){
        return String.join(", ", words);
    }
;
}
