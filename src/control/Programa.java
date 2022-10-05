package control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programa {
	
	public static Integer defineGrupo(List<String> vitorias)
	{		
		Integer quantVit = Collections.frequency(vitorias, "V");
			
		if(quantVit == 1 || quantVit == 2) 
		{
			return 3;
		}
		else if(quantVit == 3 || quantVit == 4) 
		{
			return 2;
		}
		else if(quantVit == 5 || quantVit == 6) 
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		List<String> vitorias = new ArrayList<String>();
		
		for(int count = 0; count < 6; count++)
		{

			System.out.println("Digite o resultado do Jogo " + (count+1));
			Scanner input = new Scanner(System.in);
			String resultado = input.nextLine();
			vitorias.add(resultado);
		}
		
		System.out.println(defineGrupo(vitorias));
	}
}
