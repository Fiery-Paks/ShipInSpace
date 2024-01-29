package com.example.firstapp.helpclass;

import android.content.Context;

import com.example.firstapp.GameActivity;
import com.example.firstapp.R;

public class Ship extends SpaceBody {

    public Ship(Context context) {
        bitmapId = R.drawable.ship; // определяем начальные параметры
        size = (float) 3.7;
        x=7;
        y=GameView.maxY - size - 1;
        speed = (float) 0.4;

        init(context); // инициализируем корабль
    }
    @Override
    public void update() { // перемещаем корабль в зависимости от нажатой кнопки
        if(GameActivity.isLeftPressed && x >= 0){
            x -= speed;
        }
        if(GameActivity.isRightPressed && x <= GameView.maxX - 5){
            x += speed;
        }
    }
}
