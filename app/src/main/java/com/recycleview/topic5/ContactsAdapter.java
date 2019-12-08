package com.recycleview.topic5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder>{

    Context context;
    List<Contacts> contactsList;

    public ContactsAdapter(Context context, List<Contacts> contactsList) {
        this.context = context;
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contacts,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contacts contacts = contactsList.get(position);
        holder.imgProfile.setImageResource(contacts.getImageId());
        holder.tvName.setText(contacts.getName());
        holder.tvPhone.setText(contacts.getPhoneNo());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        ImageView imgProfile;
        TextView tvName, tvPhone;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }
    }
}
