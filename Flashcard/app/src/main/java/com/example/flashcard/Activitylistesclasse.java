package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.List;

public class Activitylistesclasse extends AppCompatActivity {

    private List<QuestionReponse> listqueetreponse;
     private QuestionReponseAdapter questRepAdapter;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylistesclasse);



        QuestionReponseDatabase dbbase= Room.databaseBuilder(getApplicationContext(),QuestionReponseDatabase.class,"mydatabase").allowMainThreadQueries().build();
        listqueetreponse= dbbase.questionreponseDAO().getAllquetionreponse();

        questRepAdapter = new QuestionReponseAdapter(this,listqueetreponse);
        listView = findViewById(R.id.listvue);
        listView.setAdapter(questRepAdapter);







        ImageView closebnt= findViewById(R.id.closebtn);











        closebnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }





        });
    }
}