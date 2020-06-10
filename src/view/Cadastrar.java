package view;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import controller.ControleCadastrar;
import model.Livros;

public class Cadastrar  extends javax.swing.JFrame  {

 
	private static final long serialVersionUID = 1L;

	public Cadastrar() {
		this.setTitle("Cadastrar livro");
	        initComponents();
	    }
 
	    private void initComponents() {

	        salvar = new javax.swing.JButton();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	        salvar.setText("Salvar");
	        salvar.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                jButton1ActionPerformed(evt);
	            }
	        });
	        
	        name = new JTextField();
	        name.setColumns(10);
	        
	        dis = new JTextField();
	        dis.setColumns(10);
	        
	        Autor = new JTextField();
	        Autor.setColumns(10);
	        
	        JLabel lblNewLabel = new JLabel("Nome");
	        
	        JLabel lblDiscrio = new JLabel("Discri\u00E7\u00E3o");
	        
	        JLabel lblAltor = new JLabel("Autor");
	        
	        JLabel lblNewLabel_1 = new JLabel("Cadastrar livros");
	        
	        Valor = new JTextField();
	        Valor.setText("R$:");
	        Valor.setColumns(10);
	        
	        JLabel lblValor = new JLabel("Valor");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        layout.setHorizontalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(147)
	        					.addComponent(salvar))
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(99)
	        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
	        						.addComponent(dis, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(name, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lblNewLabel)
	        						.addComponent(lblDiscrio, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(Valor, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lblValor, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lblAltor, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(Autor, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
	        				.addGroup(layout.createSequentialGroup()
	        					.addGap(137)
	        					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)))
	        			.addContainerGap(109, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	        	layout.createParallelGroup(Alignment.LEADING)
	        		.addGroup(layout.createSequentialGroup()
	        			.addContainerGap()
	        			.addComponent(lblNewLabel_1)
	        			.addGap(31)
	        			.addComponent(lblNewLabel)
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addGap(7)
	        			.addComponent(lblDiscrio)
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(dis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(lblAltor)
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(Autor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addGap(13)
	        			.addComponent(lblValor)
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(Valor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addComponent(salvar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        			.addGap(54))
	        );
	        getContentPane().setLayout(layout);

	        pack();
	    }                       

	    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	    	ControleCadastrar obj =new ControleCadastrar();
	        	
	        Livros li =new Livros();
	        
	        li.setNome(name.getText());
	        li.setDescricao(dis.getText());
	        li.setAutor(Autor.getText());
	        li.setValor(Valor.getText());
	    	 
	         obj.salvarB(li);
	         this.dispose();
	    }                                          

	                        
	    private javax.swing.JButton salvar;
	    private JTextField name;
	    private JTextField dis;
	    private JTextField Autor;
	    private JTextField Valor;
	   
   
	   

		

		public void setName(JTextField Name) {
			name = Name;
		}

		public JTextField getAltor() {
			return dis;
		}

		public void setAltor(JTextField altor) {
			dis = altor;
		}

		public JTextField getDis() {
			return Autor;
		}

		public void setDis(JTextField dis) {
			Autor = dis;
		}
}
