package com.example.flashcard;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QuestionReponseDAO {
    @Insert
    void InsertAll(QuestionReponse ... questionreponse);

    @Query("SELECT * FROM questionreponse")
    List< QuestionReponse > getAllquetionreponse();

    @Query("SELECT * FROM questionreponse LIMIT :limit OFFSET :offsett")
    QuestionReponse getquestionreponsparnext( int limit , int offsett);




    @Query("DELETE FROM  questionreponse WHERE Quetion = :questiondiplay")
    void deletequestionReponse(String questiondiplay);

}
