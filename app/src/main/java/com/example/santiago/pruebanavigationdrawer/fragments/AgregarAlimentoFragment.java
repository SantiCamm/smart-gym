package com.example.santiago.pruebanavigationdrawer.fragments;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.santiago.pruebanavigationdrawer.R;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AgregarAlimentoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AgregarAlimentoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AgregarAlimentoFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public AgregarAlimentoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AgregarAlimentoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AgregarAlimentoFragment newInstance(String param1, String param2) {
        AgregarAlimentoFragment fragment = new AgregarAlimentoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_agregar_alimento,
                container, false);

        Button buttondesayuno = (Button) view.findViewById(R.id.buttondesayuno);
        Button buttonalmuerzo = (Button) view.findViewById(R.id.buttonalmuerzo);
        Button buttonmerienda = (Button) view.findViewById(R.id.buttonmerienda);
        Button buttoncena = (Button) view.findViewById(R.id.buttoncena);
        Button buttoncolaciones = (Button) view.findViewById(R.id.buttoncolaciones);

        buttondesayuno.setOnClickListener(this);
        buttonalmuerzo.setOnClickListener(this);
        buttonmerienda.setOnClickListener(this);
        buttoncena.setOnClickListener(this);
        buttoncolaciones.setOnClickListener(this);


        ///////////////CONSEJOS DIARIOS
        TextView consejos = (TextView) view.findViewById(R.id.consejos);
        Calendar c = Calendar.getInstance();
        int daymonth = c.get(Calendar.DAY_OF_MONTH);
        String[] array = getResources().getStringArray(R.array.consejos);
        String consejodeldia = array[daymonth];
        consejos.setText(consejodeldia);
        //////////////////////////////////

        final TextView fecha = (TextView) view.findViewById(R.id.fecha);
        fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendario = Calendar.getInstance();
                int yy = calendario.get(Calendar.YEAR);
                int mm = calendario.get(Calendar.MONTH);
                int dd = calendario.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePicker = new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        String fecha2 = String.valueOf(year) +"-"+String.valueOf(monthOfYear)
                                +"-"+String.valueOf(dayOfMonth);
                        fecha.setText(fecha2);

                    }
                }, yy, mm, dd);

                datePicker.show();
            }
        });




        return view;
    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        switch (view.getId()) {
            case R.id.buttonalmuerzo:
                fragment = new NuevoAlimentoFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttondesayuno:
                fragment = new NuevoAlimentoFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttonmerienda:
                fragment = new NuevoAlimentoFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttoncena:
                fragment = new NuevoAlimentoFragment();
                replaceFragment(fragment);
                break;

            case R.id.buttoncolaciones:
                fragment = new NuevoAlimentoFragment();
                replaceFragment(fragment);
                break;
        }

    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.agregarAlimento, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
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
