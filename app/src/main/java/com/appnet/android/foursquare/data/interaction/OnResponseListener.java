package com.appnet.android.foursquare.data.interaction;

import com.appnet.android.foursquare.data.model.Venue;

import java.util.List;

public interface OnResponseListener {
    void onSuccess(List<Venue> items);

    void onFailure(String error);
}