package com.anik.droiddialogmeterial;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.droidbyme.dialoglib.AnimUtils;
import com.droidbyme.dialoglib.DroidDialog;

public class MainActivity extends AppCompatActivity {

    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDialog=findViewById(R.id.btn_dialog);

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DroidDialog.Builder(MainActivity.this)
                        .icon(R.drawable.ic_action_tick)
                        .title("All Well!")
                        .content(getString(R.string.short_text))
                        .cancelable(true, true)
                        .positiveButton("OK", new DroidDialog.onPositiveListener() {
                            @Override
                            public void onPositive(Dialog droidDialog) {
                                Toast.makeText(MainActivity.this, "YES", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .negativeButton("No", new DroidDialog.onNegativeListener() {
                            @Override
                            public void onNegative(Dialog droidDialog) {

                            }
                        })
                        .neutralButton("Neutral", new DroidDialog.onNeutralListener() {
                            @Override
                            public void onNeutral(Dialog droidDialog) {

                            }
                        })

                        .animation(AnimUtils.AnimUpDown)
                       // .divider(true, ContextCompat.getColor(MainActivity.this, R.color.orange))
                        .show();
            }
        });
    }
}
