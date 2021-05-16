import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Frame;

public class eðitimotomasyonu {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame pencere0 = new Frame();
 		pencere0.setTitle("Yönetim Eðitim Bilgi Sistemi");
 		pencere0.setVisible(true);
 		pencere0.setSize(500,700);
 		pencere0.setLayout(null);
        pencere0.setLocationRelativeTo(null);
        pencere0.setVisible(true);
        
        Label label = new Label("Kastamonu Ticaret Meslek Lisesine Hoþ geldiniz");
 	    label.setBounds(120, 100, 500, 20);
 	    pencere0.add(label);
             
		 Button button1 = new Button("Yönetim Bilgi Sistem Giriþi");
		    button1.setBounds(130, 135, 250, 50);
		    pencere0.add(button1);
		    
		    button1.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    
			    	
		            
		         
	                        
	    
		    
	    
		Frame pencere = new Frame();
	    pencere.setTitle("Eðitim Otomasyonu");
	    pencere.setSize(500,700);
	   
	   
		JButton button = new JButton("Öðrenci Ekleme");
	    button.setBounds(160, 100, 150, 50);
	    pencere.add(button);
	    
	    button.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    
		     Frame pencere3 = new Frame();
			 pencere3.setTitle("Öðrenci ekleme");
			 pencere3.setVisible(true);
			 pencere3.setSize(500,700);
			 pencere3.setLayout(null);
	         pencere3.setLocationRelativeTo(null);
	         pencere3.setVisible(true);
	         
	 	    
	 	    JLabel label = new JLabel("Kastamonu Ticaret Meslek Lisesi");
	 	    label.setBounds(150, 50, 200, 20);
	 	    pencere3.add(label);
	 	    
	 	    JLabel label2 = new JLabel("ogrnoID:");
	 	    label2.setBounds(50, 120, 50, 20);
	 	    pencere3.add(label2);
	 	    
	 	    JLabel label3 = new JLabel("ogradi:");
	 	    label3.setBounds(50, 144, 50, 20);
	 	    pencere3.add(label3);
	 	    
	 	    JLabel label4 = new JLabel("ogrsoyadi:");
	 	    label4.setBounds(50, 170, 65, 20);
	 	    pencere3.add(label4);
	 	    
	 	    JLabel label5 = new JLabel("bolumid:");
	 	    label5.setBounds(50, 200, 50, 20);
	 	    pencere3.add(label5);
	 	    
	 	    JLabel label6 = new JLabel("sýnýfID:");
	 	    label6.setBounds(50, 230, 50, 20);
	 	    pencere3.add(label6);
	 	    
	 	     JTextField tf1 = new JTextField();  
	          tf1.setBounds(110,120,150,20);  
	          pencere3.add(tf1);
	         
	          JTextField tf2 = new JTextField();  
	          tf2.setBounds(110,145,150,20);  
	          pencere3.add(tf2);
	          
	          JTextField tf3 = new JTextField();  
	          tf3.setBounds(110,168,150,20);  
	          pencere3.add(tf3);
	          
	          JTextField tf4 = new JTextField();  
	          tf4.setBounds(110,200,150,20);  
	          pencere3.add(tf4);
	          
	          JTextField tf5 = new JTextField();  
	          tf5.setBounds(110,230,150,20);  
	          pencere3.add(tf5);
	          
	        Button button = new Button("Ekle");
	  	    button.setBounds(65, 500, 70, 30);
	  	    pencere3.add(button);
	  	   	   
	  	    Button button1 = new Button("Sil");
	  	    button1.setBounds(150, 500, 70, 30);
	  	    pencere3.add(button1);
	  	    
	  	    Button button2 = new Button("Güncelleme");
	  	    button2.setBounds(250, 500, 70, 30);
	  	    pencere3.add(button2);
	  	    
	  	  DefaultTableModel  mustafa34 = new DefaultTableModel (); 
          JTable mustafa37=new JTable();
          mustafa37.setBounds(50, 350, 400, 400); 
          pencere3.add(mustafa37);
          pencere3.setVisible(true);
          mustafa37.setModel(mustafa34);
          mustafa34.setColumnIdentifiers(new String  [] {"","","","",""});
	  	    
          button.addActionListener((ActionListener) new ActionListener() {
              public void  actionPerformed(ActionEvent e) {

              mustafa34.addRow(new String [] {tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(),tf5.getText()});
              
           }
      });
          button1.addActionListener((ActionListener) new ActionListener() {
              public void  actionPerformed(ActionEvent e) {
             mustafa34.removeRow(mustafa37.getSelectedRow());
             

           }
      });       
          
