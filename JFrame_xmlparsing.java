package xmlparsing_sobhana;


import java.awt.*;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

public class JFrame_xmlparsing extends javax.swing.JFrame {
public String xmlFile="";
public static int countCount=0;
public static int countTitle=0;
public static int countbook=0;
public static int countPrice=0;
public static int c=0;

public JFrame_xmlparsing() {
        initComponents();
        {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1select_file = new javax.swing.JLabel();
        jButton1browse_file = new javax.swing.JButton();
        jButton2StartParsing = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1select_file.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1select_file.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1select_file.setText("Please Select Xml File:");

        jButton1browse_file.setBackground(new java.awt.Color(204, 204, 255));
        jButton1browse_file.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1browse_file.setText("Browse Xml File..");
        jButton1browse_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1browse_fileActionPerformed(evt);
            }
        });

        jButton2StartParsing.setBackground(new java.awt.Color(204, 204, 255));
        jButton2StartParsing.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2StartParsing.setText("Start Reading the selected file..");
        jButton2StartParsing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2StartParsingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Book Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Book Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Book Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Ordered Copies:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Ordered Copies:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Ordered Copies:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Following is the name and price of the book which got maximum number of orders:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Ordered Copies:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Book Title:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel11.setText("Book Price:");

        jLabel12.setBackground(new java.awt.Color(153, 153, 255));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Following is the number of copies ordered for a particular book:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1select_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1browse_file, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(319, 319, 319))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(338, 338, 338))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2StartParsing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField3))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField2))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField1)))
                                                .addGap(108, 108, 108)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField7))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField5))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextField4)))
                                                .addGap(259, 259, 259))
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE))
                                        .addGap(47, 47, 47))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextField8)
                                        .addGap(162, 162, 162)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextField10)
                                        .addGap(162, 162, 162)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)))))
                        .addGap(63, 63, 63))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(351, 351, 351)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(772, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1browse_file)
                    .addComponent(jLabel1select_file))
                .addGap(30, 30, 30)
                .addComponent(jButton2StartParsing)
                .addGap(55, 55, 55)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(jLabel8)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(195, 195, 195)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(457, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void jButton1browse_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1browse_fileActionPerformed
       try{
            JFileChooser jFileChooser= new JFileChooser("E:\\java code practice\\XMLparsing_Sobhana\\src\\Order.xml");
            jFileChooser.setDialogTitle("Please Select XML File.");
            jFileChooser.setFileFilter(new FileTypeFilter(".xml","XML File"));
            int result= jFileChooser.showSaveDialog(null);
            if (result== jFileChooser.APPROVE_OPTION)
                {
                    xmlFile= jFileChooser.getSelectedFile().getAbsolutePath();
                }
          
            
             }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Can't select XML file");
                    
                    
        }
      
    }//GEN-LAST:event_jButton1browse_fileActionPerformed

    private void jButton2StartParsingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2StartParsingActionPerformed
       
String priceArray[] = new String[10]; 
Integer countArray[] = new Integer[10]; 
String titleArray[] = new String[10];
Integer bookArray[] = new Integer[10];
String count[] = new String[10];

