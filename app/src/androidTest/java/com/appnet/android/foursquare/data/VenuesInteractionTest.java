package com.appnet.android.foursquare.data;

import android.support.test.runner.AndroidJUnit4;
import android.text.TextUtils;

import com.appnet.android.foursquare.data.interaction.OnResponseListener;
import com.appnet.android.foursquare.data.interaction.VenuesInteraction;
import com.appnet.android.foursquare.data.interaction.VenuesInteractionImpl;
import com.appnet.android.foursquare.data.model.Venue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class VenuesInteractionTest {
    VenuesInteraction mInteraction;

    @Before
    public void setUp() throws Exception {
        mInteraction = new VenuesInteractionImpl();
    }

    @Test
    public void testSearchVenues() throws Exception {
        mInteraction.searchVenues(21.0228161, 105.801944, "Ha Noi", new OnResponseListener() {
            @Override
            public void onSuccess(List<Venue> items) {
                assertFalse("Search success", items.isEmpty());
            }

            @Override
            public void onFailure(String error) {
                assertFalse("Search failure", TextUtils.isEmpty(error));
            }
        });
    }
}
