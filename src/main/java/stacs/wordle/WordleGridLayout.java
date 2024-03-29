package stacs.wordle;

import java.util.Hashtable;

/**
 * This class sets the Grid-layout for the wordle game.It is a hashtable that holds  alphabets and keys which hold the state of the color.
 *
 * @author 220031985
 */
public class WordleGridLayout {

    public Hashtable<String, Integer> alphabets = new Hashtable<>();

    public WordleGridLayout() {
        initialState();
    }


    //  Resetting the Grid-layout.
    // '3' is given as default value as 0,1,2 are defined as color states in the game.

    public void initialState() {
        alphabets.put("a", 3);
        alphabets.put("b", 3);
        alphabets.put("c", 3);
        alphabets.put("d", 3);
        alphabets.put("e", 3);
        alphabets.put("f", 3);
        alphabets.put("g", 3);
        alphabets.put("h", 3);
        alphabets.put("i", 3);
        alphabets.put("j", 3);
        alphabets.put("k", 3);
        alphabets.put("l", 3);
        alphabets.put("m", 3);
        alphabets.put("n", 3);
        alphabets.put("o", 3);
        alphabets.put("p", 3);
        alphabets.put("q", 3);
        alphabets.put("r", 3);
        alphabets.put("s", 3);
        alphabets.put("t", 3);
        alphabets.put("u", 3);
        alphabets.put("v", 3);
        alphabets.put("w", 3);
        alphabets.put("x", 3);
        alphabets.put("y", 3);
        alphabets.put("z", 3);
    }
}
