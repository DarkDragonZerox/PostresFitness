package com.example.postresfitness;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostresFitnessAdapter extends RecyclerView.Adapter<PostresFitnessAdapter.fitnessViewHolder> {

    @NonNull
    private LayoutInflater layoutInflater;
    private List<Postre> listaPostreList;
    private Context mContext;
    private AdapterView.OnItemClickListener listener;
    public PostresFitnessAdapter(Context pContext, List<Postre> pListaPostreList, AdapterView.OnItemClickListener pListener){
        mContext=pContext;
        listaPostreList=pListaPostreList;
        listener=pListener;
        layoutInflater=LayoutInflater.from(mContext);
    }
    @Override
    public fitnessViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull fitnessViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class fitnessViewHolder extends RecyclerView.ViewHolder {
        public fitnessViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
