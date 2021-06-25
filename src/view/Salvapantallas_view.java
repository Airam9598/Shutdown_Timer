package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import model.Salvapantallas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.awt.Cursor;

public class Salvapantallas_view {

	private JFrame frmSalvapantallas;
	private Salvapantallas pantalla;
	private JPanel panel,panel_1,panel_2,panel_3;
	public Salvapantallas_view(Salvapantallas pantalla) {
		initialize();
		frmSalvapantallas.setVisible(true);
		this.pantalla=pantalla;
	}

	private void initialize() {
		frmSalvapantallas = new JFrame();
		frmSalvapantallas.getContentPane().setBackground(SystemColor.textHighlight);
		frmSalvapantallas.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmSalvapantallas.setType(Type.UTILITY);
		frmSalvapantallas.setTitle("Salvapantallas");
		frmSalvapantallas.setAlwaysOnTop(true);
		frmSalvapantallas.setResizable(false);
		frmSalvapantallas.setBounds(100, 100, 369, 180);
		frmSalvapantallas.getContentPane().setLayout(null);
		frmSalvapantallas.addWindowListener(new WindowAdapter() {
               @Override
               public void windowClosing(WindowEvent e) {
            	  frmSalvapantallas.setVisible(false);
               }
           });
		JLabel lblBurbujas = new JLabel("Burbujas:");
		lblBurbujas.setForeground(Color.WHITE);
		lblBurbujas.setHorizontalAlignment(SwingConstants.CENTER);
		lblBurbujas.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBurbujas.setBounds(10, 9, 103, 24);
		frmSalvapantallas.getContentPane().add(lblBurbujas);
		
		JButton btnNewButton = new JButton("Ver");
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(255, 165, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.View(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(123, 9, 66, 24);
		frmSalvapantallas.getContentPane().add(btnNewButton);
		
		JLabel lblMistico = new JLabel("Mistico:");
		lblMistico.setForeground(Color.WHITE);
		lblMistico.setHorizontalAlignment(SwingConstants.CENTER);
		lblMistico.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMistico.setBounds(10, 44, 103, 24);
		frmSalvapantallas.getContentPane().add(lblMistico);
		
		JButton btnNewButton_1 = new JButton("Ver");
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.View(2);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(123, 44, 66, 24);
		frmSalvapantallas.getContentPane().add(btnNewButton_1);
		
		JLabel lblRibbon = new JLabel("Ribbon:");
		lblRibbon.setForeground(Color.WHITE);
		lblRibbon.setHorizontalAlignment(SwingConstants.CENTER);
		lblRibbon.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRibbon.setBounds(10, 79, 103, 24);
		frmSalvapantallas.getContentPane().add(lblRibbon);
		
		JButton btnNewButton_1_1 = new JButton("Ver");
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.setBackground(new Color(255, 165, 0));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.View(3);
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setBounds(123, 79, 66, 24);
		frmSalvapantallas.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNombreOs = new JLabel("Nombre OS:");
		lblNombreOs.setForeground(Color.WHITE);
		lblNombreOs.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombreOs.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNombreOs.setBounds(10, 114, 103, 24);
		frmSalvapantallas.getContentPane().add(lblNombreOs);
		
		JButton btnNewButton_1_2 = new JButton("Ver");
		btnNewButton_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton_1_2.setFocusPainted(false);
		btnNewButton_1_2.setBackground(new Color(255, 165, 0));
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.View(1);
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_2.setBounds(123, 114, 66, 24);
		frmSalvapantallas.getContentPane().add(btnNewButton_1_2);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBackground(new Color(34, 139, 34));
		panel.setBounds(202, 9, 108, 24);
		frmSalvapantallas.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnActivar = new JButton("Activar");
		btnActivar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActivar.setForeground(Color.BLACK);
		btnActivar.setBorderPainted(false);
		btnActivar.setBounds(10, 0, 88, 24);
		panel.add(btnActivar);
		btnActivar.setContentAreaFilled(false);
		btnActivar.setFocusPainted(false);
		btnActivar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setActual(0);
				panel.setBackground(new Color(34, 139, 34));
				panel_1.setBackground(new Color(204, 0, 0));
				panel_2.setBackground(new Color(204, 0, 0));
				panel_3.setBackground(new Color(204, 0, 0));
			}
		});
		btnActivar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBackground(new Color(204, 0, 0));
		panel_1.setForeground(new Color(0, 0, 205));
		panel_1.setBounds(202, 44, 108, 24);
		frmSalvapantallas.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnActivar_1 = new JButton("Activar");
		btnActivar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActivar_1.setForeground(Color.BLACK);
		btnActivar_1.setBorderPainted(false);
		btnActivar_1.setFocusPainted(false);
		btnActivar_1.setContentAreaFilled(false);
		btnActivar_1.setBounds(10, 0, 88, 24);
		panel_1.add(btnActivar_1);
		btnActivar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setActual(2);
				panel_1.setBackground(new Color(34, 139, 34));
				panel.setBackground(new Color(204, 0, 0));
				panel_2.setBackground(new Color(204, 0, 0));
				panel_3.setBackground(new Color(204, 0, 0));
			}
		});
		btnActivar_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_2.setBackground(new Color(204, 0, 0));
		panel_2.setForeground(new Color(0, 0, 205));
		panel_2.setBounds(202, 79, 108, 24);
		frmSalvapantallas.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnActivar_1_1 = new JButton("Activar");
		btnActivar_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActivar_1_1.setForeground(Color.BLACK);
		btnActivar_1_1.setBorderPainted(false);
		btnActivar_1_1.setFocusPainted(false);
		btnActivar_1_1.setBounds(10, 0, 88, 24);
		panel_2.add(btnActivar_1_1);
		btnActivar_1_1.setContentAreaFilled(false);
		btnActivar_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setActual(3);
				panel_2.setBackground(new Color(34, 139, 34));
				panel_1.setBackground(new Color(204, 0, 0));
				panel.setBackground(new Color(204, 0, 0));
				panel_3.setBackground(new Color(204, 0, 0));
			}
		});
		btnActivar_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBackground(new Color(204, 0, 0));
		panel_3.setForeground(new Color(0, 0, 205));
		panel_3.setBounds(202, 114, 108, 24);
		frmSalvapantallas.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnActivar_1_2 = new JButton("Activar");
		btnActivar_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnActivar_1_2.setForeground(Color.BLACK);
		btnActivar_1_2.setBorderPainted(false);
		btnActivar_1_2.setFocusPainted(false);
		btnActivar_1_2.setContentAreaFilled(false);
		btnActivar_1_2.setBounds(10, 0, 88, 24);
		panel_3.add(btnActivar_1_2);
		btnActivar_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pantalla.setActual(1);
				panel_3.setBackground(new Color(34, 139, 34));
				panel_1.setBackground(new Color(204, 0, 0));
				panel_2.setBackground(new Color(204, 0, 0));
				panel.setBackground(new Color(204, 0, 0));
			}
		});
		btnActivar_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
	
	public boolean dispose() {
		if(frmSalvapantallas.isVisible()) {
			return true;
		}else {
			return false;
		}
	}
}
