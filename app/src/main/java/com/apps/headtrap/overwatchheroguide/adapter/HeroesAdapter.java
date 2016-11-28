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
import com.apps.headtrap.overwatchheroguide.domain.Hero;
import com.apps.headtrap.overwatchheroguide.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Locale;

/**
 * Created by Gustavo on 11/24/2016.
 */

public class HeroesAdapter extends RecyclerView.Adapter<HeroesAdapter.HeroViewHolder>
{
    private Context context;
    private List<Hero> items;
    private HeroCallback callback;

    public HeroesAdapter(Context context, List<Hero> items, HeroCallback callback)
    {
        this.context = context;
        this.items = items;
        this.callback = callback;
    }

    @Override
    public HeroViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_heroes, parent, false);
        HeroViewHolder holder = new HeroViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(HeroViewHolder holder, int position)
    {
        Hero hero = items.get(position);
        Picasso.with(context)
                .load(hero.getHeroPicture())
                .fit()
                .into(holder.imHeroPic);

        AssetManager am = context.getApplicationContext().getAssets();
        Typeface tf = Typeface.createFromAsset(am,String.format(Locale.US, Constants.FONT_TITLE));
        holder.tvHeroName.setTypeface(tf);
        holder.tvHeroName.setText(hero.getHeroName()+" ");

        holder.imHeroPic.setOnClickListener(onClickHero(hero, holder.imHeroPic));

    }

    private View.OnClickListener onClickHero(final Hero hero, final ImageView imHeroPic)
    {
        return new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                callback.onClickHero(hero, imHeroPic);
            }
        };
    }

    @Override
    public int getItemCount()
    {
        return items.size();
    }


    public static class HeroViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView imHeroPic;
        private TextView tvHeroName;

        public HeroViewHolder(View itemView)
        {
            super(itemView);
            imHeroPic = (ImageView) itemView.findViewById(R.id.imHeroPic);
            tvHeroName = (TextView) itemView.findViewById(R.id.tvHeroName);
        }
    }

    public interface HeroCallback
    {
        void onClickHero(Hero hero, ImageView imageView);
    }
}
