package info.asiatenggara;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> fotoNegara = new ArrayList<>();
    private ArrayList<String> namaNegara = new ArrayList<>();
    private ArrayList<String> infoNegara = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> fotoNegara, ArrayList<String> namaNegara, ArrayList<String> infoNegara,  Context context) {
        this.fotoNegara = fotoNegara;
        this.namaNegara = namaNegara;
        this.infoNegara = infoNegara;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotoNegara.get(position)).into(holder.imageViewFotoNegara);

        holder.textViewNamaNegara.setText(namaNegara.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(context, namaNegara.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);

                intent.putExtra("foto_negara", fotoNegara.get(position));
                intent.putExtra("nama_negara", namaNegara.get(position));
                intent.putExtra("info_negara", infoNegara.get(position));

                context.startActivity(intent);


            }
        });
    }

    @Override
    public int getItemCount() {
        return namaNegara.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewFotoNegara;
        TextView textViewNamaNegara;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFotoNegara = itemView.findViewById(R.id.imageViewFotoNegara);
            textViewNamaNegara = itemView.findViewById(R.id.textViewNamaNegara);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
