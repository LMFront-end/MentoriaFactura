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

    // after
    public Boolean isAfter(MyDate myDate){
        return date.isAfter(myDate.getDate());
    }

    // before
    public Boolean isABefore(MyDate myDate){
        return date.isBefore(myDate.getDate());
    }
}
