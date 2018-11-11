package com.example.fat7y.maps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class PlaceCustomAdapter implements GoogleMap.InfoWindowAdapter {

    private Context mContext;
    private final View mwindow;

    PlaceCustomAdapter(Context mContext) {

        this.mContext = mContext;
        mwindow = LayoutInflater.from(mContext).inflate(R.layout.custon_window, null);
    }

    private void rendowWindowText(Marker marker, View view){

        String title = marker.getTitle();
        TextView tvTitle = (TextView) view.findViewById(R.id.title);

        if(!title.equals("")){
            tvTitle.setText(title);
        }

        String snippet = marker.getSnippet();
        TextView tvSnippet = (TextView) view.findViewById(R.id.snippet);

        if(!snippet.equals("")){
            tvSnippet.setText(snippet);
        }
    }
    @Override
    public View getInfoWindow(Marker marker) {
        rendowWindowText(marker,mwindow);
        return mwindow;
    }

    @Override
    public View getInfoContents(Marker marker) {

        rendowWindowText(marker,mwindow);
        return mwindow;
    }
}
