package com.dossiersoftsolutions.dialogs;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button,btn1,btn2;
    ImageView imageView;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.tv);
        button.setOnClickListener(this);

    }

    private void openDialog() {
        dialog = new Dialog(this);
        dialog.setContentView(R.layout.design_dialog);
        dialog.getWindow().getAttributes().windowAnimations = R.style.PauseDialogAnimation;
        dialog.setCancelable(false);
        btn1 = dialog.findViewById(R.id.bt1);
        btn2 = dialog.findViewById(R.id.bt2);
        imageView = dialog.findViewById(R.id.iv);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        imageView.setOnClickListener(this);

        dialog.show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.bt1:
                Toast.makeText(this,"btn1 clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt2:
                Toast.makeText(this,"btn2 clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv:
                dialog.dismiss();
                break;
            case R.id.tv:
                openDialog();
                break;
        }
    }
}
