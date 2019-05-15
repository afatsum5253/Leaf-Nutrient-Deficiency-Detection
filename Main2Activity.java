package peru.proj1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
Button send_data,pr;
    private TextView tv_data,tv_data1,tv_data2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_data = (TextView) findViewById(R.id.textView);
        tv_data.setText("Press the 'confirm' button to send your query.");
        pr = (Button) findViewById(R.id.button_send);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent myIntent = new Intent(Main2Activity.this,
                        Main4Activity.class);
                startActivity(myIntent);
            }
        });
        send_data = (Button) findViewById(R.id.send_data);
        send_data.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                send(v);

            }
        });

    }



    public void send(View v){
    new MessageSender().execute(MainActivity.variance,MainActivity.IDM,MainActivity.mean,MainActivity.stdevx,MainActivity.stdevy,MainActivity.correlation,MainActivity.contrast,MainActivity.energy,MainActivity.entropy,MainActivity.homogeneity,MainActivity.shade,MainActivity.prominence,MainActivity.inertia,MainActivity.red,MainActivity.green,MainActivity.blue,MainActivity.gbyb,MainActivity.gbyb);

    }

}
