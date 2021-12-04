package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTac {
    JFrame frame = new JFrame("Tic-Tac-Toe");
    JPanel panel = new JPanel();
    JPanel winPanel = new JPanel();
    JLabel score = new JLabel("");
    JButton[] buttons = new JButton[9];
    boolean xTurn = true;
    Font font = new Font("Ink free", Font.BOLD, 90);
    Timer timer;
    Timer timer1=new Timer(1500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            restart();
        }
    });

    TicTac() {
        //frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(400, 500));
        frame.setLocationRelativeTo(null);
        frame.setTitle("Tic-Tac-Toe");
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon("C:\\Users\\Alexandru Duna\\IdeaProjects\\Tic-Tac-Toe 2.0\\res\\1.png").getImage());

        //buttons panel
        panel.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < buttons.length; i++) {
            int j = i;
            buttons[i] = new JButton();
            buttons[i].setFocusable(false);
            buttons[i].setBackground(Color.WHITE);
            buttons[i].setBorder(new LineBorder(Color.BLACK, 2));
            buttons[i].setFont(font);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (xTurn == true) {
                        buttons[j].setText("X");
                        xTurn = false;
                        buttons[j].setEnabled(false);
                    } else {
                        buttons[j].setText("O");
                        xTurn = true;
                        buttons[j].setEnabled(false);
                    }
                }
            });
            panel.add(buttons[i]);
        }

        //score panel
        winPanel.setPreferredSize(new Dimension(400, 45));
        winPanel.add(score);
        winPanel.setBackground(Color.lightGray);
        score.setFont(new Font("Ink free", Font.BOLD, 35));


        //add
        frame.add(winPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);

        timer=new Timer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkWin();
                checkTurn();
            }
        });
        timer.start();
    }

    void restart() {
        timer1.stop();
        for (JButton b:
             buttons) {
            b.setEnabled(true);
            b.setText("");
            xTurn=true;
            score.setText("");
            b.setBackground(Color.WHITE);
        }
    }

    void checkWin() {
            //daca x castiga
            //orizontala
            if (buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X") {
                buttons[0].setBackground(Color.GREEN);
                buttons[1].setBackground(Color.GREEN);
                buttons[2].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X") {
                buttons[3].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[5].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X") {
                buttons[6].setBackground(Color.GREEN);
                buttons[7].setBackground(Color.GREEN);
                buttons[8].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            }
            //verticala
            else if (buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X") {
                buttons[0].setBackground(Color.GREEN);
                buttons[3].setBackground(Color.GREEN);
                buttons[6].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X") {
                buttons[1].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[7].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X") {
                buttons[2].setBackground(Color.GREEN);
                buttons[5].setBackground(Color.GREEN);
                buttons[8].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            }
            //diagonala
            else if (buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X") {
                buttons[0].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[8].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X") {
                buttons[2].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[6].setBackground(Color.GREEN);
                score.setText("X wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            }

            //O wins
            //orizontala
            else if (buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O") {
                buttons[0].setBackground(Color.GREEN);
                buttons[1].setBackground(Color.GREEN);
                buttons[2].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O") {
                buttons[3].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[5].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "O") {
                buttons[6].setBackground(Color.GREEN);
                buttons[7].setBackground(Color.GREEN);
                buttons[8].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            }
            //verticala
            else if (buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O") {
                buttons[0].setBackground(Color.GREEN);
                buttons[3].setBackground(Color.GREEN);
                buttons[6].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O") {
                buttons[1].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[7].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O") {
                buttons[2].setBackground(Color.GREEN);
                buttons[5].setBackground(Color.GREEN);
                buttons[8].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            }
            //diagonala
            else if (buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O") {
                buttons[0].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[8].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            } else if (buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O") {
                buttons[2].setBackground(Color.GREEN);
                buttons[4].setBackground(Color.GREEN);
                buttons[6].setBackground(Color.GREEN);
                score.setText("O wins!");
                for (JButton b:
                        buttons) {
                    b.setEnabled(false);
                }
                timer1.start();
            }else if(buttons[0].isEnabled()==false&&buttons[1].isEnabled()==false&&buttons[2].isEnabled()==false&&buttons[3].isEnabled()==false&&
                    buttons[4].isEnabled()==false&&buttons[5].isEnabled()==false&&buttons[6].isEnabled()==false&&buttons[7].isEnabled()==false&&
                    buttons[8].isEnabled()==false){
                score.setText("Draw!");
                timer1.start();
            }
        }

        void checkTurn(){
            for (JButton b:
                 buttons) {
                if(b.isEnabled()&&xTurn==true){
                    score.setText("X turn");
                }if(b.isEnabled()&&xTurn==false){
                    score.setText("O turn");
                }
            }
        }

    }
