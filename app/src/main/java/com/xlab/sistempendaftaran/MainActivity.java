package com.xlab.sistempendaftaran;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Add the dialog buttons.

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.satu:
                //Toast.makeText(getApplicationContext(),"menu satu", Toast.LENGTH_SHORT).show();
                myalert();
                return true;
            case R.id.dua:

                return true;
            default:
                // Do nothing
        }
        return super.onOptionsItemSelected(item);
    }



private void myalert() {
    AlertDialog.Builder myAlertBuilder = new
            AlertDialog.Builder(MainActivity.this);
        myAlertBuilder.setTitle("Alert");
    myAlertBuilder.setMessage("Click OK to continue, or Cancel to stop:");
    myAlertBuilder.setPositiveButton("OK", new
            DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // User clicked OK button.
                    Toast.makeText(getApplicationContext(), "Pressed OK",
                            Toast.LENGTH_SHORT).show();
                }
            });
    myAlertBuilder.setNegativeButton("Cancel", new
            DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    // User cancelled the dialog.
                    Toast.makeText(getApplicationContext(), "Pressed Cancel",
                            Toast.LENGTH_SHORT).show();
                }
            });
    myAlertBuilder.show();
}
}