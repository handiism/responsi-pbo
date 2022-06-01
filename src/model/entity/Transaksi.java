package model.entity;

import helper.Helper;

public class Transaksi {
  private String id;
  private String barang;

  public Transaksi(String id, String barang, String kasir, int kuantitas,
                   int hargaSatuan, int diskon, int hargaTotal) {
    this.id = id;
    this.barang = barang;
    this.kasir = kasir;
    this.kuantitas = kuantitas;
    this.hargaSatuan = hargaSatuan;
    this.diskon = diskon;
    this.hargaTotal = hargaTotal;
  }

  private String kasir;
  private int kuantitas;
  private int hargaSatuan;
  private int diskon;
  private int hargaTotal;

  public Transaksi(String barang, String kasir, int kuantitas, int hargaSatuan,
                   int diskon) {
    this.barang = barang;
    this.kasir = kasir;
    this.kuantitas = kuantitas;
    this.hargaSatuan = hargaSatuan;
    this.diskon = diskon;
    this.hargaTotal = Helper.hitungHargaTotal(hargaSatuan, kuantitas, diskon);
  }

  public Transaksi() {}

  public String getId() { return id; }

  public void setId(String id) { this.id = id; }

  public String getBarang() { return barang; }

  public void setBarang(String barang) { this.barang = barang; }

  public String getKasir() { return kasir; }

  public void setKasir(String kasir) { this.kasir = kasir; }

  public int getKuantitas() { return kuantitas; }

  public void setKuantitas(int kuantitas) { this.kuantitas = kuantitas; }

  public int getHargaSatuan() { return hargaSatuan; }

  public void setHargaSatuan(int hargaSatuan) {
    this.hargaSatuan = hargaSatuan;
  }

  public int getDiskon() { return diskon; }

  public void setDiskon(int diskon) { this.diskon = diskon; }

  public int getHargaTotal() {
    hargaTotal = Helper.hitungHargaTotal(hargaSatuan, kuantitas, diskon);
    return hargaTotal;
  }

  public void setHargaTotal(int hargaTotal) { this.hargaTotal = hargaTotal; }
}
