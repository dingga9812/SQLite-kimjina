package com.human.sqlite_kimjina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.human.sqlite_kimjina.DatabaseTables.StudentTable;

public class MainActivity extends AppCompatActivity {
    //현재클래스에서 사용할 멤버변수 생성(아래)
    private DatabaseHelper mDatabaseHelper;
    private SQLiteDatabase mSqLiteDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //신규 데이터베이스 객체 생성=메모리에 올리기=실행가능하게 만들기(아래)
        //=데이터베이스헬퍼클래스의 생성자 매서드 실행
        mDatabaseHelper = new DatabaseHelper(this,"school.db",null,1);
        //데이터베이스 파일 만들기(아래)
        mSqLiteDatabase = mDatabaseHelper.getWritableDatabase();
        //인설트 테스트 SqlBateabse
        ContentValues contentValues = new ContentValues();
        contentValues.put(StudentTable.GRADE,2);
        contentValues.put(StudentTable.NUMBER,20210002);
        contentValues.put(StudentTable.NAME,"홍길동");
        mSqLiteDatabase.insert(StudentTable.TABLE_NAME,null,contentValues);

    }
}