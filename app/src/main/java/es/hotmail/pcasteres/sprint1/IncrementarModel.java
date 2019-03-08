package es.hotmail.pcasteres.sprint1;

import android.util.Log;

import java.lang.ref.WeakReference;

import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentActivity;


public class IncrementarModel implements IncrementarContract.Model {

    public static String TAG = IncrementarModel.class.getSimpleName();

    public IncrementarModel() {
        int numero;


        }





    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
