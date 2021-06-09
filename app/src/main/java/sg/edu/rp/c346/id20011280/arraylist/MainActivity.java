package sg.edu.rp.c346.id20011280.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruits = new ArrayList<String>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        tv = findViewById(R.id.textView);

        String text = "Fruits \n";
        text += "======== \n";

        for(int i = 0; i < fruits.size();i++)
        {
            text += fruits.get(i) + "\n";
        }
        tv.setText(text);

        // adding durian

        fruits.add(3,"durian");

        // getting the second element


        String theFruit = fruits.get(1);

        // removing the first element

        fruits.remove(0);

        // changing last element

        fruits.set(fruits.size()-1,"dragon fruit"); // setting from the back





    }
}