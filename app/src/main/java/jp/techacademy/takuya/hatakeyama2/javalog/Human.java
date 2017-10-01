package jp.techacademy.takuya.hatakeyama2.javalog;

import android.content.Context;
import android.util.Log;

/**
 * Created by Takuya on 2017/10/01.
 */

public class Human extends Animal implements Thinkable {

    private String hobby;
    private Context context;

    public Human(String name, int age, String hobby,Context context) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.context=context;

    }

    @Override
    public void think() {
        Log.d(context.getString(R.string.LogKeyJavaTest), "私は" + this.hobby + "について考える");
    }

    @Override
    public void say() {
        Log.d(context.getString(R.string.LogKeyJavaTest), "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }
}
