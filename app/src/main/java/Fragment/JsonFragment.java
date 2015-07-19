package Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.nfc.Tag;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lixudong.utils.R;

import java.lang.annotation.Target;

/**
 * A simple {@link Fragment} subclass.
 */
public class JsonFragment extends BackHandledFragment {

    public JsonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setText(R.string.JSON);

        return textView;
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
