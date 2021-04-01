package info.asiatenggara;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFotoNegara;
    TextView textViewNamaNegara, textViewInfoNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoNegara = findViewById(R.id.imageViewFotoNegara);
        textViewNamaNegara = findViewById(R.id.textViewNamaNegara);
        textViewInfoNegara = findViewById(R.id.textViewInfoNegara);

        getIncomingExtra();
    }

    private void getIncomingExtra(){

        if(getIntent().hasExtra("foto_negara") && getIntent().hasExtra("nama_negara") && getIntent().hasExtra("info_negara")){

            String fotoNegara = getIntent().getStringExtra("foto_negara");
            String namaNegara = getIntent().getStringExtra("nama_negara");
            String infoNegara = getIntent().getStringExtra("info_negara");

            setDataActivity(fotoNegara, namaNegara, infoNegara);
        }
    }

    private void setDataActivity(String fotoNegara, String namaNegara, String infoNegara){

        Glide.with(this).asBitmap().load(fotoNegara).into(imageViewFotoNegara);

        textViewNamaNegara.setText(namaNegara);

        textViewInfoNegara.setText(infoNegara);

    }
}