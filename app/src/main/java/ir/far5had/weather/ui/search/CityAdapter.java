package ir.far5had.weather.ui.search;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ir.far5had.weather.R;
import ir.far5had.weather.databinding.CityItemBinding;
import ir.far5had.weather.model.City;

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder> {

    List<? extends City> list;

    @Nullable
    private final CityClickCallback clickCallback;

    public CityAdapter(@Nullable CityClickCallback clickCallback) {
        this.clickCallback = clickCallback;
        setHasStableIds(true);
    }

    public void setCityList(final List<? extends City> searches) {
        if (list == null) {
            list = searches;
            notifyItemRangeInserted(0, searches.size());
        } else {
            DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return list.size();
                }

                @Override
                public int getNewListSize() {
                    return searches.size();
                }

                @Override
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    return list.get(oldItemPosition).getId() == searches.get(newItemPosition).getId();
                }

                @Override
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    City newModel = searches.get(newItemPosition);
                    City oldModel = list.get(oldItemPosition);
                    return newModel.getId() == oldModel.getId();
                }
            });
            list = searches;
            result.dispatchUpdatesTo(this);
        }
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CityItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.city_item, parent, false);
        binding.setCallback(clickCallback);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        City model = list.get(position);
        holder.binding.setCity(model);
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public long getItemId(int position) {
        return list.get(position).getId();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        final CityItemBinding binding;

        public ViewHolder(CityItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
