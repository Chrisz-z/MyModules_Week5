package sg.edu.rp.c346.id22035357.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity{

    TextView tvC203;
    TextView tvC206;
    TextView tvC218;
    TextView tvC235;
    TextView tvC346;
    Button btnSummary;
    Module c203 = new Module("C203","Web Appln Development in php",2023, 1, 4, "W65D");
    Module c206 = new Module("C206","Software Development Process",2023, 1, 4, "W65D");
    Module c218 = new Module("C218","UI/UX Design For Apps",2023, 1, 4, "W65D");
    Module c235 = new Module("C235","IT security and Management",2023, 1, 4, "W65D");
    Module c346 = new Module("C346","Mobile App Development",2023, 1, 4, "E63A");
    ArrayList<Module> arrayList= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvC203 = findViewById(R.id.tvC203);
        tvC206 = findViewById(R.id.tvC206);
        tvC218 = findViewById(R.id.tvC218);
        tvC235 = findViewById(R.id.tvC235);
        tvC346 = findViewById(R.id.tvC346);
        btnSummary =findViewById(R.id.btnSummary);

        arrayList.add(c203);
        arrayList.add(c206);
        arrayList.add(c218);
        arrayList.add(c235);
        arrayList.add(c346);

        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("code", c203);
                startActivity(intent);
            }
        });

        tvC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("code", c206);
                startActivity(intent);
            }
        });

        tvC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("code", c218);
                startActivity(intent);
            }
        });

        tvC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("code", c235);
                startActivity(intent);
            }
        });

        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("code", c346);
                startActivity(intent);
            }
        });

        btnSummary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalCredit = 0;
                String allMods = "";
                int semSummary = 0;
                int yearSummary = 0;
                for(int i = 0; i < arrayList.size(); i++){
                    semSummary = arrayList.get(i).getSem();
                    yearSummary = arrayList.get(i).getYear();
                    totalCredit += arrayList.get(i).getCredit();
                    allMods += ("\n" + arrayList.get(i).getCode()+ " "+ arrayList.get(i).getName());
                }
                Module summary = new Module("",allMods,yearSummary,semSummary,totalCredit,"");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("code", summary);
                startActivity(intent);
                }
        });

    }
}