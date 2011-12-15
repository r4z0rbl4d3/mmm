package thread;

import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class testActivity extends Activity {
	private Game game;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v("msg:","111");
		game = new Game(this);
		Log.v("msg:","222");
		setContentView(game);

		Thread myThread = new Thread(new UpdateThread());
		myThread.start();

	}

	public class UpdateThread implements Runnable {

		@Override
		public void run() {
			while(true){
				testActivity.this.updateHandler.sendEmptyMessage(0);
			}
		}
	}
	
	public Handler updateHandler = new Handler(){
    	/** Gets called on every message that is received */
        // @Override
        public void handleMessage(Message msg) {
        	game.update();
            game.invalidate();
            super.handleMessage(msg);
        }
    };

}
