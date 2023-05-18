package sg.edu.rp.c346.id22035357.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvCode = findViewById(R.id.tvCode);
        tvName = findViewById(R.id.tvName);
        tvYear = findViewById(R.id.tvYear);
        tvSem = findViewById(R.id.tvSem);
        tvCredit = findViewById(R.id.tvCredit);
        tvVenue = findViewById(R.id.tvVenue);

        Intent intentReceived = getIntent();
        Module module = (Module) intentReceived.getSerializableExtra("code");
        String code = module.getCode();
        String Name = module.getName();
        int year = module.getYear();
        int sem = module.getSem();
        int credit = module.getCredit();
        String venue = module.getVenue();
        if(code=="" & venue == "") {
            tvName.setText("Module Name: " + Name);
            tvYear.setText("Academic Year: " + year);
            tvSem.setText("Semester: " + sem);
            tvCredit.setText("Module Credit : " + credit);
        }else{
            tvCode.setText("Module Code: " + code);
            tvName.setText("Module Name: " + Name);
            tvYear.setText("Academic Year: " + year);
            tvSem.setText("Semester: " + sem);
            tvCredit.setText("Module Credit : " + credit);
            tvVenue.setText("Venue: " + venue);
        }
    }
}
