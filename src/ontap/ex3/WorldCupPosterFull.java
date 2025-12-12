package ontap.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;

public class WorldCupPosterFull extends JPanel {

    private BufferedImage background;
    private ArrayList<PlayerImage> players;
    private BufferedImage ball;

    // Lớp lưu thông tin hình ảnh cầu thủ
    class PlayerImage {
        BufferedImage image;
        int x, y, width, height;

        PlayerImage(BufferedImage img, int x, int y, int w, int h) {
            this.image = img;
            this.x = x;
            this.y = y;
            this.width = w;
            this.height = h;
        }
    }

    public WorldCupPosterFull() {
        try {
            // Nền poster (ví dụ bạn vừa gửi)
            background = ImageIO.read(new File("/mnt/data/e70db3ba-345a-4c90-8041-b20be9832cc3.png"));

            // Quả bóng
            ball = ImageIO.read(new File("images/ball.png"));

            // Thêm cầu thủ (PNG với nền trong suốt)
            players = new ArrayList<>();
            players.add(new PlayerImage(ImageIO.read(new File("images/messi.png")), 200, 300, 120, 180));
            players.add(new PlayerImage(ImageIO.read(new File("images/ronaldo.png")), 400, 250, 120, 180));
            players.add(new PlayerImage(ImageIO.read(new File("images/mbappe.png")), 600, 300, 120, 180));
            // Thêm nhiều cầu thủ khác tương tự
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        // Anti-aliasing
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Vẽ nền
        if (background != null) {
            g2.drawImage(background, 0, 0, width, height, null);
        } else {
            g2.setColor(Color.CYAN);
            g2.fillRect(0, 0, width, height);
        }

        // Vẽ cầu thủ theo layer
        for (PlayerImage p : players) {
            g2.drawImage(p.image, p.x, p.y, p.width, p.height, null);
        }

        // Vẽ quả bóng
        if (ball != null) {
            g2.drawImage(ball, 500, 400, 80, 80, null);
        }

        // Vẽ băng rôn
        g2.setColor(new Color(255, 215, 0, 180));
        g2.fillRoundRect(50, 20, width - 100, 60, 30, 30);
        g2.setColor(Color.RED);
        g2.setFont(new Font("Arial", Font.BOLD, 36));
        g2.drawString("World Cup 2026", 150, 60);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("World Cup 2026 Collage Poster");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 600);
        frame.add(new WorldCupPosterFull());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
