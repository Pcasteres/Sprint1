package es.hotmail.pcasteres.sprint1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class IncrementarActivity
        extends AppCompatActivity implements IncrementarContract.View {

    public static String TAG = IncrementarActivity.class.getSimpleName();

    private IncrementarContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incrementar);

        // do the setup
        IncrementarScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // do some work
        presenter.fetchData();
    }
    public void onClicked(){

    }

    @Override
    public void injectPresenter(IncrementarContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void displayData(IncrementarViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.data)).setText(viewModel.data);
    }

    public void Incrementar(View view) {
    }
}
