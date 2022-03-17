package co.com.LinaDev.MentoriaFuncional.funcional;


import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MyDate {

    private final LocalDate date;


    public MyDate(String inputDate) {
        date = LocalDate.parse(inputDate);
    }
}
