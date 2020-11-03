package com.example.fakeemail;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class EmailAdapter extends ArrayAdapter<String> {
    ArrayList<Email> listEmail;
    Context context;
    public EmailAdapter(@NonNull Context context, ArrayList<Email> listEmail, String[] items) {
        super(context, R.layout.item_list,items);
        this.listEmail=listEmail;
        this.context=context;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=((Activity) context).getLayoutInflater();
        View view=inflater.inflate(R.layout.item_list,null);
        TextView name=(TextView) view.findViewById(R.id.name);
        TextView mess=(TextView) view.findViewById(R.id.mess);
        TextView time=(TextView) view.findViewById(R.id.time);
        TextView CA=(TextView) view.findViewById(R.id.CA);
        CircleImageView avatar=(CircleImageView) view.findViewById(R.id.avatar);

        Email e=listEmail.get(position);

        String t=Integer.toString(e.getH()).concat(":").concat(Integer.toString(e.getM())).concat(" AM");
        time.setText(t);
        name.setText(e.getName());
        mess.setText(e.getMess());
        avatar.setImageResource(e.getIdColor());
        CA.setText(Character.toString(Character.toUpperCase(e.getName().charAt(0))));
        return view;
    }
}