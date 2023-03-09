package Latihan_1;

public class kota<E> {
    private E element;

    public kota(E kota) {
        element = kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        kota<Integer> jumlahkota =  new kota<Integer>(9);
        kota<String> namakota = new kota<String>("malang");
        System.out.println("jumlah Latihan_1.kota di jawa timur "+ jumlahkota.getElement() + " Latihan_1.kota");
        System.out.println("salah satu Latihan_1.kota di jawa timur : Latihan_1.kota "+ namakota.getElement());
    }
}
