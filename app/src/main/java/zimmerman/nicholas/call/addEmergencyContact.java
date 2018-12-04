package zimmerman.nicholas.call;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addEmergencyContact extends AppCompatActivity {

    EditText name;
    EditText number;
    String Name;
    String Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_emergency_contact);
        name = (EditText) findViewById(R.id.name);
        number = (EditText) findViewById(R.id.number);
    }

    public void create(View view)
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


    public boolean ready()
    {
        if(name.getText().toString().trim().isEmpty()||number.getText().toString().trim().isEmpty())
            return false;
        else
            return true;
    }
}
