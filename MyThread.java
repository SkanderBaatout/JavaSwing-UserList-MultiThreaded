package miniProjet;
import java.awt.Graphics;


public class MyThread extends Thread{
	MyList ml;
	Graphics g;
	
	public MyThread(MyList ml) {
		this.ml=ml;
		g = ml.cv.getGraphics();
	}
	@Override
	public void run() {
			ml.mCon.remplir(ml.model, "SELECT * FROM `liste des utilisateurs`");
		
		
	}

}
