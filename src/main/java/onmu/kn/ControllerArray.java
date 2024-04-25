/*package onmu.kn;

import javax.swing.*;
import javax.swing.text.*;

public class ControllerArray {

    public static void applyDigitFilter(JTextField textField) {
        DocumentFilter filter = new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                if (isDigitOrMinus(string)) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (isDigitOrMinus(text)) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }

            private boolean isDigitOrMinus(String text) {
                return text.matches("-?\\d+");
            }
        };

        ((AbstractDocument) textField.getDocument()).setDocumentFilter(filter);
    }

    public static void clearTextFields(JTextField textField1, JTextField textField2) {
        // Отключаем фильтр временно
        ((AbstractDocument) textField1.getDocument()).setDocumentFilter(null);
        ((AbstractDocument) textField2.getDocument()).setDocumentFilter(null);

        // Очищаем текстовые поля
        textField1.setText("");
        textField2.setText("");

        // Включаем фильтр обратно
        applyDigitFilter(textField1);
        applyDigitFilter(textField2);
    }

    private static boolean isDigitOrMinus(String text) {
        return text.matches("-?\\d+");
    }
}*/
