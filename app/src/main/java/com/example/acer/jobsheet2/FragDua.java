package com.example.acer.jobsheet2;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragDua extends Fragment {

    private Button buttonSatu;

    public FragDua() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_frag_dua, container, false);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonSatu = (Button) view.findViewById(R.id.btFrag2);

        setHasOptionsMenu(true);
        //agar button back work
        return view;

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        buttonSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragTiga fragmentKetiga = new FragTiga();
                //buat object fragmentkedua

                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_content, fragmentKetiga)
                        //mengganti fragment
                        .addToBackStack(null)
                        //menyimpan fragment
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        //transisi fragment
                        .commit();
                //mengeksekusi fragment transaction
            }
        });
    }

    @Override
    //membuat button back
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);



    }
}
