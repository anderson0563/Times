package br.anderson.times;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import br.anderson.times.R.drawable;

public class MainActivity extends AppCompatActivity {
    private int time=0;
    int Time[] = {drawable.vasco, drawable.botafogo, drawable.fluminense, drawable.flamengo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageDrawable(getDrawable(Time[time++%4]));
    }

}