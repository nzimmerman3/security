package zimmerman.nicholas.call;

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

    }

    public void cameras(View view)
    {
        Intent intent = new Intent(this, cameras.class);
        startActivity(intent);
    }

    public void help(View view)
    {
        dialContactPhone("911");
    }
    public void addEmergency(View view)
    {
        Intent intent = new Intent(this, addEmergencyContact.class);
        startActivity(intent);
    }

    private void dialContactPhone(final String phoneNumber)
    {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

}
