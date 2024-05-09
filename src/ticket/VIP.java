/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket;

/**
 *
 * @author User
 */
class VIP extends TiketKonser {
    public String getNamaTiket() {
        return "VIP"; //Jika vip dipanggil maka getNamaTiket Nilainya VIP
    }

    public int getHarga() {
        return 10; // Jika vip dipanggil maka getHarga nilai nya 10
    }
}