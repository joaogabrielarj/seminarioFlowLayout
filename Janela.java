import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Janela extends JFrame {

    private JButton bConfirm, bWant, bPlus, bSair, bOk;
    private JLabel imagemLabel;

    public Janela() {

        super("Aula de Programação 2 com Emanoel Barreiros");

        // Definir o layout principal como FlowLayout
        setLayout(new FlowLayout(FlowLayout.LEFT));

        // Carregar a imagem e adicionar à janela
        ImageIcon imagemOriginal = new ImageIcon("Imagem\\cartaz.png");
        Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon imagem = new ImageIcon(imagemRedimensionada);
        imagemLabel = new JLabel(imagem);
        add(imagemLabel);

        // Adicionar os botões de ação
        bConfirm = new JButton("Confirmar Presença");
        bWant = new JButton("Quero me Inscrever");
        bPlus = new JButton("Saiba Mais!");

        add(bConfirm);
        add(bPlus);
        add(bWant);

        JPanel quadradosCaixinhas = new JPanel();
        quadradosCaixinhas.setLayout(new FlowLayout(FlowLayout.CENTER));

        add(quadradosCaixinhas);

        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 650);

        bConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll();
                setLayout(new FlowLayout(FlowLayout.CENTER));

                ImageIcon novaImagem = new ImageIcon("Imagem\\confirmed.png");
                Image imagemNovaRedimensionada = novaImagem.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                ImageIcon imagemCentralizada = new ImageIcon(imagemNovaRedimensionada);
                JLabel imagemCentral = new JLabel(imagemCentralizada);
                add(imagemCentral);

                bSair = new JButton("Sair");
                bSair.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0); // Fecha o programa
                    }
                });
                add(bSair);

                revalidate();
                repaint();
            }
        });

        // Ação do botão Saiba Mais
        bPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll(); // Limpa a tela
                setLayout(new FlowLayout(FlowLayout.CENTER)); // Usar FlowLayout

                // Exibir o texto no topo
                JLabel textoTopo = new JLabel("Este é um evento que ensina as melhores práticas de Java do mercado");
                add(textoTopo);

                // Adicionar botão "Sair"
                bSair = new JButton("Sair");
                bSair.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0); // Fecha o programa
                    }
                });
                add(bSair);

                revalidate();
                repaint();
            }
        });

        // Ação do botão Quero me Inscrever
        bWant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getContentPane().removeAll(); // Limpa a tela
                setLayout(new FlowLayout(FlowLayout.CENTER)); // Usar FlowLayout

                // Adicionar os campos do formulário
                add(new JLabel("Nome:"));
                JTextField nomeCampo = new JTextField(15);
                add(nomeCampo);

                add(new JLabel("Sobrenome:"));
                JTextField sobrenomeCampo = new JTextField(15);
                add(sobrenomeCampo);

                add(new JLabel("Número:"));
                JTextField numeroCampo = new JTextField(15);
                add(numeroCampo);

                // Adicionar o botão OK
                bOk = new JButton("OK");
                bOk.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0); // Fecha o programa
                    }
                });
                add(bOk);

                revalidate();
                repaint();
            }
        });
    }
}
