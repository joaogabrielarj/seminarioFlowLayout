import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
public class Janela extends JFrame {

    
    private JButton bConfirm, bWant, bPlus;
    private JLabel imagemLabel;
    private JLabel loginLabel;
    private JTextField loginTexto;
    private JLabel senhaLabel;
    private JPasswordField senhaTexto;

    public Janela() {

        super("Aula de Programação 2 com Emanoel Barreiros");

        setLayout(new FlowLayout(FlowLayout.LEFT));

    
        ImageIcon imagemOriginal = new ImageIcon("Imagem\\cartaz.png");

        
        Image imagemRedimensionada = imagemOriginal.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon imagem = new ImageIcon(imagemRedimensionada);

        imagemLabel = new JLabel(imagem);
        add(imagemLabel);

        
        bConfirm = new JButton("Confirmar Presença");
        bWant = new JButton("Quero me Inscrever");
        bPlus = new JButton("Saiba Mais!");

        FlowLayout flow = new FlowLayout();
        setLayout(flow);

       
        add(bConfirm);
        add(bPlus);
        add(bWant);

        
        JPanel quadradosCaixinhas = new JPanel();
        quadradosCaixinhas.setLayout(new BoxLayout(quadradosCaixinhas, BoxLayout.Y_AXIS));

        
        loginLabel = new JLabel("Login:");
        loginTexto = new JTextField(15);
        quadradosCaixinhas.add(loginLabel);
        quadradosCaixinhas.add(loginTexto);

        
        quadradosCaixinhas.add(Box.createVerticalStrut(10));

        
        senhaLabel = new JLabel("Senha:");
        senhaTexto = new JPasswordField(15);
        quadradosCaixinhas.add(senhaLabel);
        quadradosCaixinhas.add(senhaTexto);

        
        JPanel quadradoPrincipal = new JPanel(new FlowLayout(FlowLayout.CENTER));
        quadradoPrincipal.add(quadradosCaixinhas);

        
        add(quadradoPrincipal);

        setResizable(true);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 650);
        // pack();
    }

    public static void main(String[] args) {
        new Janela();
    }
}
