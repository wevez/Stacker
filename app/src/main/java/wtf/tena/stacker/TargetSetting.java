package wtf.tena.stacker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TargetSetting extends AbstractSettingActivity {

    /*
    Settings for target activity
     */

    public TargetSetting() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_setting);
    }
}