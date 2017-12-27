package com.appnet.android.foursquare.helper;


import android.content.res.Resources;

import com.appnet.android.foursquare.R;

public final class ViewHelper {
    public static String formatDistance(Resources res, int distance) {
        if (distance < 1000) {
            return res.getString(R.string.distance_pd_m, distance);
        } else {
            float value = distance / 1000f;
            return res.getString(R.string.distance_pf_km, value);
        }
    }
}
