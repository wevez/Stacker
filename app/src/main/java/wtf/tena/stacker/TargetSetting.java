package wtf.tena.stacker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import wtf.tena.stacker.setting.BoolSetting;

public class TargetSetting extends AppCompatActivity {

    /*
    Settings for target activity
     */
    private final List<BoolSetting> sections;
    private final BoolSetting randomProposing;

    public TargetSetting() {
        sections = new ArrayList<>();
        // add section 1 to 19
        for (int i = 1; i < 19; i++) {
            this.sections.add(new BoolSetting(String.format("Section %d", i), true));
        }
        this.randomProposing = new BoolSetting(getString(R.string.random_proposing), true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_setting);
        // set start view button
        {
            final Button startButton = findViewById(R.id.start);
            startButton.setOnClickListener(i -> {
                final Intent intent = new Intent(TargetSetting.this, TargetTheme.class);
                // add section information to the intent.
                this.sections.forEach(s -> intent.putExtra(s.getName(), s.getValue()));
                intent.putExtra("random_proposing", randomProposing.getValue());
                startActivity(intent);
            });
        }
    }
}