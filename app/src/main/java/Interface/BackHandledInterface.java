package Interface;


import Fragment.BackHandledFragment;

/**
* Created by lixudong on 15/7/15.
        * 定义一个setSelectedFragment方法用于设置当前加载的Fragment在栈顶
        */
public interface BackHandledInterface {

    public abstract void setSelectedFragment(BackHandledFragment fragment);

}
