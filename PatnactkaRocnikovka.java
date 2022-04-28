/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rocnikovyprojekt2;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class PatnactkaRocnikovka extends javax.swing.JFrame {

    /**
     * Creates new form PatnactkaRocnikovka
     */
    public PatnactkaRocnikovka() {
        initComponents();
    }
    int counter = 1;

    void Move(JButton button1, JButton button2) {
        String shuffle = button2.getText();
        if (shuffle == "") {
            button2.setText(button1.getText());
            button1.setText("");
            //metoda prohazuje mezi sebou tlačítka s čísly a volné tlačítko
        }
    }

    public void RandomShuffle() {
        int[][] puzzle = new int[4][4];
        do {
            Random rand = new Random();
            int min = 0;
            int max = 15;
            int nCislo = rand.nextInt((max - min) + 1) + min;
        } while (!isSolvable(puzzle));
        buttonOne.setText(Integer.toString(puzzle[1][1]));
        buttonTwo.setText(Integer.toString(puzzle[1][2]));
        buttonThree.setText(Integer.toString(puzzle[1][3]));
        buttonFour.setText(Integer.toString(puzzle[1][4]));
        buttonFive.setText(Integer.toString(puzzle[2][1]));
        buttonSix.setText(Integer.toString(puzzle[2][2]));
        buttonSeven.setText(Integer.toString(puzzle[2][3]));
        buttonEight.setText(Integer.toString(puzzle[2][4]));
        buttonNine.setText(Integer.toString(puzzle[3][1]));
        buttonTen.setText(Integer.toString(puzzle[3][2]));
        buttonEleven.setText(Integer.toString(puzzle[3][3]));
        buttonTwelve.setText(Integer.toString(puzzle[3][4]));
        buttonThirteen.setText(Integer.toString(puzzle[4][1]));
        buttonFourteen.setText(Integer.toString(puzzle[4][2]));
        buttonFifteen.setText(Integer.toString(puzzle[4][3]));
        clearButton.setText(Integer.toString(puzzle[4][4]));

    }

    static int getInvCount(int[] arr) {
        int inv_count = 0;
        for (int i = 0; i < 15; i++) {
            for (int j = i + 1; j < 16; j++) {

                // počítá dvojice (arr[i], arr[j]) tak aby
                // i < j ale arr[i] > arr[j]
                if (arr[j] > 0 && arr[i] > 0 && arr[i] > arr[j]) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    static int findXPosition(int[][] puzzle) {
        // hledá pozici volného čtverce
        //začíná ze spodního pravého rohu pole
        for (int i = 4 - 1; i >= 0; i--) {
            for (int j = 4 - 1; j >= 0; j--) {
                if (puzzle[i][j] == 0) {
                    return 4 - i;
                }
            }
        }
        return 0;

    }

    static boolean isSolvable(int[][] puzzle) {
        // Tato funkce vrací true pokud
        // je tato kombinace řešitelná
        int[] flat = new int[16];
        int c = 0;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                flat[c] = puzzle[x][y];
                c++;
            }
        }

        int invCount = getInvCount(flat);

        int pos = findXPosition(puzzle);
        if ((pos & 1) == 1) {
            return !((invCount & 1) == 1);
        } else {
            return (invCount & 1) == 1;
        }
    }

    public void Solution() {
        String solution = buttonOne.getText();
        String solution1 = buttonTwo.getText();
        String solution2 = buttonThree.getText();
        String solution3 = buttonFour.getText();
        String solution4 = buttonFive.getText();
        String solution5 = buttonSix.getText();
        String solution6 = buttonSeven.getText();
        String solution7 = buttonEight.getText();
        String solution8 = buttonNine.getText();
        String solution9 = buttonTen.getText();
        String solution10 = buttonEleven.getText();
        String solution11 = buttonTwelve.getText();
        String solution12 = buttonThirteen.getText();
        String solution13 = buttonFourteen.getText();
        String solution14 = buttonFifteen.getText();

        if (solution == "1" && solution1 == "2" && solution2 == "3" && solution3 == "4" && solution4 == "5" && solution5 == "6" && solution6 == "7"
                && solution7 == "8" && solution8 == "9" && solution9 == "10" && solution10 == "11" && solution11 == "12" && solution12 == "13"
                && solution13 == "14" && solution14 == "15") {
            JOptionPane.showMessageDialog(this, "Vyhrál jsi!", "Patnáctka", JOptionPane.INFORMATION_MESSAGE);

        }

        kliky.setText("      " + Integer.toString(counter));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pravidla = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        buttonTwo = new javax.swing.JButton();
        buttonThree = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonOne = new javax.swing.JButton();
        buttonFourteen = new javax.swing.JButton();
        buttonEight = new javax.swing.JButton();
        buttonFive = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();
        buttonEleven = new javax.swing.JButton();
        buttonSeven = new javax.swing.JButton();
        buttonThirteen = new javax.swing.JButton();
        buttonTen = new javax.swing.JButton();
        buttonNine = new javax.swing.JButton();
        buttonFifteen = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        buttonTwelve = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pocetKliku = new javax.swing.JLabel();
        kliky = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        reseni = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1400, 730));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 255)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 88)); // NOI18N
        jLabel1.setText("Patnáctka");

        Pravidla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pravidla.setText("Pravidla");
        Pravidla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PravidlaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(327, 327, 327)
                .addComponent(Pravidla, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pravidla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));

        buttonTwo.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonTwo.setText("2");
        buttonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwoActionPerformed(evt);
            }
        });

        buttonThree.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonThree.setText("3");
        buttonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThreeActionPerformed(evt);
            }
        });

        buttonFour.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonFour.setText("4");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonOne.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonOne.setText("1");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonFourteen.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonFourteen.setText("14");
        buttonFourteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourteenActionPerformed(evt);
            }
        });

        buttonEight.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonEight.setText("8");
        buttonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEightActionPerformed(evt);
            }
        });

        buttonFive.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonFive.setText("5");
        buttonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiveActionPerformed(evt);
            }
        });

        buttonSix.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonSix.setText("6");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        buttonEleven.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonEleven.setText("11");
        buttonEleven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonElevenActionPerformed(evt);
            }
        });

        buttonSeven.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonSeven.setText("7");
        buttonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevenActionPerformed(evt);
            }
        });

        buttonThirteen.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonThirteen.setText("13");
        buttonThirteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThirteenActionPerformed(evt);
            }
        });

        buttonTen.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonTen.setText("10");
        buttonTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTenActionPerformed(evt);
            }
        });

        buttonNine.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonNine.setText("9");
        buttonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNineActionPerformed(evt);
            }
        });

        buttonFifteen.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonFifteen.setText("15");
        buttonFifteen.setPreferredSize(new java.awt.Dimension(101, 100));
        buttonFifteen.setRequestFocusEnabled(false);
        buttonFifteen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFifteenActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        buttonTwelve.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        buttonTwelve.setText("12");
        buttonTwelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwelveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonTen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(185, 185, 185))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEleven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTen, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonTwelve, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonThirteen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonFourteen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonFifteen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 255, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        jPanel3.setPreferredSize(new java.awt.Dimension(425, 383));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        jLabel2.setText(" Počet kliků");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pocetKliku.setFont(new java.awt.Font("Tahoma", 1, 75)); // NOI18N

        kliky.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        kliky.setText("           ");
        kliky.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(pocetKliku)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kliky, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(pocetKliku)
                .addGap(38, 38, 38)
                .addComponent(kliky, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));

        exit.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        reseni.setBackground(new java.awt.Color(255, 255, 255));
        reseni.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        reseni.setText("Řešení");
        reseni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reseniActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(204, 255, 204));
        reset.setFont(new java.awt.Font("Tahoma", 1, 55)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(reseni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reseni)
                .addGap(46, 46, 46)
                .addComponent(reset)
                .addGap(46, 46, 46)
                .addComponent(exit)
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwoActionPerformed
        // TODO add your handling code here:
        Move(buttonTwo, buttonOne);
        Move(buttonTwo, buttonThree);
        Move(buttonTwo, buttonSix);
        Solution();
        counter++;
    }//GEN-LAST:event_buttonTwoActionPerformed

    private void buttonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThreeActionPerformed
        // TODO add your handling code here:
        Move(buttonThree, buttonTwo);
        Move(buttonThree, buttonSeven);
        Move(buttonThree, buttonFour);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonThreeActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
        // TODO add your handling code here:
        Move(buttonFour, buttonThree);
        Move(buttonFour, buttonEight);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
        // TODO add your handling code here:
        Move(buttonOne, buttonTwo);
        Move(buttonOne, buttonFive);
        Solution();
        counter++;


    }//GEN-LAST:event_buttonOneActionPerformed

    private void buttonFourteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourteenActionPerformed
        // TODO add your handling code here:
        Move(buttonFourteen, buttonTen);
        Move(buttonFourteen, buttonFifteen);
        Move(buttonFourteen, buttonThirteen);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonFourteenActionPerformed

    private void buttonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEightActionPerformed
        // TODO add your handling code here:
        Move(buttonEight, buttonFour);
        Move(buttonEight, buttonSeven);
        Move(buttonEight, buttonTwelve);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonEightActionPerformed

    private void buttonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiveActionPerformed
        // TODO add your handling code here:
        Move(buttonFive, buttonOne);
        Move(buttonFive, buttonSix);
        Move(buttonFive, buttonNine);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonFiveActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
        // TODO add your handling code here:
        Move(buttonSix, buttonSeven);
        Move(buttonSix, buttonFive);
        Move(buttonSix, buttonTwo);
        Move(buttonSix, buttonTen);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonSixActionPerformed

    private void buttonElevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonElevenActionPerformed
        // TODO add your handling code here:
        Move(buttonEleven, buttonSeven);
        Move(buttonEleven, buttonFifteen);
        Move(buttonEleven, buttonTen);
        Move(buttonEleven, buttonTwelve);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonElevenActionPerformed

    private void buttonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevenActionPerformed
        // TODO add your handling code here:
        Move(buttonSeven, buttonThree);
        Move(buttonSeven, buttonEleven);
        Move(buttonSeven, buttonSix);
        Move(buttonSeven, buttonEight);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonSevenActionPerformed

    private void buttonThirteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThirteenActionPerformed
        // TODO add your handling code here:
        Move(buttonThirteen, buttonNine);
        Move(buttonThirteen, buttonFourteen);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonThirteenActionPerformed

    private void buttonTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTenActionPerformed
        // TODO add your handling code here:
        Move(buttonTen, buttonSix);
        Move(buttonTen, buttonFourteen);
        Move(buttonTen, buttonNine);
        Move(buttonTen, buttonEleven);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonTenActionPerformed

    private void buttonTwelveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwelveActionPerformed
        // TODO add your handling code here:
        Move(buttonTwelve, buttonEight);
        Move(buttonTwelve, buttonEleven);
        Move(buttonTwelve, clearButton);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonTwelveActionPerformed

    private void buttonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNineActionPerformed
        // TODO add your handling code here:
        Move(buttonNine, buttonTen);
        Move(buttonNine, buttonFive);
        Move(buttonNine, buttonThirteen);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonNineActionPerformed

    private void buttonFifteenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFifteenActionPerformed
        // TODO add your handling code here:
        Move(buttonFifteen, buttonEleven);
        Move(buttonFifteen, buttonFourteen);
        Move(buttonFifteen, clearButton);
        Solution();
        counter++;

    }//GEN-LAST:event_buttonFifteenActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        Move(clearButton, buttonTwelve);
        Move(clearButton, buttonFifteen);
        counter++;
        counter--;
        Solution();

    }//GEN-LAST:event_clearButtonActionPerformed
    public JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Chceš opustit Patnáctku? ", "Patnáctka", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_exitActionPerformed

    private void reseniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reseniActionPerformed
        // TODO add your handling code here:
        buttonOne.setText("1");
        buttonTwo.setText("2");
        buttonThree.setText("3");
        buttonFour.setText("4");
        buttonFive.setText("5");
        buttonSix.setText("6");
        buttonSeven.setText("7");
        buttonEight.setText("8");
        buttonNine.setText("9");
        buttonTen.setText("10");
        buttonEleven.setText("11");
        buttonTwelve.setText("12");
        buttonThirteen.setText("13");
        buttonFourteen.setText("14");
        buttonFifteen.setText("15");
        clearButton.setText("");
        counter = 0;
    }//GEN-LAST:event_reseniActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        RandomShuffle();
        counter = 0;
    }//GEN-LAST:event_resetActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        RandomShuffle();
    }//GEN-LAST:event_formWindowActivated
    public JFrame frame1;
    private void PravidlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PravidlaActionPerformed
        // TODO add your handling code here:
        frame1 = new JFrame("Pravidla");
        JOptionPane.showMessageDialog(frame, " Pravidla \n Vaším úkolem je seřadit čísla od 1 do 15. Docílíte toho postupnými záměnami některého čísla se sousedním políčkem");
    }//GEN-LAST:event_PravidlaActionPerformed

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
            java.util.logging.Logger.getLogger(PatnactkaRocnikovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatnactkaRocnikovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatnactkaRocnikovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatnactkaRocnikovka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatnactkaRocnikovka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pravidla;
    private javax.swing.JButton buttonEight;
    private javax.swing.JButton buttonEleven;
    private javax.swing.JButton buttonFifteen;
    private javax.swing.JButton buttonFive;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonFourteen;
    private javax.swing.JButton buttonNine;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonSeven;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonTen;
    private javax.swing.JButton buttonThirteen;
    private javax.swing.JButton buttonThree;
    private javax.swing.JButton buttonTwelve;
    private javax.swing.JButton buttonTwo;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel kliky;
    private javax.swing.JLabel pocetKliku;
    private javax.swing.JButton reseni;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
