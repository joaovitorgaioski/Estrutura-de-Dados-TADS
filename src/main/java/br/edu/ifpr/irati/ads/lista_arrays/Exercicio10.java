package br.edu.ifpr.irati.ads.lista_arrays;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Exercicio10 {
    public static void main(String[] args) {
        try {
            BufferedImage imagem = ImageIO.read(new File("imagem.jpg"));
            int w = imagem.getWidth();
            int h = imagem.getHeight();
            int[] pixels = imagem.getRGB(0, 0, w, h, null, 0, w);

            for (int col = 0; col < w; col++) {
                for (int lin = 0; lin < h; lin++) {

                    int pixel = w * lin + col;
                    Color cor = new Color(pixels[pixel]);
                    int media = (cor.getRed() + cor.getGreen() + cor.getBlue()) / 3;

                    pixels[pixel] = new Color(media, media, media).getRGB();
                }
            }

            imagem.setRGB(0, 0, w, h, pixels, 0, w);
            ImageIO.write(imagem, "JPG", new File("imagemEscalaDeCinza.jpg"));

        } catch (IOException e) {
            System.out.println("Erro ao obter imagem" + e);
        }
    }
}
