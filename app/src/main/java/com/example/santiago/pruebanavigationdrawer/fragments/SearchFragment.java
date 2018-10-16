package com.example.santiago.pruebanavigationdrawer.fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import 	android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.santiago.pruebanavigationdrawer.MainActivity;
import com.example.santiago.pruebanavigationdrawer.R;
import com.example.santiago.pruebanavigationdrawer.utils.ResourceUtils;

import net.yslibrary.android.keyboardvisibilityevent.util.UIUtil;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends ListFragment implements SearchView.OnQueryTextListener, MenuItem.OnActionExpandListener {

    List<String> mAllValues;
    private ArrayAdapter<String> mAdapter;
    private Context mContext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
        setHasOptionsMenu(true);
        populateList();

    }

    @Override
    public void onListItemClick(ListView listView, View v, int position, long id) {
        /*String item = (String) listView.getAdapter().getItem(position);
        if (getActivity() instanceof OnItem1SelectedListener) {
            ((OnItem1SelectedListener) getActivity()).OnItem1SelectedListener(item);
        }
        getFragmentManager().popBackStack();*/
        String s = this.getListAdapter().getItem(position).toString();
        FragmentManager manager = getFragmentManager();
        Fragment mifragment = EjercicioFragment.newInstance(s);
        manager.beginTransaction().replace(R.id.content_main,mifragment).addToBackStack(null).commit();



    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_search, container, false);
        ListView listView = (ListView) layout.findViewById(android.R.id.list);
        TextView emptyTextView = (TextView) layout.findViewById(android.R.id.empty);
        listView.setEmptyView(emptyTextView);
        return layout;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(this);
        searchView.setQueryHint("Busca un ejercicio");

        super.onCreateOptionsMenu(menu, inflater);

        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onDestroyView() { super.onDestroyView(); }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return true;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        if (newText == null || newText.trim().isEmpty()) {
            resetSearch();
            return false;
        }

        List<String> filteredValues = new ArrayList<String>(mAllValues);
        for (String value : mAllValues) {
            if (!value.toLowerCase().contains(newText.toLowerCase())) {
                filteredValues.remove(value);
            }
        }

        mAdapter = new ArrayAdapter<>(mContext, android.R.layout.simple_list_item_1, filteredValues);
        setListAdapter(mAdapter);

        return false;
    }

    public void resetSearch() {
        mAdapter = new ArrayAdapter<>(mContext, android.R.layout.simple_list_item_1, mAllValues);
        setListAdapter(mAdapter);
    }

    @Override
    public boolean onMenuItemActionExpand(MenuItem item) {
        return true;
    }

    @Override
    public boolean onMenuItemActionCollapse(MenuItem item) {
        return true;
    }

    public interface OnItem1SelectedListener {
        void OnItem1SelectedListener(String item);
    }

    private void populateList(){
        mAllValues = ResourceUtils.getListaEjercicios();
        mAdapter = new ArrayAdapter<>(mContext, android.R.layout.simple_list_item_1, mAllValues);
        setListAdapter(mAdapter);
    }

    @Override
    public void onResume() {
        populateList();
        super.onResume();
    }
}
