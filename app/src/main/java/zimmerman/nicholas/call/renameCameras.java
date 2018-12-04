package zimmerman.nicholas.call;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class renameCameras extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rename_cameras);
    }
    public void rename(View view)
    {
        if(!ready())
            return;
        Intent intent = new Intent(this, newHome.class);
        Name = String.valueOf(name.getText().toString());
        intent.putExtra("n", Name);
        Number = String.valueOf(number.getText().toString());
        intent.putExtra("p", Number);
        startActivity(intent);
    }
}
