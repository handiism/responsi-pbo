package model.query;

import database.Database;
import helper.Helper;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entity.Transaksi;

public class MySQLTransaksiQuery implements TransaksiQuery {

  private Database database;

  public MySQLTransaksiQuery(Database database) { this.database = database; }

  @Override
  public Transaksi insert(String barang, String kasir, int kuantitas,
                          int hargaSatuan, int diskon) {

    try {
      String query =
          "INSERT INTO transactions(id_trans,nama_barang,nama_kasir,qty,price_per_qty,discount,price_total) VALUES (?,?,?,?,?,?,?)";
      PreparedStatement preparedStatement =
          database.getConnection().prepareStatement(
              query, PreparedStatement.RETURN_GENERATED_KEYS);
      String id = Helper.getRandomId();
      int hargaTotal = Helper.hitungHargaTotal(hargaSatuan, kuantitas, diskon);
      System.out.println("hargaTotal : " + hargaTotal);
      preparedStatement.setString(1, id);
      preparedStatement.setString(2, barang);
      preparedStatement.setString(3, kasir);
      preparedStatement.setInt(4, kuantitas);
      preparedStatement.setInt(5, hargaSatuan);
      preparedStatement.setInt(6, diskon);
      preparedStatement.setInt(7, hargaTotal);
      preparedStatement.executeUpdate();
      return new Transaksi(id, barang, kasir, kuantitas, hargaSatuan, diskon,
                           hargaTotal);
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Transaksi read(String id) {
    try {
      String query = "SELECT * FROM transactions WHERE id_trans = ?";
      PreparedStatement preparedStatement =
          database.getConnection().prepareStatement(query);
      preparedStatement.setString(1, id);
      ResultSet resultSet = preparedStatement.executeQuery();
      if (resultSet.next()) {
        return new Transaksi(
            id, resultSet.getString("nama_barang"),
            resultSet.getString("nama_kasir"), resultSet.getInt("qty"),
            resultSet.getInt("price_per_qty"), resultSet.getInt("discount"),
            resultSet.getInt("price_total"));
      }
      return null;
    } catch (SQLException e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public List<Transaksi> readAll() {
    try {
      List<Transaksi> semuaTransaksi = new ArrayList<>();
      String query = "SELECT * FROM transactions";
      PreparedStatement preparedStatement =
          database.getConnection().prepareStatement(query);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        Transaksi transaksi = new Transaksi(
            resultSet.getString("id_trans"), resultSet.getString("nama_barang"),
            resultSet.getString("nama_kasir"), resultSet.getInt("qty"),
            resultSet.getInt("price_per_qty"), resultSet.getInt("discount"),
            resultSet.getInt("price_total"));
        semuaTransaksi.add(transaksi);
      }
      return semuaTransaksi;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public Transaksi update(Transaksi transaksi) {
    try {
      String query =
          "UPDATE transactions SET nama_barang = ?, nama_kasir = ?, qty = ?, price_per_qty = ?, discount = ?, price_total = ? WHERE id_trans = ?";
      PreparedStatement preparedStatement =
          database.getConnection().prepareStatement(query);
      preparedStatement.setString(1, transaksi.getBarang());
      preparedStatement.setString(2, transaksi.getKasir());
      preparedStatement.setInt(3, transaksi.getKuantitas());
      preparedStatement.setInt(4, transaksi.getHargaSatuan());
      preparedStatement.setInt(5, transaksi.getDiskon());
      preparedStatement.setInt(6, transaksi.getHargaTotal());
      preparedStatement.setString(7, transaksi.getId());
      if (preparedStatement.executeUpdate() != 1) {
        return null;
      }
      return transaksi;
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }

  @Override
  public boolean delete(String id) {
    try {
      String query = "DELETE FROM transactions WHERE id_trans = ?";
      PreparedStatement preparedStatement =
          database.getConnection().prepareStatement(query);
      preparedStatement.setString(1, id);
      if (preparedStatement.executeUpdate() != 1) {
        return false;
      }
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}
