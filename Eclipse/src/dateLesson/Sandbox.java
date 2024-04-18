package dateLesson;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Sandbox {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());		// 2024-04-18
		System.out.println(LocalTime.now());		// 16:02:42.916124100
		System.out.println(LocalDateTime.now());	// 2024-04-18T16:02:42.916124100
		
		System.out.println(LocalDate.of(2025, 1, 13));	// 2025-01-13
		System.out.println(LocalTime.of(15, 8, 32));	// 15:08:32
		System.out.println(LocalDateTime.of(2025, 1, 13, 15, 8, 32)); // 2025-01-13T15:08:32
		
		// 文字列から日付の生成
		System.out.println(LocalDate.parse("2025-01-13"));
		System.out.println(LocalTime.parse("15:08:32"));
		System.out.println(LocalDateTime.parse("2025-01-13T15:08:32"));
		
		// フォーマットを作成して表示
		var dateFormat = DateTimeFormatter.ofPattern("y年M月d日eeee");
		var timeFormat = DateTimeFormatter.ofPattern("ah時m分s秒");
		var fmt = DateTimeFormatter.ofPattern("y年M月d日eeee ah時m分s秒");
		System.out.println(LocalDate.of(2025, 1, 13).format(dateFormat) );	// 2025年1月13日月曜日
		System.out.println(LocalTime.of(15, 8, 32).format(timeFormat) );	// 午後3時8分32秒
		System.out.println(LocalDateTime.of(2025, 1, 13, 15, 8, 32).format(fmt) ); // 2025年1月13日月曜日 午後3時8分32秒
		
		// 和暦
		var dateFormatjp = DateTimeFormatter.ofPattern("Gy年M月d日eeee");
		var jdate = JapaneseDate.from(LocalDate.of(2025,  1, 13));
		System.out.println(jdate.format(dateFormatjp)); // 令和7年1月13日月曜日
		
		// 日付の比較
		var day1 = LocalDate.of(2024, 11, 20);
		var day2 = LocalDate.of(2025, 1, 13);		
		System.out.println(day1.isAfter(day2));		// false
		System.out.println(day1.isBefore(day2));	// true
		System.out.println(day1.equals(day2));		// false
		System.out.println(day1.isLeapYear());		// true
		
		// 日時の加算
		var day = LocalDate.of(2024, 11, 20);
		var time = LocalTime.of(15, 8, 32);
		System.out.println( day.plusYears(3).plusMonths(2).plusDays(6)); // 2028-01-26
		System.out.println( time.plusHours(3).plusMinutes(15)); // 18:23:32
		
		// 日付についての期間の計算
		LocalDate start = LocalDate.of(2023,  1, 13);
		LocalDate end = LocalDate.of(2025, 1, 1);
		System.out.println( ChronoUnit.MONTHS.between(start, end) + "ヶ月");
		System.out.println( ChronoUnit.DAYS.between(start, end) + "日間");
		var p = Period.between(start, end);
		System.out.printf( "%d年%dヶ月%d日%n", p.getYears(), p.getMonths(), p.getDays() );
		/*
		23ヶ月
		719日間
		1年11ヶ月19日
		*/
		
		// 時間についての期間の計算
		LocalTime startTime = LocalTime.of(10, 0, 0);
		LocalTime endTime = LocalTime.of(18, 33, 45);
		var d = Duration.between(startTime, endTime);
		System.out.println( d.toMinutes() + "分間");
		System.out.println( d.toSeconds() + "秒間");
		/*
		513分間
		30825秒間	
		 */
		
		

	}

}
