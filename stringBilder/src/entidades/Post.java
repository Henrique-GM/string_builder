/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Henrique
 */
public class Post {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;
    
    private List<Comentario> comentarios = new ArrayList<>();
    
    public Post() {
    }

    public Post(Date momento, String titulo, String conteudo, Integer curtidas) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public void adicionarComentarios(Comentario comentario) {
        comentarios.add(comentario);
    }
    
    public void removerComentarios(Comentario comentario) {
        comentarios.remove(comentario);
    }
    
    //Quando na função toString está muito grande se usa StringBuilder
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); 
        //Significa acrescentar no final.
        sb.append(titulo + "\n");
        sb.append(curtidas);
        sb.append(" Likes - ");
        sb.append(sdf.format(momento) + "\n");
        sb.append(conteudo + "\n");
        sb.append("Comentario: \n");
        //Usando o for no StringBuilder
        for (Comentario c : comentarios) {
            sb.append(c.getTexto() + "\n");
        }
        
        return sb.toString();
    }
    
    
}
