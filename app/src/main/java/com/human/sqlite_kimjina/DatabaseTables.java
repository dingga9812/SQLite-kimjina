package com.human.sqlite_kimjina;

import android.provider.BaseColumns;

/**
 * 물리테이블과 DAO클래스와 데이터 연동시 필요,
 * 알려진 용어Contract(계약서)
 */
public class DatabaseTables {
    //학생테이블용 필드값 클래스지정(아래)
    public static class StudentTable implements BaseColumns {
        public static final String TABLE_NAME = "student";
        public  static final String GRADE = "grade";
        public  static final String NUMBER = "mumber";
        public  static final String NAME = "name";
    }

}
