package wtf.tena.stacker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ThemeSetting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_setting);
        final Button startView = findViewById(R.id.start);
        startView.setOnClickListener(view -> {
            final String theme = getIntent().getStringExtra("theme");
            switch (theme){
                case "target":
                    final Intent targetIntent = new Intent();
                    break;
                case "scramble":

                    break;
            }
        });
    }
}