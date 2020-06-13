package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controller.Controle_livro;
import model.Livros;

public class Home extends  javax.swing.JFrame {
	
	private static final long serialVersionUID = 1L;
	private JLabel lbNome;
	
	private JButton btnDelet;
	private JButton btCadastrar;
	private JScrollPane barraRolagem;
	private JTable tabela;
	private DefaultTableModel modelo = new DefaultTableModel();
	private JButton Atualizar;
	private Home home;
	
	

	public Home() {
		 
		this.setTitle("Livraria");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(650, 600);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.lbNome = new JLabel("Livros");
		

		
	

		this.btCadastrar = new JButton("Cadastrar");
		btCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				Cadastrar c = new Cadastrar();
				c.setVisible(true);
          
				
			}
		});
		
		 this.btnDelet = new JButton("Delete");
		btnDelet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
			  Deletar d = new Deletar();
			d.setVisible(true);
				 
			}
		});
		
		
		Atualizar = new JButton("Atualizar");
		Atualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Atualizar a = new Atualizar();
				a.setVisible(true);
				
				
			}
		});

		
		
		JButton Refresh = new JButton("Refresh");
		Refresh.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				 
		 home.dispose();
			   
		 Home h = new Home();
			h.setVisible(true);

			new Controle_livro(h);
				 
			}
		});
		
		
		
		
		
		
		this.lbNome.setBounds(313, 11, 150, 20);
		this.btCadastrar.setBounds(37, 492, 200, 25);

		criarTabela();
		barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(37, 42, 580, 420);
		getContentPane().add(lbNome);
		getContentPane().add(btCadastrar);
		getContentPane().add(barraRolagem);
		btnDelet.setBounds(530, 493, 89, 23);
		
		getContentPane().add(btnDelet);
		
		
		Atualizar.setBounds(398, 493, 89, 23);
		getContentPane().add(Atualizar);
		Refresh.setBounds(267, 493, 89, 23);
		getContentPane().add(Refresh);
	
		
		
	}
	

	
	public void exibirAlerta(String mensagem) {
		JOptionPane.showMessageDialog(this, mensagem, "Atenção", JOptionPane.WARNING_MESSAGE);
	}

	private void criarTabela() {
		
		tabela = new JTable(modelo);
		modelo.addColumn("id");
		modelo.addColumn("Nome");
		modelo.addColumn("Autor");
		modelo.addColumn("Descrição");
		modelo.addColumn("Valor");
		tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(2).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(3).setPreferredWidth(200);
		tabela.getColumnModel().getColumn(4).setPreferredWidth(150);
	}

	public void adicionarContatoTabela(Livros livro) {
		System.out.println("nome"+livro.getNome());
		modelo.addRow(new Object[] { livro.getID(), livro.getNome(),livro.getAutor(),livro.getDescricao(),livro.getValor() });
	}
	
	
	public void ref(Home h) {
		this.home = h;
	}
	
	
	
	
	
	
	
	
	
	public void limparTabela() {
		modelo.setRowCount(0);  
		
	
	}
  
	
	public JLabel getLbNome() {
		return lbNome;
	}

	public void setLbNome(JLabel lbNome) {
		this.lbNome = lbNome;
	}

	

	


	public JButton getBtCadastrar() {
		return btCadastrar;
	}

	public void setBtCadastrar(JButton btCadastrar) {
		this.btCadastrar = btCadastrar;
	}

	public JScrollPane getBarraRolagem() {
		return barraRolagem;
	}

	public void setBarraRolagem(JScrollPane barraRolagem) {
		this.barraRolagem = barraRolagem;
	}

	public JTable getTabela() {
		return tabela;
	}

	public void setTabela(JTable tabela) {
		this.tabela = tabela;
	}

	public DefaultTableModel getModelo() {
		return modelo;
	}

	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public JButton getBtnDelet() {
		return btnDelet;
	}



	public void setBtnDelet(JButton btnDelet) {
		this.btnDelet = btnDelet;
	}
}
