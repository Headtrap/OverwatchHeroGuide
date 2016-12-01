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
import com.apps.headtrap.overwatchheroguide.domain.Ability;
import com.apps.headtrap.overwatchheroguide.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;
import java.util.Locale;

/**
 * Created by Gustavo on 11/30/2016.
 */

public class AbilitiesAdapter extends RecyclerView.Adapter<AbilitiesAdapter.AbilitiesViewHolder> {
    private List<Ability> items;
    private Context context;
    private Ability ability;

    public AbilitiesAdapter (Context context, List items){
        this.context = context;
        this.items = items;
    }

    @Override
    public AbilitiesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_abilities, parent, false);
        AbilitiesViewHolder holder = new AbilitiesViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(AbilitiesViewHolder holder, int position) {
        ability = items.get(position);
        if(ability != null) {
            AssetManager am = context.getApplicationContext().getAssets();
            Typeface tf = Typeface.createFromAsset(am,String.format(Locale.US, Constants.FONT_TITLE));
            holder.tvAbilityDescription.setText(ability.getAbilityDescription());
            holder.tvAbilityName.setText(ability.getAbilityName()+" ");
            holder.tvAbilityName.setTypeface(tf);

            Picasso.with(context)
                    .load(ability.getAbilityIcon())
                    .into(holder.imAbilityIcon);
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class AbilitiesViewHolder extends RecyclerView.ViewHolder {
        private TextView tvAbilityName;
        private TextView tvAbilityDescription;
        private ImageView imAbilityIcon;

        public AbilitiesViewHolder(View itemView) {
            super(itemView);
            tvAbilityName = (TextView) itemView.findViewById(R.id.tvAbilityName);
            tvAbilityDescription = (TextView) itemView.findViewById(R.id.tvAbilityDescription);
            imAbilityIcon = (ImageView) itemView.findViewById(R.id.imAbilityIcon);
        }
    }

    public interface AbilitiesCallback {
        void onClickAbility();
    }
}
