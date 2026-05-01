package com.tutorial;

// public class Hero extends Object {
public class Hero{
    private String name;

    public Hero(String name){
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + this.name);
    }


    // Merubah fungsi equals yang biasanya biasa aja di object
    // Di override di Hero, dan bisa dipakai di main
    // Alat pendeteksi -> Jika CLASS sama, dan jika REFERENCE sama
    @Override
    // artinya -> namakan function equals agar mengoverride fungsi equals
    // -> ambil parameter untuk menampung si object 2 nya
    // -> Isi parameter nya object 2 nya (reference)
    // -> Yang akan dibandingkan dengan object 1 (reference)
    public boolean equals(Object otherObject){
        // Kuncinya jika masukan parameter itu bukan berupa seperti tipe data biasa, berarti itu tipe data yang masuk
        // Dimana Hero == Object, maka tipedata nya Object
        if(this == otherObject){
            // Jika object 1 sama dengan object 2 (reference nya)
            System.out.println("Object dengan reference sama");
            return true;
        } else if (this.getClass() == otherObject.getClass()){
            // Jika setelah di getClass (Method object juga) masih sama dengan other Object
            System.out.println("Object dengan class sama, Reference berbeda");

            Hero other = (Hero) otherObject;

            if(this.name == other.name){
                System.out.println("Namanya sama");
                return true;
            }else{
                System.out.println("Namanya beda");
                return false;
            }
        }else{
            return false;
        }

    }
}
