package com.afeastoffriends.doctorsaathi;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by Mr Mojo Risin on 3/5/2017.
 */

public class FADatabaseOpenHelper extends SQLiteAssetHelper{
    private static final String DATABASE_NAME = "DISPLAY.db";
    private static final int DATABASE_VERSION = 1;

    public FADatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
