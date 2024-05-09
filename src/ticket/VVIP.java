/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket;

/**
 *
 * @author User
 */
class VVIP extends TiketKonser {
    public String getNamaTiket() {
        return "UNLIMITED EXPERIENCE"; //Jika vvip dipanggil maka getNamaTiket Nilainya UNLIMITED EXPERIENCE
    }

    public int getHarga() {
        return 20; // Jika vvip dipanggil maka getHarga nilai nya 20
    }
}