package com.example.eight.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.eight.R;

import java.util.ArrayList;
import java.util.List;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

public class FriendsListenAdapter extends RecyclerView.Adapter<FriendsListenAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView usresCount ;
        ImageView user_image;
        LinearLayout parentLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

//            module_image = itemView.findViewById(R.id.module_image);
//            module_name = itemView.findViewById(R.id.module_name);
//            parent_layout = itemView.findViewById(R.id.parent_layout);
        }
    }

//    public StationsAdapter(List<Modules> modulesList, Context context) {
//        this.modulesList = modulesList;
//        this.context = context;
//    }

    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

//        height = viewGroup.getMeasuredHeight();
//        width = viewGroup.getMeasuredWidth();
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.friends_listen_adapter, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder myViewHolder, int i) {
//        final Modules modules = modulesList.get(i);
        final int position = i;
        /*Glide.with(context)
                .load(modules.getModule_image())
                .placeholder(R.drawable.channels_default_image)
                .transition(withCrossFade())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(myViewHolder.module_image);*/

//        myViewHolder.module_name.setText(modules.getModule_name());
        /*myViewHolder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(context, ModuleDocumentShowcaseActivity.class);
//                intent.putExtra(ResponseParameter.MDOC_MID, modules.getMid());
//                intent.putExtra(ResponseParameter.MDOC_NAME, modules.getModule_name());
//                intent.putExtra(ResponseParameter.MDOC_DESC, modules.getMod_desc());
//                intent.putExtra(ResponseParameter.MDOC_CREATED_ON, modules.getMod_created_on());
//                context.startActivity(intent);
            }
        });*/


    /*myViewHolder.modulePartialView.post(new Runnable() {
      @Override
      public void run() {
        if (height == 0) {
          width = myViewHolder.moduleFullView.getMeasuredWidth();
          height = myViewHolder.moduleFullView.getMeasuredHeight();
        }
        int reqWidth = width * Integer.parseInt(modules.getPercent_completed())/100;

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(reqWidth,height);
        myViewHolder.modulePartialView.setLayoutParams(params);
      }
    });

    if(position == modulesList.size()-1){
      myViewHolder.outlineView.setVisibility(View.GONE);
    }*/


    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

