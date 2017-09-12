package kotlin.basic

class Hello {
	
	fun main(args:ArrayList<String>){
		makeMessage(2);
	}
	
	fun makeMessage(msgType : Int) : String{
		return if (msgType == 1) "hi" else "bye";
	}
}