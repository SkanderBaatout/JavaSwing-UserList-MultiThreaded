package miniProjet;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MyForm extends JFrame {
	JLabel formL = new JLabel("Examen");
	JLabel nomL = new JLabel("Nom");
	JLabel genreL = new JLabel("Genre");
	JTextField nomT = new JTextField();
	JRadioButton rh = new JRadioButton("Homme", true);
	JRadioButton rf = new JRadioButton("Femme", false);
	JButton ajouterBtn = new JButton("Ajouter");
	JButton listBtn = new JButton("Liste");

	ButtonGroup bg = new ButtonGroup();

	public MyForm() {
		super("Examen");
		setSize(400, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		formL.setAlignmentX(CENTER_ALIGNMENT);

		nomT.setSize(100, 140);

		JPanel pgenre = new JPanel();
		pgenre.setLayout(new GridLayout(1, 2));
		pgenre.add(rh);
		pgenre.add(rf);
		bg.add(rh);
		bg.add(rf);

		JPanel pinfo = new JPanel();
		pinfo.setLayout(new GridLayout(2, 2));
		pinfo.add(nomL);
		pinfo.add(nomT);
		pinfo.add(genreL);
		pinfo.add(pgenre);
		pinfo.setBorder(BorderFactory.createTitledBorder("Informations"));

		JPanel pbtn = new JPanel();
		pbtn.setLayout(new FlowLayout());
		pbtn.setBorder(BorderFactory.createEtchedBorder());
		pbtn.add(listBtn);
		pbtn.add(ajouterBtn);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		c.add("North", formL);
		c.add("Center", pinfo);
		c.add("South", pbtn);

		MyEvent evt = new MyEvent(this);
		listBtn.addActionListener(e -> liste());
		ajouterBtn.addActionListener(evt);

		setVisible(true);

	}

	void liste() {
		MyList l = new MyList();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyForm f = new MyForm();
	}
}
