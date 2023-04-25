package com.example.flashcard;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = QuestionReponse.class ,version = 1)
public abstract class QuestionReponseDatabase extends RoomDatabase {

    public abstract QuestionReponseDAO questionreponseDAO();



}
