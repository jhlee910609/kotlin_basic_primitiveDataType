// java의 main entry 부
fun main(args: Array<String>) {
	
	// System.out.println();
	println("hello")
	println(makeMessage(2));

	// String name = "junhee";
	val name: String = "junhee";
	println(name);

	// int age = 3;
	val age: Int = 3;
	
	val strInt: String = "내 나이는 [" + age + "] 세 입니다.";
	println(strInt);

	bark();

	// 2. String 연습 
	val s1 = "My name is\njunhee";
	println(s1);

	val s2 = """
      >대한민국
      >만세만세
			 """.trimMargin(">");
 	println(s2);
	
	val myAge : String = "7";
	// Integer.parseInt(string); -> string.toInt(); 로 한방에 파싱가능 
	println(myAge.toInt() + 3);
	
	// 배열 선언 
	val item = arrayOf("apple", "pear", "orange");
	
	// for-each 을 아래와 같이 사용할 수 있음 
	for(fruit in item){
		print(fruit + ", ");
	}
	
	// 0~4까지 size 5만큼 i*i를 인자로 갖는 Array를 생성 
	val num = Array<String>(5, {i -> (i*i).toString()});
	
	// kotlin의 for-each 문 
	for(number in num){
		println(number);
	}
	
}

// String makeMeesage(int sth) 함수 만들
fun makeMessage(msgType: Int): String {
	return if (msgType == 1) "1 입니다." else "잘못 선택하셨습니다."
}

// void bark();
fun bark() {
	println("멍멍");
}

