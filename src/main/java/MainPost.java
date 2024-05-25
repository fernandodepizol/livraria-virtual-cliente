import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class MainPost {

	public static void main(String[] args) {
		
		Livro livro = new Livro(4L, "Livro C", "ISBN-8888", "Genero A", 19.90, "Autor 1");
		Livro livroResposta = ClientBuilder.newClient()
				.target("http://localhost:8080/livraria-virtual")
				.path("livro")
				.request()
				.post(Entity.entity(livro, MediaType.APPLICATION_XML), Livro.class);
		
		
	
		
		System.out.println(livroResposta.getTitulo());

	}

}
