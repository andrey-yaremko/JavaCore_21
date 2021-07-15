import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Date;

public class Aplication {

    public static void main(String[] args) throws IOException {
        getAnnotationToFile(Droid.class);
    }

    public static void getAnnotationToFile(Class<?> customClass) throws IOException {
        Field[] fields = customClass.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];

            if (field.getAnnotation(DroidInfo.class) instanceof DroidInfo) {
                String name = field.getName();
                String params = field.getAnnotation(DroidInfo.class).value();
                FileWriter writer = new FileWriter("Result.txt", true);
                writer.write(name);
                writer.append('\n');
                writer.write(params);
                writer.append('\n');
                writer.flush();

            }

        }
    }

}
