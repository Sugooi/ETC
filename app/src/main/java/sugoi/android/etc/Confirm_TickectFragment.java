package sugoi.android.etc;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Confirm_TickectFragment extends Fragment {


    public Confirm_TickectFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_confirm__tickect, container, false);
        v.setBackgroundColor(Color.WHITE);
        Button pay=(Button)v.findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Its clicked",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getActivity(),TicketActivity.class));
            }
        });

        return v;
    }

}
