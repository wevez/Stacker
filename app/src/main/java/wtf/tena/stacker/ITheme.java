package wtf.tena.stacker;

import android.content.Intent;

import java.util.concurrent.ThreadLocalRandom;

public interface ITheme {

    ThreadLocalRandom randomInstance = ThreadLocalRandom.current(); // The instance of ThreadLocalRandom class.

    void setValue(final Intent intent);
    void updateData();
}
