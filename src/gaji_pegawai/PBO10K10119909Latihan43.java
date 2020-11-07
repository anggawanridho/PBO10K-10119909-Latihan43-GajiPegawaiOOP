package gaji_pegawai;

/**
 *
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10K10119909Latihan43 {

    public static void main(String[] args) {
        GajiPegawai pegawai1 = new GajiPegawai();
        String nama, alamat;
        int uangTransport, uangTunjangan, gajiPokok, totalGaji;

        System.out.println("###Data Gaji Karyawan PT. KAKATU###");
        System.out.println("-----------------------------------");

        pegawai1.setNama("Rizki Adam Kurniawan");
        pegawai1.setAlamat("Jalan Semar dlm 4 No 72/66");
        pegawai1.setUangTransport(250000);
        pegawai1.setUangTunjangan(300000);
        pegawai1.setGajiPokok(4500000);

        nama = pegawai1.getNama();
        alamat = pegawai1.getAlamat();
        uangTransport = pegawai1.getUangTransport();
        uangTunjangan = pegawai1.getUangTunjangan();
        gajiPokok = pegawai1.getGajiPokok();
        totalGaji = pegawai1.totalGaji(uangTunjangan,uangTransport,gajiPokok);
        pegawai1.tampilData(nama,alamat,uangTunjangan, uangTransport, gajiPokok, totalGaji);
    }
}
