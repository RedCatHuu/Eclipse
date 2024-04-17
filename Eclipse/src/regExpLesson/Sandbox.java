package regExpLesson;

public class Sandbox {

	public static void main(String[] args) {
		Reg.test("Tom", "Tom", "tom"); // Tom    〇 Tom    × tom  
		Reg.test(".im", "Jim", "Tom"); // .im    〇 Jim    × Tom  
		Reg.test("[a-z]xx", "Axx", "gxx", "8xx");	// [a-z]xx    × Axx    〇 gxx    × 8xx  
		Reg.test("[a-zA-z]xx", "Axx", "gxx", "8xx"); // [a-zA-z]xx    〇 Axx    〇 gxx    × 8xx
		Reg.test("[PSA]xx", "Axx", "qxx", "8xx");	// [PSA]xx    〇 Axx    × qxx    × 8xx
		Reg.test("[^PSA]xx", "Axx", "qxx", "8xx");	// [^PSA]xx    × Axx    〇 qxx    〇 8xx
		Reg.test(".*apple", "XXXapple", "XXX", "apple");	// .*apple    〇 XXXapple    × XXX    〇 apple
		Reg.test(".+apple", "XXXapple", "XXX", "apple");	//.+apple    〇 XXXapple    × XXX    × apple
		Reg.test("^apple.*", "appleXX", "apple", "XXappleXX");	// ^apple.*    〇 appleXX    〇 apple    × XXappleXX
		Reg.test(".*apple$", "XXapple", "apple", "XXappleXX");	// .*apple$    〇 XXapple    〇 apple    × XXappleX
		Reg.test("\\d+", "2301", "apple_#");	// \d+    〇 2301    × apple_#
		Reg.test("\\D+", "2301", "apple_#");	// \D+    × 2301    〇 apple_#
		Reg.test("ap\\s+ple", "ap  ple", "ap##ple");	// ap\s+ple    〇 ap  ple    × ap##ple
		Reg.test("ap\\S+ple", "ap  ple", "ap##ple");	// ap\S+ple    × ap  ple    〇 ap##ple
		Reg.test("\\w+", "apple_12", "#$%&");	// \w+    〇 apple_12    × #$%&
		Reg.test("\\W+", "apple_12", "#$%&");	// \W+    × apple_12    〇 #$%&
		Reg.test("\\d{3}", "123", "1234", "12345", "123456");	// \d{3}    〇 123    × 1234    × 12345    × 123456
		Reg.test("\\d{3,}", "123", "1234", "12345", "123456");	// \d{3,}    〇 123    〇 1234    〇 12345    〇 123456
		Reg.test("\\d{3,5}", "123", "1234", "12345", "123456");	// \d{3,5}    〇 123    〇 1234    〇 12345    × 123456
		Reg.test("[TJ]im|[Tt]om|[Ss]am", "Jim", "Kim", "tom", "sam");	// [TJ]im|[Tt]om|[Ss]am    〇 Jim    × Kim    〇 tom    〇 sam
		Reg.test("(1[012]|[1-9])(am|pm)", "10am", "8pm", "13pm", "1km");
		// (1[012]|[1-9])(am|pm)    〇 10am    〇 8pm    × 13pm    × 1km
		Reg.test("(?i)(tim|tom|sam)", "Tim", "Kim", "Tom", "Sam");	// (?i)(tim|tom|sam)    〇 Tim    × Kim    〇 Tom    〇 Sam
		Reg.test("(?-i)(tim|tom|sam)", "Tim", "Kim", "Tom", "Sam");	// (?-i)(tim|tom|sam)    × Tim    × Kim    × Tom    × Sam 
		Reg.test("(?=.*tom).*", "xtom130", "tom", "tom.138");	// (?=.*tom).*    〇 xtom130    〇 tom    〇 tom.138
		Reg.test("(?!.*tom).*", "xtom130", "tom", "tom.138");	// (?!.*tom).*    × xtom130    × tom    × tom.138
		Reg.test("(?=.*tom).{6,10}", "tom130", "tom", "tom.13$"); // (?=.*tom).{6,10}    〇 tom130    × tom    〇 tom.13$
		Reg.test("(?=.*tom)\\w+", "tom130", "tom", "tom.13$");	// (?=.*tom)\w+    〇 tom130    〇 tom    × tom.13$
		Reg.test("(?=.*tom)(?=.*[@#$%]).*", "tom130", "tom", "tom.13$");	//(?=.*tom)(?=.*[@#$%]).*    × tom130    × tom    〇 tom.13$
		Reg.test("(?=.*tom)(?!.*[0-9]).*", "tom130", "tom", "tom.13$");	// (?=.*tom)(?!.*[0-9]).*    × tom130    〇 tom    × tom.13$
		
		Reg.test("\\d{3}-\\d{4}", "123-1234", "a23-1234");
		Reg.test("^(ab|cc)2[0-9]\\d{4}", "ab201234", "ab21123456");
		
	}

}
