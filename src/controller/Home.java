package controller;

import helper.NonEditableTableModel;
import java.awt.*;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.entity.Transaksi;
import model.query.TransaksiQuery;

public class Home {
  private DefaultTableModel tableModel = new NonEditableTableModel();
  private Transaksi transaksi;
  private TransaksiQuery query;
  private view.Home view;

  public Home(TransaksiQuery query, view.Home view) {
    this.query = query;
    this.view = view;
    initController();

    EventQueue.invokeLater(new Runnable() {
      public void run() {
        view.setLocationRelativeTo(null);
        view.setResizable(false);
        view.setVisible(true);
      }
    });
  }

  private void refreshTable() {
    tableModel = new NonEditableTableModel();
    String columnNames[] = {"ID",           "Barang", "Kasir",      "Kuantitas",
                            "Harga Satuan", "Diskon", "Total Harga"};
    for (String name : columnNames) {
      tableModel.addColumn(name);
    }
    view.getTableTransaksi().setModel(tableModel);
    List<Transaksi> semuaTransaksi = query.readAll();
    for (Transaksi transaksi : semuaTransaksi) {
      tableModel.addRow(new Object[] {
          transaksi.getId(), transaksi.getBarang(), transaksi.getKasir(),
          transaksi.getKuantitas(), transaksi.getHargaSatuan(),
          transaksi.getDiskon(), transaksi.getHargaTotal()});
    }
  }

  private void initController() {
    refreshTable();

    view.getTextFieldId().setEditable(false);

    view.getButtonTambah().addActionListener((l) -> {
      String barang = view.getTextFieldBarang().getText();
      String kasir = view.getTextFieldKasir().getText();
      try {
        int kuantitas =
            Integer.parseInt(view.getTextFieldKuantitas().getText());
        int hargaSatuan =
            Integer.parseInt(view.getTextFieldHargaSatuan().getText());
        int diskon = Integer.parseInt(view.getTextFieldDiskon().getText());
        transaksi = query.insert(barang, kasir, kuantitas, hargaSatuan, diskon);
        if (transaksi == null) {
          JOptionPane.showMessageDialog(null, "Gagal menambahkan transaksi");
        } else {
          view.getTextFieldId().setText(transaksi.getId());
          JOptionPane.showMessageDialog(null, "Transaksi berhasil ditambahkan");
          refreshTable();
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menambahkan transaksi");
      }
    });

    view.getButtonReset().addActionListener((l) -> {
      view.getTextFieldId().setText("");
      view.getTextFieldBarang().setText("");
      view.getTextFieldKasir().setText("");
      view.getTextFieldKuantitas().setText("");
      view.getTextFieldDiskon().setText("");
      view.getTextFieldHargaSatuan().setText("");
      transaksi = null;
    });

    view.getButtonUbah().addActionListener((l) -> {
      String barang = view.getTextFieldBarang().getText();
      String kasir = view.getTextFieldKasir().getText();
      try {
        int kuantitas =
            Integer.parseInt(view.getTextFieldKuantitas().getText());
        int hargaSatuan =
            Integer.parseInt(view.getTextFieldHargaSatuan().getText());
        int diskon = Integer.parseInt(view.getTextFieldDiskon().getText());
        Transaksi transaksi =
            query.insert(barang, kasir, kuantitas, hargaSatuan, diskon);
        if (transaksi == null) {
          JOptionPane.showMessageDialog(null, "Gagal mengubah transaksi");
        } else {
          view.getTextFieldId().setText(transaksi.getId());
          JOptionPane.showMessageDialog(null, "Transaksi berhasil diubah");
          refreshTable();
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal mengubah transaksi");
      }
    });

    view.getButtonHapus().addActionListener(l -> {
      if (transaksi == null) {
        JOptionPane.showMessageDialog(null, "Mohon pilih transaksi");
      } else {
        query.delete(transaksi.getId());
        JOptionPane.showMessageDialog(null, "Transaksi Berhasil dihapus");
        refreshTable();
      }
    });

    view.getTableTransaksi().addMouseListener(new MouseListener() {
      @Override
      public void mouseClicked(java.awt.event.MouseEvent e) {
        int row = view.getTableTransaksi().getSelectedRow();
        String id = view.getTableTransaksi().getValueAt(row, 0).toString();
        transaksi = query.read(id);
        view.getTextFieldId().setText(transaksi.getId());
        view.getTextFieldBarang().setText(transaksi.getBarang());
        view.getTextFieldKasir().setText(transaksi.getKasir());
        view.getTextFieldKuantitas().setText(
            String.valueOf(transaksi.getKuantitas()));
        view.getTextFieldHargaSatuan().setText(
            String.valueOf(transaksi.getHargaSatuan()));
        view.getTextFieldDiskon().setText(
            String.valueOf(transaksi.getDiskon()));
      }

      @Override
      public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
      }

      @Override
      public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
      }

      @Override
      public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
      }

      @Override
      public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
      }
    });
    ;
  }
}
