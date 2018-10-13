package josegabriel.villarama.com.villaramajosegabriellab5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class IntentLogs extends IntentService {
    public IntentLogs() {
        super ("josegabriel.villarama.com.villaramajosegabriellab5.intentlogs");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent){
        Log.d("4ITI", "Running");
    }
}