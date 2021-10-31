package com.example.paperscissorstone;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_paper = (Button) findViewById(R.id.btn_paper);
        Button btn_scissor = (Button) findViewById(R.id.btn_scissor);
        Button btn_stone = (Button) findViewById(R.id.btn_stone);
        btn_paper.setOnClickListener(ClickListener);
        btn_scissor.setOnClickListener(ClickListener);
        btn_stone.setOnClickListener(ClickListener);
    }

    private View.OnClickListener ClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
                TextView tv_whowin = (TextView) findViewById(R.id.tv_whowin);
                TextView tv_our = (TextView) findViewById(R.id.tv_our);
                TextView tv_com = (TextView) findViewById(R.id.tv_com);
                int random = 0;
            String[] ary = {"剪刀", "石頭", "布"};
//              random 剪刀為1 石頭為2 布為3
                random = (int)(Math.random()*3)+1;

                switch (v.getId()){
                    case R.id.btn_paper:
                    {
                        tv_our.setText("我方：布");
                        tv_com.setText("電腦："+ary[random-1]);
                        if(random == 1)
                        {
                            tv_whowin.setText("獲勝的是電腦");
                        }
                        else if(random == 2)
                        {
                            tv_whowin.setText("獲勝的是我方");
                        }
                        else{
                            tv_whowin.setText("雙方平手");
                        }
                        break;
                    }
                    case R.id.btn_scissor:
                    {
                        tv_our.setText("我方：剪刀");
                        tv_com.setText("電腦："+ary[random-1]);
                        if(random == 1)
                        {
                            tv_whowin.setText("雙方平手");
                        }
                        else if(random == 2)
                        {
                            tv_whowin.setText("獲勝的是電腦");
                        }
                        else{
                            tv_whowin.setText("獲勝的是我方");
                        }
                        break;
                    }
                    case R.id.btn_stone:
                    {
                        tv_our.setText("我方：石頭");
                        tv_com.setText("電腦："+ary[random-1]);
                        if(random == 1)
                        {
                            tv_whowin.setText("獲勝的是我方");
                        }
                        else if(random == 2)
                        {
                            tv_whowin.setText("雙方平手");
                        }
                        else{
                            tv_whowin.setText("獲勝的是電腦");
                        }
                        break;
                    }
                }
        }
    };
}