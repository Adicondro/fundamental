package com.hero;

public interface IAttack {
    // Didalam interface tidak boleh ada field and attribute

    // private String name;

    // public IAttack(String name){
        // this.name = name;
    // }

    // Contoh method di dalam interface -> Semua harus punya interface ini
    public void attack(Hero enemy);
}
