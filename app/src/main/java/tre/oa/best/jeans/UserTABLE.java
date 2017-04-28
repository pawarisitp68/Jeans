package tre.oa.best.jeans;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by USER on 28/4/2560.
 */

public class UserTABLE{

    public UserTABLE()
    //Explicit
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDataBase,readSqLiteDatabase;
    public  UserTABLE(Context context){
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDataBase = objMySQLiteOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
    }
} //Constructor
