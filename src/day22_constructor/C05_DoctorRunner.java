package day22_constructor;

public class C05_DoctorRunner {
    public static void main(String[] args) {

        C04_doctor doctor1=new C04_doctor();

        doctor1.isim="Kemal";

        doctor1.yas=40;

        System.out.println(doctor1.soyisim);
        System.out.println(doctor1.yas);

        C04_doctor doctor2=new C04_doctor();

        C04_doctor doctor3 ;

       // System.out.println(doctor3.yas);
        //contructor calısmadan bir obje olusturulup deger ataması mumkun değildir

        System.out.println("veriable a atanmayan obje için yas "+new C04_doctor().yas);



    }
}
