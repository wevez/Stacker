package wtf.tena.stacker.data.world;

public class TargetWord extends AbstractWord {

    private final TargetSpeech speech;
    // use byte field to reduce memory
    private final byte section;

    public TargetWord(String name, String description, int section, TargetSpeech speech) {
        super(name, description);
        this.section = (byte) section;
        this.speech = speech;
    }

    public TargetSpeech getSpeech() { return this.speech; }
    public byte getSession() { return this.section; }

    public enum TargetSpeech {
        // 動詞
        Verb,
        // 名詞
        Noun,
        // 形容詞
        Adjective,
        // 副詞
        Adverb;
    }
}
