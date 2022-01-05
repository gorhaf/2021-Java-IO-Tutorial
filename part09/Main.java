package main;

import java.io.*;

/**
 * @author 【看动画，学Java】https://learning.snssdk.com/feoffline/toutiao_wallet_bundles/toutiao_learning_wap/online/album_detail.html?content_id=6892772675148579083
 * @author 【微信公众号】gorhaf
 * @author 【个人微信号】gorhafapp
 * @author 【官方网站】www.gorhaf.com
 * @author 【抖音/今日头条/西瓜视频】人人都是程序员
 * @author 【CSDN】人人都是程序员
 * @author 【B站】人人都是程序员
 * 欢迎大家扫描下方二维码关注我们
 * █▀▀▀▀▀▀▀██▀██████▀▀▀▀██▀▀▀▀▀▀▀█
 * █ █▀▀▀█ █▄ ▀ ▄▄█▄█▄█▀██ █▀▀▀█ █
 * █ █   █ █▄▄▀▄▀█▄▄ ██▀ █ █   █ █
 * █ ▀▀▀▀▀ █ █ █▀▄▀▄ █ █ █ ▀▀▀▀▀ █
 * █▀▀▀▀▀█▀▀▀▀▀█ █▀▄▀▀█ ▄▀█▀█▀█▀██
 * █▄▄▄ ██▀█  █▀▀ ▀  ▄ ▄▀▄   ███▄█
 * ██  ▀▀█▀ ▄ ▄ █▀▄▄▄▀▄▀▄ ▄██▀▀▄██
 * █ █▄▄  ▀ █ ▄█▄▄▄▀▄▀█▄ ▄ ▄ █ █▄█
 * █  ▄██▄▀██▄ █ ▀▄▀ ▀▀ ▄▄▄▀██▀▄██
 * █ █▀▀█▀▀█▀ █▀▀█▄▀▀█▀▄ ▀▄    █▄█
 * █ █▀▀██▀▀█▀  █▀▀  ██▄▀▀▀▀▀█▀ ▀█
 * █▀▀▀▀▀▀▀█ ▄██▄▄▀▀▀▄▄▀ █▀█   ▄▄█
 * █ █▀▀▀█ █▀ ▄█ █▀ ▄▀▄▄ ▀▀▀  ▀▀ █
 * █ █   █ █ ▄▀▀▀█▄ ▄▀▄▀ █▀▀▀ ▀ ▄█
 * █ ▀▀▀▀▀ █ ▀█ ▀█▄  █▄█▄▄█  ▄▀▄██
 * ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀
 */
public class Main {

    public static void main(String[] args) {
        // 输入流
        InputStream in = null;
        // 输出流
        OutputStream out = null;
        try {
            // 初始化输入流
            in = new FileInputStream("/Users/admin/Downloads/人人都是程序员.txt");
            // 初始化输出流
            out = new FileOutputStream("/Users/admin/Downloads/人人都是程序员副本.txt");
            // 缓冲区，字节数组
            byte[] bytes = new byte[1024];
            // 记录读取的字节数
            int length;
            // 循环读取字节，返回-1时结束
            while ((length = in.read(bytes)) != -1) {
                // 写入读取的字节
                out.write(bytes, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 当输入流不为空时
            if (in != null) {
                try {
                    // 关闭输入流
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 当输出流不为空时
            if (out != null) {
                try {
                    // 关闭输出流
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}