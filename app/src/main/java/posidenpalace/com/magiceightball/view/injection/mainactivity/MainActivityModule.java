package posidenpalace.com.magiceightball.view.injection.mainactivity;


import dagger.Module;
import dagger.Provides;
import posidenpalace.com.magiceightball.view.mainactivity.MainActivityPresenter;

@Module
public class MainActivityModule {
    @Provides
    public MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
