package com.example.flashcard;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class QuestionReponse {
    @PrimaryKey(autoGenerate = true)
    public int ID;

    @ColumnInfo(name = "Quetion")
    public String Question;

    @ColumnInfo(name = "Answer_1")
    public String Answer_1;


    @ColumnInfo(name = "Answer_2")
    public String Answer_2;


    @ColumnInfo(name = "Answer_3")
    public String Answer_3;


public QuestionReponse(){

}

     public QuestionReponse(int id, String question, String rep1, String rep2 , String rep3){
         this.ID= id;
         this.Question =question;
         this.Answer_1=rep1;
         this.Answer_2=rep2;
         this.Answer_3=rep3;
     }


    public QuestionReponse(String question, String rep1, String rep2 , String rep3){
        this.Question =question;
        this.Answer_1=rep1;
        this.Answer_2=rep2;
        this.Answer_3=rep3;
    }


}
