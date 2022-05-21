package wtf.tena.stacker.setting;

public class DoubleSetting extends AbstractSetting {

    private static final String NONE_UNIT;

    static {
        NONE_UNIT = "";
    }

    private double value;
    private final double min, max, increment;
    private final String unit;

    public DoubleSetting(String name, Visibility visibility, double value, double min, double max, double increment, String unit) {
        super(name, visibility);
        this.value = value;
        this.min = min;
        this.max = max;
        this.increment = increment;
        this.unit = unit;
    }

    public DoubleSetting(String name, double value, double min, double max, double increment, String unit) {
        super(name);
        this.value = value;
        this.min = min;
        this.max = max;
        this.increment = increment;
        this.unit = unit;
    }

    public DoubleSetting(String name, Visibility visibility, double value, double min, double max, double increment) {
        super(name, visibility);
        this.value = value;
        this.min = min;
        this.max = max;
        this.increment = increment;
        this.unit = NONE_UNIT;
    }

    public DoubleSetting(String name, double value, double min, double max, double increment) {
        super(name);
        this.value = value;
        this.min = min;
        this.max = max;
        this.increment = increment;
        this.unit = NONE_UNIT;
    }

    public void switchValue(boolean positive) {

    }

    public void setValue(double percent) {

    }

    public final double getValue() {
        return this.value;
    }

}
