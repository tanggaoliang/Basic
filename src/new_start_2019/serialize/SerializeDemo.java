/*
 * @author:tang gao liang
 * @time:2019/3/6 15:43:42
 * @qq:1440535574
 */
package new_start_2019.serialize;

import java.io.*;

//          Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型。
//
//        将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。
//
//        整个过程都是 Java 虚拟机（JVM）独立的，也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。
//
//        类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含反序列化和序列化对象的方法。
//
//        ObjectOutputStream 类包含很多写方法来写各种数据类型，但是一个特别的方法例外：
//
//           public final void writeObject(Object x) throws IOException
//        上面的方法序列化一个对象，并将它发送到输出流。相似的 ObjectInputStream 类包含如下反序列化一个对象的方法：
//
//          public final Object readObject() throws IOException,
//        ClassNotFoundException
//        该方法从流中取出下一个对象，并将对象反序列化。它的返回值为Object，因此，你需要将它转换成合适的数据类型。
class Employee implements Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    @Override
    public String toString() {
        return "SerializeDemo{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }

    public String Info() {
        return this.toString();
    }

}

public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "tang";
        employee.address = "zong yang";
        employee.SSN = 1440535574;
        employee.number = 15035037;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(employee);
            outputStream.close();
            fileOutputStream.close();
            System.out.println("Serialize data succeed!");
            FileInputStream fileInputStream = new FileInputStream("employee.ser");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            Employee employee1=(Employee)objectInputStream.readObject();
            System.out.println(employee1.Info());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
