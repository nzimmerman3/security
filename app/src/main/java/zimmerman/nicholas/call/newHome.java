package zimmerman.nicholas.call;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newHome extends AppCompatActivity {

    Button contact;
    String number;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_home);
        contact = (Button)findViewById(R.id.button4);
        Bundle extras = getIntent().getExtras();
        if(extras == null)
        {
            return;
        }
        name = extras.getString("n");
        number = extras.getString("p");
        contact.setText(name);
    }
    public void help(View view)
    {
        dialContactPhone("911");
    }

    public void callEmergency(View view)
    {
        dialContactPhone(number);
    }

    private void dialContactPhone(final String phoneNumber)
    {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }
}
