package  com.veer.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("so文件中的内容",getStrFromJNI());
    }
    public native String getStrFromJNI();
    static {
        System.loadLibrary("demo");
    }
}
