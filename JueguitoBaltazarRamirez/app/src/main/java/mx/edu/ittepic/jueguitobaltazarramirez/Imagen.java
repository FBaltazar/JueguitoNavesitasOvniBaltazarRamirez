package mx.edu.ittepic.jueguitobaltazarramirez;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Imagen
{
    private Bitmap imagen;
    private float x,y;
    private boolean visible;
    int desplazamiento,desplazamientos;
    CountDownTimer timer;

    public Imagen(int recurso, float _x, float _y, final Lienzo l)
    {
        x = _x;
        y = _y;
        visible=true;
        imagen = BitmapFactory.decodeResource(l.getResources(),recurso);
        timer = new CountDownTimer(1000,50)
        {
            @Override
            public void onTick(long millisUntilFinished)
            {
                y+=desplazamiento;
                if (y>=l.getHeight())
                {
                    y=-410;
                }
                y+=desplazamientos;
                l.invalidate();
            }

            @Override
            public void onFinish()
            {
                start();
            }
        };
    }

    public void movimientoNaveyIsla(int desplaza)
    {
        desplazamiento = desplaza;
        timer.start();
    }

    public void movimientoNaveyIslas(int desplaza)
    {
        desplazamientos = desplaza;
        timer.start();
    }
    public boolean estaEnArea(float xp,float yp)
    {
        if (!visible)
        {
            return false;
        }
        float x2,y2;
        x2 = x + imagen.getWidth();
        y2 = y + imagen.getHeight();

        if (xp >= x && xp <= x2)
        {
            if (yp >= y && yp <= y2)
            {
                return true;
            }
        }
        return false;
    }

    public boolean colision(Imagen objetoB)
    {
        float x2,y2;

        x2 = x + imagen.getWidth();
        y2 = y + imagen.getHeight();

        if (objetoB.estaEnArea(x2,y))return true;
        if (objetoB.estaEnArea(x,y))return  true;
        if (objetoB.estaEnArea(x,y2))return true;
        if (objetoB.estaEnArea(x2,y2))return true;

        return false;
    }

    public void mover(float xp)
    {
        x = xp - (imagen.getWidth()/2);
    }
    public void pintar(Canvas c, Paint p)
    {
        if (visible)
        {
            c.drawBitmap(imagen,x,y,p);
        }
    }
    public void hacerVisible(boolean v)
    {
        visible=v;
    }
    public float getY()
    {
        return y;
    }
    public void setY(float y)
    {
        this.y=y;
    }
}
