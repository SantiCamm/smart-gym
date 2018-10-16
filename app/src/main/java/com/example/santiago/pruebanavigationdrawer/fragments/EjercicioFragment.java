package com.example.santiago.pruebanavigationdrawer.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.santiago.pruebanavigationdrawer.MainActivity;
import com.example.santiago.pruebanavigationdrawer.R;
import com.example.santiago.pruebanavigationdrawer.models.EjercicioContent;
import com.example.santiago.pruebanavigationdrawer.utils.ResourceUtils;

public class EjercicioFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "id";

    // TODO: Rename and change types of parameters
    private String id;

    private OnFragmentInteractionListener mListener;

    public EjercicioFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @return A new instance of fragment EjercicioFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EjercicioFragment newInstance(String param1) {
        EjercicioFragment fragment = new EjercicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*getActivity().getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);*/
        if (getArguments() != null) {
            id = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_ejercicio, container, false);

        EjercicioContent ejercicioContent = ResourceUtils.getEjercicio(id, this.getContext());

        TextView title = v.findViewById(R.id.ejerciciotitle);
        title.setText(ejercicioContent.getTitle());

        ImageView imageView = (ImageView) v.findViewById(R.id.ejerciciopicture);
        imageView.setImageBitmap(ejercicioContent.getImagen());

        TextView descripcion = v.findViewById(R.id.ejerciciodescripcion);
        descripcion.setText(ejercicioContent.getDescripcion());

        TextView ejecucion = v.findViewById(R.id.ejercicioejecucion);
        ejecucion.setText(ejercicioContent.getEjecucion());

        hideSoftKeyboard();

        return v;
    }


    public void hideSoftKeyboard(){
        InputMethodManager inputManager = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        menu.clear();
        super.onCreateOptionsMenu(menu, inflater);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
