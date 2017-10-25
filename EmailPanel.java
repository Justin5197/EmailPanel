package email;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailPanel extends JPanel{
    private JLabel toLabel, ccLabel, bccLabel, bodyLabel;
    private JTextField toField, ccField, bccField;
    private JTextArea bodyText;
    private JButton send;

    public EmailPanel() {
        toLabel = new JLabel("      To: ");
        toField = new JTextField(30);
        ccLabel = new JLabel("      Cc: ");
        ccField = new JTextField(30);
        bccLabel = new JLabel("     Bcc: ");
        bccField = new JTextField(30);
        bodyLabel = new JLabel("    Body: ");
        bodyText = new JTextArea(10, 30);

        send = new JButton("SEND!");
        send.addActionListener(new SendListener());

        add(toLabel); add(toField);
        add(ccLabel); add(ccField);
        add(bccLabel); add(bccField);
        add(bodyLabel); add(bodyText);
        add(send);

        setPreferredSize(new Dimension(430, 300));
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        setBackground(Color.green);

    }

    private class SendListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.printf("To: %s%nCc: %s%nBcc: %s%n%n%s%n",
                    toField.getText(),
                    ccField.getText(),
                    bccField.getText(),
                    bodyText.getText());
        }
    }
}
