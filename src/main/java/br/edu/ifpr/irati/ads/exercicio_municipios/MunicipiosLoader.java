package br.edu.ifpr.irati.ads.exercicio_municipios;

import br.edu.ifpr.irati.ads.IArray;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class MunicipiosLoader {

    public static IArray<Municipio> load(String path) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(path));
            CSVReader csvReader = new CSVReaderBuilder(reader)
                    .withSkipLines(1)
                    .build();

            Iterator<String[]> iterator = csvReader.iterator();

            while (iterator.hasNext()) {
                String[] linha = iterator.next();
            }

        } catch (IOException e) {
            System.out.println("Arquivo não localizado!");
            System.exit(-1);
        }

        return null;
    }

    static void main(String[] args) {
        load("C:\\Users\\Aluno\\Downloads\\municipios.csv");
    }

}
