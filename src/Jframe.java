import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


public class Jframe extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static JTextField textFieldModeleVoiture;
	private static JTextField textFieldMarqueVoiture;
	private static JTextField textFieldImmatVoiture;
	private static JTextField textFieldModeleMoto;
	private static JTextField textFieldImmatMoto;
	private static JTextField textFieldMarqueMoto;
	private static JTextField textFieldCouleurVoiture;
	private static JTextField textFieldAnneeVoiture;
	private static JTextField textFieldPuissanceMoto;
	private String[][] arrListArray = {
			{ "001", "David", "AUS", "Goliath", "Jason", "Argonaut", "Immat" },
			{ "002", "David", "AUS", "Goliath", "Jason", "Argonaut", "Immat" }
		};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jframe frame = new Jframe();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the frame.
	 */
	public Jframe() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2));

		JPanel panelLeft = new JPanel();
		contentPane.add(panelLeft);
		
		panelLeft.setLayout(new CardLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		panelLeft.add(tabbedPane, "name_133724519386612");

		JSplitPane VoitureTab = new JSplitPane();
		VoitureTab.setResizeWeight(1.0);
		VoitureTab.setOrientation(JSplitPane.VERTICAL_SPLIT);
		tabbedPane.addTab("Voiture", null, VoitureTab, null);

		JPanel VoitureInputs = new JPanel();
		VoitureTab.setLeftComponent(VoitureInputs);
		VoitureInputs.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel modeleVoiture = new JPanel();
		VoitureInputs.add(modeleVoiture);

		JLabel label = new JLabel("Modèle");
		modeleVoiture.add(label);

		textFieldModeleVoiture = new JTextField();
		textFieldModeleVoiture.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldModeleVoiture.setColumns(10);
		modeleVoiture.add(textFieldModeleVoiture);

		JPanel marqueVoiture = new JPanel();
		VoitureInputs.add(marqueVoiture);

		JLabel lblMarque_1 = new JLabel("Marque");
		marqueVoiture.add(lblMarque_1);

		textFieldMarqueVoiture = new JTextField();
		textFieldMarqueVoiture.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMarqueVoiture.setColumns(10);
		marqueVoiture.add(textFieldMarqueVoiture);

		JPanel immatVoiture = new JPanel();
		VoitureInputs.add(immatVoiture);

		JLabel label_2 = new JLabel("Immat");
		immatVoiture.add(label_2);

		textFieldImmatVoiture = new JTextField();
		textFieldImmatVoiture.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldImmatVoiture.setColumns(10);
		immatVoiture.add(textFieldImmatVoiture);

		JPanel couleurVoiture = new JPanel();
		VoitureInputs.add(couleurVoiture);

		JLabel lblCouleur = new JLabel("Couleur");
		couleurVoiture.add(lblCouleur);

		textFieldCouleurVoiture = new JTextField();
		textFieldCouleurVoiture.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCouleurVoiture.setColumns(10);
		couleurVoiture.add(textFieldCouleurVoiture);

		JPanel anneeVoiture = new JPanel();
		VoitureInputs.add(anneeVoiture);

		JLabel lblAnnee = new JLabel("Annee");
		anneeVoiture.add(lblAnnee);

		textFieldAnneeVoiture = new JTextField();
		textFieldAnneeVoiture.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAnneeVoiture.setColumns(10);
		anneeVoiture.add(textFieldAnneeVoiture);
		
		JLabel label_1 = new JLabel("");
		VoitureInputs.add(label_1);

		JButton btnAjouter = new JButton("Ajouter");
		VoitureTab.setRightComponent(btnAjouter);
		btnAjouter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				voitureData();				
			}
		});
		

		JSplitPane MotoTab = new JSplitPane();
		MotoTab.setResizeWeight(1.0);
		MotoTab.setOrientation(JSplitPane.VERTICAL_SPLIT);
		tabbedPane.addTab("Moto", null, MotoTab, null);

		JPanel MotoInputs = new JPanel();
		MotoTab.setLeftComponent(MotoInputs);
		MotoInputs.setLayout(new GridLayout(0, 1, 0, 0));

		JPanel modeleMoto = new JPanel();
		MotoInputs.add(modeleMoto);

		JLabel label_3 = new JLabel("Modèle");
		modeleMoto.add(label_3);

		textFieldModeleMoto = new JTextField();
		textFieldModeleMoto.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldModeleMoto.setColumns(10);
		modeleMoto.add(textFieldModeleMoto);

		JPanel marqueMoto = new JPanel();
		MotoInputs.add(marqueMoto);

		JLabel lblMarque = new JLabel("Marque");
		marqueMoto.add(lblMarque);

		textFieldMarqueMoto = new JTextField();
		textFieldMarqueMoto.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMarqueMoto.setColumns(10);
		marqueMoto.add(textFieldMarqueMoto);

		JPanel immatMoto = new JPanel();
		MotoInputs.add(immatMoto);

		JLabel label_4 = new JLabel("Immat");
		immatMoto.add(label_4);

		textFieldImmatMoto = new JTextField();
		textFieldImmatMoto.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldImmatMoto.setColumns(10);
		immatMoto.add(textFieldImmatMoto);

		JPanel puissanceMoto = new JPanel();
		MotoInputs.add(puissanceMoto);

		JLabel lblPuissance = new JLabel("Puissance");
		puissanceMoto.add(lblPuissance);

		textFieldPuissanceMoto = new JTextField();
		textFieldPuissanceMoto.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPuissanceMoto.setColumns(10);
		puissanceMoto.add(textFieldPuissanceMoto);

		JButton btnAjouter_1 = new JButton("Ajouter");
		MotoTab.setRightComponent(btnAjouter_1);
		btnAjouter_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				motoData();
			}
		});;

		JPanel panelRight = new JPanel();
		contentPane.add(panelRight);
		panelRight.setLayout(new BorderLayout(0, 0));

		JPanel panel_5 = new JPanel();
		panelRight.add(panel_5, BorderLayout.SOUTH);

		JButton btnSupprimer = new JButton("Supprimer");
		panel_5.add(btnSupprimer);

		JButton btnModifier = new JButton("Modifier");
		panel_5.add(btnModifier);

		JPanel panel_6 = new JPanel();
		panelRight.add(panel_6, BorderLayout.CENTER);
		
		String[] titles = { "Marque", "Modèle", "Nombre de Roues", "Couleur", "Année", "Puissance", "Immat" };

		table = new JTable(arrListArray, titles);
	    panel_6.add(new JScrollPane(table));
		
	}
	
		
	public void voitureData() {
        String modeleVoiture = textFieldModeleVoiture.getText();
        String marqueVoiture = textFieldMarqueVoiture.getText();
        String anneeVoiture = textFieldAnneeVoiture.getText();
        String immatVoiture = textFieldImmatVoiture.getText();
        String couleurVoiture = textFieldCouleurVoiture.getText(); 
        
        System.out.println(arrListArray);
        // The array of strings to add to my table.
        String[] addedArray = new String[] { modeleVoiture, marqueVoiture, anneeVoiture, immatVoiture, couleurVoiture,
        		"Placeholder", "Placeholder" };
        
        // I create an ArrayList
        ArrayList<String[]> arrlist = new ArrayList<String[]>();
        
		// I populate this ArrayList with the initial value of variable rec (my array of arrays of strings)
		for (int i = 0; i < arrListArray.length; i++) {
		    arrlist.add(arrListArray[i]);
		} 
        // I add the line I need on my array
        arrlist.add(addedArray);
        
        // I change my ArrayList to a simple 2Dimensions Array
        String[][] arrListArray = arrlist.toArray(new String[arrlist.size()][]);
        
        // I rewrite the global arrListArray with the new value,
        // this should change the value of the Table, it doesn't, please kill me.
        
        
        System.out.println(Arrays.deepToString(arrListArray));
        
        //table = new JTable(arrListArray, titles);
        //return this.arrListArray = arrListArray;

//        
//        
//        String[][] arrListArray = arrlist.toArray(new String[arrlist.size()][]);
//        for (int i = 0; i < arrlist.size(); i++) {
//        	System.out.println(arrListArray[i]);
//        }
//        
//        
//        System.out.println(Arrays.deepToString(arrListArray));
//        
//        return arrListArray;
        
        //System.out.println(arrListArray[0][2]);
        
        //return arrListArray;
    }
	
	public static void motoData() {
		String modeleMoto = textFieldModeleMoto.getText();
		String marqueMoto = textFieldMarqueMoto.getText();
		String immatMoto = textFieldImmatMoto.getText();
		String puissanceMoto = textFieldPuissanceMoto.getText();
		System.out.println(modeleMoto + marqueMoto + immatMoto + puissanceMoto);
	}
}

