package posidenpalace.com.magiceightball.view.injection.mainactivity;

import dagger.Component;
import posidenpalace.com.magiceightball.view.mainactivity.MainActivity;

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
