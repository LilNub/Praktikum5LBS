package com.example.praktmod5;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng malang = new LatLng(-7.985518, 112.628018);
        LatLng smp1 = new LatLng(-7.971169, 112.623829);
        mMap.addMarker(new MarkerOptions().position(smp1).title("SMPN 1 Malang"));
        LatLng smp2 = new LatLng(-7.990135, 112.630891);
        mMap.addMarker(new MarkerOptions().position(smp2).title("SMPN 2 Malang"));
        LatLng smp3 = new LatLng(-7.969046, 112.635568);
        mMap.addMarker(new MarkerOptions().position(smp3).title("SMPN 3 Malang"));
        LatLng smp4 = new LatLng(-7.958097, 112.616760);
        mMap.addMarker(new MarkerOptions().position(smp4).title("SMPN 4 Malang"));
        LatLng smp5 = new LatLng(-7.966327, 112.638464);
        mMap.addMarker(new MarkerOptions().position(smp5).title("SMPN 5 Malang"));
        LatLng smp6 = new LatLng(-7.979502, 112.624676);
        mMap.addMarker(new MarkerOptions().position(smp6).title("SMPN 6 Malang"));
        LatLng smp7 = new LatLng(-8.003857, 112.636594);
        mMap.addMarker(new MarkerOptions().position(smp7).title("SMPN 7 Malang"));
        LatLng smp8 = new LatLng(-7.977118, 112.627323);
        mMap.addMarker(new MarkerOptions().position(smp8).title("SMPN 8 Malang"));
        LatLng smp9 = new LatLng(-7.977118, 112.627323);
        mMap.addMarker(new MarkerOptions().position(smp9).title("SMPN 9 Malang"));
        LatLng smp10 = new LatLng(-8.009615, 112.644043);
        mMap.addMarker(new MarkerOptions().position(smp10).title("SMPN 10 Malang"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(malang));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(13));
    }
}
