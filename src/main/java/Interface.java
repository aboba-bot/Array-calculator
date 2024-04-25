import onmu.kn.PositiveNumberDeleter;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Interface extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox<String> choiceBox2;

    public Interface() {
        super("Array Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(620, 600);
        setResizable(false); // Запрещаем изменение размеров окна
        setLayout(new BorderLayout());

        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);

        textField1 = new JTextField();
        textField1.setBounds(75, 101, 200, 25);
        contentPane.add(textField1);
        applyDigitFilter(textField1); // Применяем фильтр к первому текстовому полю

        textField2 = new JTextField();
        textField2.setBounds(342, 101, 200, 25);
        contentPane.add(textField2);
        applyDigitFilter(textField2); // Применяем фильтр ко второму текстовому полю

        String[] options2 = {"Видалення елементів", "7. Видалення елементів, які повторюються", "8. Видалення з масиву від’ємних чисел", "9. Видалення з масиву додатніх чисел"};
        choiceBox2 = new JComboBox<>(options2);
        choiceBox2.setBounds(71, 311, 470, 43);
        contentPane.add(choiceBox2);

        choiceBox2.addActionListener(e -> {
            String selectedOperation = (String) choiceBox2.getSelectedItem();
            if (selectedOperation.equals("9. Видалення з масиву додатніх чисел")) {
                performPositiveNumberDeletion();
            }
        });

        JButton historyButton1 = new JButton("\uD83D\uDD50"); // Emoji для истории
        historyButton1.setBounds(280, 80, 56, 30);
        contentPane.add(historyButton1);

        JButton resetButton = new JButton("\uD83D\uDD03"); // Emoji для истории (стрелка влево)
        resetButton.setBounds(280, 115, 56, 30);
        contentPane.add(resetButton);

        JLabel label1 = new JLabel("Array 1");
        label1.setBounds(150, 75, 80, 25);
        contentPane.add(label1);

        JLabel label2 = new JLabel("Array 2");
        label2.setBounds(420, 75, 80, 25);
        contentPane.add(label2);

        JButton deleteButton1 = new JButton("\uD83D\uDDD1️"); // Emoji для мусорной корзины
        deleteButton1.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
        deleteButton1.setBounds(342, 139, 50, 30);
        contentPane.add(deleteButton1);
        deleteButton1.addActionListener(e -> {
            textField1.setText(""); // Очистка текстового поля
        });

        JButton historyButton2 = new JButton("\uD83D\uDD50"); //тут
        historyButton2.setBounds(418, 139, 50, 30);
        contentPane.add(historyButton2);

        JButton openbutton2 = new JButton("\uD83D\uDCC1");
        openbutton2.setBounds(490, 139, 50, 30);
        contentPane.add(openbutton2);

        JButton historyButton3 = new JButton("\uD83D\uDD50"); //тут
        historyButton3.setBounds(152, 139, 50, 30);
        contentPane.add(historyButton3);

        JButton openbutton1 = new JButton("\uD83D\uDCC1");
        openbutton1.setBounds(223, 139, 50, 30);//ещё подвинь
        contentPane.add(openbutton1);

        JButton copyButton = new JButton("\uD83D\uDCB0"); // Emoji для копирования в буфер обмена
        copyButton.setBounds(150, 139, 50, 30);
        contentPane.add(copyButton);
        copyButton.addActionListener(e -> {
            String copiedText = textField1.getText();
            StringSelection selection = new StringSelection(copiedText);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(selection, null);
            JOptionPane.showMessageDialog(this, "Дані успішно скопійовано в буфер обміну", "Скопійовано", JOptionPane.INFORMATION_MESSAGE);
        });

        JButton pasteButton = new JButton("\uD83D\uDCCB"); // Emoji для вставки из буфера обмена
        pasteButton.setBounds(218, 139, 50, 30); //ещё подвинь
        contentPane.add(pasteButton);
        pasteButton.addActionListener(e -> {
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable transferable = clipboard.getContents(null);
            if (transferable != null && transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                try {
                    String pastedText = (String) transferable.getTransferData(DataFlavor.stringFlavor);
                    textField1.setText(pastedText);
                } catch (UnsupportedFlavorException | IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        String[] options = {
                "Розрахунки та сортування",
                "1. Розрахунок кількості введених чисел",
                "2. Сортування масиву за зростанням",
                "3. Сортування масиву за спаданням",
                "4. Пошук найменшого числа",
                "5. Пошук найбільшого числа",
                "6. Розрахунок суми введених чисел"
        };
        JComboBox<String> choiceBox1 = new JComboBox<>(options);
        choiceBox1.setBounds(71, 238, 470, 43);
        contentPane.add(choiceBox1);

        JLabel choiceBoxLabel1 = new JLabel("Оберіть Варіант:");
        choiceBoxLabel1.setBounds(50, 200, 200, 25);
        contentPane.add(choiceBoxLabel1);

        String[] options3 = {"Статистичні показники", "10. Розрахунок середнього арифметичного введених чисел"};
        JComboBox<String> choiceBox3 = new JComboBox<>(options3);
        choiceBox3.setBounds(71, 380, 470, 43);
        contentPane.add(choiceBox3);

        JButton graphButton = new JButton("Побудова графіків");
        graphButton.setBounds(200, 461, 200, 43);
        contentPane.add(graphButton);

        JButton deleteButton2 = new JButton("\uD83D\uDDD1️"); // Emoji для мусорной корзины
        deleteButton2.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
        deleteButton2.setBounds(75, 139, 50, 30);
        contentPane.add(deleteButton2);
        deleteButton2.addActionListener(e -> {
            textField1.setText(""); // Очистка текстового поля
        });

        add(contentPane, BorderLayout.CENTER);

        setVisible(true);
    }

    private void applyDigitFilter(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                char c = evt.getKeyChar();
                if (!Character.isDigit(c) && c != KeyEvent.VK_MINUS && c != KeyEvent.VK_PLUS && c != KeyEvent.VK_SPACE && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
                    evt.consume();
                }
            }
        });
    }


    private void performPositiveNumberDeletion() {
        String text1 = textField1.getText();
        String text2 = textField2.getText();

        // Проверка на количество введенных чисел в массивах
        int[] array1 = parseArrayInput(text1);
        int[] array2 = parseArrayInput(text2);
        if (array1.length != array2.length) {
            JOptionPane.showMessageDialog(this, "Кількість введених чисел в обох масивах має бути однаковим.", "Помилка", JOptionPane.ERROR_MESSAGE);
            return;
        }

        array1 = PositiveNumberDeleter.deletePositiveNumbers(array1);
        array2 = PositiveNumberDeleter.deletePositiveNumbers(array2);

        int[] deletedFromArray1 = getDeletedPositiveNumbers(array1, array1);
        int[] deletedFromArray2 = getDeletedPositiveNumbers(array2, array2);

        textField1.setText(arrayToString(array1));
        textField2.setText(arrayToString(array2));

        StringBuilder message = new StringBuilder();
        message.append("<html><body style='font-size:14px;'>");
        message.append("<b>Введені числа з першого масиву:</b> ").append(text1).append("<br>");
        message.append("<b>Введені числа з другого масиву:</b> ").append(text2).append("<br>");
        message.append("<b>Обрана операція:</b> ").append(choiceBox2.getSelectedItem()).append("<br>");
        message.append("<b>Результат операції з масивами:</b><br>");
        message.append("<b>Масив 1:</b> ").append(arrayToString(array1)).append("<br>");
        message.append("<b>Масив 2:</b> ").append(arrayToString(array2)).append("<br>");
        message.append("<b>Видалені додатні числа з першого масиву:</b> ").append(arrayToString(deletedFromArray1)).append("<br>");
        message.append("<b>Видалені додатні числа з другого масиву:</b> ").append(arrayToString(deletedFromArray2)).append("<br>");
        message.append("</body></html>");

        JOptionPane.showMessageDialog(this, message.toString(), "Результат операції", JOptionPane.INFORMATION_MESSAGE);
    }

    // Измененный метод parseArrayInput для ввода через консоль
    private int[] parseArrayInput(String input) {
        String[] parts = input.trim().split("\\s+"); // Разделение введенной строки на отдельные числа
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            try {
                array[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                // Если не удалось преобразовать в int, выбрасываем исключение
                throw new NumberFormatException("Invalid input: " + parts[i]);
            }
        }
        return array;
    }

    // Исправлен метод getDeletedPositiveNumbers
    private int[] getDeletedPositiveNumbers(int[] originalArray, int[] modifiedArray) {
        int count = 0;
        for (int num : originalArray) {
            if (num > 0 && !contains(modifiedArray, num)) {
                count++;
            }
        }
        int[] deletedNumbers = new int[count];
        int index = 0;
        for (int num : originalArray) {
            if (num > 0 && !contains(modifiedArray, num)) {
                deletedNumbers[index++] = num;
            }
        }
        return deletedNumbers;
    }

    private boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    private String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interface::new);
    }
}
