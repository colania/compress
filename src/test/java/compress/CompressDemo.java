package compress;

import java.util.Random;

import priv.dengjl.compress.util.CompressUtil;

public class CompressDemo {

    public static final String allChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String generateString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(allChar.charAt(random.nextInt(allChar.length())));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            String data = generateString(1024 * 10);
            System.out.println("压缩前数据大小" + data.length());

            String compressResult = CompressUtil.GZIP.compress(data);
            System.out.println("压缩后数据大小:" + compressResult.length());

            String uncompressRes = CompressUtil.GZIP.uncompress(compressResult);
            System.out.println("解压后数据大小：" + uncompressRes.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
