package developer.hussain.com.dashboarddesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button profilebtn,educationbtn,lovebtn,goalbtn,healthbtn,financebtn,helplinebtn,computerbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profilebtn = (Button)findViewById(R.id.btnprofile);
        profilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MainActivity2.class));
            }
        });

        educationbtn = (Button)findViewById(R.id.btneducation);
        educationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Education", Toast.LENGTH_SHORT).show();
            }
        });

        lovebtn = (Button)findViewById(R.id.btnlove);
        lovebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "love", Toast.LENGTH_SHORT).show();
            }
        });
        goalbtn = (Button)findViewById(R.id.btngoal);
        goalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Goal", Toast.LENGTH_SHORT).show();
            }
        });

        healthbtn =(Button)findViewById(R.id.btnhealth);
        healthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Health", Toast.LENGTH_SHORT).show();
            }
        });

        financebtn = (Button)findViewById(R.id.btnfinance);
        financebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "finance", Toast.LENGTH_SHORT).show();
            }
        });
        helplinebtn = (Button)findViewById(R.id.btnHelpline);
        helplinebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Help line", Toast.LENGTH_SHORT).show();
            }
        });
        computerbtn = (Button)findViewById(R.id.btnIComputer);
        computerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Computer", Toast.LENGTH_SHORT).show();
            }
        });



    }
}