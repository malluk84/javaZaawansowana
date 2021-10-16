package adnotacje;

import java.lang.reflect.Field;

public class TeddyBearNameLengthValidator {

    public static boolean validate(Object o) throws IllegalAccessException {
        Field[] fields = o.getClass().getDeclaredFields();
        for (Field field : fields) {
            MaxLength annotation = field.getAnnotation(MaxLength.class);
            if (annotation != null) {
                field.setAccessible(true);
                String value = (String) field.get(o);
                if (value.length() > annotation.maxLength()) {
                    return false;
                }
                field.setAccessible(false);
            }
        }
        return true;
    }
}
