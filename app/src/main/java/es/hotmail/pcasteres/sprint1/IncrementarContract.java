package es.hotmail.pcasteres.sprint1;

import java.lang.ref.WeakReference;

interface IncrementarContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void displayData(IncrementarViewModel viewModel);
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void injectRouter(Router router);

        void fetchData();
    }

    interface Model {
        String fetchData();
    }

    interface Router {
        void navigateToNextScreen();

        void passDataToNextScreen(IncrementarState state);

        IncrementarState getDataFromPreviousScreen();
    }
}
