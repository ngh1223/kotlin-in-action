package chapter3;

import java.util.ArrayList;

public class ExtensionFunctionJava {

    public void test() {
        // 자바에서 호출 가능
        ExtensionFunctionKotlinKt.extensionFunction(new ArrayList<>());
    }

    private void args(String...as){
        for (String a: as) {
        }
    }
}
