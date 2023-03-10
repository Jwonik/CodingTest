package programmers;

import java.time.DayOfWeek;
import java.time.LocalDate;

// 2016년
class Solution02 {
   public String solution(int a, int b) {
        String answer = "";
        String[] week = {"MON","TUE","WED","THU","FRI","SAT", "SUN"};
        
        LocalDate date = LocalDate.of(2016, a, b);
        System.out.println(date);
        
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        int dayOfWeekNumber = dayOfWeek.getValue();
        
        answer = week[dayOfWeekNumber-1];
        
        return answer;
    }
}
