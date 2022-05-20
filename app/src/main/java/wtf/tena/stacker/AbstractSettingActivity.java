package wtf.tena.stacker;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import wtf.tena.stacker.setting.AbstractSetting;

public abstract class AbstractSettingActivity extends AppCompatActivity {

    private final List<AbstractSetting> settingList;

    protected AbstractSettingActivity() {
        this.settingList = new ArrayList<>();
    }

    protected final List<AbstractSetting> getSettingList() {
        return this.settingList;
    }

    public void registerSetting(AbstractSetting setting) {
        this.settingList.add(setting);
    }
}
