/*https://youtu.be/A3TCFgKKseI?list=PLdvD02W3316JtVoctAc_Dg_1PefHgaFYI*/
package projetoLocadora.model;

import java.util.Date;

public class Item {
  
    private Integer codItem;
    private double preco;
    private String tipo;
    private Date dataLocacao;
    private Date dataDevolucao;
    private Filme filme;
    private Cliente cliente;
}
