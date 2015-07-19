package Fragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lixudong.utils.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DesFragment extends BackHandledFragment {


    public DesFragment() {
        // Required empty public constructor
    }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            TextView textView = new TextView(getActivity());
            textView.setText(R.string.DES);
            return textView;
    }

    @Override
    public boolean onBackPressed() {
        return false;
    }
}
