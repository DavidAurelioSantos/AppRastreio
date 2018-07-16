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
public class Fragment1 extends Fragment {
    private Button bFragment;

    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1,container,false);

        bFragment = (Button) view.findViewById(R.id.bFragment);

        bFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getBaseContext(), "Você esta no Framento 1", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
