package com.cosco.lin.linechartactivity;

/**
 * Created by Administrator on 2015/9/17.
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPreferencesUtil {
    private String TAG= "BdiK_V";
    private SharedPreferences sharedPreferences;
    private Editor editor;

    public SharedPreferencesUtil(Context context) {
        sharedPreferences = context.getSharedPreferences(TAG, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }


    public boolean putBDI(String key,String value){
        editor.putString(key, value);
        return editor.commit();
    }

    public String getBDI(String key){
        return sharedPreferences.getString(key, "false");
    }

}
