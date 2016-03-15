package it.neokree.example.mockedActivity;

import it.neokree.example.R;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by neokree on 24/11/14.
 */
public class Settings extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }
}
