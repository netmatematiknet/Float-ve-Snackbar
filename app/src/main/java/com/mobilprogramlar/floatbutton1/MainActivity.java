package com.mobilprogramlar.floatbutton1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button mShowSnackbarButton;
    private CoordinatorLayout mCoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCoordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        mShowSnackbarButton = (Button) findViewById(R.id.showSnackbarButton);
        mShowSnackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(mCoordinatorLayout,
                        "Bu basit bir Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("KAPAT", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Custom action
                            }
                        }).show();
            }
        });
    }
}
