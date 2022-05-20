package wtf.tena.stacker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

import wtf.tena.stacker.setting.AbstractSetting;

public class ScrambleSetting extends AbstractSettingActivity {

    public ScrambleSetting() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scramble_setting);
    }
}