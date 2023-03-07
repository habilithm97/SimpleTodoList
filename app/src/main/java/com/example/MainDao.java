package com.example;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.simpletodolist.MainModel;

import java.util.List;

@Dao
public interface MainDao {

    @Insert
    public void insert(MainModel mainModel);

    @Update
    public void update(MainModel mainModel);

    @Delete
    public void delete(MainModel mainModel);

    @Query("SELECT * FROM my_tb")
    public LiveData<List<MainModel>> getAllData();
}
