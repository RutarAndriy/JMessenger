package com.rutar.jmessenger;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import com.rutar.jmessenger.JMessenger.*;

import static com.rutar.jmessenger.JMessenger.Icon.*;

// ............................................................................

public class JMessengerDemo extends JFrame {

private static JMessengerDemo demo;
private static JMessenger messenger;

///////////////////////////////////////////////////////////////////////////////

public JMessengerDemo() { initComponents(); }

///////////////////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_main = new JPanel();
        jButton_01 = new JButton();
        jButton_02 = new JButton();
        jButton_03 = new JButton();
        jButton_04 = new JButton();
        jButton_05 = new JButton();
        jButton_06 = new JButton();
        jButton_07 = new JButton();
        jButton_08 = new JButton();
        jButton_09 = new JButton();
        jButton_10 = new JButton();
        jButton_11 = new JButton();
        jButton_12 = new JButton();
        jButton_13 = new JButton();
        jButton_14 = new JButton();
        jButton_15 = new JButton();
        jButton_16 = new JButton();
        jButton_17 = new JButton();
        jButton_18 = new JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JMessenger Demo");
        setResizable(false);

        jPanel_main.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jPanel_main.setLayout(new GridLayout(6, 0, 3, 3));

        jButton_01.setIcon(new ImageIcon(getClass().getResource("/icons/information.png"))); // NOI18N
        jButton_01.setText("Інформація");
        jButton_01.setActionCommand("button_01");
        jButton_01.addActionListener(formListener);
        jPanel_main.add(jButton_01);

        jButton_02.setIcon(new ImageIcon(getClass().getResource("/icons/help.png"))); // NOI18N
        jButton_02.setText("Допомога");
        jButton_02.setActionCommand("button_02");
        jButton_02.addActionListener(formListener);
        jPanel_main.add(jButton_02);

        jButton_03.setIcon(new ImageIcon(getClass().getResource("/icons/done.png"))); // NOI18N
        jButton_03.setText("Готово");
        jButton_03.setActionCommand("button_03");
        jButton_03.addActionListener(formListener);
        jPanel_main.add(jButton_03);

        jButton_04.setIcon(new ImageIcon(getClass().getResource("/icons/warning.png"))); // NOI18N
        jButton_04.setText("Попередження");
        jButton_04.setActionCommand("button_04");
        jButton_04.addActionListener(formListener);
        jPanel_main.add(jButton_04);

        jButton_05.setIcon(new ImageIcon(getClass().getResource("/icons/error.png"))); // NOI18N
        jButton_05.setText("Помилка");
        jButton_05.setActionCommand("button_05");
        jButton_05.addActionListener(formListener);
        jPanel_main.add(jButton_05);

        jButton_06.setIcon(new ImageIcon(getClass().getResource("/icons/processing.png"))); // NOI18N
        jButton_06.setText("Обробка");
        jButton_06.setActionCommand("button_06");
        jButton_06.addActionListener(formListener);
        jPanel_main.add(jButton_06);

        jButton_07.setIcon(new ImageIcon(getClass().getResource("/icons/hourglass.png"))); // NOI18N
        jButton_07.setText("Годинник");
        jButton_07.setActionCommand("button_07");
        jButton_07.addActionListener(formListener);
        jPanel_main.add(jButton_07);

        jButton_08.setIcon(new ImageIcon(getClass().getResource("/icons/magnifier.png"))); // NOI18N
        jButton_08.setText("Лупа");
        jButton_08.setActionCommand("button_08");
        jButton_08.addActionListener(formListener);
        jPanel_main.add(jButton_08);

        jButton_09.setIcon(new ImageIcon(getClass().getResource("/icons/bug.png"))); // NOI18N
        jButton_09.setText("Bug");
        jButton_09.setActionCommand("button_09");
        jButton_09.addActionListener(formListener);
        jPanel_main.add(jButton_09);

        jButton_10.setIcon(new ImageIcon(getClass().getResource("/icons/chart.png"))); // NOI18N
        jButton_10.setText("Графік");
        jButton_10.setActionCommand("button_10");
        jButton_10.addActionListener(formListener);
        jPanel_main.add(jButton_10);

        jButton_11.setIcon(new ImageIcon(getClass().getResource("/icons/component.png"))); // NOI18N
        jButton_11.setText("Компонент");
        jButton_11.setActionCommand("button_11");
        jButton_11.addActionListener(formListener);
        jPanel_main.add(jButton_11);

