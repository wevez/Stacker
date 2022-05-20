package wtf.tena.stacker.setting;

import wtf.tena.stacker.AbstractSettingActivity;

public class BoolSetting extends AbstractSetting {

    private boolean value;

    public BoolSetting(String name, AbstractSettingActivity activity, Visibility visibility, boolean defaultValue) {
        super(name, activity, visibility);
    }

    public BoolSetting(String name, AbstractSettingActivity activity, boolean defaultValue) {
        super(name, activity);
    }

    public final boolean getValue() {
        return this.value;
    }

    public final void switchValue() {
        this.value = !this.value;
    }
}
