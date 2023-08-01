package com.picoyplaca.ejercicio.controlador;

import com.picoyplaca.ejercicio.modelo.Message;
import com.picoyplaca.ejercicio.modelo.Placa;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class Logica {

    public Message validatePermission(Placa placa) {
        Message message = new Message();
        message.setResult(true);

        String lastDigit = placa.getLicense().substring(placa.getLicense().length() - 1);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(placa.getDateRestriction());
        int dayWeek = calendar.get(Calendar.DAY_OF_WEEK);

        Calendar calendarHour = Calendar.getInstance();
        calendarHour.setTime(placa.getHourRestriction());
        int hour = calendarHour.get(Calendar.HOUR_OF_DAY);
        int minutes = calendarHour.get(Calendar.MINUTE);

        if (!validateDate(placa.getDateRestriction()))
            return new Message("La fecha debe ser mayor o igual a la actual", false);

        if (!validateTime(placa.getHourRestriction(), placa.getDateRestriction()))
            return new Message("La hora debe ser mayor o igual a la actual", false);

        if(!validateHour(hour,minutes)){
            if (!validateDayWeek(dayWeek))
                return new Message("En la fecha ingresada no existe restricción", false);

            if (validateLicense(Integer.parseInt(lastDigit), dayWeek))
                return new Message("El vehiculo no puede circular", false);
        }
        return message;
    }

    public boolean validateDate(Date dateValidation) {
        return removeTime(dateValidation).compareTo(removeTime(new Date())) >= 0;
    }

    public boolean validateTime(Date hourValidation, Date dateValidation) {
        if(removeTime(dateValidation).compareTo(removeTime(new Date())) == 0)
            return removeDate(hourValidation).compareTo(removeDate(new Date())) >= 0;
        return true;
    }

    public boolean validateDayWeek(int dayWeek) {
        return dayWeek >= 2 && dayWeek <= 6;
    }

    public boolean validateLicense(int lastDigit, int dayWeek) {
       return (lastDigit == 1 || lastDigit == 2) && dayWeek == 2 ||
                (lastDigit == 3 || lastDigit == 4) && dayWeek == 3 ||
                (lastDigit == 5 || lastDigit == 6) && dayWeek == 4 ||
                (lastDigit == 7 || lastDigit == 8) && dayWeek == 5 ||
                (lastDigit == 9 || lastDigit == 0) && dayWeek == 6;
    }

    public boolean validateHour(int hour, int minutes){
        if(hour >= 6 && hour <= 8 || hour == 9 && minutes <= 30 || hour >=16 && hour <= 19 || hour == 20 && minutes == 0)
            return false;
        return true;
    }

    public static Date removeTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date removeDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.YEAR, 1970);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        return cal.getTime();

    }

}
