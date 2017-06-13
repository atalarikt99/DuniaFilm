package id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import javax.xml.transform.Source;

import id.sch.smktelkom_mlg.privateassignment.xirpl228.duniafilm.R;

/**
 * Created by Mokleters on 6/13/2017.
 */

public class SourceAdapter extends RecyclerView.Adapter<SourceAdapter.ViewHolder> {
    public static final String IMAGE_URL_BASE_PATH = "http://image.tmdb.org/t/p/w500";
    ArrayList<Source> list;
    Context context;

    public SourceAdapter(Context context, ArrayList<Source> list)
    {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
}
