package com.human.sqlite_kimjina;
/*
SyudentVO클래스는 xml 과 db, 메인액티비티java, 데이터 GET/SET하기위해서
 */
public class StudentVO {
    //VO클래스 멤버변수(클래스 전역변수)
    //Cursor id(레코드-한줄아이디)
    private int mId;
    //학년
    private int mGrade;
    //학번
    private int mNumber;
    //이름
    private String mName;

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
