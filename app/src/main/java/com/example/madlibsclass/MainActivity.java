package com.example.madlibsclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendText(View v){
        boolean hasNull = false;
        ArrayList<EditText> editTextArray = new ArrayList<EditText>();
        editTextArray.add((EditText) findViewById(R.id.playerEditText));
        editTextArray.add((EditText) findViewById(R.id.adjEditText)) ;
        editTextArray.add((EditText) findViewById(R.id.somethingerEditText));
        editTextArray.add((EditText) findViewById(R.id.skillEditText));
        editTextArray.add((EditText) findViewById(R.id.skillEditText2));
        editTextArray.add((EditText) findViewById(R.id.nounEditText));
        editTextArray.add((EditText) findViewById(R.id.playerEditText2));
        editTextArray.add((EditText) findViewById(R.id.playerEditText3));

        for(int i = 0; i < editTextArray.size(); i++){
            if(editTextArray.get(i).getText().toString().equals("")){
                hasNull = true;
            }
        }
        if(!hasNull) {
            String myMessage = "Excuse me? " + editTextArray.get(0).getText().toString() + " is bad? I'll have you know that ";
            myMessage += editTextArray.get(0).getText().toString() + " is the most ";
            myMessage += editTextArray.get(1).getText().toString() + " ";
            myMessage += editTextArray.get(2).getText().toString() + " in the whole school. His ";
            myMessage += editTextArray.get(3).getText().toString() + " and ";
            myMessage += editTextArray.get(4).getText().toString() + " with the ";
            myMessage += editTextArray.get(5).getText().toString() + " is something we should be glad to witness. ";
            myMessage += editTextArray.get(6).getText().toString() + " breaks the records. " + editTextArray.get(7).getText().toString() + " breaks the records. ";
            myMessage += editTextArray.get(0).getText().toString() + " breaks the rules.";
            myMessage += " You can keep your statistics. I prefer the magic.";

            Intent intent = new Intent(this, MadLibsActivity.class);
            intent.putExtra(MadLibsActivity.MY_MESSAGE, myMessage);
            startActivity(intent);
        }
        else{
            Context context = getApplicationContext();
            CharSequence string = "Textbox feels lonely. But nobody came. (You left some textbox blank. Fill it in.)";
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
        }

    }
}
