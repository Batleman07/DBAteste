package com.example.cadastrodata;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLiteDAO extends SQLiteOpenHelper {
    public static final String bancoTeste="My_db";
    public static final String tabEmpregado = "empregado";

    public static final int version = 1;

    public SQLiteDAO(@Nullable Context context) {
        super(context, bancoTeste, null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String empregadoCriarTabela = "CREATE TABLE   " + tabEmpregado + "('empNo' TEXT PRIMARY KEY, 'empName' TEXT);";

        sqLiteDatabase.execSQL(empregadoCriarTabela);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS "+tabEmpregado);
        onCreate(sqLiteDatabase);
    }
    public void insert(String empNo, String empName){
        try{
            SQLiteDatabase db= getWritableDatabase();
            ContentValues contentValues= new ContentValues();
            contentValues.put("empNo",empNo);
            contentValues.put("empName",empName);

            db.insert(tabEmpregado,null,contentValues);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void delete(String empNo){

    }
    public void update(String empNo, String empName){

    }
    public void search(String empNo){

    }
}
