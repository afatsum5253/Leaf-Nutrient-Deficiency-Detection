package peru.proj1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class Main4Activity extends AppCompatActivity {
    private TextView textView;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView = (TextView) findViewById(R.id.textView3);
        bt = (Button) findViewById(R.id.button_back);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent myIntent = new Intent(Main4Activity.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });
        textView.setText("The Deficiency found is: "+MessageSender.answer);

    }

}
