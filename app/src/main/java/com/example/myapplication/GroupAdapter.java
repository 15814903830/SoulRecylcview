package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context mContext;
    List<String> list;
    public GroupAdapter(Context context,  List<String> list) {
        this.mContext = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.soul_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        ((ViewHolder) viewHolder).btn_soul.setText(list.get(i));
        ((ViewHolder) viewHolder).btn_soul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //按钮的监听器
                Toast.makeText(mContext, list.get(i), Toast.LENGTH_SHORT).show();
                //你可以根据  list.get(i)的文字去区分做对应操作
                if (list.get(i).equals("按钮1")){//equals函数的意思是  当list.get(i)等于双引号里面的值 返回true
                    Toast.makeText(mContext, "按钮8888", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    private class ViewHolder extends RecyclerView.ViewHolder {
        Button btn_soul;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            btn_soul = itemView.findViewById(R.id.btn_soul);
        }
    }

}
