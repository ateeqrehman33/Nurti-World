package designs.attitude.nurtri_world;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {


    LinearLayout c2_12,babiesbelow2,infants,olderadults,pandlwomen,teens,womenofchildbearingage,youngadults;
    CardView guide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        guide=findViewById(R.id.cv0);
        c2_12=findViewById(R.id.cv1);
        babiesbelow2=findViewById(R.id.cv2);
        infants=findViewById(R.id.cv3);
        olderadults=findViewById(R.id.cv4);
        pandlwomen=findViewById(R.id.ncv3);
        teens=findViewById(R.id.ncv4);
        womenofchildbearingage=findViewById(R.id.mcv3);
        youngadults=findViewById(R.id.nncv4);



        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/guide.html");
                startActivity(i);





            }
        });

        c2_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/children(2-12 years).html");
                startActivity(i);





            }
        });



        babiesbelow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/babies2yearsold.html");
                startActivity(i);





            }
        });




        infants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/infants(1-6monthsbaby).html");
                startActivity(i);





            }
        });




        olderadults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/olderadults.html");
                startActivity(i);





            }
        });



        pandlwomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/pregnantandlactatingwomen.html");
                startActivity(i);




            }
        });




        teens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/teens.html");
                startActivity(i);





            }
        });



        womenofchildbearingage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/womenofchildbearingage.html");
                startActivity(i);




            }
        });


        youngadults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomeActivity.this,WebViewActivity.class);
                i.putExtra("key","file:///android_asset/youngadults.html");
                startActivity(i);





            }
        });





    }
}
