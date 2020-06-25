package com.fancyalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.fancyalertdialoglib.Animation;
import com.fancyalertdialoglib.FancyAlertDialog;
import com.fancyalertdialoglib.FancyAlertDialogListener;
import com.fancyalertdialoglib.Icon;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new FancyAlertDialog.Builder(this)
                .setTitle("Remove Photo")
                .setHeaderBackgroundColor(getResources().getColor(R.color.colorAccent))
                .setMessage("Are you sure you want to delete?")
                .setNegativeBtnText("Cancel")
                .setHideNegativeButton(true)
                .setHideHeader(true)
                .setMessage("Are you sure you want to delete?")
                .setNegativeBtnText("Cancel")
                .setBtnTextColor(getResources().getColor(R.color.colorPrimaryDark))
                .setPositiveBtnBackground(getResources().getColor(R.color.colorAccent))
                .setPositiveBtnText("Delete")
                .setNegativeBtnBackground(getResources().getColor(R.color.colorAccent))
                .setAnimation(Animation.POP)
                .isCancellable(true)
                .setIcon(R.drawable.ic_attention, Icon.Visible)
                .OnPositiveClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(getApplicationContext(), "Rate", Toast.LENGTH_SHORT).show();
                    }
                })
                .OnNegativeClicked(new FancyAlertDialogListener() {
                    @Override
                    public void OnClick() {
                        Toast.makeText(getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
                    }
                })
                .build();
    }
}
