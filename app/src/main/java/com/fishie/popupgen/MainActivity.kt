package com.fishie.popupgen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.Gen)

        //via
        //https://www.javatpoint.com/kotlin-android-alertdialog#:~:text=Kotlin%20Android%20AlertDialog%20Android%20AlertDialog%20is%20a%20subclass,up%20to%20three%20buttons%20or%20a%20custom%20layout.
        button.setOnClickListener {

            //Init
            var Title = findViewById(R.id.title) as EditText;
            var Message = findViewById(R.id.content) as EditText;

            var Btn1 = findViewById(R.id.btn1) as EditText;
            var Btn2 = findViewById(R.id.btn2) as EditText;
            var Btn3 = findViewById(R.id.btn3) as EditText;
            //end init

            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle(Title.text)

            //set message for alert dialog
            builder.setMessage(Message.text)

            //disabled cause looks ugly
            //builder.setIcon(android.R.drawable.ic_dialog_alert);

            //performing positive action
            builder.setPositiveButton(Btn3.text) { dialogInterface, which -> }
            //performing cancel action
            builder.setNeutralButton(Btn1.text) { dialogInterface, which -> }
            //performing negative action
            builder.setNegativeButton(Btn2.text) { dialogInterface, which -> }

            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.setCancelable(true)
            alertDialog.show()
        }

    }


}