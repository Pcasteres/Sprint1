package es.hotmail.pcasteres.sprint1;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;

public class IncrementarScreen {

    public static void configure(IncrementarContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        IncrementarState state = mediator.getIncrementarState();

        IncrementarContract.Router router = new IncrementarRouter(mediator);
        IncrementarContract.Presenter presenter = new IncrementarPresenter(state);
        IncrementarContract.Model model = new IncrementarModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
