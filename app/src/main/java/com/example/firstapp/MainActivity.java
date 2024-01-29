package com.example.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FullScreen(this);
        setContentView(R.layout.activity_main);
    }
    public static void FullScreen(AppCompatActivity activity)
    {
        activity.requestWindowFeature(Window.FEATURE_NO_TITLE);
        activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }


    public void Click_Start(View view)
    {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
        this.finish();
    }
    private int artem = 0;
    public void Click_Info(View view)
    {
        ++artem;
        if (artem>10) {
            ImageView imageView = (ImageView) findViewById(R.id.imageViewArtem);
            imageView.setVisibility(View.VISIBLE);
        }
        Toast toast1 = Toast.makeText(this  , "In this game you need to dodge asteroids. Score 300 points to win. And get your gift.", Toast.LENGTH_SHORT );
        toast1.show();
    }
    public void Click_Image(View view) {
        artem = 0;
        ImageView imageView = (ImageView) findViewById(R.id.imageViewArtem);
        imageView.setVisibility(View.INVISIBLE);
    }

    /*public static ArrayList<Student> names = new ArrayList<Student>();
    boolean info = false;
    public static Integer ID_stud;

    public void Enter_(View view)
    {
        EditText logtext = (EditText) findViewById(R.id.LoginText);
        EditText passtext = (EditText) findViewById(R.id.PasswordText);

        if (logtext.getText().toString().equals("") || passtext.getText().toString().equals(""))
        {
            Toast toast1 = Toast.makeText(this  , "Заполните все поля", Toast.LENGTH_SHORT );
            toast1.show();
            return;
        }
        else {

            ID_stud = Find_in_class();
            if (info) {
                Intent intent = new Intent(this, MenuActivity.class);
                startActivity(intent);
            }
        }
    }

    int Find_in_class()
    {
        EditText logtext = (EditText) findViewById(R.id.LoginText);
        EditText passtext = (EditText) findViewById(R.id.PasswordText);

        for(Student s : names)
        {
            if(s.Login.equals(logtext.getText().toString()))
            {

                if (s.Password.equals(passtext.getText().toString())) {
                    info = true;
                    return s.Id;
                }
                info = false;
                Toast toast1 = Toast.makeText(this  , "Не правильный пароль для пользователя - "+s.Login, Toast.LENGTH_SHORT );
                toast1.show();
                return 0;
            }
        }
        info = false;
        Toast toast1 = Toast.makeText(this  , "Пользователь с Логином "+ logtext.getText().toString() + " не найден!", Toast.LENGTH_SHORT );
        toast1.show();
        return 0;
    }

    void Add_Data()
    {
        names.clear();
        names.add(new Student( 1, "123", "123456" , "Tom","41is", "avatar1.png"));
        names.add(new Student( 2,  "Somelog555", "55555" , "Kate","43is", "avatar2.png"));
        names.add(new Student( 3, "ImNikit", "Hiitsme" ,  "Nikita","42is", "avatar3.png"));
        names.add(new Student( 4, "Antoni01", "142536" ,  "Toni","31is", "avatar4.png"));
        names.add(new Student( 5,  "USAismy", "favoriteLand" , "Sam","32is", "avatar5.png"));
    }

    Integer number = 1;
    public void Plus_One(View view)
    {
        Button btn1 = (Button) findViewById(R.id.button2);
        TextView textView1 = (TextView) findViewById(R.id.PlusText);

        Random rand = new Random();

        String somestring = "5454";
        Integer somenumb = Integer.valueOf(somestring);
        somenumb += 46;

        number = rand.nextInt(9);

        textView1.setText(number.toString());


        X++;
        TextView textView1 = (TextView) findViewById(R.id.PlusText);
        textView1.setText(X.toString());

        btn1.setText("Нажми ещё раз чтобы сменить число!");
    }*/
}