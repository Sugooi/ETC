package sugoi.android.etc;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.github.sumimakito.awesomeqr.AwesomeQRCode;

public class TicketActivity extends AppCompatActivity {
    private ImageView qr_code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        qr_code = (ImageView) findViewById(R.id.qr);
        generateQrCode();



                    }

    public void generateQrCode(){
        new AwesomeQRCode.Renderer()
                .contents("TSRTC is the best")
                .size(800).margin(20)
                .renderAsync(new AwesomeQRCode.Callback() {
                    @Override
                    public void onRendered(AwesomeQRCode.Renderer renderer, final Bitmap bitmap) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                // Tip: here we use runOnUiThread(...) to avoid the problems caused by operating UI elements from a non-UI thread.
                                qr_code.setImageBitmap(bitmap);
                            }
                        });

    }

                    @Override
                    public void onError(AwesomeQRCode.Renderer renderer, Exception e) {
                        e.printStackTrace();
                    }
                });
    }
}
