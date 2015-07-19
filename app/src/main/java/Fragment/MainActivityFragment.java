package Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.lixudong.utils.R;


    /**
     * A placeholder fragment containing a simple view.
     */
    public class MainActivityFragment extends BackHandledFragment implements View.OnClickListener{

        private View view;
        public JsonFragment jsonFragment;
        public XmlFragment xmlFragment;
        public DesFragment desFragment;
        public DialogFragment dialogFragment;
        public ServiceFragment serviceFragment;
        public TextViewFragment textViewFragment;
        public ToastFragment toastFragment;
        public CallBackFragment callBackFragment;
        public ButtonFragment buttonFragment;
        public HandleFragment handleFragment;
        public BaseFragment baseFragment;

        public MainActivityFragment(){

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            view = inflater.inflate(R.layout.fragment_main, container, false);
            View btn = (Button)view.findViewById(R.id.json);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.xml);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.service);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.callback);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.des);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.handle);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.toast);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.textview);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.button);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.fragment);
            btn.setOnClickListener(this);
            btn = (Button)view.findViewById(R.id.dialog);
            btn.setOnClickListener(this);
            initFragment();
            return view;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
        }

        @Override
        public void onPause() {
            super.onPause();
        }

        @Override
        public void onStop() {
            super.onStop();
        }

        @Override
        public void onStart() {
            super.onStart();
        }

        @Override
        public void onResume() {
            super.onResume();
        }

        @Override
        public void onLowMemory() {
            super.onLowMemory();
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
        }

        @Override
        public void onDestroy() {

            super.onDestroy();
        }

        @Override
        public void onDetach()
        {
            super.onDetach();
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.json:
                    Toast.makeText(getActivity(),"json",Toast.LENGTH_LONG).show();
                    loadFragment(jsonFragment);
                    break;
                case R.id.xml:
                    Toast.makeText(getActivity(),"xml",Toast.LENGTH_LONG).show();
                    loadFragment(xmlFragment);
                    break;
                case R.id.des:
                    Toast.makeText(getActivity(),"des",Toast.LENGTH_LONG).show();
                    loadFragment(desFragment);
                    break;
                case R.id.handle:
                    Toast.makeText(getActivity(),"handle",Toast.LENGTH_LONG).show();
                    loadFragment(handleFragment);
                    break;
                case R.id.service:
                    Toast.makeText(getActivity(),"service",Toast.LENGTH_LONG).show();
                    loadFragment(serviceFragment);
                    break;
                case R.id.textview:
                    Toast.makeText(getActivity(),"textview",Toast.LENGTH_LONG).show();
                    loadFragment(textViewFragment);
                    break;
                case R.id.button:
                    Toast.makeText(getActivity(),"button",Toast.LENGTH_LONG).show();
                    loadFragment(buttonFragment);
                break;
                case R.id.dialog:
                    Toast.makeText(getActivity(),"dialog",Toast.LENGTH_LONG).show();
                    loadFragment(dialogFragment);
                    break;
                case R.id.fragment:
                    Toast.makeText(getActivity(),"fragment",Toast.LENGTH_LONG).show();
                    loadFragment(baseFragment);
                    break;
                case R.id.toast:
                    Toast.makeText(getActivity(),"toast",Toast.LENGTH_LONG).show();
                    loadFragment(toastFragment);
                    break;
                case R.id.callback:
                    Toast.makeText(getActivity(),"callback",Toast.LENGTH_LONG).show();
                    loadFragment(callBackFragment);
                    break;
            }
        }

        @Override
        public boolean onBackPressed() {
            return false;
        }

        public void loadFragment(BackHandledFragment selectedFragment){
            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.fragment_layout,selectedFragment);
            ft.addToBackStack("tag");
            ft.commit();
        }

        public void initFragment(){
            jsonFragment = new JsonFragment();
            xmlFragment = new XmlFragment();
            desFragment = new DesFragment();
            serviceFragment = new ServiceFragment();
            handleFragment = new HandleFragment();
            dialogFragment = new DialogFragment();
            buttonFragment = new ButtonFragment();
            textViewFragment = new TextViewFragment();
            baseFragment = new BaseFragment();
            callBackFragment = new CallBackFragment();
            toastFragment = new ToastFragment();
        }

}
