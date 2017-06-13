package id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.R;
import id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.model.Saved;

/**
 * Created by Mokleters on 6/13/2017.
 */

public class SavedAdapter extends RecyclerView.Adapter<SavedAdapter.ViewHolder> {
    Context context;
    ArrayList<Saved> savedList;

    public SavedAdapter(Context context, ArrayList<Saved> savedList)
    {
        this.context = context;
        this.savedList = savedList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.save_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
}
