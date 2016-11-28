package com.apps.headtrap.overwatchheroguide.activity;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.Toolbar;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.apps.headtrap.overwatchheroguide.R;
import com.apps.headtrap.overwatchheroguide.utils.Constants;
import com.squareup.picasso.Picasso;

import java.util.Locale;


public class CollapsingToolbarActivity extends BaseActivity {
    private CollapsingToolbarLayout collapsingToolbar;
    private ImageView appBarImg;
    private FrameLayout frameImagePost;

    private String title;
    private String urlPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_collapsing_toolbar);
    }

    public void initViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        AssetManager am = getContext().getApplicationContext().getAssets();
        Typeface tf = Typeface.createFromAsset(am,  String.format(Locale.US, Constants.FONT_TITLE));
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setCollapsedTitleTypeface(tf);
        collapsingToolbar.setExpandedTitleTypeface(tf);

        appBarImg = (ImageView) findViewById(R.id.appBarImg);

        frameImagePost = (FrameLayout) findViewById(R.id.frameImagePost);

//        frameImagePost.setOnClickListener(onClickImage());


        //recebe e faz a animação
        ViewCompat.setTransitionName(frameImagePost, Constants.KEY_TRANSITION_DETAILS);
    }

//    private View.OnClickListener onClickImage() {
//        return new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getContext(), ShowImageActivity.class);
//
//                Bundle bundle = new Bundle();
//                bundle.putString(Constants.KEY_URL_PHOTO, urlPhoto);
//                intent.putExtras(bundle);
//
//                ActivityOptionsCompat opts = ActivityOptionsCompat.makeSceneTransitionAnimation(getActivity(), appBarImg, Constants.KEY_TRANSITION_IMAGE);
//                ActivityCompat.startActivity(getActivity(), intent, opts.toBundle());
//            }
//        };
//    }

    public void setAppBarTitle(String title) {
        this.title = title;
        collapsingToolbar.setTitle(this.title);
    }

    public void setAppBarImage(String photo) {
        urlPhoto = photo;
        Picasso.with(this)
                .load(photo)
                .fit()
                .into(appBarImg);
    }

}