        jButton_12.setIcon(new ImageIcon(getClass().getResource("/icons/roadworks.png"))); // NOI18N
        jButton_12.setText("Дорожні роботи");
        jButton_12.setActionCommand("button_12");
        jButton_12.addActionListener(formListener);
        jPanel_main.add(jButton_12);

        jButton_13.setIcon(new ImageIcon(getClass().getResource("/icons/world.png"))); // NOI18N
        jButton_13.setText("Планета");
        jButton_13.setActionCommand("button_13");
        jButton_13.addActionListener(formListener);
        jPanel_main.add(jButton_13);

        jButton_14.setIcon(new ImageIcon(getClass().getResource("/icons/system_monitor.png"))); // NOI18N
        jButton_14.setText("Моніторинг");
        jButton_14.setActionCommand("button_14");
        jButton_14.addActionListener(formListener);
        jPanel_main.add(jButton_14);

        jButton_15.setIcon(new ImageIcon(getClass().getResource("/icons/yin_yang.png"))); // NOI18N
        jButton_15.setText("Інь-Янь");
        jButton_15.setActionCommand("button_15");
        jButton_15.addActionListener(formListener);
        jPanel_main.add(jButton_15);

        jButton_16.setIcon(new ImageIcon(getClass().getResource("/icons/flask.png"))); // NOI18N
        jButton_16.setText("Колба");
        jButton_16.setActionCommand("button_16");
        jButton_16.addActionListener(formListener);
        jPanel_main.add(jButton_16);

        jButton_17.setIcon(new ImageIcon(getClass().getResource("/icons/bomb.png"))); // NOI18N
        jButton_17.setText("Бомба");
        jButton_17.setActionCommand("button_17");
        jButton_17.addActionListener(formListener);
        jPanel_main.add(jButton_17);

