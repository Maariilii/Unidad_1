package mx.edu.utng.mementolapiz;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

public class Lapiz {
    private int color;
    float x,y,xi,yi,xd,yd;
    public Lapiz(){}

    public void dibujar(Canvas canvas, int color){

        Paint paint = new Paint();
        Paint paint2 = new Paint();
        Paint paint3 = new Paint();
        paint.setColor(Color.RED);
        paint2.setColor(color);
        paint3.setColor(color);
        paint.setStyle(Paint.Style.FILL);
        paint2.setStyle(Paint.Style.FILL);
        paint3.setStyle(Paint.Style.FILL);

        Path path    = new Path();
        Path path2    = new Path();
        Path path3    = new Path();

        x=(canvas.getWidth()/2);
        y=(canvas.getHeight()/2);
        xi=x-80;
        yi=y-80;

        xd=x+80;
        yd=y-80;


        canvas.drawCircle(x, y-200, 50, paint);
        path.close();
        canvas.drawPath(path, paint);

        path2.moveTo(x-50, y-200);
        path2.lineTo(x+50, y-200);
        path2.lineTo(x+50, y+200);
        path2.lineTo(x-50, y+200);
        path2.close();
        canvas.drawPath(path2, paint2);

        path3.moveTo(x-50, y+200);
        path3.lineTo(x+50, y+200);
        path3.lineTo(x, y+260);
        path3.close();
        canvas.drawPath(path3, paint3);


    }

    public Memento guardarMemento() {
        return new Memento(color);
    }
    public void restaurarMemento(Memento m) {
        color = m.getColor();
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}
