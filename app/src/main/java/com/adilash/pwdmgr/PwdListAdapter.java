package com.adilash.pwdmgr;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Intent;
import android.content.Context;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PwdListAdapter extends RecyclerView.Adapter<PwdListAdapter.ListItemHolder> {
    private List<Password> mPasswordList;
    private Context context;

    public PwdListAdapter(Context context, List<Password> passwordList) {
        mPasswordList = passwordList;
        context = context;
    }

    @NonNull
    @Override
    public PwdListAdapter.ListItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pwd_item, parent, false);

        return new ListItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull PwdListAdapter.ListItemHolder holder, int position) {
        
        String linkItem = mPasswordList.get(holder.getAdapterPosition()).getmLink();
        String userItem = mPasswordList.get(holder.getAdapterPosition()).getmUsername();
        String passItem = mPasswordList.get(holder.getAdapterPosition()).getmPassword();

        holder.mLink.setText(linkItem);
        holder.mUsername.setText(userItem);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(mPwdListActivity,
//                mPasswordList.get(holder.getAdapterPosition()).getmPassword(),
//                Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(view.getContext(), PasswordActivity.class);
                intent.putExtra("linkItem", linkItem);
                intent.putExtra("userItem", userItem);
                intent.putExtra("passItem", passItem);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mPasswordList.size();
    }

    public class ListItemHolder extends RecyclerView.ViewHolder {
        
        TextView mLink;
        TextView mUsername;

        public ListItemHolder(View view){
            super(view);
            mLink = view.findViewById(R.id.tv_link_item);
            mUsername = view.findViewById(R.id.tv_username_item);
        }

    }
}
