package com.application.restaurantreservation.presenter;

import java.util.List;

public interface BaseView {
    void onFailure(String message);
    void onDataRetrieved(List<?> items);
}
