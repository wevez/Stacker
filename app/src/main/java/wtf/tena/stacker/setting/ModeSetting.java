package wtf.tena.stacker.setting;

public class ModeSetting extends AbstractSetting {

    private String value;
    private final String[] option;

    public ModeSetting(String name, Visibility visibility, String... option) {
        super(name, visibility);
        this.value = option[0];
        this.option = option;
    }

    public ModeSetting(String name, String... option) {
        super(name);
        this.value = option[0];
        this.option = option;
    }

    public void switchValue(boolean positive) {
        // get current index
        int currentIndex = -1;
        for (int i = 0; i < this.option.length; i++) {
            if (option[i].equalsIgnoreCase(this.value)) {
                currentIndex = i;
                break;
            }
        }
        // change value to incremented or decremented
        if (positive) this.value = (currentIndex == this.option.length - 1 ? this.option[0] : this.option[currentIndex + 1]);
        else this.value = (currentIndex == 0 ? this.option[this.option.length - 1] : this.option[currentIndex - 1]);
    }

    public final String getValue() {
        return this.value;
    }

    public final String[] getOption() {
        return this.option;
    }
}
