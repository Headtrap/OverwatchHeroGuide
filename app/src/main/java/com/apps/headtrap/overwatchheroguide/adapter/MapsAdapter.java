package com.apps.headtrap.overwatchheroguide.adapter;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.domain.Map;
import com.apps.headtrap.overwatchheroguide.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Locale;

/**
 * Created by Gustavo on 11/24/2016.
 */

public class MapsAdapter extends RecyclerView.Adapter<MapsAdapter.MapViewHolder>
{
    private Context context;
    private List<Map> items;
    private MapCallback callback;

    public MapsAdapter(Context context, List<Map> items, MapCallback callback)
    {
        this.context = context;
        this.items = items;
        this.callback = callback;
    }

    @Override
    public MapViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_maps, parent, false);
        MapViewHolder holder = new MapViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MapViewHolder holder, int position)
    {
        Map map = items.get(position);
        Picasso.with(context)
                .load(map.getMapPicture())
                .fit()
                .into(holder.imMapPic);

        AssetManager am = context.getApplicationContext().getAssets();
        Typeface tf = Typeface.createFromAsset(am, String.format(Locale.US, Constants.FONT_TITLE));
        holder.tvMapName.setTypeface(tf);
        holder.tvMapName.setText(map.getMapName() + " ");
        holder.imMapPic.setOnClickListener(onClickMap(map, holder.imMapPic));

    }

    private View.OnClickListener onClickMap(final Map map, final ImageView imMapPic)
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                callback.onClickMap(map, imMapPic);

            }
        };
    }

    @Override
    public int getItemCount()
    {
        return items.size();
    }


    public static class MapViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imMapPic;
        private TextView tvMapName;

        public MapViewHolder(View itemView)
        {
            super(itemView);
            imMapPic = (ImageView) itemView.findViewById(R.id.imMapPic);
            tvMapName = (TextView) itemView.findViewById(R.id.tvMapName);
        }
    }

    public interface MapCallback
    {
        void onClickMap(Map map, ImageView imageView);
    }
}
