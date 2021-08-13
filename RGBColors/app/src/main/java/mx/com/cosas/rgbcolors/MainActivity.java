package mx.com.cosas.rgbcolors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    SeekBar rojo, verde, azul;
    TextView vrojo, vverde, vazul, hex, color;
    int r=0, v=0, a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rojo = (SeekBar)findViewById(R.id.rojo);
        verde = (SeekBar)findViewById(R.id.verde);
        azul = (SeekBar)findViewById(R.id.azul);
        hex = (TextView) findViewById(R.id.hex);
        color = (TextView) findViewById(R.id.color);
        vrojo = (TextView) findViewById(R.id.vrojo);
        vverde = (TextView) findViewById(R.id.vverde);
        vazul = (TextView) findViewById(R.id.vazul);
        rojo.setOnSeekBarChangeListener(this);
        verde.setOnSeekBarChangeListener(this);
        azul.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()){
            case R.id.rojo:
                r=progress;
                break;

            case R.id.verde:
                v=progress;
                break;

            case R.id.azul:
                a=progress;
                break;
        }
        String c=ColorHex(r,v,a);
        hex.setText("HEX: "+c);
        color.setBackgroundColor(android.graphics.Color.rgb(r, v, a));
    }
    public String ColorHex(int r, int v, int a){
        String color = "";
        color = "#";
        color+= Integer.toHexString(r);
        color+= Integer.toHexString(v);
        color+= Integer.toHexString(a);
        return color;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        vrojo.setText("R: "+r);
        vverde.setText("G: "+v);
        vazul.setText("B: "+a);
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        vrojo.setText("R: "+r);
        vverde.setText("G: "+v);
        vazul.setText("B: "+a);
    }
}