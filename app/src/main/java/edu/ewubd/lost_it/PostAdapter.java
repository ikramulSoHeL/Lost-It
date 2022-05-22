package edu.ewubd.lost_it;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;


import com.squareup.picasso.Picasso;

import java.util.List;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ImageViewHolder> {
    private Context p_context;
    private List<PostClass> post_Class;

    public PostAdapter(Context p1_context, List<PostClass> postClass1) {
        p_context = p1_context;
        post_Class = postClass1;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(p_context).inflate(R.layout.layout_post_row, parent, false);
        return new ImageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {

        PostClass current_post = post_Class.get(position);
        holder.tv_post_date.setText("posted on "+current_post.getPost_date());
        Picasso.with(p_context)
                .load(current_post.getPost_imageUrl())
                .fit()
                .centerCrop()
                .into(holder.Imv_post_image_holder);
        holder.tv_post_details.setText(current_post.getPost_details());
    }

    @Override
    public int getItemCount() {
        return post_Class.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_post_date;
        public TextView tv_post_details;
        public ImageView Imv_post_image_holder;

        public ImageViewHolder(View itemView) {
            super(itemView);
            tv_post_date = itemView.findViewById(R.id.post_date);
            tv_post_details = itemView.findViewById(R.id.post_details1);
            Imv_post_image_holder = itemView.findViewById(R.id.imv_post_image_holder);
        }
    }
}
