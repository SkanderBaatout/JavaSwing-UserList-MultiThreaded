package miniProjet;
import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class MyEvent implements ActionListener{
	MyForm m;
	MyDataBase mCon = new MyDataBase();
	
	public MyEvent(MyForm m) {
		this.m=m;
		mCon.connexion();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if (o == m.ajouterBtn) {
			Personne p = new Personne(1, m.nomT.getText(),m.bg.toString());
			int rep =mCon.ajouter(p);
			if(rep>0) {
				System.out.println("ok");
			}
		}
		
	}

}
