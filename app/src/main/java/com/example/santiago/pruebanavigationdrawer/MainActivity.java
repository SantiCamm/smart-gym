package com.example.santiago.pruebanavigationdrawer;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.example.santiago.pruebanavigationdrawer.fragments.ActualRutinaFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.AgregarAlimentoFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.ArmarRutinaFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.CategoriasEjercicioFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.NuevoAlimentoFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.RutinasFragment;
import com.example.santiago.pruebanavigationdrawer.utils.Utilidades;
import com.example.santiago.pruebanavigationdrawer.fragments.ContenedorFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.EjercicioFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.GreenFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.HomeFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.RedFragment;
import com.example.santiago.pruebanavigationdrawer.fragments.SearchFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, NuevoAlimentoFragment.OnFragmentInteractionListener, AgregarAlimentoFragment.OnFragmentInteractionListener, RutinasFragment.OnFragmentInteractionListener, ArmarRutinaFragment.OnFragmentInteractionListener, ActualRutinaFragment.OnFragmentInteractionListener, CategoriasEjercicioFragment.OnFragmentInteractionListener, EjercicioFragment.OnFragmentInteractionListener, SearchFragment.OnItem1SelectedListener, HomeFragment.OnFragmentInteractionListener, RedFragment.OnFragmentInteractionListener, GreenFragment.OnFragmentInteractionListener, ContenedorFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        if (Utilidades.validaPantalla){
            Fragment fragment = new HomeFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main, fragment).commit();
            Utilidades.validaPantalla=false;
        }

        Fragment fragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.content_main, fragment).commit();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /*if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }*/

    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        super.onPostResume();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setActionBarTitle("Smart Gym");
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment miFragment = null;
        boolean fragmentSeleccionado=false;

        if (id == R.id.nav_home) {
            miFragment= new HomeFragment();
            fragmentSeleccionado=true;
        } else if (id == R.id.nav_ejercicios) {
            miFragment= new SearchFragment();
            fragmentSeleccionado=true;
        } else if (id == R.id.nav_rutinas) {
            miFragment= new ContenedorFragment();
            fragmentSeleccionado=true;
        } else if (id == R.id.nav_alimentacion) {
            miFragment= new AgregarAlimentoFragment();
            fragmentSeleccionado=true;
        }

     if (fragmentSeleccionado){
            getSupportFragmentManager().beginTransaction().replace(R.id.content_main, miFragment).addToBackStack(null).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void OnItem1SelectedListener(String item) {

    }
}
