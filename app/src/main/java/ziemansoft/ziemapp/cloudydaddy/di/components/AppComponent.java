package ziemansoft.ziemapp.cloudydaddy.di.components;

import javax.inject.Singleton;

import dagger.Component;
import ziemansoft.ziemapp.cloudydaddy.MainActivity;
import ziemansoft.ziemapp.cloudydaddy.di.module.AdapterModule;
import ziemansoft.ziemapp.cloudydaddy.di.module.ContextModule;

@Component(modules = {ContextModule.class, AdapterModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
