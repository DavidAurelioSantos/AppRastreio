package digitalhouse.com.projetofragmentestatico;


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
public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2,container,false);

        Button bFrament2 = (Button) view.findViewById(R.id.bFragment2);

        bFrament2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getBaseContext(),"Você esta no Fragmento 2", Toast.LENGTH_SHORT).show();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
