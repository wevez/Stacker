package wtf.tena.stacker.data.world;

public class ScrambleWord extends AbstractWord {

    private final ScrambleType type;
    private final String answer;
    private final String[] option;

    public ScrambleWord(String name, String description, ScrambleType type, String answer, String... option) {
        super(name, description);
        this.type = type;
        this.answer = answer;
        this.option = option;
    }

    public ScrambleType getType() { return this.type; }
    public String[] getOption() { return this.option; }
    public String getAnswer() { return this.answer; }

    public enum ScrambleType {
        // 文法
        Sentence,
        // 語法
        Word,
        // 語彙
        Vocabulary,
        // イディオム
        Idiom,
        // 会話表現
        Conversation;
    }
}
