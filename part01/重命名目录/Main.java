package main;

import java.io.File;

/**
 * @author 【B站】人人都是程序员
 * @author 【掘金】人人都是程序员
 * @author 【CSDN】人人都是程序员
 * @author 【抖音/今日头条/西瓜视频】人人都是程序员
 * @author 【官方网站】www.gorhaf.com
 * @author 【微信公众号】gorhaf
 * @author 【个人微信号】gorhafapp
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
        // 创建File对象
        File file = new File("/Users/admin/Downloads/人人都是程序员");
        // 当目录存在时
        if (file.exists()) {
            // 重命名目录
            boolean result = file.renameTo(new File("/Users/admin/Downloads/看动画学编程"));
            // 输出重命名结果
            System.out.println(result);
        }
    }
}