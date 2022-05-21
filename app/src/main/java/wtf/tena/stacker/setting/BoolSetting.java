package wtf.tena.stacker.setting;

public class BoolSetting extends AbstractSetting {

    private boolean value;

    public BoolSetting(String name, Visibility visibility, boolean defaultValue) {
        super(name, visibility);
    }

    public BoolSetting(String name,  boolean defaultValue) {
        super(name);
    }

    public final boolean getValue() {
        return this.value;
    }

    public final void switchValue() {
        this.value = !this.value;
    }
}
