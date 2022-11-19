package com.noob.rebirthsimulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.noob.rebirthsimulator.AppData.AppDatabase;
import com.noob.rebirthsimulator.AppData.User;

public class setActivity extends AppCompatActivity {

    //实例一个Dao
    UserDao userDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set);

        userDao = AppDatabase.getInstance(this).userDao();
        //实例按钮
        Button clearbtn=findViewById(R.id.restart);
        Button deletebtn=findViewById(R.id.deleteaccount);

        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userDao.findByName("Guest").iflogin){
                    User user0=userDao.getloginuser(true);
                    user0.username="Guest";
                    user0.water=40000;
                    user0.fragment=0;
                    user0.iflogin=true;
                    userDao.update(user0);
                    Toast.makeText(setActivity.this, "Guest账号重置数据成功！",Toast.LENGTH_SHORT).show();
                }
                else {
                    User clcuser=userDao.getloginuser(true);
                    clcuser.username=userDao.getloginuser(true).username;
                    clcuser.water=50000;
                    clcuser.fragment=0;
                    clcuser.iflogin=true;
                    userDao.update(clcuser);
                    Toast.makeText(setActivity.this, "数据已经重置！",Toast.LENGTH_SHORT).show();
                }

            }
        });
        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userDao.findByName("Guest").iflogin)
                    Toast.makeText(setActivity.this, "无法删除游客账号！",Toast.LENGTH_SHORT).show();
                else
                {
                    User deluser = userDao.getloginuser(true);
                    deluser.username = userDao.getloginuser(true).username;
                    userDao.delete(deluser);
                    Toast.makeText(setActivity.this, "账号已经删除！如需请重新注册！",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}