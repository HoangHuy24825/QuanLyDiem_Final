package ui;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer ;

public class CustomCellRenderer extends JLabel implements TableCellRenderer {

    public CustomCellRenderer(Color foregroundColor, Color backgroundColor, Font font, Border border, boolean isOpaque) {
        setFont(font);
        setOpaque(isOpaque);
        setForeground(foregroundColor);
        setBackground(backgroundColor);
        setBorder(border);
        setHorizontalAlignment(CENTER);
        setPreferredSize(new Dimension(this.getWidth(),35));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        setText(value.toString());
        return this;
    }
}
