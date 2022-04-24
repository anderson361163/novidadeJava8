package br.com.alura.data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ApiData {
	public static void main(String[] args) {
		
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println("------------------");
		
		LocalDate dataOlimpiada = LocalDate.of(2016, Month.JUNE, 5);
		System.out.println(dataOlimpiada);
		
		System.out.println("------------------");
		
		int anos = dataOlimpiada.getYear() - hoje.getYear();
		
		System.out.println("As olimpiadas ocorreram há: "+ (anos*(-1)));
		
		System.out.println("------------------");
		
		Period periodo = Period.between(hoje, dataOlimpiada);
		System.out.println("Foram "+periodo.getDays()+" que passou a copa do Rio");
		
		System.out.println("------------------");
		
		//as datas manipuladas são imutaveis
		LocalDate plusYears = dataOlimpiada.plusYears(4);
		
		System.out.println("A copa da Russia ocorreu em: " + plusYears);
		
		System.out.println("------------------");
		
		DateTimeFormatter formatdor = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String dataFormatada = dataOlimpiada.format(formatdor);
		
		System.out.println("Data Formatada: " + dataFormatada);
		
		System.out.println("------------------");
		
		LocalDateTime agoraHora = LocalDateTime.now();
		LocalDate agoraHoraConvertido = agoraHora.toLocalDate();
		
		System.out.println("Converter LocalDateTime em LocalDate: " + agoraHoraConvertido);
		
		System.out.println("------------------");
		
		boolean issoEhDepois2022 = dataOlimpiada.isAfter(LocalDate.of(1,1,1));
		
		System.out.println("As Olimpiadas foram depois de Cristo (D.C)? " + issoEhDepois2022);
		
		LocalDate olimpiadaRio = LocalDate.parse("2018-05-06", DateTimeFormatter.ISO_LOCAL_DATE);
	    LocalDate dataHoje = LocalDate.parse("2018-05-30", DateTimeFormatter.ISO_LOCAL_DATE);
	    
	    System.out.println("------------------");
	    
	    long diferencaDias = ChronoUnit.DAYS.between(olimpiadaRio, dataHoje);

	    System.out.println("Diferença de dias: "+ diferencaDias);
		
	    System.out.println("------------------");
		
	    LocalTime cafeTarde = LocalTime.of(12, 30);
	    
	    System.out.println("Horário do café da tarde é: "+cafeTarde);
	    System.out.println("------------------");
	    
	
	}
}
