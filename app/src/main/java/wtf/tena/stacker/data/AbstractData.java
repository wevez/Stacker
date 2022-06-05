package wtf.tena.stacker.data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import wtf.tena.stacker.data.world.AbstractWord;

public abstract class AbstractData <W extends AbstractWord> {

    // The list of word
    private final List<W> wordList;

    private final ThreadLocalRandom randomInstance;

    private int dataIndex;

    {
        this.randomInstance = ThreadLocalRandom.current();
        this.dataIndex = 0;
    }

    protected AbstractData() {
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

    public final W getData(int index) { return this.wordList.get(index); }

    public final W nextData(boolean random) {
        if (random) return this.getData(randomInstance.nextInt(this.getLength()));
        else return this.getData(dataIndex++);
    }
}
