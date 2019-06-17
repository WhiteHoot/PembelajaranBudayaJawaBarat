package com.pbjb.gr.pembelajaranbudayajawabarat;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<MenuList> mList;
    private ArrayList<MenuList> getListMenu() {
        return mList;
    }
    rvAdapter(Context context, ArrayList<MenuList> list){
        mContext = context;
        mList = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.rv_menu_item,parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        MenuList menuList = mList.get(position);

        ImageView img,icn;
        TextView title,dsc;
        Button btn_go;

        img = holder.menu_img;
        icn = holder.menu_icn;

        title = holder.menu_title;
        dsc = holder.menu_dsc;

        btn_go = holder.btnGo;

        img.setImageResource(menuList.getMenu_img());
        icn.setImageResource(menuList.getMenu_icn());

        title.setText(menuList.getMenu_title());
        dsc.setText(menuList.getMenu_dsc());

        btn_go.setTextColor(menuList.getBtn_txt_clr());

        holder.btnGo.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                final Intent intent;
                switch (position){
                    case 0:
                        intent =  new Intent(mContext, slider.class);
                        break;

                    case 1:
                        intent =  new Intent(mContext, starting_quiz.class);
                        break;
                    default:
                        intent =  new Intent(mContext, about_menu.class);
                        break;
                }
                mContext.startActivity(intent);

            }
        }));


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView menu_img, menu_icn;
        TextView menu_title, menu_dsc;
        Button btnGo;

        public ViewHolder(View itemView) {
            super(itemView);
            menu_img = itemView.findViewById(R.id.menu_image);
            menu_icn = itemView.findViewById(R.id.menu_icon);
            menu_title = itemView.findViewById(R.id.menu_title);
            menu_dsc = itemView.findViewById(R.id.menu_desc);
            btnGo = itemView.findViewById(R.id.btn_go);
        }
    }
}

