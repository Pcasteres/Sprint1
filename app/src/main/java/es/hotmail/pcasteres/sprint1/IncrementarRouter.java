package es.hotmail.pcasteres.sprint1;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

public class IncrementarRouter implements IncrementarContract.Router {

    public static String TAG = IncrementarRouter.class.getSimpleName();

    private AppMediator mediator;

    public IncrementarRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, IncrementarActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(IncrementarState state) {
        mediator.setIncrementarState(state);
    }

    @Override
    public IncrementarState getDataFromPreviousScreen() {
        IncrementarState state = mediator.getIncrementarState();
        return state;
    }
}
