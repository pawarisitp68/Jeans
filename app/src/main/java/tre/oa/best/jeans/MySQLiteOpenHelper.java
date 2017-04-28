package tre.oa.best.jeans;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by USER on 28/4/2560.
 */

public class MySQLiteOpenHelper extends SQLiteOpenHelper{
    //Explicit
    private static final String DATABASE_NAME = "Jeans.db";
    private static final int DATABASE_VARSION = 1;
    private static final String CREATE_USER_TABLE = "create table userTABLE" +
            "(_id integer primary key, Address text,Email text, Tell text, Name text);";
    private static final String CREATE_JEANS_TABLE = "create table jeansTABLE"+
            "(_id integer primary key, Namejeans text,size taxt,Price text);";
    private static final String CREATE_ORDER_TABLE = "cteate table orderTABLE"+
            "(_id integer primary key, Namejeans text, Size text, Oz text, Price text, Item text);"; // namejeans,ขนาด,เนื้อผ้า,ราคา จำนวนชิ้น

    public MySQLiteOpenHelper(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VARSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_JEANS_TABLE);
        sqLiteDatabase.execSQL(CREATE_ORDER_TABLE);
        sqLiteDatabase.execSQL(CREATE_USER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public
} //Main Class
