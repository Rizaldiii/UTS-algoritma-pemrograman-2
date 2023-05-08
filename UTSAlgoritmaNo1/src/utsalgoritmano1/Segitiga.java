/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utsalgoritmano1;

/**
 *
 * @author User
 */
class Segitiga {
    private int sisi1, sisi2, sisi3;

    public Segitiga(int sisi1, int sisi2, int sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public String getJenisSegitiga() {
        if (sisi1 == sisi2 && sisi1 == sisi3) {
            return "Segitiga Sama Sisi";
        } else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3) {
            return "Segitiga Sama Kaki";
        } else if (Math.pow(sisi1, 2) + Math.pow(sisi2, 2) == Math.pow(sisi3, 2) ||
                   Math.pow(sisi1, 2) + Math.pow(sisi3, 2) == Math.pow(sisi2, 2) ||
                   Math.pow(sisi2, 2) + Math.pow(sisi3, 2) == Math.pow(sisi1, 2)) {
            return "Segitiga Siku-Siku";
        } else {
            return "Segitiga Sembarang";
        }
    }

}
