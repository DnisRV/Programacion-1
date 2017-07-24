/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.MouseEvent;
import java.lang.Override;

/**
 *
 * @author BILLY
 */
public class Nivel1 extends javax.swing.JFrame {

    JLabel mat [] [];
    int matriz [] [];
    Random aleatorio;
    int score =1;
    
    public Nivel1() {
        initComponents();
        
        setSize(567,390);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JLabel score1;
        
        score1 = new JLabel("score : "+ score);
        score1.setSize(160,100);
        score1.setLocation(490,-40);
        score1.setVisible(true);
        score1.setForeground(Color.white);
        this.add(score1,0);
        
        
        
        
        mat = new JLabel[10][10];
        matriz = new int [10] [10];
        aleatorio = new Random();
        
        
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat [i] [j] = new JLabel();
                mat [i] [j].setBounds(0+i*55, 0+j*50, 50, 50);
                matriz [i] [j] = aleatorio.nextInt(3)+1;
                mat [i] [j].setIcon(new ImageIcon("imagenes/" + matriz [i] [j] + ".png"));
                mat [i] [j].setVisible(true);
                this.add(mat [i] [j]);
            
                
             
        }
          
    }
       for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat [i][j].addMouseListener(new MouseAdapter (){
               
                   @Override
                   public void mouseClicked (MouseEvent click){
                    
                       for (int k = 0; k < mat.length; k++) {
                            for (int l = 0; l < mat.length; l++) {
                                if(mat[k][l] == click.getSource() ){
                                    
                                     funcionComer( k, l,matriz[k][l]);
                                     
//                                     moverLado();
                                    mover();
//                                    fin(k, l, matriz [k][l]);
                                    
                                }
                                
                            }} 
                       
                       
                        }
        
                        
                        
                    
                    
                    
                });
                    
                }
           
            }
       
        
    } 
    public void  funcionComer (int x,int y,int diamantes){
 
        mat [x] [y].setIcon(new ImageIcon("imagenes/" + matriz [x] [y] + ".png"));
if (x != 0) {
        if (matriz[x - 1][y] == diamantes) {
            matriz[x - 1][y] = -2;
            matriz[x][y] = -2;

        
            funcionComer(x-1, y, diamantes);
        }
    }

    if (x != 9) {
        if (matriz[x + 1][y] == diamantes) {
            matriz[x + 1][y] = -2;
            matriz[x][y] = -2;

            
            funcionComer(x+1, y,diamantes);
        }
    }

    if (y != 0) {
        if (matriz[x][y - 1] == diamantes) {
            matriz[x][y - 1] = -2;
            matriz[x][y] = -2;

            
            funcionComer(x, y-1, diamantes);
        }
    }

    if (y != 6) {
        if (matriz[x][y + 1] == diamantes) {
            matriz[x][y + 1] = -2;
            matriz[x][y] = -2;

            
            
            funcionComer(x, y+1,diamantes);
        }
    }
}
        
       
        
        
   
      
      

       
        
    
       

   
   
        
     public void mover(){
                        for (int m = 0; m < mat.length; m++) {
                            for (int k = 0; k < mat.length; k++) {
                         for (int l = 0; l < mat.length; l++) {
                                 if(l>0 && matriz[k][l]==-2){
                                 matriz[k][l]= matriz[k][l-1];
                                  matriz [k][l-1]= -2;
                 }
                    mat [k][l].setIcon(new ImageIcon("imagenes/" + matriz [k ][l] + ".png"));
                }
            }
       
         }
         
     }
     public void moverLado(){
         
         
         for (int m = 0; m < mat.length; m++) {
            
             
         
        
    for (int k= 0; k < mat.length; k++) {
                            for (int l = 0; l < mat.length; l++) {
                         
                                 if(k>0 && matriz [0][l]==-2){
                                 matriz[k][l]= matriz[k-1][l];
                                  matriz [k-1][l]= -2;
                 }
                    mat [k][l].setIcon(new ImageIcon("imagenes/" + matriz [k ][l] + ".png"));
                
            }
       }
         
         }
     
         
     }
     
    
           public void fin (int x,int y,int diamantes){
               Gameover over = new Gameover();
               mat [x] [y].setIcon(new ImageIcon("imagenes/" + matriz [x] [y] + ".png"));
               if( !(x<9 && matriz [x+1][y] == diamantes) && !(x>0 && matriz [x-1][y] == diamantes) && 
                       !(x>0 && matriz [x][y+1] == diamantes) && !(x<6 && matriz [x][y-1] == diamantes)){
                      over.setVisible(true); this.setVisible(false);
               
               }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jToolBar1 = new javax.swing.JToolBar();
        jToolBar2 = new javax.swing.JToolBar();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jSpinner1 = new javax.swing.JSpinner();
        jFrame1 = new javax.swing.JFrame();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        jLabel1.setText("Nivel 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel1)
                .addContainerGap(265, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToolBar1.setRollover(true);

        jToolBar2.setRollover(true);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Nivel1 nin1 = new Nivel1();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nivel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables

    

}

