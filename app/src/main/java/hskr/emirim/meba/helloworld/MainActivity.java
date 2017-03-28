package hskr.emirim.meba.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = (Button) findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "지구가 멸망했따!!!!!",Toast.LENGTH_LONG).show();
    }
}
