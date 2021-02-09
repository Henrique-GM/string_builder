/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbilder;

import entidades.Comentario;
import entidades.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Henrique
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
        
        Comentario c1 = new Comentario("Tenha uma ótima viagem!");
        Comentario c2 = new Comentario("Uau isso é incrível!");
        
        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
                "Viajando em nova Zelandia", 
                "Vou visitar esse país maravilhoso",
                12);
        
        p1.adicionarComentarios(c1);
        p1.adicionarComentarios(c2);
        
        System.out.println(p1);
    }
    
}
