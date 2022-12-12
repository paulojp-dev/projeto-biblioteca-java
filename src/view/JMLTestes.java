
package view;

import model.Livro;

public class JMLTestes {
    public static void main(String[] args) {
    	Livro livro = new Livro(1, "exemplar", "autor", Byte.parseByte("127"), Short.parseShort("1"), "disponivel");
    	System.out.println(livro.getId());
    	byte b = 127;
    	
    }
    
}