          mustafa37.addMouseListener(new MouseAdapter() {
              public void  mouseClicked(MouseEvent arg0) {
                  int musti = mustafa37.getSelectedRow();
                  tf1.setText(mustafa34.getValueAt(musti, 0).toString());
                  tf2.setText(mustafa34.getValueAt(musti, 1).toString());
                  tf3.setText(mustafa34.getValueAt(musti, 2).toString());
                  tf4.setText(mustafa34.getValueAt(musti, 3).toString());
                  tf5.setText(mustafa34.getValueAt(musti, 4).toString());
          } 
           });    
         button2.addActionListener((ActionListener) new ActionListener() {
              public void  actionPerformed(ActionEvent e) {

              int musti34 = mustafa37.getSelectedRow();

              mustafa34.setValueAt(tf1.getText(),musti34,0);
             mustafa34.setValueAt(tf2.getText(),musti34,1);
             mustafa34.setValueAt(tf3.getText(),musti34,2);
             mustafa34.setValueAt(tf4.getText(),musti34,3);
             mustafa34.setValueAt(tf5.getText(),musti34,4);

               }
          });
	         pencere3.addWindowListener((WindowListener) new WindowAdapter() {
	             @Override
	             public void windowClosing(WindowEvent e) {
	                 super.windowClosing(e);
	                 pencere3.dispose(); 
	               
	             
	          }
	         });
		    }
		    });
	   	   
	    JButton button1 = new JButton("Sýnýf Olusturma");
	    button1.setBounds(160, 200, 150, 50);
	    pencere.add(button1);
	    
	    button1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    
		    	Frame pencere2 = new Frame();
		 		pencere2.setTitle("Sýnýf Olusturma");
		 		pencere2.setVisible(true);
		 		pencere2.setSize(500,700);
		 		pencere2.setLayout(null);
		        pencere2.setLocationRelativeTo(null);
		        pencere2.setVisible(true);
		             
		        JLabel label7 = new JLabel("Sýnýf Oluþturma");
		 	    label7.setBounds(200, 50, 150, 20);
		 	    pencere2.add(label7); 
	           
		 	   JLabel label8 = new JLabel("SýnýfID:");
		 	    label8.setBounds(50, 120, 50, 20);
		 	    pencere2.add(label8);
		 	    
		 	   JTextField tf6 = new JTextField();  
		          tf6.setBounds(110,120,150,20);  
		          pencere2.add(tf6);
		          
		          Button button3 = new Button("Ekle");
			  	    button3.setBounds(65, 500, 70, 30);
			  	    pencere2.add(button3);
			  	   	   
		 	    
		 	   JLabel label9 = new JLabel("Sýnýf:");
		 	    label9.setBounds(50, 150, 50, 20);
		 	    pencere2.add(label9); 
		 	    
		 	   JTextField tf7 = new JTextField();  
		          tf7.setBounds(110,150,150,20);  
		          pencere2.add(tf7);
		          
		          Button button4 = new Button("Sil");
			  	    button4.setBounds(140, 500, 70, 30);
			  	    pencere2.add(button4);
		        
		 	   JLabel label10 = new JLabel("ogrnoID:");
		 	    label10.setBounds(50, 180, 50, 20);
		 	    pencere2.add(label10); 
		 	    
		 	   JTextField tf8 = new JTextField();  
		          tf8.setBounds(110,180,150,20);  
		          pencere2.add(tf8);
		        
		          Button button5 = new Button("Güncelle");
			  	    button5.setBounds(220, 500, 70, 30);
			  	    pencere2.add(button5);
			  	    
			  	  DefaultTableModel  musti34 = new DefaultTableModel (); 
		          JTable mustafa=new JTable();
		          mustafa.setBounds(50, 250, 400, 400); 
		          pencere2.add(mustafa);
		          pencere2.setVisible(true);
		          mustafa.setModel(musti34);
		          musti34.setColumnIdentifiers(new String  [] {"","",""});
		          
		          button3.addActionListener((ActionListener) new ActionListener() {
		              public void  actionPerformed(ActionEvent e) {

		              musti34.addRow(new String [] {tf6.getText(),tf7.getText(),tf8.getText(),});
		              
		           }
		      });
		          button4.addActionListener((ActionListener) new ActionListener() {
		              public void  actionPerformed(ActionEvent e) {
		             musti34.removeRow(mustafa.getSelectedRow());
		             

		           }
		      }); 
		          mustafa.addMouseListener(new MouseAdapter() {
		               public void  mouseClicked(MouseEvent arg0) {
		                   int musti = mustafa.getSelectedRow();
		                   tf6.setText(musti34.getValueAt(musti, 0).toString());
		                   tf7.setText(musti34.getValueAt(musti, 1).toString());
		                   tf8.setText(musti34.getValueAt(musti, 2).toString());
		                   
		           } 
		            });    
		          button5.addActionListener((ActionListener) new ActionListener() {
	                   public void  actionPerformed(ActionEvent e) {

	                   int musti37 = mustafa.getSelectedRow();

	                  musti34.setValueAt(tf6.getText(),musti37,0);
	                  musti34.setValueAt(tf7.getText(),musti37,1);
	                  musti34.setValueAt(tf8.getText(),musti37,2);
	                 

	                    }
	               });
		          
	         pencere2.addWindowListener((WindowListener) new WindowAdapter() {
	             @Override
	             public void windowClosing(WindowEvent e) {
	                 super.windowClosing(e);
	                 pencere2.dispose(); 
	               
	                 
	          }
	         });
		    }
		    });
	    
	    JButton button2 = new JButton("Ders Atama");
	    button2.setBounds(160, 300, 150, 50);
	    pencere.add(button2);
		
	    button2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    
		    	Frame pencere2 = new Frame();
		 		pencere2.setTitle("Ders Atama");
		 		pencere2.setVisible(true);
		 		pencere2.setSize(500,700);
		 		pencere2.setLayout(null);
		        pencere2.setLocationRelativeTo(null);
		        pencere2.setVisible(true);
		             
		        JLabel label10 = new JLabel("Ders Atama");
		 	    label10.setBounds(200, 50, 150, 20);
		 	    pencere2.add(label10); 
	         
		 	   JLabel label11 = new JLabel("DersID:");
		 	    label11.setBounds(50, 120, 50, 20);
		 	    pencere2.add(label11);
		 	    
		 	   JTextField tf9 = new JTextField();  
		          tf9.setBounds(110,120,150,20);  
		          pencere2.add(tf9);
		          
			 	   JLabel label12 = new JLabel("DersAdý:");
			        label12.setBounds(50, 150, 100, 20);
			        pencere2.add(label12);
			 	    
			 	   JTextField tf10 = new JTextField();  
			          tf10.setBounds(110,150,150,20);  
			          pencere2.add(tf10); 
			          
			          JLabel label13 = new JLabel("DersKodu:");
				 	    label13.setBounds(50, 180, 65, 20);
				 	    pencere2.add(label13);
				 	    
				 	   JTextField tf11 = new JTextField();  
				          tf11.setBounds(115,180,150,20);  
				          pencere2.add(tf11); 
			        
				          JLabel label14 = new JLabel("Kredi:");
					 	    label14.setBounds(50, 210, 65, 20);
					 	    pencere2.add(label14);
					 	    
					 	   JTextField tf12 = new JTextField();  
					          tf12.setBounds(115,210,150,20);  
					          pencere2.add(tf12); 
					          
					          JLabel label15 = new JLabel("BolumID:");
						 	    label15.setBounds(50, 240, 65, 20);
						 	    pencere2.add(label15);
						 	    
						 	   JTextField tf13 = new JTextField();  
						          tf13.setBounds(115,240,150,20);  
						          pencere2.add(tf13); 
			        
		        
						          Button button6 = new Button("Ekle");
							  	    button6.setBounds(65, 500, 70, 30);
							  	    pencere2.add(button6);
							  	    
							  	  Button button7 = new Button("Sil");
							  	    button7.setBounds(150, 500, 70, 30);
							  	    pencere2.add(button7);
	            
							  	  Button button8 = new Button("Güncelle");
							  	    button8.setBounds(230, 500, 70, 30);
							  	    pencere2.add(button8);
							  	    
							  	  DefaultTableModel  musti37 = new DefaultTableModel (); 
						          JTable mustafa=new JTable();
						          mustafa.setBounds(50, 300, 400, 400); 
						          pencere2.add(mustafa);						      
						          pencere2.setVisible(true);
						          mustafa.setModel(musti37);
						          musti37.setColumnIdentifiers(new String  [] {"","","","",""});
						          
						          button6.addActionListener((ActionListener) new ActionListener() {
						           public void  actionPerformed(ActionEvent e) {

						          musti37.addRow(new String [] {tf9.getText(),tf10.getText(),tf11.getText(),tf12.getText(),tf13.getText(),});
						              
						           }
						      });
						          button7.addActionListener((ActionListener) new ActionListener() {
						              public void  actionPerformed(ActionEvent e) {
						             musti37.removeRow(mustafa.getSelectedRow());
						             
                   
						           }
						      }); 
						          
						          mustafa.addMouseListener(new MouseAdapter() {
						               public void  mouseClicked(MouseEvent arg0) {
						                   int musti = mustafa.getSelectedRow();
						                   tf9.setText(musti37.getValueAt(musti, 0).toString());
						                   tf10.setText(musti37.getValueAt(musti, 1).toString());
						                   tf11.setText(musti37.getValueAt(musti, 2).toString());
						                   tf12.setText(musti37.getValueAt(musti, 3).toString());
						                   tf13.setText(musti37.getValueAt(musti, 4).toString());
						           } 
						            });    
						          button8.addActionListener((ActionListener) new ActionListener() {
					                   public void  actionPerformed(ActionEvent e) {

					                   int musti34 = mustafa.getSelectedRow();

					                   musti37.setValueAt(tf9.getText(),musti34,0);
					                  musti37.setValueAt(tf10.getText(),musti34,1);
					                  musti37.setValueAt(tf11.getText(),musti34,2);
					                  musti37.setValueAt(tf12.getText(),musti34,3);
					                  musti37.setValueAt(tf13.getText(),musti34,4);

					                    }
					               });
	         pencere2.addWindowListener((WindowListener) new WindowAdapter() {
	             @Override
	             public void windowClosing(WindowEvent e) {
	                 super.windowClosing(e);
	                 pencere2.dispose(); 
	               
	                 
	          }
	         });
		    }
		    });
	    
	    JButton button3 = new JButton("Öðrenci Listeleme");
	    button3.setBounds(160, 400, 150, 50);
	    pencere.add(button3);
	    
	    button3.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    
	     Frame pencere2 = new Frame();
		 pencere2.setTitle("Listeleme");
		 pencere2.setVisible(true);
		 pencere2.setSize(500,700);
         pencere2.setVisible(true);
         
         
         String[] columns=new String[]
                 {"ogrnoID","ogradi","ogrsoyadi","bolumid","sýnýfID"};

         String[][] cells=new String[][]{
                  {"1","Berkay","Yolcu","1","1"},
                  {"2","Yiðit","Karagöz","2","2"},
                  {"3","Oðuzhan","Kodcu","3","3"},
                  {"4","Mete","Daskýn","4","4"},
                  {"5","Süleyman","Çakýr","5","5"},
        };

         JTable table=new JTable(cells,columns);
         table.setBounds(70, 300, 350, 130); 
         pencere2.add(new JScrollPane(table));
         pencere2.setVisible(true);
        	    
         
        
         pencere2.addWindowListener((WindowListener) new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 super.windowClosing(e);
                 pencere2.dispose(); //System.exit(0);
                                                      }

                        
         });
	    }
	    });
	    

	    JButton button4 = new JButton("Öðretmen Listeleme");
	    button4.setBounds(160, 500, 150, 50);
	    pencere.add(button4);
	    
	    button4.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
	    
	     Frame pencere4 = new Frame();
		 pencere4.setTitle("Listeleme");
		 pencere4.setVisible(true);
		 pencere4.setSize(500,700);
         pencere4.setVisible(true);
         
         String[] columns=new String[]
                 {"ogretmenID","adi","soyad","dersID","ogrnoID"};

         String[][] cells=new String[][]{
                  {"1","Ahmet","Aydýn","1","1"},
                  {"2","Mehmet","Yakup","2","2"},
                  {"3","Selim","Kalender","3","3"},
                  {"4","Ýlayda","Sabuncu","4","4"},
                  {"5","Yasemin","Ziya","5","5"}};

         JTable table=new JTable(cells,columns);
         table.setBounds(60, 300, 350, 150); 
         pencere4.add(new JScrollPane(table));
         pencere4.setVisible(true);
        	    
         
            
         pencere4.addWindowListener((WindowListener) new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 super.windowClosing(e);
                 pencere4.dispose(); //System.exit(0);
                                                      }

                        
         });
	    }
	    });
        
	   
	pencere.setLayout(null);
            pencere.setLocationRelativeTo(null);
            pencere.setVisible(true);

            pencere.addWindowListener((WindowListener) new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                    pencere.dispose(); 
                    
                    
                }
	         });
		    }
		    });
	    
		    
	
		    pencere0.addWindowListener((WindowListener) new WindowAdapter() {
	             @Override
	             public void windowClosing(WindowEvent e) {
	                 super.windowClosing(e);
	                 pencere0.dispose(); 
	               
	                 
	             }
	         });
		    }
}
		   
	              
		
	     
		    
		
		    
		
           

	    



