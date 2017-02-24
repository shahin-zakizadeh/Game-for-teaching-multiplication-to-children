package tableMulti;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

public class UI extends JFrame {
	

	
	private JPanel contentPane;
	private JTable table;
	private int res;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	
	public UI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(9, 9, 9, 9));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table = new JTable();
		
		DefaultTableModel model = new DefaultTableModel(11, 11);
		table.setModel(model);

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				int row = table.getSelectedRow() + 1;
				int column = table.getSelectedColumn() + 1;
				
				for (int i = 0; i < 11; i++) {
					for (int j = 0; j < 11; j++) {
						res = row * column;
					}
				}
				
				// JOptionPane.showMessageDialog(null, column);
				// jopton vorodar if ooni k kard
				String showInputDialog = JOptionPane.showInputDialog("input");
				
				if (Integer.parseInt(showInputDialog) == res) {
					
						

					JOptionPane.showMessageDialog(null, "صد آفرین گلم");
					model.setValueAt(res + "", row - 1, column - 1);

				}
				else {
					
					JOptionPane.showMessageDialog(null, "بیشتر تلاش کن طلا");
						
					model.setValueAt(res, row-1, column-1);
					//taeene meghdar khane
					
					setBackground(Color.RED);
				}

			}
		});
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		table.setModel(model);

		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				model.setValueAt("?", i, j);
			}
		}
		/*
		 * table.setModel(new DefaultTableModel( new Object[][] { { "?", "?",
		 * "?", "?", "?", "?", "?", "?", "?", "?" }, { "?", "?", "?", "?", "?",
		 * "?", "?", "?", "?", "?" }, { "?", "?", "?", "?", "?", "?", "?", "?",
		 * "?", "?" }, { "?", "?", "?", "?", "?", "?", "?", "?", "?", "?" }, {
		 * "?", "?", "?", "?", "?", "?", "?", "?", "?", "?" }, { "?", "?", "?",
		 * "?", "?", "?", "?", "?", "?", "?" }, { "?", "?", "?", "?", "?", "?",
		 * "?", "?", "?", "?" }, { "?", "?", "?", "?", "?", "?", "?", "?", "?",
		 * "?" }, { "?", "?", "?", "?", "?", "?", "?", "?", "?", "?" }, { "?",
		 * "?", "?", "?", "?", "?", "?", "?", "?", "?" }, }, new String[] {
		 * "\u062C\u062F\u0648\u0644 \u0636\u0631\u0628 1",
		 * "\u062C\u062F\u0648\u0644 \u0636\u0631\u0628 2",
		 * "\u062C\u062F\u0648\u0644 \u0636\u0631\u0628 3",
		 * "\u062C\u062F\u0648\u0644 \u0636\u0631\u0628 4",
		 * "\u062C\u062F\u0648\u0644 \u0636\u0631\u0628 5", "New column",
		 * "New column", "New column", "New column", "New column" }) { Class[]
		 * columnTypes = new Class[] { Integer.class, Object.class,
		 * Object.class, Object.class, Object.class, Object.class, Object.class,
		 * Object.class, Object.class, Object.class };
		 * 
		 * public Class getColumnClass(int columnIndex) { return
		 * columnTypes[columnIndex]; } });
		 */
		table.setBounds(51, 58, 349, 160);
		contentPane.add(table);

		JLabel label = new JLabel("جدول ضرب 10تایی");
		label.setBounds(167, 0, 96, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("1تایی");
		label_1.setBounds(18, 58, 34, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("2تایی");
		label_2.setBounds(20, 75, 32, 14);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("3تایی");
		label_3.setBounds(20, 90, 34, 14);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("4تایی");
		label_4.setBounds(18, 106, 34, 14);
		contentPane.add(label_4);

		JLabel label_5 = new JLabel("5تایی");
		label_5.setBounds(18, 121, 34, 14);
		contentPane.add(label_5);

		JLabel label_6 = new JLabel("6تایی");
		label_6.setBounds(20, 137, 32, 14);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("7تایی");
		label_7.setBounds(18, 154, 34, 19);
		contentPane.add(label_7);

		JLabel label_8 = new JLabel("8تایی");
		label_8.setBounds(18, 173, 34, 14);
		contentPane.add(label_8);

		JLabel label_9 = new JLabel("9تایی");
		label_9.setBounds(18, 188, 38, 14);
		contentPane.add(label_9);

		JLabel label_10 = new JLabel("10تایی");
		label_10.setBounds(10, 204, 46, 14);
		contentPane.add(label_10);

		JLabel label_11 = new JLabel("1تایی");
		label_11.setBounds(51, 43, 34, 14);
		contentPane.add(label_11);

		JLabel label_12 = new JLabel("2تایی");
		label_12.setBounds(84, 43, 32, 14);
		contentPane.add(label_12);

		JLabel label_13 = new JLabel("3تایی");
		label_13.setBounds(111, 43, 34, 14);
		contentPane.add(label_13);

		JLabel label_14 = new JLabel("4تایی");
		label_14.setBounds(143, 43, 34, 14);
		contentPane.add(label_14);

		JLabel label_15 = new JLabel("5تایی");
		label_15.setBounds(167, 58, 34, 14);
		contentPane.add(label_15);

		JLabel label_16 = new JLabel("5تایی");
		label_16.setBounds(179, 43, 32, 14);
		contentPane.add(label_16);

		JLabel label_17 = new JLabel("6تایی");
		label_17.setBounds(211, 41, 34, 19);
		contentPane.add(label_17);

		JLabel label_18 = new JLabel("7تایی");
		label_18.setBounds(242, 43, 34, 14);
		contentPane.add(label_18);

		JLabel label_19 = new JLabel("8تایی");
		label_19.setBounds(273, 43, 38, 14);
		contentPane.add(label_19);

		JLabel label_20 = new JLabel("9تایی");
		label_20.setBounds(305, 43, 34, 14);
		contentPane.add(label_20);
		
		JLabel lblNewLabel = new JLabel("10تایی");
		lblNewLabel.setBounds(334, 43, 34, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label_21 = new JLabel("11تایی");
		label_21.setBounds(367, 43, 46, 14);
		contentPane.add(label_21);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		layeredPane.setBackground(Color.BLACK);
		layeredPane.setBounds(46, 38, 367, 19);
		contentPane.add(layeredPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		layeredPane_1.setBackground(Color.RED);
		layeredPane_1.setForeground(Color.GREEN);
		layeredPane_1.setBounds(10, 56, 40, 166);
		contentPane.add(layeredPane_1);
	}
}
