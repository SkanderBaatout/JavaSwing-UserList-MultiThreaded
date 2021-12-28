package miniProjet;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class MyList extends JFrame{
	String entete[]= {"id","Nom", "Genre"};
	DefaultTableModel model=new DefaultTableModel(entete,10);
	JTable tab=new JTable(model);
	JScrollPane sP= new JScrollPane(tab);
	Canvas cv = new Canvas();
	MyThread mt;
	MyDataBase mCon;
	
	public MyList() {
		super("liste des utilisateurs");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pCenter = new JPanel();
		BorderLayout br = new BorderLayout();
		pCenter.setLayout(br);
		pCenter.add(sP);		
		cv.setBackground(Color.black);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(2,1));
		c.add(pCenter);
		c.add(cv);
		

		setVisible(true);
		mt = new MyThread(this);
		mCon = new MyDataBase();
		mCon.connexion();
		mt.start();
	}

}
