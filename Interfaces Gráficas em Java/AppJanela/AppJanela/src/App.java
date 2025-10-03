
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame form = new JFrame ("Aplicação Teste de Janela");
        form.setSize(600, 400);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null); //Centraliza Janela ao ser apresentada
        form.setLayout(null);//trabalha sem gerenciador de layout

        Font fontArialBold16 = new Font("Arial", Font.BOLD, 16);       
       
        //Inserindo um JLabel
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10,20,100,30);
        form.add(lblNome);

        //Alterando a fonte do JLabel************************
        lblNome.setFont(fontArialBold16);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(10,80,100,30);
        form.add(lblCpf);        

        //Inserir Caixa de texto(JTextField)
        JTextField  jtfNome = new JTextField();
        jtfNome.setBounds(10, 55, 200, 30);
        form.add(jtfNome);

        JTextField jtfCpf = new JTextField();
        jtfCpf.setBounds(10, 115, 200, 30);
        form.add(jtfCpf);

        //Alterando a cor do fundo
        form.getContentPane().setBackground(new Color(100, 110, 150));

        //Adicionando um JButton no form

        JButton btnOK = new JButton("OK");
        btnOK.setBounds(10, 200, 100, 30);
        form.add(btnOK);

        //Processando o evento de click do botão versão antiga
        //btnOK.addActionListener(new ActionListener() {

            //@Override
            //public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(null, "O Nome digitado é:  " + jtfNome.getText());

           // }
            
        //});

        btnOK.addActionListener(e -> JOptionPane.showMessageDialog(null, "O Nome digitado é:  " + jtfNome.getText()));






        

        form.setVisible(true);
    }
}
