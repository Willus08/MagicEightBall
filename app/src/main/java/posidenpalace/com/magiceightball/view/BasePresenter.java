package posidenpalace.com.magiceightball.view;



public interface BasePresenter<V extends BaseView> {
    void addView(V view);
    void removeView();
}
