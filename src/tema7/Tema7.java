package tema7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tema7 {

    public static void main(String[] args) {
        PC[] type = new PC[2];//массив техники

        notebook pc = new notebook(450, "msi", true);
        PC hp = new PC(500, "hp", true);
        pc.settypeOfCar(hp);
        type[0] = pc;
        type[1] = hp;

        try {
            // Сброс данных объекта staff в файл (сериализация данных)
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("mechanism.dat"));
            out.writeObject(type);
            out.close();

            // Чтение сериализованных данных из файла в объект (десериализация данных)
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("mechanism.dat"));
            PC[] newType = (PC[]) in.readObject(); // Новый список
            in.close();

            // Вывод на экран массива объектов newStaff
            for (PC e : newType) {
                System.out.println(e);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
