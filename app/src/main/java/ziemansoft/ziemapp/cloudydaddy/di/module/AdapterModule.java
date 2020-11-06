package ziemansoft.ziemapp.cloudydaddy.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ziemansoft.ziemapp.cloudydaddy.adapters.CitiesAdapter;

@Module
public class AdapterModule {

    public AdapterModule() {
    }

    @Provides
    @Singleton
    CitiesAdapter adapter() {
       return new CitiesAdapter();
    }

}
