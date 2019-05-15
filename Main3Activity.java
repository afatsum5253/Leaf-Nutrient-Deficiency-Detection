package peru.proj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.Handler;
import android.content.Intent;

public class Main3Activity extends AppCompatActivity {
    private ProgressBar progressBar;
    private int progressStatus = 0;
    private TextView textView;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar3);
        textView = (TextView) findViewById(R.id.textView2);
        //Long operation by thread
        new Thread(new Runnable() {
            public void run() {
                while (progressStatus < 300) {
                    progressStatus++;
                    android.os.SystemClock.sleep(50);
                    //Update progress bar with completion of operation
                    handler.post(new Runnable() {
                        public void run() {
                            progressBar.setProgress(progressStatus);
                        }
                    });
                }

                handler.post(new Runnable() {
                    public void run() {
                        Intent intent = new Intent(Main3Activity.this, Main4Activity.class);
                        startActivity(intent);
                    }
                });

            }

        }).start();
    }
}