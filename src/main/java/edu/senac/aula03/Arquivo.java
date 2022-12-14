package edu.senac.aula03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe corrigida para o Java 8
 */
public class Arquivo {

	private String nomeArquivo;
	private Path arquivo;

	public Arquivo() {
	}

	public void criarArquivo(String nomeArquivo) throws IOException {
		this.nomeArquivo = nomeArquivo;
		if (!Files.exists(Paths.get(nomeArquivo)))
			this.arquivo = Files.createFile(Paths.get(nomeArquivo));
		else
			this.arquivo = Paths.get(nomeArquivo);
	}

	public void escreverLinha(String linha) throws IOException {
		Files.write(this.arquivo, linha.getBytes(StandardCharsets.ISO_8859_1), StandardOpenOption.APPEND);
	}

	public List<String> linhas() throws IOException {
		List<String> linhas = new ArrayList<>();
		try (BufferedReader bufferedReader = Files.newBufferedReader(arquivo, StandardCharsets.ISO_8859_1)) {
			while (bufferedReader.lines().iterator().hasNext()) {
				String linha = bufferedReader.readLine();
				linhas.add(linha);
			}			
		}
		return linhas;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public Path getArquivo() {
		return arquivo;
	}

	public void setArquivo(Path arquivo) {
		this.arquivo = arquivo;
	}

}
