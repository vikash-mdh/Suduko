
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.solver;
 
import javax.swing.JOptionPane;
import static java.awt.Color.*;
import javax.swing.*;
 
/**
 *
 * @author Admin
 */
public class Solver extends javax.swing.JFrame {
 
    private String turn  = "1";
    
    private boolean globalFlag = true;
    
    private String solvedBoard[][] = {
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };
    
    private void AssignTurn(JButton btn){
        selectionBtn1.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn2.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn3.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn4.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn5.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn6.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn7.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn8.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn9.setBackground(new java.awt.Color(54, 48, 98));
        
        btn.setBackground(new java.awt.Color(134,10,53));
    }
    
    private void ResetGame(){
        
        JButton predefinedBtns[]= {r2c1, r3c1,r3c3, r1c4, r2c5, r2c6, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5, r4c6, r6c4, r6c5,  r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3, r7c5, r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
        
        JButton btns[][] = {
            {r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8, r1c9},
            {r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8, r2c9},
            {r3c1, r3c2, r3c3, r3c4, r3c5, r3c6, r3c7, r3c8, r3c9},
            {r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8, r4c9},
            {r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8, r5c9},
            {r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8, r6c9},
            {r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8, r7c9},
            {r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8, r8c9},
            {r9c1, r9c2, r9c3, r9c4, r9c5, r9c6, r9c7, r9c8, r9c9},
        };
        
        for(int i =0; i<9; i++){
            for(int j =0; j<9; j++){
                boolean flag = true;
                
                for(int k =0; k<predefinedBtns.length; k++){
                    if(btns[i][j] == predefinedBtns[k]){
                        flag = false;
                    }
                }
                if(flag == true){
                    btns[i][j].setText("");             // make empty
                    btns[i][j].setForeground(new java.awt.Color(0,0,0));
                    btns[i][j].setBackground(new java.awt.Color(255,197,197));
                }
            }
        }
    }
    
    
    private void SeeSolution(){
        
        JButton predefinedBtns[]= {r2c1, r3c1,r3c3, r1c4, r2c5, r2c6, r1c7, r1c8, r1c9, r2c7, r2c9, r3c8, r5c2, r5c3, r6c2, r4c5, r4c6, r6c4, r6c5,  r4c8, r5c8, r5c7, r7c2, r8c1, r9c1, r9c2, r9c3, r7c5, r8c5, r9c6, r8c4, r7c7, r7c9, r8c9};
        
        JButton btns[][] = {
            {r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8, r1c9},
            {r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8, r2c9},
            {r3c1, r3c2, r3c3, r3c4, r3c5, r3c6, r3c7, r3c8, r3c9},
            {r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8, r4c9},
            {r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8, r5c9},
            {r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8, r6c9},
            {r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8, r7c9},
            {r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8, r8c9},
            {r9c1, r9c2, r9c3, r9c4, r9c5, r9c6, r9c7, r9c8, r9c9},
        };
        if(globalFlag == true){
            globalFlag = false;
            solBtn.setText("Hide Solution");
            for(int i=0; i<9; i++){
                for(int j =0; j<9; j++){
                    boolean flag = true;
                    for(int k =0; k<predefinedBtns.length; k++){
                        if(btns[i][j] == predefinedBtns[k]){
                            flag = false;
                        }
                    }
                    if(flag == true){
                        btns[i][j].setText(solvedBoard[i][j]);
                        btns[i][j].setBackground(white);
                        btns[i][j].setForeground(black);
                    }
                }
            }
        }
        else{
            solBtn.setText("Solution");
            globalFlag = true;
            ResetGame();
        }
        
    }
    
    private void Checkmoves(){
        JButton btns[][] = {
            {r1c1, r1c2, r1c3, r1c4, r1c5, r1c6, r1c7, r1c8, r1c9},
            {r2c1, r2c2, r2c3, r2c4, r2c5, r2c6, r2c7, r2c8, r2c9},
            {r3c1, r3c2, r3c3, r3c4, r3c5, r3c6, r3c7, r3c8, r3c9},
            {r4c1, r4c2, r4c3, r4c4, r4c5, r4c6, r4c7, r4c8, r4c9},
            {r5c1, r5c2, r5c3, r5c4, r5c5, r5c6, r5c7, r5c8, r5c9},
            {r6c1, r6c2, r6c3, r6c4, r6c5, r6c6, r6c7, r6c8, r6c9},
            {r7c1, r7c2, r7c3, r7c4, r7c5, r7c6, r7c7, r7c8, r7c9},
            {r8c1, r8c2, r8c3, r8c4, r8c5, r8c6, r8c7, r8c8, r8c9},
            {r9c1, r9c2, r9c3, r9c4, r9c5, r9c6, r9c7, r9c8, r9c9},
        };
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(btns[i][j].getText() != solvedBoard[i][j] && btns[i][j].getText() != ""){
                    btns[i][j].setBackground(red);
                }
            }
        }
    }
    /**
     * Creates new form Sudokufile
     */
    public Solver() {
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
 
        jPanel12 = new javax.swing.JPanel();
        jButton151 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jButton155 = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        jButton157 = new javax.swing.JButton();
        jButton158 = new javax.swing.JButton();
        jButton159 = new javax.swing.JButton();
        jButton160 = new javax.swing.JButton();
        jButton161 = new javax.swing.JButton();
        jButton162 = new javax.swing.JButton();
        jButton163 = new javax.swing.JButton();
        jButton164 = new javax.swing.JButton();
        jButton165 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton166 = new javax.swing.JButton();
        jButton167 = new javax.swing.JButton();
        jButton168 = new javax.swing.JButton();
        jButton169 = new javax.swing.JButton();
        jButton170 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton173 = new javax.swing.JButton();
        jButton174 = new javax.swing.JButton();
        jButton175 = new javax.swing.JButton();
        jButton176 = new javax.swing.JButton();
        jButton177 = new javax.swing.JButton();
        jButton178 = new javax.swing.JButton();
        jButton179 = new javax.swing.JButton();
        jButton180 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        r1c1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        r1c3 = new javax.swing.JButton();
        r1c2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        r2c3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        r2c1 = new javax.swing.JButton();
        r2c2 = new javax.swing.JButton();
        r3c1 = new javax.swing.JButton();
        r3c2 = new javax.swing.JButton();
        r3c3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        r7c1 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        r8c3 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        r8c1 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        r9c1 = new javax.swing.JButton();
        r9c2 = new javax.swing.JButton();
        r9c3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        r4c1 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r4c2 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        r5c3 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        r5c1 = new javax.swing.JButton();
        r5c2 = new javax.swing.JButton();
        r6c1 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r6c3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        r1c4 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r1c5 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        r2c6 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r2c5 = new javax.swing.JButton();
        r3c4 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r3c6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        r4c4 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        r5c4 = new javax.swing.JButton();
        r5c5 = new javax.swing.JButton();
        r6c4 = new javax.swing.JButton();
        r6c5 = new javax.swing.JButton();
        r6c6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        r1c7 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        r1c9 = new javax.swing.JButton();
        r1c8 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        r2c9 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r3c8 = new javax.swing.JButton();
        r3c9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        r4c7 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        r4c9 = new javax.swing.JButton();
        r4c8 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        r5c9 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        r5c7 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r6c9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        r7c7 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        r7c9 = new javax.swing.JButton();
        r7c8 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        r8c9 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r8c8 = new javax.swing.JButton();
        r9c7 = new javax.swing.JButton();
        r9c8 = new javax.swing.JButton();
        r9c9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        r7c4 = new javax.swing.JButton();
        jButton182 = new javax.swing.JButton();
        jButton183 = new javax.swing.JButton();
        r7c6 = new javax.swing.JButton();
        r7c5 = new javax.swing.JButton();
        jButton186 = new javax.swing.JButton();
        jButton187 = new javax.swing.JButton();
        r8c6 = new javax.swing.JButton();
        jButton189 = new javax.swing.JButton();
        jButton190 = new javax.swing.JButton();
        r8c4 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        r9c4 = new javax.swing.JButton();
        r9c5 = new javax.swing.JButton();
        r9c6 = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        selectionBtn1 = new javax.swing.JButton();
        selectionBtn2 = new javax.swing.JButton();
        selectionBtn8 = new javax.swing.JButton();
        selectionBtn9 = new javax.swing.JButton();
        selectionBtn3 = new javax.swing.JButton();
        selectionBtn4 = new javax.swing.JButton();
        selectionBtn5 = new javax.swing.JButton();
        selectionBtn6 = new javax.swing.JButton();
        selectionBtn7 = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        solBtn = new javax.swing.JButton();
        movesBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
 
        jPanel12.setBackground(new java.awt.Color(248, 244, 236));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel12.setOpaque(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(146, 149));
 
        jButton151.setText("jButton1");
 
        jButton152.setText("jButton1");
 
        jButton153.setText("jButton1");
 
        jButton154.setText("jButton1");
 
        jButton155.setText("jButton1");
 
        jButton156.setText("jButton1");
 
        jButton157.setText("jButton1");
 
        jButton158.setText("jButton1");
 
        jButton159.setText("jButton1");
 
        jButton160.setText("jButton10");
 
        jButton161.setText("jButton12");
 
        jButton162.setText("jButton13");
 
        jButton163.setText("jButton14");
 
        jButton164.setText("jButton14");
 
        jButton165.setText("jButton14");
 
        jPanel13.setBackground(new java.awt.Color(248, 244, 236));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(146, 149));
 
        jButton166.setText("jButton1");
 
        jButton167.setText("jButton1");
 
        jButton168.setText("jButton1");
 
        jButton169.setText("jButton1");
 
        jButton170.setText("jButton1");
 
        jButton171.setText("jButton1");
 
        jButton172.setText("jButton1");
 
        jButton173.setText("jButton1");
 
        jButton174.setText("jButton1");
 
        jButton175.setText("jButton10");
 
        jButton176.setText("jButton12");
 
        jButton177.setText("jButton13");
 
        jButton178.setText("jButton14");
 
        jButton179.setText("jButton14");
 
        jButton180.setText("jButton14");
 
        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton176, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton178, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton177, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton169, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton175, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButton179, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton180, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton166, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton170, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton169, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton177, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton175, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton176, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton173, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton178, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton179, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton180, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton174, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton171, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton172, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton167, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton168, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton156, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton159, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton163, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton155, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton158, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton160, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton155, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton162, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton160, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton161, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton158, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton163, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton164, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton165, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton159, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton156, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton152, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton153, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 197, 197));
        setPreferredSize(new java.awt.Dimension(500, 630));
 
        jPanel1.setBackground(new java.awt.Color(248, 244, 236));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r1c1.setBackground(new java.awt.Color(255, 197, 197));
        r1c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });
 
        jButton2.setText("jButton1");
 
        jButton3.setText("jButton1");
 
        r1c3.setBackground(new java.awt.Color(255, 197, 197));
        r1c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });
 
        r1c2.setBackground(new java.awt.Color(255, 197, 197));
        r1c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });
 
        jButton6.setText("jButton1");
 
        jButton7.setText("jButton1");
 
        r2c3.setBackground(new java.awt.Color(255, 197, 197));
        r2c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });
 
        jButton9.setText("jButton1");
 
        jButton10.setText("jButton10");
 
        r2c1.setBackground(new java.awt.Color(170, 215, 217));
        r2c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c1.setText("4");
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });
 
        r2c2.setBackground(new java.awt.Color(255, 197, 197));
        r2c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });
 
        r3c1.setBackground(new java.awt.Color(170, 215, 217));
        r3c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c1.setText("7");
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });
 
        r3c2.setBackground(new java.awt.Color(255, 197, 197));
        r3c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });
 
        r3c3.setBackground(new java.awt.Color(170, 215, 217));
        r3c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c3.setText("6");
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r2c1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r3c1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel3.setBackground(new java.awt.Color(248, 244, 236));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r7c1.setBackground(new java.awt.Color(255, 197, 197));
        r7c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });
 
        jButton17.setText("jButton1");
 
        jButton18.setText("jButton1");
 
        r7c3.setBackground(new java.awt.Color(255, 197, 197));
        r7c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });
 
        r7c2.setBackground(new java.awt.Color(170, 215, 217));
        r7c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c2.setText("4");
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });
 
        jButton21.setText("jButton1");
 
        jButton22.setText("jButton1");
 
        r8c3.setBackground(new java.awt.Color(255, 197, 197));
        r8c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });
 
        jButton24.setText("jButton1");
 
        jButton25.setText("jButton10");
 
        r8c1.setBackground(new java.awt.Color(170, 215, 217));
        r8c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c1.setText("3");
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });
 
        r8c2.setBackground(new java.awt.Color(255, 197, 197));
        r8c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });
 
        r9c1.setBackground(new java.awt.Color(170, 215, 217));
        r9c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c1.setText("6");
        r9c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c1ActionPerformed(evt);
            }
        });
 
        r9c2.setBackground(new java.awt.Color(170, 215, 217));
        r9c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c2.setText("8");
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });
 
        r9c3.setBackground(new java.awt.Color(170, 215, 217));
        r9c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c3.setText("9");
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r9c1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(r7c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel4.setBackground(new java.awt.Color(248, 244, 236));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r4c1.setBackground(new java.awt.Color(255, 197, 197));
        r4c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });
 
        jButton32.setText("jButton1");
 
        jButton33.setText("jButton1");
 
        r4c3.setBackground(new java.awt.Color(255, 197, 197));
        r4c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });
 
        r4c2.setBackground(new java.awt.Color(255, 197, 197));
        r4c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });
 
        jButton36.setText("jButton1");
 
        jButton37.setText("jButton1");
 
        r5c3.setBackground(new java.awt.Color(170, 215, 217));
        r5c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c3.setText("4");
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });
 
        jButton39.setText("jButton1");
 
        jButton40.setText("jButton10");
 
        r5c1.setBackground(new java.awt.Color(255, 197, 197));
        r5c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });
 
        r5c2.setBackground(new java.awt.Color(170, 215, 217));
        r5c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c2.setText("3");
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });
 
        r6c1.setBackground(new java.awt.Color(255, 197, 197));
        r6c1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });
 
        r6c2.setBackground(new java.awt.Color(170, 215, 217));
        r6c2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c2.setText("6");
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });
 
        r6c3.setBackground(new java.awt.Color(255, 197, 197));
        r6c3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel7.setBackground(new java.awt.Color(248, 244, 236));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r1c4.setBackground(new java.awt.Color(170, 215, 217));
        r1c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c4.setText("5");
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });
 
        jButton77.setText("jButton1");
 
        jButton78.setText("jButton1");
 
        r1c6.setBackground(new java.awt.Color(255, 197, 197));
        r1c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });
 
        r1c5.setBackground(new java.awt.Color(255, 197, 197));
        r1c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });
 
        jButton81.setText("jButton1");
 
        jButton82.setText("jButton1");
 
        r2c6.setBackground(new java.awt.Color(170, 215, 217));
        r2c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c6.setText("8");
        r2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c6ActionPerformed(evt);
            }
        });
 
        jButton84.setText("jButton1");
 
        jButton85.setText("jButton10");
 
        r2c4.setBackground(new java.awt.Color(255, 197, 197));
        r2c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });
 
        r2c5.setBackground(new java.awt.Color(170, 215, 217));
        r2c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c5.setText("7");
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });
 
        r3c4.setBackground(new java.awt.Color(255, 197, 197));
        r3c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });
 
        r3c5.setBackground(new java.awt.Color(255, 197, 197));
        r3c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c5.setToolTipText("");
        r3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c5ActionPerformed(evt);
            }
        });
 
        r3c6.setBackground(new java.awt.Color(255, 197, 197));
        r3c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r3c4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel8.setBackground(new java.awt.Color(248, 244, 236));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r4c4.setBackground(new java.awt.Color(255, 197, 197));
        r4c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });
 
        jButton92.setText("jButton1");
 
        jButton93.setText("jButton1");
 
        r4c6.setBackground(new java.awt.Color(170, 215, 217));
        r4c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c6.setText("5");
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });
 
        r4c5.setBackground(new java.awt.Color(170, 215, 217));
        r4c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c5.setText("3");
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });
 
        jButton96.setText("jButton1");
 
        jButton97.setText("jButton1");
 
        r5c6.setBackground(new java.awt.Color(255, 197, 197));
        r5c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });
 
        jButton99.setText("jButton1");
 
        jButton100.setText("jButton10");
 
        r5c4.setBackground(new java.awt.Color(255, 197, 197));
        r5c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });
 
        r5c5.setBackground(new java.awt.Color(255, 197, 197));
        r5c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c5ActionPerformed(evt);
            }
        });
 
        r6c4.setBackground(new java.awt.Color(170, 215, 217));
        r6c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c4.setText("1");
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });
 
        r6c5.setBackground(new java.awt.Color(170, 215, 217));
        r6c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c5.setText("8");
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });
 
        r6c6.setBackground(new java.awt.Color(255, 197, 197));
        r6c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel9.setBackground(new java.awt.Color(248, 244, 236));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r1c7.setBackground(new java.awt.Color(170, 215, 217));
        r1c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c7.setText("7");
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });
 
        jButton107.setText("jButton1");
 
        jButton108.setText("jButton1");
 
        r1c9.setBackground(new java.awt.Color(170, 215, 217));
        r1c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c9.setText("4");
        r1c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c9ActionPerformed(evt);
            }
        });
 
        r1c8.setBackground(new java.awt.Color(170, 215, 217));
        r1c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r1c8.setText("3");
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });
 
        jButton111.setText("jButton1");
 
        jButton112.setText("jButton1");
 
        r2c9.setBackground(new java.awt.Color(170, 215, 217));
        r2c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c9.setText("9");
        r2c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c9ActionPerformed(evt);
            }
        });
 
        jButton114.setText("jButton1");
 
        jButton115.setText("jButton10");
 
        r2c7.setBackground(new java.awt.Color(170, 215, 217));
        r2c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c7.setText("5");
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });
 
        r2c8.setBackground(new java.awt.Color(255, 197, 197));
        r2c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });
 
        r3c7.setBackground(new java.awt.Color(255, 197, 197));
        r3c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });
 
        r3c8.setBackground(new java.awt.Color(170, 215, 217));
        r3c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c8.setText("2");
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });
 
        r3c9.setBackground(new java.awt.Color(255, 197, 197));
        r3c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r3c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c9ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r3c7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel10.setBackground(new java.awt.Color(248, 244, 236));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r4c7.setBackground(new java.awt.Color(255, 197, 197));
        r4c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });
 
        jButton122.setText("jButton1");
 
        jButton123.setText("jButton1");
 
        r4c9.setBackground(new java.awt.Color(255, 197, 197));
        r4c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c9ActionPerformed(evt);
            }
        });
 
        r4c8.setBackground(new java.awt.Color(170, 215, 217));
        r4c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r4c8.setText("9");
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });
 
        jButton126.setText("jButton1");
 
        jButton127.setText("jButton1");
 
        r5c9.setBackground(new java.awt.Color(255, 197, 197));
        r5c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c9ActionPerformed(evt);
            }
        });
 
        jButton129.setText("jButton1");
 
        jButton130.setText("jButton10");
 
        r5c7.setBackground(new java.awt.Color(170, 215, 217));
        r5c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c7.setText("2");
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });
 
        r5c8.setBackground(new java.awt.Color(170, 215, 217));
        r5c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r5c8.setText("8");
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });
 
        r6c7.setBackground(new java.awt.Color(255, 197, 197));
        r6c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });
 
        r6c8.setBackground(new java.awt.Color(255, 197, 197));
        r6c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });
 
        r6c9.setBackground(new java.awt.Color(255, 197, 197));
        r6c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r6c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c9ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6c7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton130, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton126, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton122, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel11.setBackground(new java.awt.Color(248, 244, 236));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r7c7.setBackground(new java.awt.Color(170, 215, 217));
        r7c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c7.setText("9");
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });
 
        jButton137.setText("jButton1");
 
        jButton138.setText("jButton1");
 
        r7c9.setBackground(new java.awt.Color(170, 215, 217));
        r7c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c9.setText("6");
        r7c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c9ActionPerformed(evt);
            }
        });
 
        r7c8.setBackground(new java.awt.Color(255, 197, 197));
        r7c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });
 
        jButton141.setText("jButton1");
 
        jButton142.setText("jButton1");
 
        r8c9.setBackground(new java.awt.Color(170, 215, 217));
        r8c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c9.setText("2");
        r8c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c9ActionPerformed(evt);
            }
        });
 
        jButton144.setText("jButton1");
 
        jButton145.setText("jButton10");
 
        r8c7.setBackground(new java.awt.Color(255, 197, 197));
        r8c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });
 
        r8c8.setBackground(new java.awt.Color(255, 197, 197));
        r8c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });
 
        r9c7.setBackground(new java.awt.Color(255, 197, 197));
        r9c7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });
 
        r9c8.setBackground(new java.awt.Color(255, 197, 197));
        r9c8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c8ActionPerformed(evt);
            }
        });
 
        r9c9.setBackground(new java.awt.Color(255, 197, 197));
        r9c9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c9ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r9c7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton145, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton137, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton138, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        jPanel14.setBackground(new java.awt.Color(248, 244, 236));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 52, 132), 2, true));
        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(146, 149));
 
        r7c4.setBackground(new java.awt.Color(255, 197, 197));
        r7c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });
 
        jButton182.setText("jButton1");
 
        jButton183.setText("jButton1");
 
        r7c6.setBackground(new java.awt.Color(255, 197, 197));
        r7c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });
 
        r7c5.setBackground(new java.awt.Color(170, 215, 217));
        r7c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r7c5.setText("5");
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });
 
        jButton186.setText("jButton1");
 
        jButton187.setText("jButton1");
 
        r8c6.setBackground(new java.awt.Color(255, 197, 197));
        r8c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });
 
        jButton189.setText("jButton1");
 
        jButton190.setText("jButton10");
 
        r8c4.setBackground(new java.awt.Color(170, 215, 217));
        r8c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c4.setText("9");
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });
 
        r8c5.setBackground(new java.awt.Color(170, 215, 217));
        r8c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r8c5.setText("6");
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });
 
        r9c4.setBackground(new java.awt.Color(255, 197, 197));
        r9c4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c4ActionPerformed(evt);
            }
        });
 
        r9c5.setBackground(new java.awt.Color(255, 197, 197));
        r9c5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });
 
        r9c6.setBackground(new java.awt.Color(170, 215, 217));
        r9c6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        r9c6.setText("1");
        r9c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c6ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton182, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton183, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton186, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton187, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton189, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r9c4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                .addGap(98, 98, 98)
                                .addComponent(jButton190, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton190, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton189, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton186, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton187, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jButton182, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButton183, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
 
        resetBtn.setBackground(new java.awt.Color(87, 10, 87));
        resetBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(251, 249, 241));
        resetBtn.setText("Reset");
        resetBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetBtn.setBorderPainted(false);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
 
        selectionBtn1.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn1.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn1.setText("1");
        selectionBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn1ActionPerformed(evt);
            }
        });
 
        selectionBtn2.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn2.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn2.setText("2");
        selectionBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn2ActionPerformed(evt);
            }
        });
 
        selectionBtn8.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn8.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn8.setText("8");
        selectionBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn8ActionPerformed(evt);
            }
        });
 
        selectionBtn9.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn9.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn9.setText("9");
        selectionBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn9ActionPerformed(evt);
            }
        });
 
        selectionBtn3.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn3.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn3.setText("3");
        selectionBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn3ActionPerformed(evt);
            }
        });
 
        selectionBtn4.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn4.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn4.setText("4");
        selectionBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn4ActionPerformed(evt);
            }
        });
 
        selectionBtn5.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn5.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn5.setText("5");
        selectionBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn5ActionPerformed(evt);
            }
        });
 
        selectionBtn6.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn6.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn6.setText("6");
        selectionBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn6ActionPerformed(evt);
            }
        });
 
        selectionBtn7.setBackground(new java.awt.Color(54, 48, 98));
        selectionBtn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        selectionBtn7.setForeground(new java.awt.Color(245, 232, 199));
        selectionBtn7.setText("7");
        selectionBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBtn7ActionPerformed(evt);
            }
        });
 
        exitBtn.setBackground(new java.awt.Color(87, 10, 87));
        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(251, 249, 241));
        exitBtn.setText("Exit");
        exitBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitBtn.setBorderPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
 
        solBtn.setBackground(new java.awt.Color(87, 10, 87));
        solBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        solBtn.setForeground(new java.awt.Color(251, 249, 241));
        solBtn.setText("Solution");
        solBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        solBtn.setBorderPainted(false);
        solBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solBtnActionPerformed(evt);
            }
        });
 
        movesBtn.setBackground(new java.awt.Color(87, 10, 87));
        movesBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movesBtn.setForeground(new java.awt.Color(251, 249, 241));
        movesBtn.setText("Check Moves");
        movesBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        movesBtn.setBorderPainted(false);
        movesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movesBtnActionPerformed(evt);
            }
        });
 
        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("    SUDOKU PUZZLE");
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectionBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectionBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectionBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectionBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selectionBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(solBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectionBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(selectionBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(selectionBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(movesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
 
        pack();
    }// </editor-fold>                        
 
    private void selectionBtn3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn3);
        turn="3";
    }                                             
 
    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c8.setText(turn);
        r2c8.setBackground(new java.awt.Color(199,220,167));
        r2c8.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c2.setText(turn);
        r2c2.setBackground(new java.awt.Color(199,220,167));
        r2c2.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c1.setText(turn);
        r1c1.setBackground(new java.awt.Color(199,220,167));
        r1c1.setForeground(new java.awt.Color(119,67,219));
        
    }                                    
 
    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c2.setText(turn);
        r1c2.setBackground(new java.awt.Color(199,220,167));
        r1c2.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c3.setText(turn);
        r1c3.setBackground(new java.awt.Color(199,220,167));
        r1c3.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c3.setText(turn);
        r2c3.setBackground(new java.awt.Color(199,220,167));
        r2c3.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c5.setText(turn);
        r1c5.setBackground(new java.awt.Color(199,220,167));
        r1c5.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r1c6.setText(turn);
        r1c6.setBackground(new java.awt.Color(199,220,167));
        r1c6.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r2c4.setText(turn);
        r2c4.setBackground(new java.awt.Color(199,220,167));
        r2c4.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c2.setText(turn);
        r3c2.setBackground(new java.awt.Color(199,220,167));
        r3c2.setForeground(new java.awt.Color(119,67,219));
        
    }                                    
 
    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c4.setText(turn);
        r3c4.setBackground(new java.awt.Color(199,220,167));
        r3c4.setForeground(new java.awt.Color(119,67,219));
        
    }                                    
 
    private void r3c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c5.setText(turn);
        r3c5.setBackground(new java.awt.Color(199,220,167));
        r3c5.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c6.setText(turn);
        r3c6.setBackground(new java.awt.Color(199,220,167));
        r3c6.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c7.setText(turn);
        r3c7.setBackground(new java.awt.Color(199,220,167));
        r3c7.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r3c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r3c9.setText(turn);
        r3c9.setBackground(new java.awt.Color(199,220,167));
        r3c9.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c1.setText(turn);
        r4c1.setBackground(new java.awt.Color(199,220,167));
        r4c1.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c2.setText(turn);
        r4c2.setBackground(new java.awt.Color(199,220,167));
        r4c2.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c3.setText(turn);
        r4c3.setBackground(new java.awt.Color(199,220,167));
        r4c3.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c4.setText(turn);
        r4c4.setBackground(new java.awt.Color(199,220,167));
        r4c4.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c7.setText(turn);
        r4c7.setBackground(new java.awt.Color(199,220,167));
        r4c7.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r4c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r4c9.setText(turn);
        r4c9.setBackground(new java.awt.Color(199,220,167));
        r4c9.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r5c1.setText(turn);
        r5c1.setBackground(new java.awt.Color(199,220,167));
        r5c1.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r5c4.setText(turn);
        r5c4.setBackground(new java.awt.Color(199,220,167));
        r5c4.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r5c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r5c5.setText(turn);
        r5c5.setBackground(new java.awt.Color(199,220,167));
        r5c5.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r5c6.setText(turn);
        r5c6.setBackground(new java.awt.Color(199,220,167));
        r5c6.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r5c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r5c9.setText(turn);
        r5c9.setBackground(new java.awt.Color(199,220,167));
        r5c9.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c1.setText(turn);
        r6c1.setBackground(new java.awt.Color(199,220,167));
        r6c1.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c3.setText(turn);
        r6c3.setBackground(new java.awt.Color(199,220,167));
        r6c3.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c6.setText(turn);
        r6c6.setBackground(new java.awt.Color(199,220,167));
        r6c6.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c7.setText(turn);
        r6c7.setBackground(new java.awt.Color(199,220,167));
        r6c7.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c8.setText(turn);
        r6c8.setBackground(new java.awt.Color(199,220,167));
        r6c8.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r6c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r6c9.setText(turn);
        r6c9.setBackground(new java.awt.Color(199,220,167));
        r6c9.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r7c1.setText(turn);
        r7c1.setBackground(new java.awt.Color(199,220,167));
        r7c1.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r7c3.setText(turn);
        r7c3.setBackground(new java.awt.Color(199,220,167));
        r7c3.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r7c4.setText(turn);
        r7c4.setBackground(new java.awt.Color(199,220,167));
        r7c4.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r7c6.setText(turn);
        r7c6.setBackground(new java.awt.Color(199,220,167));
        r7c6.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r7c8.setText(turn);
        r7c8.setBackground(new java.awt.Color(199,220,167));
        r7c8.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c2.setText(turn);
        r8c2.setBackground(new java.awt.Color(199,220,167));
        r8c2.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c3.setText(turn);
        r8c3.setBackground(new java.awt.Color(199,220,167));
        r8c3.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c6.setText(turn);
        r8c6.setBackground(new java.awt.Color(199,220,167));
        r8c6.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c7.setText(turn);
        r8c7.setBackground(new java.awt.Color(199,220,167));
        r8c7.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r8c8.setText(turn);
        r8c8.setBackground(new java.awt.Color(199,220,167));
        r8c8.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r9c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c8.setText(turn);
        r9c8.setBackground(new java.awt.Color(199,220,167));
        r9c8.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r9c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c9.setText(turn);
        r9c9.setBackground(new java.awt.Color(199,220,167));
        r9c9.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c5.setText(turn);
        r9c5.setBackground(new java.awt.Color(199,220,167));
        r9c5.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void r9c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c4.setText(turn);
        r9c4.setBackground(new java.awt.Color(199,220,167));
        r9c4.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void selectionBtn1ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn1);
        turn="1";
    }                                             
 
    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r9c1ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r2c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r9c6ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r1c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r2c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r7c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void r8c9ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
           JOptionPane.showMessageDialog(this, "The place is already allocated", "Attention!", JOptionPane.INFORMATION_MESSAGE);
    }                                    
 
    private void selectionBtn2ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn2);
        turn="2";
    }                                             
 
    private void selectionBtn5ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn5);
        turn="5";
    }                                             
 
    private void selectionBtn4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn4);
        turn="4";
    }                                             
 
    private void selectionBtn6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn6);
        turn="6";
    }                                             
 
    private void selectionBtn7ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn7);
        turn="7";
    }                                             
 
    private void selectionBtn8ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn8);
        turn="8";
    }                                             
 
    private void selectionBtn9ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
        AssignTurn(selectionBtn9);
        turn="9";
    }                                             
 
    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        r9c7.setText(turn);
        r9c7.setBackground(new java.awt.Color(199,220,167));
        r9c7.setForeground(new java.awt.Color(119,67,219));
    }                                    
 
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to reset the game", "Sudoku Puzzle", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }                                       
 
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        JFrame frame = new JFrame("Reset");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to reset the game", "Sudoku Puzzle", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            ResetGame();
        }
    }                                        
 
    private void solBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        SeeSolution();
    }                                      
 
    private void movesBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        Checkmoves();
        
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
            java.util.logging.Logger.getLogger(Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Solver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Solver().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify                     
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    private javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton155;
    private javax.swing.JButton jButton156;
    private javax.swing.JButton jButton157;
    private javax.swing.JButton jButton158;
    private javax.swing.JButton jButton159;
    private javax.swing.JButton jButton160;
    private javax.swing.JButton jButton161;
    private javax.swing.JButton jButton162;
    private javax.swing.JButton jButton163;
    private javax.swing.JButton jButton164;
    private javax.swing.JButton jButton165;
    private javax.swing.JButton jButton166;
    private javax.swing.JButton jButton167;
    private javax.swing.JButton jButton168;
    private javax.swing.JButton jButton169;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton170;
    private javax.swing.JButton jButton171;
    private javax.swing.JButton jButton172;
    private javax.swing.JButton jButton173;
    private javax.swing.JButton jButton174;
    private javax.swing.JButton jButton175;
    private javax.swing.JButton jButton176;
    private javax.swing.JButton jButton177;
    private javax.swing.JButton jButton178;
    private javax.swing.JButton jButton179;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton180;
    private javax.swing.JButton jButton182;
    private javax.swing.JButton jButton183;
    private javax.swing.JButton jButton186;
    private javax.swing.JButton jButton187;
    private javax.swing.JButton jButton189;
    private javax.swing.JButton jButton190;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton movesBtn;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r1c9;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JButton r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r2c9;
    private javax.swing.JButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r3c9;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r4c9;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c5;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r5c9;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r6c9;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r7c9;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton r8c9;
    private javax.swing.JButton r9c1;
    private javax.swing.JButton r9c2;
    private javax.swing.JButton r9c3;
    private javax.swing.JButton r9c4;
    private javax.swing.JButton r9c5;
    private javax.swing.JButton r9c6;
    private javax.swing.JButton r9c7;
    private javax.swing.JButton r9c8;
    private javax.swing.JButton r9c9;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton selectionBtn1;
    private javax.swing.JButton selectionBtn2;
    private javax.swing.JButton selectionBtn3;
    private javax.swing.JButton selectionBtn4;
    private javax.swing.JButton selectionBtn5;
    private javax.swing.JButton selectionBtn6;
    private javax.swing.JButton selectionBtn7;
    private javax.swing.JButton selectionBtn8;
    private javax.swing.JButton selectionBtn9;
    private javax.swing.JButton solBtn;
    // End of variables declaration                   
}