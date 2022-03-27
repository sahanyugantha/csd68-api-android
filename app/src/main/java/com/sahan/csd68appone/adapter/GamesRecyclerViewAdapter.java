package com.sahan.csd68appone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.sahan.csd68appone.R;
import com.sahan.csd68appone.model.Game;

import java.util.List;

public class GamesRecyclerViewAdapter extends RecyclerView.Adapter<GamesRecyclerViewAdapter.MyViewHolder> {

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvGameName;
        TextView tvCompanyName;
        TextView tvRate;
        ImageView imgLogo;
        ImageView gameCover;
        public MyViewHolder(View itemView) {
            super(itemView);
            this.tvGameName = itemView.findViewById(R.id.gameName);
            this.tvCompanyName = itemView.findViewById(R.id.companyName);
            this.tvRate = itemView.findViewById(R.id.rateValue);
            this.imgLogo = itemView.findViewById(R.id.gameLogo);
            this.gameCover = itemView.findViewById(R.id.imgPost);
        }
    }

    private Context context;
    private List<Game> gameList;

    public GamesRecyclerViewAdapter(Context context, List<Game> gameList) {
        this.context = context;
        this.gameList = gameList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemView = layoutInflater.inflate(R.layout.list_game_row_item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Game game = gameList.get(position);
        holder.tvGameName.setText(game.getName());
        holder.tvCompanyName.setText(game.getCompany());
        holder.tvRate.setText(game.getOverallRate());
        Glide
                .with(context)
                .load(game.getGameLogoURL())
                .circleCrop()
                .into(holder.imgLogo);
        Glide
                .with(context)
                .load(game.getImgURL())
                .centerCrop()
                .into(holder.gameCover);
    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }
}
