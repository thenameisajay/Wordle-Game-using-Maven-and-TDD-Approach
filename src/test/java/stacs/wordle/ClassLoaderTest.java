package stacs.wordle;

import org.junit.jupiter.api.Test;

/**
 * Test class for checking if all classes are loaded.
 *
 * @author 220031985
 */
class ClassLoaderTest {

    @Test
    void testClasses() throws ClassNotFoundException {
        getClass().getClassLoader().loadClass("stacs.wordle.GameEngine");
        getClass().getClassLoader().loadClass("stacs.wordle.ScoreEngine");
        getClass().getClassLoader().loadClass("stacs.wordle.WordChecker");
        getClass().getClassLoader().loadClass("stacs.wordle.RandomEngine");
        getClass().getClassLoader().loadClass("stacs.wordle.ColorAssigner");
        getClass().getClassLoader().loadClass("stacs.wordle.WordleGridLayout");
        getClass().getClassLoader().loadClass("stacs.wordle.WordleApp");


    }
}