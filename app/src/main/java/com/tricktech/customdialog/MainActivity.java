package com.tricktech.customdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button showCustomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCustomDialog = (Button) findViewById(R.id.btnShowDialog);

        showCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCustomDialog();
            }
        });
    }

    public void showCustomDialog(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog_view);
        final Button button = (Button) dialog.findViewById(R.id.button);
        final CheckBox checkBox = (CheckBox) dialog.findViewById(R.id.checkBox);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()){
                    Toast.makeText(MainActivity.this, "Checked!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                }else {
                    Toast.makeText(MainActivity.this, "Unchecked!", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                }
            }
        });
        dialog.show();

    }
}
