package ParentClasses;

import Enums.SEX;

public class GrammarUtils {
    public static String genderify(String verb, SEX sex){
        switch (sex) {
            case FEMALE -> {
                if (verb.endsWith("л")) {
                    return verb + "a";
                } else {
                    return verb + "ла";
                }
            }
            case MALE -> {
                return verb;
            }
            default -> {
                return verb + "о";
            }
        }
    }
}
