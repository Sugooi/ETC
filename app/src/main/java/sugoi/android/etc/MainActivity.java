package sugoi.android.etc;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText src,dst;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        src = (EditText) findViewById(R.id.src);
        dst = (EditText) findViewById(R.id.dst);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(src.getText().toString().isEmpty())
                {
                    src.setError("Please enter the source location or switch on gps.");
                    return;
                }

                if(dst.getText().toString().isEmpty())
                {
                    dst.setError("Please enter the destination location.");
                    return;
                }

                 Dialog pay_dialog = new Dialog(MainActivity.this);
                pay_dialog.setContentView(R.layout.ticket);

                pay_dialog.show();


                TextView id,from,till;

                id=(TextView) pay_dialog.findViewById(R.id.id);
                from = (TextView) pay_dialog.findViewById(R.id.from);
                till = (TextView) pay_dialog.findViewById(R.id.till);

                id.setText("Generated id");
                from.setText("Yousufguda");
                till.setText("JubileeHills");


            }
        });
    }
}