try {
 
	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();
 
	DefaultHandler handler = new DefaultHandler() {
 
	boolean bcount = false;
	boolean bprice = false;
	boolean bbook = false;
	boolean bisbn = false;
        boolean btitle = false;
        boolean bauthors = false;
        boolean bauthor = false;
        boolean bmanufacturer = false;
        boolean bmodel = false;
        boolean bstandard_feature = false;
        

 
	public void startElement(String uri, String localName,String qName, 
                Attributes attributes) throws SAXException {
 
		System.out.println("Start Element :" + qName);
 
		if (qName.equalsIgnoreCase("COUNT")) {
			bcount = true;
		}
 
		if (qName.equalsIgnoreCase("PRICE")) {
			bprice = true;
		}
 
		if (qName.equalsIgnoreCase("BOOK")) {
			bbook = true;
                        
		}
                if (qName.equalsIgnoreCase("ISBN")) {
			bisbn = true;
		}
                if (qName.equalsIgnoreCase("TITLE")) {
			btitle = true;
		}
                 if (qName.equalsIgnoreCase("AUTHORS")) {
			bauthors = true;
		}
                if (qName.equalsIgnoreCase("AUTHOR")) {
			bauthor = true;
		}
                if (qName.equalsIgnoreCase("Manufacturer")) {
			bmanufacturer = true;
		}
                 if (qName.equalsIgnoreCase("MODEL")) {
			bmodel = true;
		}
                if (qName.equalsIgnoreCase("standard_feature")) {
			bstandard_feature = true;
		}
 
	}
 
	public void endElement(String uri, String localName,
		String qName) throws SAXException {
 
		System.out.println("End Element :" + qName);
 
	}
 
	public void characters(char ch[], int start, int length) throws SAXException {
char a=0; 
		if (bcount) {
                    
                    
                    String strbookCount =new String(ch, start, length);
                    
                   int bookCount=Integer.parseInt(strbookCount);  

                    
                        countArray[countCount] = bookCount;
                         countCount=countCount+1;
			System.out.println("Count : " + bookCount);
                       
                        c=bookCount;
                        
			bcount = false;
		}
 
		if (bprice) {
                    priceArray[countPrice] =new String(ch, start, length);
                    
                   

                    
                        
                         countPrice=countPrice+1;
			System.out.println("Price : " + new String(ch, start, length));
                       
			bprice = false;
		}
 
		if (bbook) {
                    
                        String bookNumber =new String(ch, start, length);
                        bookArray[countbook] =   c;
                        countbook=countbook+1;
                        
			//System.out.println("Book : " + bookprice);
			bbook = false;
		}
 
		if (bisbn) {
			System.out.println("ISBN : " + new String(ch, start, length));
                       
			bisbn = false;
		}
                
                if (btitle) {
                    
                    String booktitle =new String(ch, start, length);
                    
                    

                    
                        titleArray[countTitle] = booktitle;
                        countTitle=countTitle+1;
			System.out.println("Title : " + booktitle);
                       
			btitle = false;
		}
                
                if (bauthors) {
			//System.out.println("Authors : " + new String(ch, start, length));
			bauthors = false;
		}
                
                if (bauthor) {
			System.out.println("Author : " + new String(ch, start, length));
                     
			bauthor = false;
                }
                if (bmanufacturer) {
			System.out.println("Manufacturer : " + new String(ch, start, length));
			bmanufacturer = false;
		}
                
                if (bmodel) {
			System.out.println("Model : " + new String(ch, start, length));
			bmodel = false;
                }
                if (bstandard_feature) {
			System.out.println("Standard_feature : " + new String(ch, start, length));
			bstandard_feature = false;
                }
                
               
 
	}
         
     };
        
 
       saxParser.parse("src\\Order.xml", handler);
      
              //count the number copies ordered for a particular book.
       System.out.println("\n\nCount the number copies ordered for a particular book.\n");
       for(int i=0;i<bookArray.length;i++)  
       {
           if(bookArray[i]!=null)
               {System.out.println("\nBook Name= "+titleArray[i] +"  & Order Count Number : "
                       + bookArray[i]);
              
               }
       }
       
       jLabel12.setText("Following is the number of copies ordered for a particular book:");
         jTextField1.setText(titleArray[0]);
         jTextField2.setText(titleArray[1]);
         jTextField3.setText(titleArray[2]);
         String bC1=Integer.toString(bookArray[0]);
         String bC2=Integer.toString(bookArray[1]);
         String bC3=Integer.toString(bookArray[2]);
         jTextField4.setText(bC1);
         jTextField5.setText(bC2);
         jTextField7.setText(bC3);
       //The name and price of the book which got maximum number of orders
       System.out.println("\n\nThe name and price of the book which got maximum number of orders\n");
      jLabel8.setText("Following is the name and price of the book which got maximum number of orders:");
       jLabel9.setText("Ordered Copies:");
       jLabel10.setText("Book Title:");
       jLabel11.setText("Book Price:");
       int max = bookArray[0]; 
       for(int i=0;i<bookArray.length;i++)  
       {
           if(bookArray[i]!=null)
           { 
        
             if (bookArray[i] > max) 
                 max = bookArray[i]; 
        
           }
           
        }
       System.out.println("Maximum Number of orders: "+max);
       for(int i=0;i<bookArray.length;i++)
       {if(bookArray[i]!=null)
            {
                if(max==bookArray[i])
                {String MAX=Integer.toString(max);
                    jTextField8.setText(MAX);
                    jTextField9.setText(titleArray[i]);
                    jTextField10.setText(priceArray[i]);
                    System.out.println("Title of that book:   "+titleArray[i]+" & Price of that book:  "
                            +priceArray[i]);
                }
            }
       }
       
       
       
    }//GEN-LAST:event_jButton2StartParsingActionPerformed
catch (Exception e) {
       e.printStackTrace();
     }}

    
    
public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame_xmlparsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_xmlparsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_xmlparsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_xmlparsing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_xmlparsing().setVisible(true);
            }
        });
}
private static class handler {

        public handler() {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1browse_file;
    private javax.swing.JButton jButton2StartParsing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel1select_file;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private static class FileTypeFilter extends FileFilter {
        private final String extention;
        private final String description;
        public FileTypeFilter(String extention, String desription) {
            this.extention= extention;
            this.description= desription;
            
        }

        @Override
        public boolean accept(File file) {
            if (file.isDirectory())
                    {return true;
                    
                    }
            return file.getName().endsWith(extention);
        }

        @Override
        public String getDescription() {
           return description + String.format("(*%s)", extention);
        }
    }
}
