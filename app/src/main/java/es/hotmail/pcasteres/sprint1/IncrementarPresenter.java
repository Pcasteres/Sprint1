package es.hotmail.pcasteres.sprint1;

import android.util.Log;

import java.lang.ref.WeakReference;

public class IncrementarPresenter implements IncrementarContract.Presenter {

    public static String TAG = IncrementarPresenter.class.getSimpleName();

    private WeakReference<IncrementarContract.View> view;
    private IncrementarViewModel viewModel;
    private IncrementarContract.Model model;
    private IncrementarContract.Router router;

    public IncrementarPresenter(IncrementarState state) {
        int numero = 0;
        int acumulador = 0;
        int contador = 0;
        int i = 0;
        for (i=1;i<=10;i++){
            acumulador = acumulador + numero;
            if (numero<0){
                contador = contador + 1;
            }
        viewModel = state;
    }

    @Override
    public void injectView(WeakReference<IncrementarContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(IncrementarContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(IncrementarContract.Router router) {
        this.router = router;
    }

    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // set passed state
        IncrementarState state = router.getDataFromPreviousScreen();
        if (state != null) {
            viewModel.data = state.data;
        }

        if (viewModel.data == null) {
            // call the model
            String data = model.fetchData();

            // set initial state
            viewModel.data = data;
        }

        // update the view
        view.get().displayData(viewModel);

    }


}
