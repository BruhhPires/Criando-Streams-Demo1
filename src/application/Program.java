package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> st1 = list.stream().map(x -> x *10); // CRIA A STREAM APARTIR DE UMA 'COLEÇÃO' E USA O MAPA PRA APLICAR A FUNÇÃO NOS VALORES *INTEGER*
		System.out.println(Arrays.toString(st1.toArray())); // IMPRIME A STREAM COM A OPERAÇÃO 'toArray'(VETOR)
		
		Stream<String> st2 = Stream.of("Maria", "Bob", "Jow"); // CRIA A STREAM APARTIR DE UMA 'STREAM.OF' E ACOMODA STRINGS
		System.out.println(Arrays.toString(st2.toArray())); // IMPRIME A STREAM COM A OPERAÇÃO 'toArray'(VETOR) 
		
		Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // CRIA STREAM APARTIR DE UMA ITERAÇÃO = 1 ELEMENTO É INCIO, 2 ELEMENTO É A ITERAÇÃO. 
		System.out.println(Arrays.toString(st3.limit(10).toArray())); // IMPRIME A STREAM COM LIMITE 10 E O TOARRAY PARA TRANSOFRMAR EM VETOR

		Stream<Long> st4 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map( p -> p [0]); //SEQUENCIA DE FIBONACCI
		System.out.println(Arrays.toString(st4.limit(10).toArray()));

	}

}
