import java.io.*;
public class Main implements Serializable
{
        int a;
        String name;
        public  Main(int a ,String name)
        {
        this.a =a;
        this.name=name;
        }
}
class test
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Main obj = new Main(9999 , "Kingspin-Sudo");

        // Serialization

        FileOutputStream fos = new FileOutputStream("/home/kingspin/IdeaProjects/JavaSerialization/SeriaziledFile.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.flush();
        System.out.println("Successfully Serialized");

        // DeSerialization

        FileInputStream fis = new FileInputStream("/home/kingspin/IdeaProjects/JavaSerialization/SeriaziledFile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Main obj2 = (Main) ois.readObject();
        System.out.println();
        System.out.println("Deserialized Successfully");
        System.out.println("a = "+obj2.a + "  name = "+obj2.name);
    }
}

