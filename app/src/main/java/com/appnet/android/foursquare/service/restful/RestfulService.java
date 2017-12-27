package com.appnet.android.foursquare.service.restful;

import com.appnet.android.foursquare.service.restful.model.SearchVenuesResponse;

import retrofit2.Call;

public class RestfulService {
    private final String CLIENT_ID = "XDSX5I54IXMVXYOVG24XD1TEULW2WGKDBJGSI24QP4VOSTOQ";
    private final String CLIENT_SECRET = "NPUJLWPCRBPNBYIUY0LH0EHNRS0DXRIYXV1SFN5DCUNGARGQ";
    private final String API_VERSION = "20171226";

    private static RestfulService sInstance;
    private FoursquareRestfulApi mFoursquareRestfulApi;

    private RestfulService() {
        mFoursquareRestfulApi = FoursquareRestfulApi.Factory.create();
    }

    public static RestfulService getInstance() {
        if(sInstance == null) {
            sInstance = new RestfulService();
        }
        return sInstance;
    }

    public Call<SearchVenuesResponse> searchVenues(String intent, String keyword) {
        return mFoursquareRestfulApi.searchVenues(CLIENT_ID, CLIENT_SECRET, intent, keyword, API_VERSION);
    }
}
