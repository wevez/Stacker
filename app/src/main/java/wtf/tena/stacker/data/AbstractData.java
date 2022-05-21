package wtf.tena.stacker.data;

import java.util.ArrayList;
import java.util.List;

import wtf.tena.stacker.data.world.AbstractWord;

public abstract class AbstractData <W extends AbstractWord> {

    // the list of word
    private final List<W> wordList;

    protected AbstractData() {
        // I love linked list !!!
        this.wordList = new ArrayList<>();
        init();
    }

    protected AbstractData(boolean inBeta) {
        this.wordList = new ArrayList<>();
        init();
    }

    protected abstract void init();

    // add words to word list
    protected final void addWord(W word) {
        this.wordList.add(word);
    }

    public final int getLength() { return this.wordList.size(); }

    public final W getWord(int index) { return this.wordList.get(index); }
}
