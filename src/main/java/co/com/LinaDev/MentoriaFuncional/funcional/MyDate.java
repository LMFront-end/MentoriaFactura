package co.com.LinaDev.MentoriaFuncional.funcional;


import java.time.LocalDate;


public class MyDate {

    private LocalDate date;


    public MyDate(String inputDate) {
        date = LocalDate.parse(inputDate);
    }
}
