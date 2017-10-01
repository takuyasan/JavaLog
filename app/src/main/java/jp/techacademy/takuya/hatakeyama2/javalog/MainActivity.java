package jp.techacademy.takuya.hatakeyama2.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        Human human1=new Human("畠山　拓也",24,"Android",this);
        human1.say();
        human1.think();


        Human human2=new Human("John Doe",20,"Programming",this);
        human2.say();
        human2.think();

    }
}
