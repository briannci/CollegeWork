/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentservices;

/**
 * XandOGame.java
 * @refernce http://www.youtube.com/watch?v=30niHciWL4k
 *  20/04/2013
 * @author Ben Callaghan
 */
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;

public class XandOGame extends javax.swing.JFrame {

    /**
     * Creates new form X and O
     */
    public XandOGame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        box1 = new javax.swing.JTextField();
        box2 = new javax.swing.JTextField();
        box3 = new javax.swing.JTextField();
        box4 = new javax.swing.JTextField();
        box5 = new javax.swing.JTextField();
        box6 = new javax.swing.JTextField();
        box7 = new javax.swing.JTextField();
        box8 = new javax.swing.JTextField();
        box9 = new javax.swing.JTextField();
        error_rectify = new javax.swing.JLabel();
        refresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(450, 200, 400, 500));
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        box1.setEditable(false);
        box1.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box1.setFocusable(false);
        box1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box1MouseClicked(evt);
            }
        });
        getContentPane().add(box1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 50, 100, 100));

        box2.setEditable(false);
        box2.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box2.setFocusable(false);
        box2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box2MouseClicked(evt);
            }
        });
        getContentPane().add(box2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 50, 100, 100));

        box3.setEditable(false);
        box3.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box3.setFocusable(false);
        box3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box3MouseClicked(evt);
            }
        });
        getContentPane().add(box3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 50, 100, 100));

        box4.setEditable(false);
        box4.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box4.setFocusable(false);
        box4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box4MouseClicked(evt);
            }
        });
        getContentPane().add(box4, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 150, 100, 100));

        box5.setEditable(false);
        box5.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box5.setFocusable(false);
        box5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box5MouseClicked(evt);
            }
        });
        getContentPane().add(box5, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 150, 100, 100));

        box6.setEditable(false);
        box6.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box6.setFocusable(false);
        box6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box6MouseClicked(evt);
            }
        });
        getContentPane().add(box6, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 150, 100, 100));

        box7.setEditable(false);
        box7.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box7.setFocusable(false);
        box7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box7MouseClicked(evt);
            }
        });
        getContentPane().add(box7, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 250, 100, 100));

        box8.setEditable(false);
        box8.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box8.setFocusable(false);
        box8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box8MouseClicked(evt);
            }
        });
        getContentPane().add(box8, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 250, 100, 100));

        box9.setEditable(false);
        box9.setFont(new java.awt.Font("Tahoma", 0, 100)); // NOI18N
        box9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        box9.setFocusable(false);
        box9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                box9MouseClicked(evt);
            }
        });
        getContentPane().add(box9, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 250, 100, 100));
        getContentPane().add(error_rectify, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 424, 40, 20));

        refresh.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 377, -1, 57));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Click any square to begin.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 11, 276, 28));

        Back.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 377, 141, 57));

        setBounds(450, 200, 400, 500);
    }// </editor-fold>//GEN-END:initComponents

    void AI() {

        String c1 = box1.getText();
        String c2 = box2.getText();
        String c3 = box3.getText();
        String c4 = box4.getText();
        String c5 = box5.getText();
        String c6 = box6.getText();
        String c7 = box7.getText();
        String c8 = box8.getText();
        String c9 = box9.getText();
        if ((i % 2) == 1) {
            if ((c1.equals(c2)) && (c2.equals("X")) && (b3 == 0)) {
                box3.setText("O");
                b3 = 1;
                i++;
            } else if ((c3.equals(c2)) && (c2.equals("X")) && (b1 == 0)) {
                box1.setText("O");
                b1 = 1;
                i++;
            } else if ((c1.equals(c3)) && (c1.equals("X")) && (b2 == 0)) {
                box2.setText("O");
                b2 = 1;
                i++;
            } else if ((c4.equals(c5)) && (c5.equals("X")) && (b6 == 0)) {
                box6.setText("O");
                b6 = 1;
                i++;
            } else if ((c6.equals(c5)) && (c5.equals("X")) && (b4 == 0)) {
                box4.setText("O");
                b4 = 1;
                i++;
            } else if ((c4.equals(c6)) && (c4.equals("X")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
            } else if ((c7.equals(c8)) && (c8.equals("X")) && (b9 == 0)) {
                box9.setText("O");
                b9 = 1;
                i++;
            } else if ((c9.equals(c8)) && (c8.equals("X")) && (b7 == 0)) {
                box7.setText("O");
                b7 = 1;
                i++;
            } else if ((c7.equals(c9)) && (c7.equals("X")) && (b8 == 0)) {
                box8.setText("O");
                b8 = 1;
                i++;
            } else if ((c1.equals(c4)) && (c4.equals("X")) && (b7 == 0)) {
                box7.setText("O");
                b7 = 1;
                i++;
            } else if ((c7.equals(c4)) && (c4.equals("X")) && (b1 == 0)) {
                box1.setText("O");
                b1 = 1;
                i++;
            } else if ((c1.equals(c7)) && (c1.equals("X")) && (b4 == 0)) {
                box4.setText("O");
                b4 = 1;
                i++;
            } else if ((c2.equals(c5)) && (c5.equals("X")) && (b8 == 0)) {
                box8.setText("O");
                b8 = 1;
                i++;
            } else if ((c8.equals(c5)) && (c5.equals("X")) && (b2 == 0)) {
                box2.setText("O");
                b2 = 1;
                i++;
            } else if ((c2.equals(c8)) && (c2.equals("X")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
            } else if ((c3.equals(c6)) && (c6.equals("X")) && (b9 == 0)) {
                box9.setText("O");
                b9 = 1;
                i++;
            } else if ((c9.equals(c6)) && (c6.equals("X")) && (b3 == 0)) {
                box3.setText("O");
                b3 = 1;
                i++;
            } else if ((c3.equals(c9)) && (c3.equals("X")) && (b6 == 0)) {
                box6.setText("O");
                b6 = 1;
                i++;
            } else if ((c1.equals(c5)) && (c5.equals("X")) && (b9 == 0)) {
                box9.setText("O");
                b9 = 1;
                i++;
            } else if ((c9.equals(c5)) && (c5.equals("X")) && (b1 == 0)) {
                box1.setText("O");
                b1 = 1;
                i++;
            } else if ((c1.equals(c9)) && (c1.equals("X")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
            } else if ((c3.equals(c5)) && (c5.equals("X")) && (b7 == 0)) {
                box7.setText("O");
                b7 = 1;
                i++;
            } else if ((c7.equals(c5)) && (c5.equals("X")) && (b3 == 0)) {
                box3.setText("O");
                b3 = 1;
                i++;
            } else if ((c3.equals(c7)) && (c3.equals("X")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
            } else {
                if (i == 1) {
                    if (b5 == 0) {
                        box5.setText("O");
                        b5 = 1;
                        i++;
                    } else {
                        Random a1 = new Random();
                        int first = a1.nextInt((4));
                        first++;
                        if ((first == 1) && (b1 == 0)) {
                            box1.setText("O");
                            b1 = 1;
                            i++;
                        } else if ((first == 2) && (b3 == 0)) {
                            box3.setText("O");
                            b3 = 1;
                            i++;
                        } else if ((first == 3) && (b7 == 0)) {
                            box7.setText("O");
                            b7 = 1;
                            i++;
                        } else if ((first == 4) && (b9 == 0)) {
                            box9.setText("O");
                            b9 = 1;
                            i++;
                        }
                    }
                } else if (((c1.equals(c9)) && (c9.equals("X")))
                        || ((c3.equals(c7)) && (c7.equals("X")))
                        && (i == 3)) {
                    box6.setText("O");
                    b6 = 1;
                    i++;
                } else if (i > 1) {

                    boolean done = false;
                    if (i != 9) {
                        while (done == false) {
                            Random a2 = new Random();
                            int scnd = a2.nextInt((9));
                            scnd++;

                            if ((scnd == 1) && (b1 == 0)) {
                                box1.setText("O");
                                b1 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 2) && (b2 == 0) && (b1 == 1) && (b3 == 1) && (b7 == 1) && (b9 == 1)) {
                                box2.setText("O");
                                b2 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 3) && (b3 == 0)) {
                                box3.setText("O");
                                b3 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 4) && (b4 == 0) && (b1 == 1) && (b3 == 1) && (b7 == 1) && (b9 == 1)) {
                                box4.setText("O");
                                b4 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 5) && (b3 == 0)) {
                                box3.setText("O");
                                b3 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 6) && (b6 == 0) && (b1 == 1) && (b3 == 1) && (b7 == 1) && (b9 == 1)) {
                                box6.setText("O");
                                b6 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 7) && (b7 == 0)) {
                                box7.setText("O");
                                b7 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 8) && (b8 == 0) && (b1 == 1) && (b3 == 1) && (b7 == 1) && (b9 == 1)) {
                                box8.setText("O");
                                b8 = 1;
                                i++;
                                done = true;
                            } else if ((scnd == 9) && (b9 == 0)) {
                                box9.setText("O");
                                b9 = 1;
                                i++;
                                done = true;
                            }
                        }
                    }
                }


            }

        }
    }

    void AI_attack() {
        boolean AI_win = false;
        String c1 = box1.getText();
        String c2 = box2.getText();
        String c3 = box3.getText();
        String c4 = box4.getText();
        String c5 = box5.getText();
        String c6 = box6.getText();
        String c7 = box7.getText();
        String c8 = box8.getText();
        String c9 = box9.getText();
        if ((i % 2) == 1) {
            if ((c1.equals(c2)) && (c2.equals("O")) && (b3 == 0)) {
                box3.setText("O");
                b3 = 1;
                i++;
                AI_win = true;
                AI_win = true;
            } else if ((c3.equals(c2)) && (c2.equals("O")) && (b1 == 0)) {
                box1.setText("O");
                b1 = 1;
                i++;
                AI_win = true;
            } else if ((c1.equals(c3)) && (c1.equals("O")) && (b2 == 0)) {
                box2.setText("O");
                b2 = 1;
                i++;
                AI_win = true;
            } else if ((c4.equals(c5)) && (c5.equals("O")) && (b6 == 0)) {
                box6.setText("O");
                b6 = 1;
                i++;
                AI_win = true;
            } else if ((c6.equals(c5)) && (c5.equals("O")) && (b4 == 0)) {
                box4.setText("O");
                b4 = 1;
                i++;
                AI_win = true;
            } else if ((c4.equals(c6)) && (c4.equals("O")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
                AI_win = true;
            } else if ((c7.equals(c8)) && (c8.equals("O")) && (b9 == 0)) {
                box9.setText("O");
                b9 = 1;
                i++;
                AI_win = true;
            } else if ((c9.equals(c8)) && (c8.equals("O")) && (b7 == 0)) {
                box7.setText("O");
                b7 = 1;
                i++;
                AI_win = true;
            } else if ((c7.equals(c9)) && (c7.equals("O")) && (b8 == 0)) {
                box8.setText("O");
                b8 = 1;
                i++;
                AI_win = true;
            } else if ((c1.equals(c4)) && (c4.equals("O")) && (b7 == 0)) {
                box7.setText("O");
                b7 = 1;
                i++;
                AI_win = true;
            } else if ((c7.equals(c4)) && (c4.equals("O")) && (b1 == 0)) {
                box1.setText("O");
                b1 = 1;
                i++;
                AI_win = true;
            } else if ((c1.equals(c7)) && (c1.equals("O")) && (b4 == 0)) {
                box4.setText("O");
                b4 = 1;
                i++;
                AI_win = true;
            } else if ((c2.equals(c5)) && (c5.equals("O")) && (b8 == 0)) {
                box8.setText("O");
                b8 = 1;
                i++;
                AI_win = true;
            } else if ((c8.equals(c5)) && (c5.equals("O")) && (b2 == 0)) {
                box2.setText("O");
                b2 = 1;
                i++;
                AI_win = true;
            } else if ((c2.equals(c8)) && (c2.equals("O")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
                AI_win = true;
            } else if ((c3.equals(c6)) && (c6.equals("O")) && (b9 == 0)) {
                box9.setText("O");
                b9 = 1;
                i++;
                AI_win = true;
            } else if ((c9.equals(c6)) && (c6.equals("O")) && (b3 == 0)) {
                box3.setText("O");
                b3 = 1;
                i++;
                AI_win = true;
            } else if ((c3.equals(c9)) && (c3.equals("O")) && (b6 == 0)) {
                box6.setText("O");
                b6 = 1;
                i++;
                AI_win = true;
            } else if ((c1.equals(c5)) && (c5.equals("O")) && (b9 == 0)) {
                box9.setText("O");
                b9 = 1;
                i++;
                AI_win = true;
            } else if ((c9.equals(c5)) && (c5.equals("O")) && (b1 == 0)) {
                box1.setText("O");
                b1 = 1;
                i++;
                AI_win = true;
            } else if ((c1.equals(c9)) && (c1.equals("O")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
                AI_win = true;
            } else if ((c3.equals(c5)) && (c5.equals("O")) && (b7 == 0)) {
                box7.setText("O");
                b7 = 1;
                i++;
                AI_win = true;
            } else if ((c7.equals(c5)) && (c5.equals("O")) && (b3 == 0)) {
                box3.setText("O");
                b3 = 1;
                i++;
                AI_win = true;
            } else if ((c3.equals(c7)) && (c3.equals("O")) && (b5 == 0)) {
                box5.setText("O");
                b5 = 1;
                i++;
                AI_win = true;
            }

        }
        if (AI_win == true) {
            JOptionPane.showMessageDialog(null, "Computer Wins");
            refresh.doClick(1000);
        }
    }

    void winx() {

        String c1 = box1.getText();
        String c2 = box2.getText();
        String c3 = box3.getText();
        String c4 = box4.getText();
        String c5 = box5.getText();
        String c6 = box6.getText();
        String c7 = box7.getText();
        String c8 = box8.getText();
        String c9 = box9.getText();
        if (((c1.equals(c2)) && (c2.equals(c3)) && (c1.equals("X")))
                || ((c4.equals(c5)) && (c5.equals(c6)) && (c4.equals("X")))
                || ((c7.equals(c8)) && (c8.equals(c9)) && (c7.equals("X")))
                ||/*
                 * Horizontal Complete
                 */ ((c1.equals(c4)) && (c4.equals(c7)) && (c1.equals("X")))
                || ((c2.equals(c5)) && (c5.equals(c8)) && (c2.equals("X")))
                || ((c3.equals(c6)) && (c6.equals(c9)) && (c3.equals("X")))
                ||/*
                 * Vertical Complete
                 */ ((c1.equals(c5)) && (c5.equals(c9)) && (c1.equals("X")))
                || ((c3.equals(c5)) && (c5.equals(c7)) && (c3.equals("X")))) /*
         * Doagonal Complete
         */ {

            JOptionPane.showMessageDialog(null, "X WINS!!");
            refresh.doClick(1000);
        }

    }

    void special_case() {
        if (i == 3) {

            String c1 = box1.getText();
            String c2 = box2.getText();
            String c3 = box3.getText();
            String c4 = box4.getText();
            String c5 = box5.getText();
            String c6 = box6.getText();
            String c7 = box7.getText();
            String c8 = box8.getText();
            String c9 = box9.getText();
            if (((c7.equals("X")) || (c9.equals("X"))) && (c2.equals("X")) && (c5.equals("O"))) {
                Random choice = new Random();
                int box = choice.nextInt((2)) + 1;
                if (box == 1) {
                    box1.setText("O");
                    b1 = 1;
                    i++;
                } else {
                    box3.setText("O");
                    b3 = 1;
                    i++;
                }
            } else if ((c1.equals("X") || (c7.equals("X"))) && (c6.equals("X")) && (c5.equals("O"))) {
                Random choice = new Random();
                int box = choice.nextInt((2)) + 1;
                if (box == 1) {
                    box3.setText("O");
                    b3 = 1;
                    i++;
                } else {
                    box9.setText("O");
                    b9 = 1;
                    i++;
                }
            } else if (((c3.equals("X")) || (c1.equals("X"))) && (c8.equals("X")) && (c5.equals("O"))) {
                Random choice = new Random();
                int box = choice.nextInt((2)) + 1;
                if (box == 1) {
                    box7.setText("O");
                    b7 = 1;
                    i++;
                } else {
                    box9.setText("O");
                    b9 = 1;
                    i++;
                }
            } else if ((c9.equals("X") || (c3.equals("X"))) && (c4.equals("X")) && (c5.equals("O"))) {
                Random choice = new Random();
                int box = choice.nextInt((2)) + 1;
                if (box == 1) {
                    box7.setText("O");
                    b7 = 1;
                    i++;
                } else {
                    box1.setText("O");
                    b1 = 1;
                    i++;
                }
            }
        }
    }
    int i = 0, b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0, b6 = 0, b7 = 0, b8 = 0, b9 = 0;
    private void box1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box1MouseClicked
        if (b1 == 0) {
            box1.setForeground(Color.RED);
            box1.setText("X");
            b1 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();

// TODO add your handling code here:
    }//GEN-LAST:event_box1MouseClicked

    private void box2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box2MouseClicked
        if (b2 == 0) {
            box2.setForeground(Color.RED);
            box2.setText("X");
            b2 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();
        // TODO add your handling code here:
    }//GEN-LAST:event_box2MouseClicked

    private void box3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box3MouseClicked
        if (b3 == 0) {
            box3.setForeground(Color.RED);
            box3.setText("X");
            b3 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();

// TODO add your handling code here:
    }//GEN-LAST:event_box3MouseClicked

    private void box4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box4MouseClicked
        if (b4 == 0) {
            box4.setForeground(Color.RED);
            box4.setText("X");
            b4 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();
// TODO add your handling code here:
    }//GEN-LAST:event_box4MouseClicked

    private void box5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box5MouseClicked
        if (b5 == 0) {
            box5.setForeground(Color.RED);
            box5.setText("X");
            b5 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();
// TODO add your handling code here:
    }//GEN-LAST:event_box5MouseClicked

    private void box6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box6MouseClicked
        if (b6 == 0) {
            box6.setForeground(Color.RED);
            box6.setText("X");
            b6 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();
// TODO add your handling code here:
    }//GEN-LAST:event_box6MouseClicked

    private void box7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box7MouseClicked
        if (b7 == 0) {
            box7.setForeground(Color.RED);
            box7.setText("X");
            b7 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();
// TODO add your handling code here:
    }//GEN-LAST:event_box7MouseClicked

    private void box8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box8MouseClicked
        if (b8 == 0) {
            box8.setForeground(Color.RED);
            box8.setText("X");
            b8 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();
// TODO add your handling code here:
    }//GEN-LAST:event_box8MouseClicked

    private void box9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_box9MouseClicked
        if (b9 == 0) {
            box9.setForeground(Color.RED);
            box9.setText("X");
            b9 = 1;
            i++;
        }
        special_case();
        winx();
        AI_attack();
        AI();
// TODO add your handling code here:
    }//GEN-LAST:event_box9MouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        box1.setText("");
        box2.setText("");
        box3.setText("");
        box4.setText("");
        box5.setText("");
        box6.setText("");
        box7.setText("");
        box8.setText("");
        box9.setText("");
        i = 0;
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        b9 = 0;
        box1.setForeground(Color.BLACK);
        box2.setForeground(Color.BLACK);
        box3.setForeground(Color.BLACK);
        box4.setForeground(Color.BLACK);
        box5.setForeground(Color.BLACK);
        box6.setForeground(Color.BLACK);
        box7.setForeground(Color.BLACK);
        box8.setForeground(Color.BLACK);
        box9.setForeground(Color.BLACK);
    }//GEN-LAST:event_refreshActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MathsSupport ms = new MathsSupport();
        ms.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new XandOGame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField box1;
    private javax.swing.JTextField box2;
    private javax.swing.JTextField box3;
    private javax.swing.JTextField box4;
    private javax.swing.JTextField box5;
    private javax.swing.JTextField box6;
    private javax.swing.JTextField box7;
    private javax.swing.JTextField box8;
    private javax.swing.JTextField box9;
    private javax.swing.JLabel error_rectify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
