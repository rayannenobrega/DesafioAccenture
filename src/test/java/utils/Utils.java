package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String criaDataFuturaByAnos(int anos){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.now().plusYears(anos).format(formatter);
    }

    public static String criaDataAnteriorByAnos(int anos){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.now().minusYears(anos).format(formatter);
    }
}
