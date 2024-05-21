package person;

/**
 *
 * @author Cahya
 */

import java.util.Date;

public class Pengujian {
    public static void main(String[] args) {
        Person person = new Person("Cahya", "Jalan Geger Arum No. 77", "089673273993", "cahyamutaqin33@gmail.com");
        System.out.println(person.toString());

        Student student = new Student("Naufal", "Jalan Geger Arum No. 88", "08953785699", "naufal123@gmail.com", Student.MAHASISWA_BARU);
        System.out.println(student.toString());

        Employee employee = new Employee("Roni", "Jalan Geger Kalong No. 99", "082345678901", "Roni22@gmail.com", "Kantor 101", 3000000, new Date());
        System.out.println(employee.toString());

        Faculty faculty = new Faculty("Jamal", "Jalan Geger Kalong No. 33", "083456789012", "Jamaludin44@gmail.com", "Kantor 102", 7000000, new Date(), "9 AM - 5 PM", "Dosen");
        System.out.println(faculty.toString());

        Staff staff = new Staff("Rahma", "Jalan Ledeng No. 55", "084567890123", "Rahmaputria@gmail.com", "Kantor 103", 4000000, new Date(), "Manajer");
        System.out.println(staff.toString());
    }
}