        jButton_18.setIcon(new ImageIcon(getClass().getResource("/icons/own_icon.png"))); // NOI18N
        jButton_18.setText("Власна іконка");
        jButton_18.setActionCommand("button_18");
        jButton_18.addActionListener(formListener);
        jPanel_main.add(jButton_18);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_main, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements ActionListener {
        FormListener() {}
        public void actionPerformed(ActionEvent evt) {
            if (evt.getSource() == jButton_01) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_02) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_03) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_04) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_05) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_06) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_07) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_08) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_09) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_10) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_11) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_12) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_13) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_14) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_15) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_16) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_17) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
            else if (evt.getSource() == jButton_18) {
                JMessengerDemo.this.onButtonClicked(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

///////////////////////////////////////////////////////////////////////////////

    private void onButtonClicked(ActionEvent evt) {//GEN-FIRST:event_onButtonClicked
        
    if (messenger != null &&
        messenger.isShowing()) { return; }

    switch (evt.getActionCommand()) {

        // Інформація
        case "button_01":
            
            messenger = new JMessenger(this, false);
            messenger.setMessage("Інформаційне повідомлення");
            break;

        // Допомога
        case "button_02":
            
            messenger = new JMessenger(this, false);
            messenger.setMessage("Допоміжне повідомлення", HELP);
            break;
            
        // Готово
        case "button_03":
            
            messenger = new JMessenger(this, false);
            messenger.setMessage("Обробку даних успішно завершено",
                                 "Готово", DONE);
            break;
            
        // Попередження
        case "button_04":
            
            messenger = new JMessenger(this, true, HAlign.LEFT);
            messenger.setMessage("Результат розрахунків" + "\n" +
                                 "може бути неточним",
                                 "Попередження", WARNING);
            break;
            
        // Помилка
        case "button_05":
            
            messenger = new JMessenger(this, true,
                                       HAlign.CENTER, VAlign.BOTTOM);
            messenger.setMessage("Під час виконання програми" + "\n" +
                                 "виникла критична помилка",
                                 "Помилка", JMessenger.Icon.ERROR);
            break;
            
        // Обробка
        case "button_06":
            
            showProcessDialog();
            break;
            
        // Годинник
        case "button_07":

            Calendar calendar = Calendar.getInstance();
            String time = "" + calendar.get(Calendar.HOUR_OF_DAY) + ":"
                             + calendar.get(Calendar.MINUTE) + ":"
                             + calendar.get(Calendar.SECOND);
            
            messenger = new JMessenger(this, false,
                                       HAlign.CENTER, VAlign.BOTTOM);
            messenger.setMessage("Час на даний момент" + "\n" + time,
                                 "Годинник", HOURGLASS);
            break;
            
        
        case "button_08": // Лупа
        case "button_09": // Bug
        case "button_10": // Графік
        case "button_11": // Компонент
        case "button_12": // Дорожні роботи
        case "button_13": // Планета
        case "button_14": // Моніторинг
        case "button_15": // Інь-Янь
        case "button_16": // Колба
        case "button_17": // Бомба
            
            String title = ((JButton) evt.getSource()).getText();
            String command = evt.getActionCommand();
            JMessenger.Icon[] icons = JMessenger.Icon.values();
            
            int index = Integer.valueOf(command
                               .substring(command.indexOf("_") + 1)) - 1;
            
            messenger = new JMessenger(this, false);
            messenger.setMessage("Спеціальне" + "\n" +
                                 "повідомлення №" + (index - 6),
                                 title, icons[index]);
            break;
            
        // Власна іконка
        case "button_18":
            
            showOwnIconDialog();
            break;
            
    }
    
    }//GEN-LAST:event_onButtonClicked

///////////////////////////////////////////////////////////////////////////////
    
public static void main (String args[]) {

    try { UIManager.setLookAndFeel("javax.swing.plaf" +
                                   ".nimbus.NimbusLookAndFeel"); }
    catch (Exception e) {}

    // Відображення JMessengerDemo після повної ініціалізації
    try { EventQueue.invokeAndWait(() -> { demo = new JMessengerDemo(); });
          Thread.sleep(100);
          demo.setVisible(true); }
    catch (Exception e) {}

}

///////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton_01;
    private JButton jButton_02;
    private JButton jButton_03;
    private JButton jButton_04;
    private JButton jButton_05;
    private JButton jButton_06;
    private JButton jButton_07;
    private JButton jButton_08;
    private JButton jButton_09;
    private JButton jButton_10;
    private JButton jButton_11;
    private JButton jButton_12;
    private JButton jButton_13;
    private JButton jButton_14;
    private JButton jButton_15;
    private JButton jButton_16;
    private JButton jButton_17;
    private JButton jButton_18;
    private JPanel jPanel_main;
    // End of variables declaration//GEN-END:variables

///////////////////////////////////////////////////////////////////////////////
// Відображення діалогу обробки

private void showProcessDialog() {

messenger = new JMessenger(this, true, HAlign.CENTER, VAlign.BOTTOM);

new SwingWorker <Void, Integer>() {

// ............................................................................
// Обробка результату у фоні

@Override
protected Void doInBackground() throws Exception {

for (int z = 1; z < 10; z++) {

    publish(z * 10);
    
    try { Thread.sleep(500); }
    catch (Exception e) {}
    
}
        
return null;

}

// ............................................................................
// Зміна даних під час обробки результату

@Override
protected void process (java.util.List<Integer> chunks) {

int lastValue = chunks.get(chunks.size()-1);

messenger.setMessage("Триває обробка результату" + "\n" +
                    "Виконано " + lastValue + "%",
                    "Обробка", PROCESSING);
}

// ............................................................................
// Зміна даних після завершення обробки результату

@Override
protected void done() {

messenger.setMessage("Обробку завершено", "Готово", DONE);

}
}.execute();
    
}

///////////////////////////////////////////////////////////////////////////////
// Відображення діалогу з власною іконкою

private void showOwnIconDialog() {

messenger = new JMessenger(this, false);

new SwingWorker <Void, Integer>() {

// ............................................................................
// Обробка результату у фоні

@Override
protected Void doInBackground() throws Exception {

for (int z = 0; z <= 5; z++) {

    publish(z%2);
    
    try { Thread.sleep(2500); }
    catch (Exception e) {}
    
}
        
return null;

}

// ............................................................................
// Зміна даних під час обробки результату

@Override
protected void process (java.util.List<Integer> chunks) {

boolean found = chunks.get(chunks.size()-1) == 0;
String iconPath = "/icons/" + (found ? "roadworks" : "test") + ".png";

String message = "Іконку " + iconPath + " " +
                 (found ? "" : "не ") + "знайдено" + "\n" +
                 "Використовується " +
                 (found ? "власна іконка" : "іконка OWN_ICON");

messenger.setMessage(message, "Власна іконка", iconPath);

}
}.execute();
    
}

///////////////////////////////////////////////////////////////////////////////

}