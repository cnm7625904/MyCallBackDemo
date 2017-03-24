package main.tc.com.mycallbackdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyCallBack
{

    private WriteCallBack mWriteCallBack;
    private TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        //必须在绑定view之后
        mWriteCallBack=new WriteCallBack();
        mWriteCallBack.setCallBack(MainActivity.this);
    }

    private void initViews() {
        tv= (TextView) findViewById(R.id.tv);
    }

    @Override
    public void toast(String text, String toast) {
         //text与toast是writecallback传过来的
        Toast.makeText(MainActivity.this,toast,Toast.LENGTH_SHORT).show();
        tv.setText(text);

    }
}
