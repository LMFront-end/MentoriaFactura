package co.com.LinaDev.MentoriaFuncional.funcional;


import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@ToString
public class MyDate {

    private final LocalDate date;


    public MyDate(String inputDate) {
        date = LocalDate.parse(inputDate);
    }

    public Boolean isAfter(MyDate myDate){
        return date.isAfter(myDate.getDate());
    }
}
