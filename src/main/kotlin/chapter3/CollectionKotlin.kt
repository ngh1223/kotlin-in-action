package chapter3

// 최상위 프로터티
const val DEFINE = "DEFINE"

class CollectionKotlin {
    val hashSet = hashSetOf<String>()
    val linkedSet = linkedSetOf(1, 2)
    val map = mapOf<Int, String>()
}

// default 값을 선언할 수 있음
// 최상위 함수
fun <T> joinToString(
    collection: Collection<T>,
    separator: String = "",
    prefix: String = ""
) : String {
    var result = prefix;
    for((index, element) in collection.withIndex()) {
        if(index > 0)
            result += separator
        result += element
    }
    return result
}

// 코틀린은 파라미터를 선택적으로 사용할 수 있음
fun test() {
    println(joinToString(setOf(1,2), separator = "."))
    println(joinToString(setOf(2,3), prefix = "!"))
}

