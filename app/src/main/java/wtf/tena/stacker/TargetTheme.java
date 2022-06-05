package wtf.tena.stacker;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import wtf.tena.stacker.data.TargetData;
import wtf.tena.stacker.data.world.TargetWord;

public class TargetTheme extends AppCompatActivity implements ITheme {

    /*
    values for theme
     */
    private boolean randomProposing;
    private boolean checking;
    private final boolean[] selectedSections;

    private TargetData targetData;
    private TargetWord currentWord;

    public TargetTheme() {
        selectedSections = new boolean[19];
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        {
            final Button[] buttons = getOptionButtons();
            for (int i = 0; i < buttons.length; i++) {
                if (this.checking) buttons[i].setVisibility(0);
                else {
                    final Button b = buttons[i];
                    b.setOnClickListener(l -> {

                    });
                }
            }
            if (this.checking) {
                // checking mode
            } else{
                // testing mode
            }
        }
    }

    @Override
    public void setValue(final Intent intent) {
        this.randomProposing = intent.getBooleanExtra("random_proposing", false);
        for (int i = 0; i < selectedSections.length; i++) {
            this.selectedSections[i] = intent.getBooleanExtra(String.format("Section %d", i), false);
        }
    }

    @Override
    public void updateData() {
        final TargetWord nextWord = targetData.nextData(this.randomProposing);
        currentWord = nextWord;
    }

    // Returns a array of option button
    private Button[] getOptionButtons() {
        return new Button[] {
                findViewById(R.id.option1),
                findViewById(R.id.option2),
                findViewById(R.id.option3),
                findViewById(R.id.option4),
        }
    }
}