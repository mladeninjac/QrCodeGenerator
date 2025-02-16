package org.example;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Paths;

public class QRCodeGenerator {

    public static String generateQRCode (String data, String path)throws WriterException, IOException {

        BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 300,300);

        MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
        return "QR code generated at: " + path;
    }
}
