package ziemansoft.ziemapp.cloudydaddy.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ziemansoft.ziemapp.cloudydaddy.R;
import ziemansoft.ziemapp.cloudydaddy.pojo.Condition;
import ziemansoft.ziemapp.cloudydaddy.pojo.Current;
import ziemansoft.ziemapp.cloudydaddy.pojo.Location;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.itemViewHolder> {

    private List<Location> locations;
    private List<Current> currents;
    private List<Condition> conditions;

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public void setCurrents(List<Current> currents) {
        this.currents = currents;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mini_cards_item, parent, false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        Location location = locations.get(position);
        Current current = currents.get(position);
        Condition condition = conditions.get(position);
        holder.cityName.setText(location.getName());
        holder.countryName.setText(location.getCountry());
        holder.degree.setText(String.format("%s°", current.getTempC()));
        holder.text.setText(condition.getText());
        holder.localTime.setText(location.getLocaltime());
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    class itemViewHolder extends RecyclerView.ViewHolder {
        private TextView cityName, countryName, degree, text, localTime;

        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            cityName = itemView.findViewById(R.id.cityName);
            countryName = itemView.findViewById(R.id.countryName);
            degree = itemView.findViewById(R.id.degree);
            text = itemView.findViewById(R.id.textDetail);
            localTime = itemView.findViewById(R.id.localTime);
        }
    }
}
