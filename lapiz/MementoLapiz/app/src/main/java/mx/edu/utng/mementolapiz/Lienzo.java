package mx.edu.utng.mementolapiz;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;


public class Lienzo extends View {

    private Lapiz lapiz;

    public Lienzo(Context context, Lapiz lapiz){
        super(context);
        this.lapiz = lapiz;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if(lapiz !=null){
            lapiz.dibujar(canvas, lapiz.getColor());
        }
    }

    public Lapiz getLapiz() {
        return lapiz;
    }

    public void setLapiz(Lapiz lapiz) {
        this.lapiz = lapiz;
    }
}
