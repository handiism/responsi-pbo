package model.query;

import java.util.List;
import model.entity.Transaksi;

public interface TransaksiQuery {
  Transaksi insert(String barang, String kasir, int kuantitas, int hargaSatuan,
                   int diskon);
  Transaksi read(String id);
  List<Transaksi> readAll();
  Transaksi update(Transaksi transaksi);
  boolean delete(String id);
}
