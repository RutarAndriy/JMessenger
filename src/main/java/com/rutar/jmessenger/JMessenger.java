package com.rutar.jmessenger;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// ............................................................................

public class JMessenger extends JDialog {

public enum HAlign { LEFT, CENTER, RIGHT  }
public enum VAlign { TOP,  CENTER, BOTTOM }

public enum Icon { INFO, HELP, DONE, WARNING, ERROR,
                   PROCESSING, HOURGLASS, MAGNIFIER, BUG, CHART, COMPONENT,
                   ROADWORKS, WORLD, SYSTEM_MONITOR, YIN_YANG, FLASK, BOMB,
                   OWN_ICON }

// ............................................................................

private final int iconTextGap;

private Dimension old_size = null;
private Point old_location = null;

///////////////////////////////////////////////////////////////////////////////

    /**
     * Конструктор класу JMessenger
     * @param parent батьківський елемент
     * @param modal  модальність/немодальність діалогового вікна
     */
    
public JMessenger (Frame parent, boolean modal)
    { this(parent, modal, HAlign.RIGHT, VAlign.CENTER); }

///////////////////////////////////////////////////////////////////////////////

    /**
     * Конструктор класу JMessenger
     * @param parent батьківський елемент
     * @param modal  модальність/немодальність діалогового вікна
     * @param hAlign горизонтальне вирівнювання тексту
     */

public JMessenger (Frame parent, boolean modal, HAlign hAlign)
    { this(parent, modal, hAlign, VAlign.CENTER); }

///////////////////////////////////////////////////////////////////////////////

