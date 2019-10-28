package com.example.arcgissample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

public class MainActivity extends AppCompatActivity {
    private Button btnMap;
    private Button btnMarker;
    private RelativeLayout rlMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMap = findViewById(R.id.btnMap);
        btnMarker = findViewById(R.id.btnMarker);
        rlMain = findViewById(R.id.rlMain);

        btnMap.setOnClickListener(v -> {
            MapViewFragment mapViewFragment = new MapViewFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.rlMain, mapViewFragment).commit();
        });
    }
}
