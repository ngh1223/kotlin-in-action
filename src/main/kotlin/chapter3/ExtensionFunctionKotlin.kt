package chapter3

// 확장함수
fun <T> Collection<T>.extensionFunction() {
    println("Extension")
}

fun Collection<String>.extensionString() {
    println("String")
}

// 확장 프로퍼티
val String.lastChar: Char
    get() = get(length - 1)

class ExtensionFunctionKotlin {
    private val list = listOf(1,2)
    private val stringSet = setOf<String>()

    fun test() {
        // 컬렉션 객체가 원래 가지고있는것처럼 사용 가능
        list.extensionFunction()
        stringSet.extensionString()

        "확장프로퍼티".lastChar
    }

    fun test2(args: Array<String>){
        val list = listOf(*args)
        print(args)
    }

    fun test3(vararg args: String){
        val list = listOf(*args)
        print(args)
    }
}