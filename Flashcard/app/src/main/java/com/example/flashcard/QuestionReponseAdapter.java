package com.example.flashcard;

import android.content.Context;
import android.hardware.lights.LightState;
import android.media.session.PlaybackState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class QuestionReponseAdapter extends BaseAdapter {

    Context context;
   private  List<QuestionReponse> listquestion;


    public QuestionReponseAdapter(Context ctx , List<QuestionReponse> questionlist){

        this.context =ctx;
        this.listquestion =questionlist;


    }

    @Override
    public int getCount() {
        return listquestion.size();
    }

    @Override
    public Object getItem(int position) {
        return listquestion.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.activity_list_qr, null, false);
        }

        TextView question = view.findViewById(R.id.quetionlist);
        TextView reponse = view.findViewById(R.id.reponse);

        QuestionReponse QR = listquestion.get(position);

        question.setText(QR.Question);
        reponse.setText(String.valueOf(QR.Answer_2));

        return view;


    }
}
