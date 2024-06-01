package com.example.alertdialog;

import static android.content.DialogInterface.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AlertDialogLayout;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //only creating one button on dialog  box use class AlertDialog only
        /*AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Terms & Condition");
        alertDialog.setIcon(R.drawable.ic_baseline_info_24);
        alertDialog.setMessage("Have read terms & condition");
        alertDialog.setButton("Yes I`ve read",new DialogInterface.OnClickListener(){
        
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Yes  Done", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialog.show();*/
        //for creating two button Dialog box
        AlertDialog.Builder al = new AlertDialog.Builder(this);
        al.setTitle("Delete");
        al.setIcon(R.drawable.ic_baseline_delete_24);
        al.setMessage("Are you sure");
        al.setPositiveButton("Yes",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Yes Bhai", Toast.LENGTH_SHORT).show();
            }
        });
        al.setNegativeButton("No",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Item not Deleted", Toast.LENGTH_SHORT).show();
            }
        });
        al.show();

    }

    @Override
    public void onBackPressed() {
         super.onBackPressed();
        AlertDialog.Builder a = new AlertDialog.Builder(this);
        a.setIcon(R.drawable.ic_baseline_exit_to_app_24);
        a.setTitle("Exit");
        a.setMessage("Are you sure");
        a.setPositiveButton("Yes",new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Exit yes",Toast.LENGTH_LONG).show();
            }
        });
         a.setNegativeButton("NO",new DialogInterface.OnClickListener(){

             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                  MainActivity.super.onBackPressed();
             }
         });
         a.setNeutralButton("Cancil",new DialogInterface.OnClickListener(){

             @Override
             public void onClick(DialogInterface dialogInterface, int i) {
                 Toast.makeText(MainActivity.this,"Exit No",Toast.LENGTH_LONG).show();
             }
         });
         a.show();

    }
}