package thread;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.util.Log;

public class Game extends View {

	private int x = 0;

	public Game(Context context) {
		super(context);
		Log.v("msg:","xxx");
	}

	// called every Frame
	protected void onDraw(Canvas canvas) {
		System.out.println(x);
	}

	// called by thread
	public void update() {
		if (x < 200)
			x++;
		else
			x = 0;
	}

}
