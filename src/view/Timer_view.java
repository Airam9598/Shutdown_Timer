package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import model.Salvapantallas;
import refactor.Action;
import refactor.Countdown;
import refactor.Time;

import java.awt.Choice;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.border.LineBorder;

public class Timer_view {

	private JFrame frmTimer;
	private JTextField textField,textField_1,textField_2,textField_3,textField_4;
	private Timer timer1=null,timer3 ;
	private JLabel lblHora_2_1_1,lblNewLabel_1_1,lblNewLabel_1;
	private JLabel lblNewLabel_1_2,lblNewLabel_2,lblNewLabel_2_1,lblNewLabel_2_2,lblNewLabel_2_1_1;
	private JButton btnParar;
	private Choice choice;
	private JLabel lblOtrasOpciones;
	private JCheckBox chckbxNewCheckBox_2,chckbxNewCheckBox_2_1 ;
	private JButton btnCambiar;
	private JLabel lblHora_2_1_2;
	private Salvapantallas salva= new Salvapantallas();
	private Time hora ;
	private JTextField textField_5;
	public Timer_view(String version) {
		initialize(version);
		frmTimer.setVisible(true);
	}
	private void initialize(String version) {
		frmTimer = new JFrame();
		frmTimer.getContentPane().setBackground(new Color(51, 0, 255));
		frmTimer.setResizable(false);
		frmTimer.setTitle(version);
		frmTimer.setBounds(100, 100, 665, 375);
		frmTimer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTimer.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modo:");
		lblNewLabel.setForeground(new Color(255, 153, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(6, 11, 87, 25);
		frmTimer.getContentPane().add(lblNewLabel);
		
		JLabel lblAccin = new JLabel("Acción:");
		lblAccin.setForeground(new Color(255, 153, 0));
		lblAccin.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblAccin.setBounds(379, 10, 260, 25);
		frmTimer.getContentPane().add(lblAccin);
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setContentAreaFilled(false);
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setContentAreaFilled(false);
		chckbxNewCheckBox.setSelected(true);
		chckbxNewCheckBox.setBounds(6, 72, 21, 23);
		frmTimer.getContentPane().add(chckbxNewCheckBox);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox cbLog = (JCheckBox) e.getSource();
				if (cbLog.isSelected()) {
					chckbxNewCheckBox_1.setSelected(false);
					disablehour(1);
					disablecountdown(0);
				} else {
					chckbxNewCheckBox.setSelected(true);
			    }
			}
		});
		chckbxNewCheckBox_1.setBounds(6, 143, 21, 23);
		frmTimer.getContentPane().add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox cbLog = (JCheckBox) e.getSource();
				if (cbLog.isSelected()) {
					chckbxNewCheckBox.setSelected(false);
					disablehour(0);
					disablecountdown(1);
				} else {
					chckbxNewCheckBox_1.setSelected(true);
			    }
			}
		});
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setText("00");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(33, 72, 31, 23);
		frmTimer.getContentPane().add(textField);
		textField.setColumns(2);
		
		lblNewLabel_1 = new JLabel(":");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(63, 72, 15, 23);
		frmTimer.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setText("00");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(2);
		textField_1.setBounds(78, 72, 31, 23);
		frmTimer.getContentPane().add(textField_1);
		
		lblNewLabel_1_1 = new JLabel(":");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(107, 72, 15, 23);
		frmTimer.getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText("00");
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(2);
		textField_2.setBounds(119, 72, 31, 23);
		frmTimer.getContentPane().add(textField_2);
		
		JLabel lblHora = new JLabel("Cuenta Atrás");
		lblHora.setForeground(Color.WHITE);
		lblHora.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHora.setBounds(10, 47, 146, 14);
		frmTimer.getContentPane().add(lblHora);
		
		JLabel lblHora_2 = new JLabel("Hora");
		lblHora_2.setForeground(Color.WHITE);
		lblHora_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblHora_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHora_2.setBounds(10, 122, 109, 14);
		frmTimer.getContentPane().add(lblHora_2);
		
		JLabel lblHora_2_1 = new JLabel("Hora Actual:");
		lblHora_2_1.setForeground(Color.WHITE);
		lblHora_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblHora_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHora_2_1.setBounds(10, 184, 122, 14);
		frmTimer.getContentPane().add(lblHora_2_1);
		
		lblHora_2_1_1 = new JLabel("7:30");
		lblHora_2_1_1.setForeground(Color.WHITE);
		lblHora_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHora_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHora_2_1_1.setBounds(140, 184, 68, 14);
		frmTimer.getContentPane().add(lblHora_2_1_1);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(btnNewButton.isEnabled())btnNewButton.setBackground(new Color(50, 205, 50));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(34, 139, 34));
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(false);
				btnParar.setEnabled(true);
				choice.setEnabled(false);
				chckbxNewCheckBox_2_1.setEnabled(false);
				textField_5.setEnabled(false);
				if(chckbxNewCheckBox_2.isSelected())salva.Active();
				if(chckbxNewCheckBox.isSelected()) {
					disablecountdown(2);
					Countdown contador=new Countdown(Integer.parseInt(textField.getText()),Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_2.getText()));
					TimerTask timerTask = new TimerTask() 
				     { 
				         public void run()  
				         { 
							if(contador.update()==1) {
								Action.execute(choice.getSelectedItem(),chckbxNewCheckBox_2_1.isSelected(),textField_5.getText());
								disablecountdown(3);
								btnNewButton.setEnabled(true);
								btnParar.setEnabled(false);
								choice.setEnabled(true);
								chckbxNewCheckBox_2_1.setEnabled(true);
								textField_5.setEnabled(true);
								timer1.cancel();
							}else {
								textField_2.setText(contador.getSeconds());
					        	textField_1.setText(contador.getMinute());
					        	textField.setText(contador.getHour());
							}
				         } 
				     }; 

				     timer1 = new Timer(); 
				     timer1.scheduleAtFixedRate(timerTask, 0, 1000);
				}else {
					disablehour(2);
					TimerTask timerTask = new TimerTask() 
				     { 
				         public void run()  
				         { 
							if(hora.comparehour(Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()))) {
								Action.execute(choice.getSelectedItem(),chckbxNewCheckBox_2_1.isSelected(),textField_5.getText());
								disablehour(3);
								btnNewButton.setEnabled(true);
								btnParar.setEnabled(false);
								choice.setEnabled(true);
								chckbxNewCheckBox_2_1.setEnabled(true);
								textField_5.setEnabled(true);
								timer1.cancel();
							}
				         } 
				     }; 

				     timer1 = new Timer(); 
				     timer1.scheduleAtFixedRate(timerTask, 0, 1000);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(142, 295, 122, 23);
		frmTimer.getContentPane().add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setText("00");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(2);
		textField_3.setBounds(86, 143, 31, 23);
		frmTimer.getContentPane().add(textField_3);
		
		lblNewLabel_1_2 = new JLabel(":");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(117, 143, 15, 23);
		frmTimer.getContentPane().add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setText("00");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(2);
		textField_4.setBounds(130, 143, 31, 23);
		frmTimer.getContentPane().add(textField_4);
		
		lblNewLabel_2 = new JLabel("^");
		lblNewLabel_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (Integer.parseInt(textField_3.getText())+1 ==100) {
					textField_3.setText("00");
				}else {
					if (Integer.parseInt(textField_3.getText())+1<10) {
						int a =Integer.parseInt(textField_3.getText())+1;
						textField_3.setText("0"+a);
					}else {
						textField_3.setText(Integer.parseInt(textField_3.getText())+1 +"");
					}
				}
			}
		});
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(33, 143, 20, 23);
		frmTimer.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_2_1 = new JLabel("^");
		lblNewLabel_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (Integer.parseInt(textField_3.getText())-1 ==-1) {
					textField_3.setText("99");
				}else {
					if (Integer.parseInt(textField_3.getText())-1<10) {
						int a =Integer.parseInt(textField_3.getText())-1;
						textField_3.setText("0"+a);
					}else {
						textField_3.setText(Integer.parseInt(textField_3.getText())-1 +"");
					}
				}
			}
		});
		lblNewLabel_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setBounds(58, 143, 20, 23);
		frmTimer.getContentPane().add(lblNewLabel_2_1);
		
		lblNewLabel_2_2 = new JLabel("^");
		lblNewLabel_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (Integer.parseInt(textField_4.getText())+1 ==100) {
					textField_4.setText("00");
				}else {
					if (Integer.parseInt(textField_4.getText())+1<10) {
						int a =Integer.parseInt(textField_4.getText())+1;
						textField_4.setText("0"+a);
					}else {
						textField_4.setText(Integer.parseInt(textField_4.getText())+1 +"");
					}
				}
			}
		});
		lblNewLabel_2_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2_2.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_2.setBounds(171, 143, 20, 23);
		frmTimer.getContentPane().add(lblNewLabel_2_2);
		
		lblNewLabel_2_1_1 = new JLabel("^");
		lblNewLabel_2_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (Integer.parseInt(textField_4.getText())-1 ==-1) {
					textField_4.setText("99");
				}else {
					if (Integer.parseInt(textField_4.getText())-1<10) {
						int a =Integer.parseInt(textField_4.getText())-1;
						textField_4.setText("0"+a);
					}else {
						textField_4.setText(Integer.parseInt(textField_4.getText())-1 +"");
					}
				}
			}
		});
		lblNewLabel_2_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		lblNewLabel_2_1_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_2_1_1.setBounds(196, 143, 20, 23);
		frmTimer.getContentPane().add(lblNewLabel_2_1_1);
		
		btnParar = new JButton("Parar");
		btnParar.setFocusPainted(false);
		btnParar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(btnParar.isEnabled())btnParar.setBackground(new Color(255, 0, 51));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnParar.setBackground(new Color(220, 20, 60));
			}
		});
		btnParar.setForeground(Color.BLACK);
		btnParar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnParar.setBackground(new Color(220, 20, 60));
		btnParar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnParar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {timer1.cancel();}catch(Exception ex) {}
				btnNewButton.setEnabled(true);
				btnParar.setEnabled(false);
				choice.setEnabled(true);
				chckbxNewCheckBox_2_1.setEnabled(true);
				textField_5.setEnabled(true);
			}
		});
		btnParar.setEnabled(false);
		btnParar.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnParar.setBounds(10, 295, 122, 23);
		frmTimer.getContentPane().add(btnParar);
		
		choice = new Choice();
		choice.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		choice.setIgnoreRepaint(true);
		choice.setFont(new Font("Dialog", Font.BOLD, 15));
		choice.setFocusTraversalKeysEnabled(false);
		choice.setFocusable(false);
		choice.setBackground(Color.WHITE);
		choice.setForeground(Color.BLACK);
		choice.setBounds(379, 57, 136, 37);
		frmTimer.getContentPane().add(choice);
		
		lblOtrasOpciones = new JLabel("OTRAS OPCIONES:");
		lblOtrasOpciones.setForeground(new Color(255, 153, 0));
		lblOtrasOpciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblOtrasOpciones.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblOtrasOpciones.setBounds(349, 122, 290, 25);
		frmTimer.getContentPane().add(lblOtrasOpciones);
		
		chckbxNewCheckBox_2 = new JCheckBox("Activar Salvapantallas");
		chckbxNewCheckBox_2.setContentAreaFilled(false);
		chckbxNewCheckBox_2.setForeground(Color.WHITE);
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox_2.setBounds(359, 232, 280, 23);
		frmTimer.getContentPane().add(chckbxNewCheckBox_2);
		
		btnCambiar = new JButton("Cambiar");
		btnCambiar.setForeground(Color.BLACK);
		btnCambiar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(btnCambiar.isEnabled())btnCambiar.setBackground(new Color(255, 153, 51));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCambiar.setBackground(new Color(255, 102, 0));
			}
		});
		btnCambiar.setBackground(new Color(255, 102, 0));
		btnCambiar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		btnCambiar.setFocusPainted(false);
		btnCambiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Salvapantallas_view vie=new Salvapantallas_view(salva);
				frmTimer.setEnabled(false);
				TimerTask timerTask3 = new TimerTask() 
			     { 
			         public void run()  
			         { 
							if(vie.dispose()) {
								lblHora_2_1_2.setText(salva.getActual());
							}else {
								lblHora_2_1_2.setText(salva.getActual());
								frmTimer.setEnabled(true);
								frmTimer.toFront();
								timer3.cancel();
							}
			         } 
			     }; 

			     timer3 = new Timer(); 
			     timer3.scheduleAtFixedRate(timerTask3, 0, 100);
			}
		});
		btnCambiar.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnCambiar.setBounds(506, 257, 107, 23);
		frmTimer.getContentPane().add(btnCambiar);
		
		lblHora_2_1_2 = new JLabel("Burbujas");
		lblHora_2_1_2.setForeground(Color.WHITE);
		lblHora_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHora_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHora_2_1_2.setBounds(359, 257, 122, 23);
		frmTimer.getContentPane().add(lblHora_2_1_2);
		
		chckbxNewCheckBox_2_1 = new JCheckBox("Forzar cierre de aplicaciones");
		chckbxNewCheckBox_2_1.setContentAreaFilled(false);
		chckbxNewCheckBox_2_1.setForeground(Color.WHITE);
		chckbxNewCheckBox_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		chckbxNewCheckBox_2_1.setBounds(359, 150, 280, 23);
		frmTimer.getContentPane().add(chckbxNewCheckBox_2_1);
		
		textField_5 = new JTextField();
		textField_5.setText("00");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(2);
		textField_5.setBounds(516, 190, 31, 23);
		frmTimer.getContentPane().add(textField_5);
		
		JLabel lblCuentaAtrsDespus = new JLabel("Tiempo de gracia:");
		lblCuentaAtrsDespus.setForeground(Color.WHITE);
		lblCuentaAtrsDespus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuentaAtrsDespus.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCuentaAtrsDespus.setBounds(349, 191, 157, 22);
		frmTimer.getContentPane().add(lblCuentaAtrsDespus);
		for (String data: Action.getmethod()) {
			choice.addItem(data);
		}
		textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
               if(textField.getText().length()>=2)e.consume();
               try{Integer.parseInt(Character.toString(e.getKeyChar()));}catch(Exception ex) {e.consume();}
           }
      });
		textField_1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
               if(textField_1.getText().length()>=2)e.consume();
               try{Integer.parseInt(Character.toString(e.getKeyChar()));}catch(Exception ex) {e.consume();}
           }
      });
		textField_2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
               if(textField_2.getText().length()>=2)e.consume();
               try{Integer.parseInt(Character.toString(e.getKeyChar()));}catch(Exception ex) {e.consume();}
           }
      });
		textField_3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
               if(textField_3.getText().length()>=2)e.consume();
               try{Integer.parseInt(Character.toString(e.getKeyChar()));}catch(Exception ex) {e.consume();}
           }
      });
		textField_4.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
               if(textField_4.getText().length()>=2)e.consume();
               try{Integer.parseInt(Character.toString(e.getKeyChar()));}catch(Exception ex) {e.consume();}
           }
      });
		textField_5.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
               if(textField_5.getText().length()>=2)e.consume();
               try{Integer.parseInt(Character.toString(e.getKeyChar()));}catch(Exception ex) {e.consume();}
           }
      });
		Updatetime();
		disablehour(1);
	}
	private void disablehour(int valor) {
		if (valor==1) {
			textField_3.setEnabled(false);
			textField_4.setEnabled(false);
			lblNewLabel_2.setEnabled(false);
			lblNewLabel_1_2.setEnabled(false);
			lblNewLabel_2_1.setEnabled(false);
			lblNewLabel_2_2.setEnabled(false);
			lblNewLabel_2_1_1.setEnabled(false);
		}else if (valor==2) {
			textField_3.setEditable(false);
			textField_4.setEditable(false);
			lblNewLabel_2.setEnabled(false);
			lblNewLabel_2_1.setEnabled(false);
			lblNewLabel_2_2.setEnabled(false);
			lblNewLabel_2_1_1.setEnabled(false);
		}else if (valor==3) {
			textField_3.setEditable(true);
			textField_4.setEditable(true);
			lblNewLabel_2.setEnabled(true);
			lblNewLabel_2_1.setEnabled(true);
			lblNewLabel_2_2.setEnabled(true);
			lblNewLabel_2_1_1.setEnabled(true);
		}else {
			textField_3.setEnabled(true);
			textField_4.setEnabled(true);
			lblNewLabel_2.setEnabled(true);
			lblNewLabel_1_2.setEnabled(true);
			lblNewLabel_2_1.setEnabled(true);
			lblNewLabel_2_2.setEnabled(true);
			lblNewLabel_2_1_1.setEnabled(true);
		}
	}
	private void disablecountdown(int valor) {
		if (valor==1) {
			textField.setEnabled(false);
			textField_1.setEnabled(false);
			textField_2.setEnabled(false);
			lblNewLabel_1_1.setEnabled(false);
			lblNewLabel_1.setEnabled(false);
		}else if(valor==2) {
			textField.setEditable(false);
			textField_1.setEditable(false);
			textField_2.setEditable(false);
		}else if(valor==3) {
			textField.setEditable(true);
			textField_1.setEditable(true);
			textField_2.setEditable(true);
		}else {
			textField.setEnabled(true);
			textField_1.setEnabled(true);
			textField_2.setEnabled(true);
			lblNewLabel_1_1.setEnabled(true);
			lblNewLabel_1.setEnabled(true);
		}
	}
	private void Updatetime() {
		hora = new Time();
		textField_3.setText(hora.getActualHour()+"");
		textField_4.setText(hora.getActualMinute()+"");
		TimerTask timerTask2 = new TimerTask() 
	     { 
	         public void run()  
	         { 
	        	 lblHora_2_1_1.setText(hora.getActualHour()+":"+hora.getActualMinute());
	         } 
	     }; 

	     Timer timer2 = new Timer(); 
	     timer2.scheduleAtFixedRate(timerTask2, 0, 2000);
	}
}
