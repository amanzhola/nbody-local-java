import javax.sound.sampled.*;
import java.io.File;

public class NBodyLocal {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please enter 2 arguments for java NBodyLocal <tau> <dt>");
            return;
        }

        double G = 6.67430e-11;
        double tau = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);

        int numParticles = StdIn.readInt();
        double radius = StdIn.readDouble();

        double[] px = new double[numParticles];
        double[] py = new double[numParticles];
        double[] vx = new double[numParticles];
        double[] vy = new double[numParticles];
        double[] mass = new double[numParticles];
        String[] image = new String[numParticles];

        for (int i = 0; i < numParticles; i++) {
            px[i] = StdIn.readDouble();
            py[i] = StdIn.readDouble();
            vx[i] = StdIn.readDouble();
            vy[i] = StdIn.readDouble();
            mass[i] = StdIn.readDouble();
            image[i] = StdIn.readString();
        }

        StdDraw.setXscale(-radius, +radius);
        StdDraw.setYscale(-radius, +radius);
        StdDraw.enableDoubleBuffering();

        Clip clip = null;
        try {
            File file = new File("assets/audio/2001.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Sound error: " + e.getMessage());
        }

        for (double t = 0.0; t < tau; t += dt) {
            StdDraw.clear();

            double[] fx = new double[numParticles];
            double[] fy = new double[numParticles];

            for (int i = 0; i < numParticles; i++) {
                fx[i] = 0.0;
                fy[i] = 0.0;

                for (int j = 0; j < numParticles; j++) {
                    if (i != j) {
                        double deltaX = px[j] - px[i];
                        double deltaY = py[j] - py[i];
                        double r = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
                        double F = G * mass[i] * mass[j] / (r * r);
                        double Fx = F * deltaX / r;
                        double Fy = F * deltaY / r;
                        fx[i] += Fx;
                        fy[i] += Fy;
                    }
                }
            }

            for (int i = 0; i < numParticles; i++) {
                vx[i] += fx[i] / mass[i] * dt;
                vy[i] += fy[i] / mass[i] * dt;
            }

            for (int i = 0; i < numParticles; i++) {
                px[i] += vx[i] * dt;
                py[i] += vy[i] * dt;
            }

            StdDraw.picture(0, 0, "assets/images/starfield.jpg");

            for (int i = 0; i < numParticles; i++) {
                StdDraw.picture(px[i], py[i], "assets/images/" + image[i]);
            }

            StdDraw.show();
            StdDraw.pause(20);
        }

        if (clip != null) {
            clip.stop();
            clip.close();
        }

        System.out.println(numParticles);
        System.out.println(radius);
        for (int i = 0; i < numParticles; i++) {
            System.out.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                    px[i], py[i], vx[i], vy[i], mass[i], image[i]);
        }
    }
}
