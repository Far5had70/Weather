/*
 * Copyright 2017, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ir.far5had.weather.ui.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import ir.far5had.weather.AppController;
import ir.far5had.weather.R;
import ir.far5had.weather.databinding.ForecastItemBinding;
import ir.far5had.weather.model.Forecast;
import ir.far5had.weather.util.DateUtils;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ViewHolder> {

    List<? extends Forecast.ForecastBean.ForecastdayBean> list;

    @Nullable
    private final ForecastClickCallback clickCallback;

    public ForecastAdapter(@Nullable ForecastClickCallback clickCallback) {
        this.clickCallback = clickCallback;
        setHasStableIds(true);
    }

    public void setForecastList(final List<? extends Forecast.ForecastBean.ForecastdayBean> forecastList) {
        if (list == null) {
            list = forecastList;
            notifyItemRangeInserted(0, forecastList.size());
        } else {
            DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return list.size();
                }

                @Override
                public int getNewListSize() {
                    return forecastList.size();
                }

                @Override
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    return list.get(oldItemPosition).getDay().getAvgtemp_c() == forecastList.get(newItemPosition).getDay().getAvgtemp_c();
                }

                @Override
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    Forecast.ForecastBean.ForecastdayBean newModel = forecastList.get(newItemPosition);
                    Forecast.ForecastBean.ForecastdayBean oldModel = list.get(oldItemPosition);
                    return newModel.getDay().getAvgtemp_c() == oldModel.getDay().getAvgtemp_c();
                }
            });
            list = forecastList;
            result.dispatchUpdatesTo(this);
        }
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ForecastItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.forecast_item, parent, false);
        binding.setCallback(clickCallback);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Forecast.ForecastBean.ForecastdayBean model = list.get(position);
        holder.binding.setForecast(model);
        holder.binding.executePendingBindings();
        Glide.with(AppController.getInstance())
                .load(list.get(position).getDay().getCondition().getIcon())
                .into(holder.binding.imageView);
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    @Override
    public long getItemId(int position) {
        return list.get(position).getDate_epoch();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        final ForecastItemBinding binding;

        public ViewHolder(ForecastItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
