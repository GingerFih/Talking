package com.qcby.util;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * ���������֣���д��Сд��ĸ�����߻�����͵���֤�룬֧���Զ�������ߣ�ͼ����ɫ
 */
public class CreateVerificationCodeImage {
    private String securityCode;
    public CreateVerificationCodeImage(String securityCode){
        this.securityCode=securityCode;
    }
    //�߶�
    private static final int CAPTCHA_HEIGHT = 35;
    //���
    private static final int CAPTCHA_WIDTH  = 100;
    //���ֵĳ���
    //private static final int NUMBER_CNT     = 6;
    private Random r = new Random();
    //  ����
    private String[] fontNames = { "����", "���Ŀ���", "����", "������κ", "��������", "΢���ź�", "����_GB2312" };
    //private String[] fontNames = { "����",  "����", "΢���ź�"};

    /**
     * ���ܸ�Ҫ:�����������ɫ
     * @return
     */
    private Color randomColor() {
        int red = r.nextInt(150);
        int green = r.nextInt(150);
        int blue = r.nextInt(150);
        return new Color(red, green, blue);
    }

    /**
     * ���ܸ�Ҫ:�������������
     * @return
     */
    private  Font randomFont() {
        int index = r.nextInt(fontNames.length);
        String fontName = fontNames[index];// �����������������
        int style = r.nextInt(4);// �����������ʽ, 0(����ʽ), 1(����), 2(б��), 3(����+б��)
        int size = r.nextInt(5) + 24; // ��������ֺ�, 24 ~ 28
       // int size = r.nextInt(5) + 15; // ��������ֺ�, 20 ~ 24
        return new Font(fontName, style, size);
    }

    // ��������
    private  void drawLine(BufferedImage image) {
        int num = 5;// һ����5��
        Graphics2D g2 = (Graphics2D) image.getGraphics();
        for (int i = 0; i < num; i++) {// ��������������꣬��4��ֵ
            int x1 = r.nextInt(CAPTCHA_WIDTH);
            int y1 = r.nextInt(CAPTCHA_HEIGHT);
            int x2 = r.nextInt(CAPTCHA_WIDTH);
            int y2 = r.nextInt(CAPTCHA_HEIGHT);
            g2.setStroke(new BasicStroke(1.5F));
            g2.setColor(randomColor()); // ������ɸ�������ɫ
            g2.drawLine(x1, y1, x2, y2);// ����
        }
    }
    // ����BufferedImage������ͼƬ
    public BufferedImage createImage() {
        BufferedImage image = new BufferedImage(CAPTCHA_WIDTH, CAPTCHA_HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = (Graphics2D) image.getGraphics();
        // ����ɫ,��ɫ
        g2.setColor(new Color(255, 255, 255));
        g2.fillRect(0, 0, CAPTCHA_WIDTH, CAPTCHA_HEIGHT);

        // ��ͼƬ�л�4���ַ�  String securityCode
        for (int i = 0; i < securityCode.length(); i++) {// ѭ���ĴΣ�ÿ������һ���ַ�
            String s = securityCode.charAt(i) + "";// �������һ����ĸ
           // float x = i * 1.0F * CAPTCHA_WIDTH / NUMBER_CNT; // ���õ�ǰ�ַ���x������
            float x = i * 1.0F * CAPTCHA_WIDTH / 4+7F; // ���õ�ǰ�ַ���x������
            g2.setFont(randomFont()); // �����������
            g2.setColor(randomColor()); // ���������ɫ
            g2.drawString(s, x, CAPTCHA_HEIGHT-7); // ��ͼ,���ν��ַ�д�뵽ͼƬ����Ӧλ��-------------------
        }
        drawLine(image); // ��Ӹ�����
        return image;
    }
}

