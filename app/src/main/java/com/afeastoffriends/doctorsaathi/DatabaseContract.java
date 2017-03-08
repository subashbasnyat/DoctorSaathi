package com.afeastoffriends.doctorsaathi;

import android.provider.BaseColumns;

/**
 * Created by rajandai on 9/17/16.
 */
public class DatabaseContract implements BaseColumns {
    public DatabaseContract() {
    }

    public static abstract class Disease implements BaseColumns {
        public static final String TABLE_NAME = "disease";
        public static final String DISEASE_CODE = "disease_code";
        public static final String DISEASE_NAME = "disease_name";
        public static final String SYMPTOMS = "symptoms";
        public static final String CURE = "cure";

    }


}
