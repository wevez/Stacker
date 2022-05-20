package wtf.tena.stacker.setting;

import wtf.tena.stacker.AbstractSettingActivity;

public abstract class AbstractSetting {

    private static final Visibility YES;

    static {
        YES = () -> true;
    }

    private final String name;
    private final Visibility visibility;

    /*
    Do not let make instance from other classes
     */
    protected AbstractSetting(String name, AbstractSettingActivity activity) {
        this.name = name;
        this.visibility = YES;
        activity.registerSetting(this);
    }

    protected AbstractSetting(String name, AbstractSettingActivity activity, Visibility visibility) {
        this.name = name;
        this.visibility = visibility;
        activity.registerSetting(this);
    }

}
