package ziemansoft.ziemapp.cloudydaddy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import ziemansoft.ziemapp.cloudydaddy.adapters.CitiesAdapter;
import ziemansoft.ziemapp.cloudydaddy.pojo.Condition;
import ziemansoft.ziemapp.cloudydaddy.pojo.Current;
import ziemansoft.ziemapp.cloudydaddy.pojo.Location;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Inject
    private CitiesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App)getApplication()).getComponent().inject(this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Current> currents = new ArrayList<>();
        List<Location> locations = new ArrayList<>();
        List<Condition> conditions = new ArrayList<>();
        Location location = new Location();
        Current current = new Current();
        Condition condition = new Condition();
        location.setName("London");
        location.setCountry("Great Britain");
        location.setLocaltime("17 September");
        current.setTempC(33.3);
        condition.setText("Cloudly");
        currents.add(current);
        locations.add(location);
        conditions.add(condition);
        Location locationd = new Location();
        Current currentd = new Current();
        Condition conditiond = new Condition();
        locationd.setName("London");
        locationd.setCountry("Great Britain");
        locationd.setLocaltime("17 September");
        currentd.setTempC(33.3);
        conditiond.setText("Cloudly");
        currents.add(currentd);
        locations.add(locationd);
        conditions.add(conditiond);
        adapter.setConditions(conditions);
        adapter.setCurrents(currents);
        adapter.setLocations(locations);
        recyclerView.setAdapter(adapter);
    }
}