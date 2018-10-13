package josegabriel.villarama.com.villaramajosegabriellab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i =  new Intent(this, IntentLogs.class);
        this.startService(i);
    }

    public void option (View v){
        Intent i = null, chooser= null;

        if (v.getId() == R.id.actBtn){
            i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.mapBtn){
            i = new Intent(Intent.ACTION_VIEW);

            i.setData(Uri.parse("geo:9.849271, 126.045617"));
            chooser = Intent.createChooser(i, "Maps");
            startActivity(chooser);
        }
    }
}
