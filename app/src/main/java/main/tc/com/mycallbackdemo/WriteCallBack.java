package main.tc.com.mycallbackdemo;

/**
 * Created by tckj03 on 2017/3/24.
 */

public class WriteCallBack
{

    private MyCallBack callBack;
    public void setCallBack(MyCallBack callBack) {
        this.callBack = callBack;
        //不能为空
        if(callBack!=null)
        {
            //处理业务逻辑
            callBack.toast("回调文字","回调吐司");
        }
    }

}
