package tre.oa.best.jeans;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by USER on 28/4/2560.
 */

public class OrderTABLE {
    private MySQLiteOpenHelper objMySQLiteOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqliteDatabase;
    public OrderTABLE(Context context){
        objMySQLiteOpenHelper = new MySQLiteOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteOpenHelper.getReadableDatabase();
        readSqliteDatabase = objMySQLiteOpenHelper.getReadableDatabase();

    } //Construtor
}  //Main Class
