package simulation.generator;

import java.io.File;
import java.io.FileOutputStream;

import simulation.generator.app.Application;
import simulation.generator.app.CyberShake;
import simulation.generator.app.Genome;
import simulation.generator.app.Montage;
import simulation.generator.app.LIGO;
import simulation.generator.app.SIPHT;

/**
 * Generate several workflows for each application.
 * 
 * @author Gideon Juve <juve@usc.edu>
 */
public class RunAll {
    public static void run(Application app, File outfile, String... args) throws Exception {
        app.generateWorkflow(args);
        app.printWorkflow(new FileOutputStream(outfile));
    }
    
    public static void main(String[] args) throws Exception {
        run(new CyberShake(), new File("CyberShake_50.xml"), "-n", "50");
        run(new CyberShake(), new File("CyberShake_100.xml"), "-n", "100");
        run(new CyberShake(), new File("CyberShake_200.xml"), "-n", "200");
        run(new CyberShake(), new File("CyberShake_300.xml"), "-n", "300");

        run(new Montage(), new File("Montage_50.xml"), "-n", "50");
        run(new Montage(), new File("Montage_100.xml"), "-n", "100");
        run(new Montage(), new File("Montage_200.xml"), "-n", "200");
        run(new Montage(), new File("Montage_300.xml"), "-n", "300");

        run(new Genome(), new File("Epigenomics_50.xml"), "-n", "50");
        run(new Genome(), new File("Epigenomics_100.xml"), "-n", "100");
        run(new Genome(), new File("Epigenomics_200.xml"), "-n", "200");
        run(new Genome(), new File("Epigenomics_300.xml"), "-n", "300");

        run(new LIGO(), new File("Inspiral_50.xml"), "-n", "50");
        run(new LIGO(), new File("Inspiral_100.xml"), "-n", "100");
        run(new LIGO(), new File("Inspiral_200.xml"), "-n", "200");
        run(new LIGO(), new File("Inspiral_300.xml"), "-n", "300");

        run(new SIPHT(), new File("Sipht_50.xml"), "-n", "50");
        run(new SIPHT(), new File("Sipht_100.xml"), "-n", "100");
        run(new SIPHT(), new File("Sipht_200.xml"), "-n", "200");
        run(new SIPHT(), new File("Sipht_300.xml"), "-n", "300");
    }
}
