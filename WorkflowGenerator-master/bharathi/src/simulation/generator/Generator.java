package simulation.generator;

import simulation.generator.app.*;
import simulation.generator.util.Misc;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public Generator()
    {

    }
    public void execute(String path,int tasknum,double[] percent,String workflowtype) throws Exception {
        List<Pair<String,Double>> list=new ArrayList<>();
        list.add(new Pair<>("1",percent[0]));
        list.add(new Pair<>("2",percent[1]));
        list.add(new Pair<>("3",percent[2]));
        Misc.weightRandom=new WeightRandom<>(list);
        switch (workflowtype){
            case "CyberShake":{
                run(new CyberShake(),new File(path),"-n", Integer.toString(tasknum));
            }break;
            case "Montage":{
                run(new Montage(),new File(path),"-n", Integer.toString(tasknum));
            }break;
            case "Genome":{
                run(new Genome(),new File(path),"-n", Integer.toString(tasknum));
            }break;
            case "Inspiral":{
                run(new LIGO(),new File(path),"-n", Integer.toString(tasknum));
            }break;
            case "Sipht":{
                run(new SIPHT(),new File(path),"-n", Integer.toString(tasknum));
            }break;
        }
    }
    public  void run(Application app, File outfile, String... args) throws Exception {
        app.generateWorkflow(args);
        app.printWorkflow(new FileOutputStream(outfile));
    }
}
