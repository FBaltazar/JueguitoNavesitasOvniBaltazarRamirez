package mx.edu.ittepic.jueguitobaltazarramirez;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View
{
    Imagen imgFondo,estrella1,estrella2,estrella3,estrella4,estrella5,estrella6,estrella7,estrella8,estrella9,estrella10,
            imgNavecita1,imgNavesita2,imgNavesita3,imgNavesita4,
            imgPlayita1,imgPlayita2,imgPlayita3,imgPlayita4,
            imgCoete,
            imgbala,imgBalaEnemiga1,imgBalaEnemiga2,imgBalaEnemiga3,imgBalaEnemiga4,
            imgPum,
            puntero,puntero2,
            imgGameOver,jugoNuevo;
    MainActivity nuevo;
    int num2=0;

    public Lienzo(Context context)
    {
        super(context);
        imgFondo = new Imagen(R.drawable.fondo,0,0,this);

        estrella1 = new Imagen(R.drawable.estrellis,30,0,this);
        estrella2 = new Imagen(R.drawable.estrellis,100,100,this);
        estrella3 = new Imagen(R.drawable.estrellis,240,200,this);
        estrella4 = new Imagen(R.drawable.estrellis,400,300,this);
        estrella5 = new Imagen(R.drawable.estrellis,450,400,this);
        estrella6 = new Imagen(R.drawable.estrellis,500,500,this);
        estrella7 = new Imagen(R.drawable.estrellis,550,600,this);
        estrella8 = new Imagen(R.drawable.estrellis,600,700,this);
        estrella9 = new Imagen(R.drawable.estrellis,660,800,this);
        estrella10 = new Imagen(R.drawable.estrellis,710,900,this);


        imgGameOver = new Imagen(R.drawable.gameover,130,50,this);
        jugoNuevo =  new Imagen(R.drawable.juegonuevo,245,500,this);

        imgNavecita1 = new Imagen(R.drawable.navesita,1,0,this);
        imgNavesita2 = new Imagen(R.drawable.navesita,210,60,this);
        imgNavesita3 = new Imagen(R.drawable.navesita,430,80,this);
        imgNavesita4 = new Imagen(R.drawable.navesita,644,10,this);

        imgPlayita1 = new Imagen(R.drawable.haygremansito,5,0,this);
        imgPlayita2 = new Imagen(R.drawable.capsulita,270,250,this);
        imgPlayita3 = new Imagen(R.drawable.haygremansito,570,50,this);
        imgPlayita4 = new Imagen(R.drawable.capsulita,690,700,this);

        imgCoete = new Imagen(R.drawable.coete,420,1062,this);

        imgbala = new Imagen(R.drawable.bala,443,1062,this);

        imgPum = new Imagen(R.drawable.pum,250,150,this);

        imgBalaEnemiga1 = new Imagen(R.drawable.balitafinalenemiga,120,150,this);
        imgBalaEnemiga2 = new Imagen(R.drawable.balitafinalenemiga,335,210,this);
        imgBalaEnemiga3 = new Imagen(R.drawable.balitafinalenemiga,550,225,this);
        imgBalaEnemiga4 = new Imagen(R.drawable.balitafinalenemiga,760,157,this);

        puntero = null;
        puntero2 = null;

        estrella1.movimientoNaveyIsla(6);
        estrella2.movimientoNaveyIsla(9);
        estrella3.movimientoNaveyIsla(12);
        estrella4.movimientoNaveyIsla(9);
        estrella5.movimientoNaveyIsla(7);
        estrella6.movimientoNaveyIsla(10);
        estrella7.movimientoNaveyIsla(8);
        estrella8.movimientoNaveyIsla(10);
        estrella9.movimientoNaveyIsla(9);
        estrella10.movimientoNaveyIsla(7);

        imgNavecita1.movimientoNaveyIsla(5);
        imgNavesita2.movimientoNaveyIsla(3);
        imgNavesita3.movimientoNaveyIsla(4);
        imgNavesita4.movimientoNaveyIsla(6);

        imgBalaEnemiga1.movimientoNaveyIslas(7);
        imgBalaEnemiga2.movimientoNaveyIslas(5);
        imgBalaEnemiga3.movimientoNaveyIslas(6);
        imgBalaEnemiga4.movimientoNaveyIslas(8);

        imgPlayita1.movimientoNaveyIsla(10);
        imgPlayita2.movimientoNaveyIsla(6);
        imgPlayita3.movimientoNaveyIsla(5);
        imgPlayita4.movimientoNaveyIsla(8);

        imgPum.hacerVisible(false);

        imgGameOver.hacerVisible(false);
        jugoNuevo.hacerVisible(false);
        nuevo=(MainActivity)context;

    }

    public void onDraw(Canvas c)
    {
        Paint p = new Paint();

        imgFondo.pintar(c,p);

        estrella1.pintar(c,p);
        estrella2.pintar(c,p);
        estrella3.pintar(c,p);
        estrella4.pintar(c,p);
        estrella5.pintar(c,p);
        estrella6.pintar(c,p);
        estrella7.pintar(c,p);
        estrella8.pintar(c,p);
        estrella9.pintar(c,p);
        estrella10.pintar(c,p);

        imgPlayita1.pintar(c,p);
        imgPlayita2.pintar(c,p);
        imgPlayita3.pintar(c,p);
        imgPlayita4.pintar(c,p);

        imgNavecita1.pintar(c,p);
        imgNavesita2.pintar(c,p);
        imgNavesita3.pintar(c,p);
        imgNavesita4.pintar(c,p);


        imgCoete.pintar(c,p);

        imgbala.pintar(c,p);

        imgBalaEnemiga1.pintar(c,p);
        imgBalaEnemiga2.pintar(c,p);
        imgBalaEnemiga3.pintar(c,p);
        imgBalaEnemiga4.pintar(c,p);

        imgPum.pintar(c,p);

        imgGameOver.pintar(c,p);
        jugoNuevo.pintar(c,p);
        if(imgBalaEnemiga1.getY()>=getHeight())
        {
            imgBalaEnemiga1.setY(imgNavecita1.getY()+150);
        }
        if(imgBalaEnemiga2.getY()>=getHeight())
        {
            imgBalaEnemiga2.setY(imgNavesita2.getY()+150);
        }
        if(imgBalaEnemiga3.getY()>=getHeight())
        {
            imgBalaEnemiga3.setY(imgNavesita3.getY()+150);
        }
        if(imgBalaEnemiga4.getY()>=getHeight())
        {
            imgBalaEnemiga4.setY(imgNavesita4.getY()+150);
        }
    }

    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if (imgCoete.estaEnArea(xp,yp))
                {
                    imgbala=new Imagen(R.drawable.bala,xp,yp,this);
                    puntero=imgCoete;
                    puntero2=imgbala;
                    imgPum.hacerVisible(false);
                }
                if(imgGameOver.estaEnArea(xp,yp))
                {
                    Intent nue=new Intent(nuevo,MainActivity.class);
                    nuevo.startActivity(nue);
                }
                if(jugoNuevo.estaEnArea(xp,yp))
                {
                    Intent nue=new Intent(nuevo,MainActivity.class);
                    nuevo.startActivity(nue);
                }
                imgbala.movimientoNaveyIsla(-10);

                break;
            case MotionEvent.ACTION_MOVE:
                if (puntero!=null)
                {
                    puntero.mover(xp);
                    if (puntero.colision(imgNavecita1)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }
                    if (puntero.colision(imgNavesita2)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }
                    if (puntero.colision(imgNavesita3)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }
                    if (puntero.colision(imgNavesita4)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }

                    if (puntero.colision(imgBalaEnemiga1)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }
                    if (puntero.colision(imgBalaEnemiga2)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }
                    if (puntero.colision(imgBalaEnemiga3)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }
                    if (puntero.colision(imgBalaEnemiga4)&&puntero==imgCoete)
                    {
                        imgCoete.hacerVisible(false);
                        imgGameOver.hacerVisible(true);
                        imgPum = new Imagen(R.drawable.pum,xp,yp,this);
                        imgPum.hacerVisible(true);
                    }

                    if(puntero2.colision(imgNavecita1)&&puntero2==imgbala)
                    {
                        imgNavecita1 = new Imagen(R.drawable.navesita,1,0,this);
                        imgNavecita1.movimientoNaveyIsla(5);
                        imgNavecita1.hacerVisible(true);
                        imgbala=new Imagen(R.drawable.bala,xp,yp,this);
                        imgbala.hacerVisible(false);
                        num2=num2+1;
                        imgBalaEnemiga1 = new Imagen(R.drawable.balitafinalenemiga,120,150,this);

                        imgBalaEnemiga1.movimientoNaveyIslas(7);
                        imgBalaEnemiga1.hacerVisible(true);
                    }
                    if(puntero2.colision(imgNavesita2)&&puntero2==imgbala)
                    {
                        imgNavesita2 = new Imagen(R.drawable.navesita,210,60,this);
                        imgNavesita2.movimientoNaveyIsla(3);
                        imgNavesita2.hacerVisible(true);
                        imgbala=new Imagen(R.drawable.bala,xp,yp,this);
                        imgbala.hacerVisible(false);
                        num2=num2+1;
                        imgBalaEnemiga2 = new Imagen(R.drawable.balitafinalenemiga,335,210,this);
                        imgBalaEnemiga2.movimientoNaveyIslas(5);
                        imgBalaEnemiga2.hacerVisible(true);
                    }
                    if(puntero2.colision(imgNavesita3)&&puntero2==imgbala)
                    {
                        imgNavesita3 = new Imagen(R.drawable.navesita,430,80,this);
                        imgNavesita3.movimientoNaveyIsla(4);
                        imgNavesita3
                                .hacerVisible(true);
                        imgbala=new Imagen(R.drawable.bala,xp,yp,this);
                        imgbala.hacerVisible(false);
                        num2=num2+1;
                        imgBalaEnemiga3 = new Imagen(R.drawable.balitafinalenemiga,550,225,this);
                        imgBalaEnemiga3.movimientoNaveyIslas(6);

                        imgBalaEnemiga3.hacerVisible(true);
                    }
                    if(puntero2.colision(imgNavesita4)&&puntero2==imgbala)
                    {
                        imgNavesita4 = new Imagen(R.drawable.navesita,644,10,this);
                        imgNavesita4.movimientoNaveyIsla(6);
                        imgNavesita4.hacerVisible(true);
                        imgbala=new Imagen(R.drawable.bala,xp,yp,this);
                        imgbala.hacerVisible(false);
                        num2=num2+1;
                        imgBalaEnemiga4 = new Imagen(R.drawable.balitafinalenemiga,760,157,this);
                        imgBalaEnemiga4.movimientoNaveyIslas(8);
                        imgBalaEnemiga4.hacerVisible(true);
                    }
                    if(num2==10)
                    {
                        jugoNuevo.hacerVisible(true);
                        imgCoete.hacerVisible(false);
                        imgbala.hacerVisible(false);
                        imgNavecita1.hacerVisible(false);
                        imgNavesita2.hacerVisible(false);
                        imgNavesita3.hacerVisible(false);
                        imgNavesita4.hacerVisible(false);
                        imgBalaEnemiga1.hacerVisible(false);
                        imgBalaEnemiga2.hacerVisible(false);
                        imgBalaEnemiga3.hacerVisible(false);
                        imgBalaEnemiga4.hacerVisible(false);
                    }
                }

                break;
            case MotionEvent.ACTION_UP:
                puntero=null;
                break;
        }
        invalidate();
        return true;
    }
}
