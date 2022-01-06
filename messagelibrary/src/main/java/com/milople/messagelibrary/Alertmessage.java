package com.milople.messagelibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Toast;

public class Alertmessage {
    Context ctx;
    Alertmessage(Context ctx)
    {
        this.ctx=ctx;
    }
    public static void getmessage(Context ctx)
    {
        AlertDialog.Builder builder;

        builder = new AlertDialog.Builder(ctx);

                //Uncomment the below code to Set the message and title from the strings.xml file
                builder.setMessage("dialog_message") .setTitle("dialog_title");

                //Setting message manually and performing action on button click
                builder.setMessage("Do you want to close this application ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                               // finish();
                                Toast.makeText(ctx,"you choose yes action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                                Toast.makeText(ctx,"you choose no action for alertbox",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
        AlertDialog alert = builder.create();
        //Setting the title manually
        alert.setTitle("AlertDialogExample");
        alert.show();
    }
}