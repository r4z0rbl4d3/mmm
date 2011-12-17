package thread;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;

public class Game extends View {

	private int x = 0;

	
	public Game(Context context) {
		super(context);
	}

	// called every Frame
	protected void onDraw(Canvas canvas) {
		Paint paint = new Paint();
		paint.setStyle(Paint.Style.FILL);

		// make the entire canvas white
		paint.setColor(Color.WHITE);
		canvas.drawPaint(paint);
		
		Rect rect = new Rect(150, 150, 50, 100);
		canvas.rotate(x,rect.exactCenterX(), rect.exactCenterY());
		Log.i("GAME", "rotating" + x );
		paint.setColor(Color.RED);
		canvas.drawRect(rect, paint);
		canvas.restore();
		
	}

	// called by thread
	public void update() {
		if (x <= 360)
			x++;
		else
			x = 0;
	}

}
