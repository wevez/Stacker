package wtf.tena.stacker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView themeView = findViewById(R.id.themeList);
        themeView.setOnItemClickListener((adapterView, view, i, l) -> {
            switch ((String) adapterView.getItemAtPosition(i)) {
                case "Scramble英文法":
                    final Intent scrambleIntent = new Intent(MainActivity.this, ThemeSetting.class);
                    scrambleIntent.putExtra("theme", "target");
                    startActivity(scrambleIntent);
                    break;
                case "Target1900":
                    final Intent targetIntent = new Intent(MainActivity.this, ThemeSetting.class);
                    targetIntent.putExtra("theme", "scramble");
                    startActivity(targetIntent);
                    break;
                default:
                    break;
            }
        });
    }
}