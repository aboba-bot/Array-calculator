import javax.swing.*;
import java.awt.*;
public class Interface extends JFrame {
    public Interface() {
        super("Array Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        JPanel contentPane = new JPanel();
        contentPane.setLayout(null);

        JTextField textField1 = new JTextField();
        textField1.setBounds(75, 106, 200, 25);
        contentPane.add(textField1);

        JTextField textField2 = new JTextField();
        textField2.setBounds(342, 106, 200, 25);
        contentPane.add(textField2);

        JButton historyButton1 = new JButton("\uD83D\uDD03"); // Emoji для истории
        historyButton1.setBounds(261, 72, 80, 27);
        contentPane.add(historyButton1);

        JButton resetButton = new JButton("\uD83D\uDD70"); // Emoji для истории (стрелка влево)
        resetButton.setBounds(261, 167, 80, 27);
        contentPane.add(resetButton);

        JLabel label1 = new JLabel("Array 1");
        label1.setBounds(150, 80, 80, 25);
        contentPane.add(label1);

        JLabel label2 = new JLabel("Array 2");
        label2.setBounds(420, 80, 80, 25);
        contentPane.add(label2);

        JButton deleteButton1 = new JButton("\uD83D\uDDD1️"); // Emoji для мусорной корзины
        deleteButton1.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
        deleteButton1.setBounds(342, 139, 50, 30);
        contentPane.add(deleteButton1);

        JButton historyButton2 = new JButton("history");
        historyButton2.setBounds(395, 139, 80, 27);
        contentPane.add(historyButton2);

        JButton button1 = new JButton("Button");
        button1.setBounds(448, 139, 80, 27);
        contentPane.add(button1);

        JButton historyButton3 = new JButton("history");
        historyButton3.setBounds(128, 139, 80, 27);
        contentPane.add(historyButton3);

        JButton button2 = new JButton("Button");
        button2.setBounds(181, 139, 80, 27);
        contentPane.add(button2);

        String[] options = {"Розрахунки та сортування"};
        JComboBox<String> choiceBox1 = new JComboBox<>(options);
        choiceBox1.setBounds(71, 238, 417, 43);
        contentPane.add(choiceBox1);

        JLabel choiceBoxLabel1 = new JLabel("Оберіть Варіант");
        choiceBoxLabel1.setBounds(50, 200, 200, 25);
        contentPane.add(choiceBoxLabel1);

        String[] options2 = {"Видалення елементів"};
        JComboBox<String> choiceBox2 = new JComboBox<>(options2);
        choiceBox2.setBounds(71, 311, 417, 43);
        contentPane.add(choiceBox2);

        String[] options3 = {"Статистичні показники"};
        JComboBox<String> choiceBox3 = new JComboBox<>(options3);
        choiceBox3.setBounds(71, 380, 417, 43);
        contentPane.add(choiceBox3);

        JButton graphButton = new JButton("Побудова графіків");
        graphButton.setBounds(192, 461, 200, 43);
        contentPane.add(graphButton);

        JButton deleteButton2 = new JButton("\uD83D\uDDD1️"); // Emoji для мусорной корзины
        deleteButton2.setFont(new Font("Arial Unicode MS", Font.BOLD, 20));
        deleteButton2.setBounds(75, 139, 50, 30);
        contentPane.add(deleteButton2);

        add(contentPane, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Interface::new);
    }
}
