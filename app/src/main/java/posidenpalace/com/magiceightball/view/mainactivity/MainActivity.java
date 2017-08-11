package posidenpalace.com.magiceightball.view.mainactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import posidenpalace.com.magiceightball.R;
import posidenpalace.com.magiceightball.view.injection.mainactivity.DaggerMainActivityComponent;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{
    @Inject MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDagger();
        presenter.addView(this);
    }

    void setupDagger(){
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(Error error) {

    }
}
