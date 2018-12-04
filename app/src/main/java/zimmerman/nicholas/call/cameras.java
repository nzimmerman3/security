package zimmerman.nicholas.call;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cameras extends AppCompatActivity {

    String camera1;
    String camera2;
    String camera3;
    String camera4;
    Button b_camera1;
    Button b_camera2;
    Button b_camera3;
    Button b_camera4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cameras);
        update();
    }

    public void update()
    {
        Bundle extras = getIntent().getExtras();
        if(extras == null)
        {
            return;
        }
        b_camera1 = (Button)findViewById(R.id.camera1);
        b_camera2 = (Button)findViewById(R.id.camera2);
        b_camera3 = (Button)findViewById(R.id.camera3);
        b_camera4 = (Button)findViewById(R.id.camera4);

        camera1 = extras.getString("1");
        camera2 = extras.getString("2");
        camera3 = extras.getString("3");
        camera4 = extras.getString("4");
        b_camera1.setText(camera1);
        b_camera2.setText(camera2);
        b_camera3.setText(camera3);
        b_camera4.setText(camera4);
    }

    public void rename(View view)
    {
        Intent intent = new Intent(this, renameCameras.class);
        startActivity(intent);
    }

    public void camera1(View view)
    {

    }

    public void camera2(View view)
    {

    }
    public void camera3(View view)
    {

    }
    public void camera4(View view)
    {

    }

}
