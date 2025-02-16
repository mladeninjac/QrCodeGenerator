package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            String data = "www.mladeninjac.com";
            String path = "src/main/resources/qrcode.jpg";
            QRCodeGenerator.generateQRCode(data, path);

            String message = QRCodeGenerator.generateQRCode(data,path);
            System.out.println(message);
        }catch (Exception e) {
            System.err.println("Error: QR code generation failed: " + e.getMessage());
        }
    }
}