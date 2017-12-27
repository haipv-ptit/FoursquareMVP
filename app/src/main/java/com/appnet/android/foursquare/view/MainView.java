package com.appnet.android.foursquare.view;

import com.appnet.android.foursquare.data.model.Venue;

import java.util.List;

public interface MainView {
    void showData(List<Venue> data);
    void showMessage(String message);
}
