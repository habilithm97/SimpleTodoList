package com.example.simpletodolist;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "my_tb") // DB 내의 테이블(클래스의 변수가 컬럼), DB에 저장할 데이터 형식
public class MainModel {
    private String title;
    private String content;

    @PrimaryKey(autoGenerate = true) // 데이터가 생성될 때마다 자동으로 고유 id 값이 1씩 증가
    private int id;

    public MainModel(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
