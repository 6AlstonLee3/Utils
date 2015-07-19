package Fragment;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lixudong.utils.R;

import Interface.BackHandledInterface;

/**
 * A simple {@link Fragment} subclass.
 * 定义一个抽象类BackHandledFragment继承自Fragment，后面跳转的Fragment界面都要继承自BackHandledFragment。
 * 抽象类BackHandledFragment中定义一个返回值为boolean类型的onBackPressed方法，用于处理点击返回按键（物理Back键）时的逻辑，
 * 若该方法返回false，表示当前Fragment不消费返回事件，而由Fragment所属的FragmentActivity来处理这个事件
 */
public abstract class BackHandledFragment extends Fragment {

    protected BackHandledInterface mBackHandledInterface;

    /**
     * 所有继承BackHandledFragment的子类都将在这个方法中实现物理Back键按下后的逻辑
     */
    public abstract boolean onBackPressed();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!(getActivity() instanceof BackHandledInterface)){
            throw new ClassCastException("Hosting Activity must implement BackHandledInterface");
        }else{
            this.mBackHandledInterface = (BackHandledInterface)getActivity();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        this.mBackHandledInterface.setSelectedFragment(this);
    }

}