    /**
     * Конструктор класу JMessenger
     * @param parent батьківський елемент
     * @param modal  модальність/немодальність діалогового вікна
     * @param hAlign горизонтальне вирівнювання тексту
     * @param vAlign вертикальне вирівнювання тексту
     */

public JMessenger (Frame parent, boolean modal,
                   HAlign hAlign, VAlign vAlign) {

super(parent, modal);

initComponents();

iconTextGap = jLabel_message.getIconTextGap();

setTextAligment(hAlign, vAlign);
addWindowListener(window_listener);

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод задає текстове повідомлення та відображає/оновлює діалогове вікно
     * @param message текстове повідомлення
     */

public void setMessage (String message)
    { setMessageContext(message, null, Icon.INFO, null); }

    /**
     * Метод задає текстове повідомлення та відображає/оновлює діалогове вікно
     * @param message текстове повідомлення
     * @param title заголовок
     */

public void setMessage (String message, String title)
    { setMessageContext(message, title, Icon.INFO, null); }

    /**
     * Метод задає текстове повідомлення та відображає/оновлює діалогове вікно
     * @param message текстове повідомлення
     * @param icon стандартна іконка, об'єкт типу JMessenger.Icon
     */

public void setMessage (String message, Icon icon) 
    { setMessageContext(message, null, icon, null); }

    /**
     * Метод задає текстове повідомлення та відображає/оновлює діалогове вікно
     * @param message текстове повідомлення
     * @param title заголовок
     * @param icon стандартна іконка, об'єкт типу JMessenger.Icon
     */

public void setMessage (String message, String title, Icon icon) 
    { setMessageContext(message, title, icon, null); }

    /**
     * Метод задає текстове повідомлення та відображає/оновлює діалогове вікно
     * @param message текстове повідомлення
     * @param title заголовок
     * @param iconPath шлях до власної іконки
     */

public void setMessage (String message, String title, String iconPath)
    { setMessageContext(message, title, Icon.OWN_ICON, iconPath); }

///////////////////////////////////////////////////////////////////////////////
// Метод відповідає за внутрішню логіку компонента JMessenger

private void setMessageContext (String message, String title,
                                Icon icon, String iconPath) {

if (!SwingUtilities.isEventDispatchThread()) {
    
    String exception = "The call is not from the EDT stream";
    System.err.println(exception);
    throw new RuntimeException(exception);

}

// ............................................................................
// Об'явлення та ініціалізація необхідних змінних

String iconName;
ImageIcon imageIcon;

switch (icon) {
    case INFO:           iconName = "information";    break;
    case HELP:           iconName = "help";           break;
    case DONE:           iconName = "done";           break;
    case WARNING:        iconName = "warning";        break;
    case ERROR:          iconName = "error";          break;
    case PROCESSING:     iconName = "processing";     break;
    case HOURGLASS:      iconName = "hourglass";      break;
    case MAGNIFIER:      iconName = "magnifier";      break;
    case BUG:            iconName = "bug";            break;
    case CHART:          iconName = "chart";          break;
    case COMPONENT:      iconName = "component";      break;
    case ROADWORKS:      iconName = "roadworks";      break;
    case WORLD:          iconName = "world";          break;
    case SYSTEM_MONITOR: iconName = "system_monitor"; break;
    case YIN_YANG:       iconName = "yin_yang";       break;
    case FLASK:          iconName = "flask";          break;
    case BOMB:           iconName = "bomb";           break;
    default:             iconName = "own_icon";       break;
}

// ............................................................................
// Використання власної іконки для діаногового вікна

if (iconPath != null) {

try                 { imageIcon = new ImageIcon(getClass()
                                     .getResource(iconPath)); }
catch (Exception e) { imageIcon = new ImageIcon(getClass()
                                     .getResource("/icons/own_icon.png")); }

}

// ............................................................................
// Використання стандартних іконок для діаногового вікна

else { 

iconPath = String.format("/icons/%s.png", iconName);
imageIcon = new ImageIcon(getClass().getResource(iconPath));

}

// ............................................................................
// Занання вмісту повідомлення в якості html документа

message = String.format("<html>" +
                            "<p align=\"center\" >%s</p>" +
                        "</html>",
                        message.replaceAll("\n", "<br/>"));

// ............................................................................
// Задання властивостей діалогового вікна та його підготовка до відображення

old_size = getSize();

jLabel_message.setText(message);
jLabel_message.setIcon(imageIcon);

pack();
revalidate();

setTitle(title == null || title.isEmpty() ? "Повідомлення" : title);

// ............................................................................
// Логіка позиціонування вікна при відображенні/оновленні

if (old_location == null)
    { setLocationRelativeTo(getParent());
      old_location = getLocation(); }
else
    { int Dx = (getSize().width  - old_size.width)  / 2;
      int Dy = (getSize().height - old_size.height) / 2;
      old_location = new Point(getLocation().x - Dx, getLocation().y - Dy);
      setLocation(old_location);
    }

old_size = getSize();

// ............................................................................
// Відображення діалогового вікна

if (isVisible() == false) { setVisible(true); }
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод задає горизонтальне та вертикальне вирівнювання тексту
     * @param hAlign горизонтальне вирівнювання тексту
     * @param vAlign вертикальне вирівнювання тексту
     */

public final void setTextAligment (HAlign hAlign, VAlign vAlign) {

int hTextAlign;
int vTextAlign;

switch (hAlign) { case CENTER: hTextAlign = JLabel.CENTER; break;
                  case RIGHT:  hTextAlign = JLabel.RIGHT;  break;
                  default:     hTextAlign = JLabel.LEFT;   break; }

switch (vAlign) { case TOP:    vTextAlign = JLabel.TOP;    break;
                  case BOTTOM: vTextAlign = JLabel.BOTTOM; break;
                  default:     vTextAlign = JLabel.CENTER; break; }

jLabel_message.setHorizontalTextPosition(hTextAlign);
jLabel_message.setVerticalTextPosition(vTextAlign);

int newGap = (hAlign == HAlign.CENTER) ? iconTextGap : iconTextGap * 2;

jLabel_message.setIconTextGap(newGap);

}

///////////////////////////////////////////////////////////////////////////////
// Прослуховувач вікна компонента JMessenger

private final WindowAdapter window_listener = new WindowAdapter() {
        
@Override
public void windowClosing (WindowEvent e)
    { super.windowClosing(e);
      old_size = null;
      old_location = null; }
};

///////////////////////////////////////////////////////////////////////////////

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_message = new JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(Type.UTILITY);

        jLabel_message.setIcon(new ImageIcon(getClass().getResource("/icons/component.png"))); // NOI18N
        jLabel_message.setText("JMessenger");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_message)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_message)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

///////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel_message;
    // End of variables declaration//GEN-END:variables

///////////////////////////////////////////////////////////////////////////////

}
