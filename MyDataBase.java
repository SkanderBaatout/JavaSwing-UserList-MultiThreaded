package miniProjet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.table.DefaultTableModel;

public class MyDataBase {
	private Connection con;

	public void connexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/tp13", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	int ajouter(Personne p) {
		try {
			Statement stm = con.createStatement();
			String req = "INSERT INTO `liste des utilisateurs`(`id`, `nom`, `genre`) VALUES ("+p.getId()+","+p.getNom()+","+p.getGenre()+")";
			return stm.executeUpdate(req);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;

	}
	
	ResultSet select(String reqSql) {
		try {
			Statement stm = con.createStatement();
			return stm.executeQuery(reqSql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	void remplir(DefaultTableModel model, String reqSql) {
		try {
			ResultSet res = select(reqSql);
			while (res.next()) {
				model.addRow(new Object[] { res.getInt(1), res.getString(0), res.getString(0) });
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
