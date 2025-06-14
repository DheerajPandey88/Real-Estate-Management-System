
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class PROPERTY_IMAGES_WINDOW extends javax.swing.JFrame {

    /**
     * Creates new form PROPERTY_IMAGES_WINDOW
     */
    
        P_TYPE type = new P_TYPE();
       HashMap<String , Integer> map = type.getTypesMap();
       String property_image_path ="";
       int propertyId = 0;
       
    public PROPERTY_IMAGES_WINDOW() {
        initComponents();
        
        //set border to the jpanel title
        Border panel_title_border = BorderFactory.createMatteBorder(0, 0, 3, 0, Color.white);
        jPanel_Title.setBorder(panel_title_border);
        
         //seta white border to the jlabel image
        Border jlabel_image_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_Image.setBorder(jlabel_image_border);
        
        //populate the combobox with type name
        bindCombo();
        
        //when the form show up
        //populate the jtable with all the properties
        fillJtableWithPropertiesData();
        
        // change the jtable row heigth
            jTable_properties.setRowHeight(40);
            //change the jtable selection background
            jTable_properties.setSelectionBackground(Color.green);
            //change the "ID" column width
            jTable_properties.getColumnModel().getColumn(0).setPreferredWidth(25);
            //change the "Address" column width
            jTable_properties.getColumnModel().getColumn(1).setPreferredWidth(250);
    }
    
    //create a function to populate the jcombox with types data
        public void bindCombo()
        {
            for(String s: map.keySet())
            {
                jComboBox_types.addItem(s);
            }
        }
        
        //create function to populate the jtable with properties data
        public void fillJtableWithPropertiesData()
        {
            P_PROPERTY property = new P_PROPERTY();
            ArrayList<P_PROPERTY> propertyList =property.propertiesList();

            //the jtable colunms
            String[] colNames = {"id","address"};
            
            //the jtable row
            //ownersList.size() =the size of the arrayList
            // 6= the number of colunms
            Object[][] rows = new Object[propertyList.size()][14];
            
            //add data form the list to the rows
            for(int i = 0; i < propertyList.size(); i++)
            {
                rows[i][0] = propertyList.get(i).getId();
                rows[i][1] = propertyList.get(i).getAddress();
            }
            
            DefaultTableModel model = new DefaultTableModel (rows,colNames);
            jTable_properties.setModel(model);
            
            
        }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Title = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_Add_Image = new javax.swing.JButton();
        jButton_Show_Images = new javax.swing.JButton();
        jButton_Remove_Image = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_types = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_properties = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton_Browse_Image = new javax.swing.JButton();
        jLabel_Image = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel_Title.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Property-Images");

        javax.swing.GroupLayout jPanel_TitleLayout = new javax.swing.GroupLayout(jPanel_Title);
        jPanel_Title.setLayout(jPanel_TitleLayout);
        jPanel_TitleLayout.setHorizontalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addGap(414, 414, 414)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_TitleLayout.setVerticalGroup(
            jPanel_TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton_Add_Image.setBackground(new java.awt.Color(0, 153, 51));
        jButton_Add_Image.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_Image.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Image.setText("Add");
        jButton_Add_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ImageActionPerformed(evt);
            }
        });

        jButton_Show_Images.setBackground(new java.awt.Color(0, 153, 255));
        jButton_Show_Images.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Show_Images.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Show_Images.setText("Show This Property Images");
        jButton_Show_Images.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Show_Images.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Show_ImagesActionPerformed(evt);
            }
        });

        jButton_Remove_Image.setBackground(new java.awt.Color(255, 51, 51));
        jButton_Remove_Image.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Remove_Image.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Remove_Image.setText("Remove");
        jButton_Remove_Image.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Remove_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Remove_ImageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select a Type:");

        jComboBox_types.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox_types.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_typesActionPerformed(evt);
            }
        });

        jTable_properties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_properties.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_propertiesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_properties);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select a Image:");

        jButton_Browse_Image.setBackground(new java.awt.Color(255, 255, 0));
        jButton_Browse_Image.setText("browse");
        jButton_Browse_Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Browse_ImageActionPerformed(evt);
            }
        });

        jLabel_Image.setBackground(new java.awt.Color(255, 204, 204));
        jLabel_Image.setOpaque(true);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jList1.setPreferredSize(new java.awt.Dimension(340, 90));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<html>* This table contains the properties id and address <br>"
            + "                      click on the button to show the images slider.</html>");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        //make the jlabel multiline
        jLabel6.setText("<html>* This table contains the images id<br> of the selected property.<br> (select the property from the table)</html>");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<html>* Select an item from the list to display <br>"
            +"                         or browse an image from your computer.</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox_types, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton_Show_Images, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                        .addComponent(jButton_Remove_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Browse_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Add_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Browse_Image))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Remove_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Show_Images, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Add_Image, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Add_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ImageActionPerformed
        
        //add images to the property
        //you can add multiple images to a property
        //we need to get the property id from the jtable
        P_PROPERTY property = new P_PROPERTY();
        
        if(propertyId !=0)
        {
            
                if(property.addImage(propertyId, property_image_path))            
                {
                    JOptionPane.showMessageDialog(null, "Image Added To This Property","Add Image",1);
                }else
                {
                    JOptionPane.showMessageDialog(null, "Image Not Added To This Property","Add Image",2);
                }          
        }else
        {
            JOptionPane.showMessageDialog(null, "Selected The  Property First","Property Not Selected",2);
        }
    }//GEN-LAST:event_jButton_Add_ImageActionPerformed

    private void jButton_Show_ImagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Show_ImagesActionPerformed
        
        try{
            
                // set the property id
                    int rowIndex = jTable_properties.getSelectedRow();
                    int id = Integer.valueOf(jTable_properties.getValueAt(rowIndex, 0).toString());//get the id form
                   
                    //first check if this property contains images
                    //we will use the jlist to do that
                    if (jList1.getModel().getSize() > 0)
                    {
                        //show the selected property images in a slider
                        //and the id to the slider form
                        PROPERTY_IMAGES_SLIDER imagesSliderform=new  PROPERTY_IMAGES_SLIDER(id);
                        imagesSliderform.setVisible(true);
                        imagesSliderform.pack();
                        imagesSliderform.setLocationRelativeTo(null);
                        imagesSliderform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    }   
                    else
                    {
                        JOptionPane.showMessageDialog(null, " This  Property Doesn't Have Any Image To Show","No Images Found",2);
 
                    }
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(null, "Selected The  Property First","Property Not Selected",2);

        }                           
    }//GEN-LAST:event_jButton_Show_ImagesActionPerformed

    private void jButton_Remove_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Remove_ImageActionPerformed

        try{
            //remove the selected image
        String selectedListItem = String.valueOf(jList1.getSelectedValue());
        Integer imageId = Integer.valueOf(selectedListItem);
        //show a confirmation message before deleting the type
        int yes_or_on =JOptionPane.showConfirmDialog(null, "Do You Realywant To Delete This  Image","Delete Image",JOptionPane.YES_NO_OPTION);
  
          if(yes_or_on == JOptionPane.YES_OPTION)
                {
                    if(new P_PROPERTY().removePropertyImage(imageId))
                    {
                        JOptionPane.showMessageDialog(null,"Property Image Deleted ", "Delete Image",1);
                        jLabel_Image.setIcon(null);
                         
                     }else
                    {
                        JOptionPane.showMessageDialog(null,"Operation Failed ,Image Not Deleted", "Delete Image",2);
                    }
                }
        }
        catch(Exception ex)
        {
               JOptionPane.showMessageDialog(null,"No Image Selected", "Delete Image",2);
        }
    }//GEN-LAST:event_jButton_Remove_ImageActionPerformed

    //create a function to resize the image to the jlabel
    //make this  function allow a byte[] param
    public ImageIcon resizeImage(String path, byte[] byteImage)
    {
        ImageIcon pic;
        if(byteImage !=null) pic = new ImageIcon(byteImage);
        else pic = new ImageIcon(path);
        
        Image img = pic.getImage().getScaledInstance(jLabel_Image.getWidth(), jLabel_Image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img);
        return image;
    }
    
    private void jButton_Browse_ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Browse_ImageActionPerformed
        
     // browse images from the computer
     JFileChooser fileChooser =new JFileChooser();
     fileChooser.setDialogTitle("Select The Property Image");
     //F:\\image =is where my images are loacated
     //image from pixabay.com
     //all file size is a 1kb to 50kb only image size
     //all height*length image horizental 500 and virtical 500 only
     fileChooser.setCurrentDirectory(new File("C:\\Users\\rkk04\\OneDrive\\Documents\\NetBeansProjects\\images"));
     
     //file extension
     FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Images",".jpeg",".png",".jpg");
     fileChooser.addChoosableFileFilter(fileFilter);
     
     int fileState = fileChooser.showSaveDialog(null);
     
     if(fileState == JFileChooser.APPROVE_OPTION)
     {
         String path = fileChooser.getSelectedFile().getAbsolutePath();
         jLabel_Image.setIcon(resizeImage(path,null));
         property_image_path =path;
     }
     
    }//GEN-LAST:event_jButton_Browse_ImageActionPerformed

    private void jComboBox_typesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_typesActionPerformed
        
        //show properties in the jtabel dependeing on the selected type
        int typeId = map.get(jComboBox_types.getSelectedItem().toString());
        P_PROPERTY property = new P_PROPERTY();
            ArrayList<P_PROPERTY> propertyList =property.propertiesListByType(typeId);

            //the jtable colunms
            String[] colNames = {"id","address"};
            
            //the jtable row
            //ownersList.size() =the size of the arrayList
            // 6= the number of colunms
            Object[][] rows = new Object[propertyList.size()][14];
            
            //add data form the list to the rows
            for(int i = 0; i < propertyList.size(); i++)
            {
                rows[i][0] = propertyList.get(i).getId();
                rows[i][1] = propertyList.get(i).getAddress();
            }
            
            DefaultTableModel model = new DefaultTableModel (rows,colNames);
            jTable_properties.setModel(model);
        
    }//GEN-LAST:event_jComboBox_typesActionPerformed

    private void jTable_propertiesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_propertiesMouseClicked

        // get the property id from the jtable
        //get the selected row index
        int rowIndex = jTable_properties.getSelectedRow();
        propertyId =Integer.valueOf(jTable_properties.getValueAt(rowIndex, 0).toString());
        
        //display the selected property images list in the jlist
        
         fillTypeList();  
    }//GEN-LAST:event_jTable_propertiesMouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
       
        //try and catch if the list is empty
        try
        {
            
            //display the selected images from the list to jlabel
            //we can use the hashmap if we want like in the property windoe
            //but here instead will create a  function to the image by id
            String selectedListItem = String.valueOf(jList1.getSelectedValue());
            Integer imageId = Integer.valueOf(selectedListItem);
            byte[] image = new P_PROPERTY().getImageById(imageId);
            jLabel_Image.setIcon(resizeImage("",image));
        }catch(Exception ex)
        {
            //nothing
            //or a new black hole
        }
        
        
    }//GEN-LAST:event_jList1MouseClicked

    //create a function to populate the Jlist with the selected property imagesId
    public void fillTypeList()
    {
        HashMap<byte[], Integer> imagesListMap = new P_PROPERTY().propertyImagesList(propertyId);
        
        DefaultListModel listModel = new DefaultListModel();
        
        int i;
        i = 0;
        
        for(Integer id: imagesListMap.values())
        {
            listModel.add(i, id);
            i++;
        }
        jList1.setModel(listModel);
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROPERTY_IMAGES_WINDOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PROPERTY_IMAGES_WINDOW().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Image;
    private javax.swing.JButton jButton_Browse_Image;
    private javax.swing.JButton jButton_Remove_Image;
    private javax.swing.JButton jButton_Show_Images;
    private javax.swing.JComboBox<String> jComboBox_types;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Image;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Title;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_properties;
    // End of variables declaration//GEN-END:variables
}
