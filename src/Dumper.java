import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author sapan.dang
 */
public class Dumper {

    static String sprPath="/home/sapan/Documents/tools/godot/pekaakana/pekka-kana-2-1.2.4/data/sprites/";
    static String dumpDirPath="extracted";
    static File dumpDir=null;
    static File sprDir=null;


    public static void main(String[] args) throws IOException {
        System.out.println("Dumper v1.0");

        dumpDir = new File(dumpDirPath);
        if(!dumpDir.exists()){
            dumpDir.mkdirs();
        }

        System.out.println("finding files in "+sprPath);
        sprDir = new File(sprPath);

        File[] sprFiles = sprDir.listFiles();

        for(int i=0;i<sprFiles.length;i++)
        {

            if(sprFiles[i].getName().contains(".spr")){
                //System.out.println(sprFiles[i].getName());
                try{
                    dumpSprite(sprFiles[i]);
                }catch (Exception e)
                {
                    System.out.println("unable to load file "+sprFiles[i].getName());
                }

            }
        }


    }

    static void dumpSprite(File spriteFile) throws IOException {

        //generate the spriteDir
        File outputPath = new File(dumpDirPath+"/"+spriteFile.getName().replaceAll(".spr",""));
        if(!outputPath.exists()){
            outputPath.mkdirs();
        }
        //--
        PK2Sprite pk2Sprite = new PK2Sprite(spriteFile);
        pk2Sprite.loadFile();
        pk2Sprite.loadBufferedImage();
        BufferedImage[] bufferedImages = pk2Sprite.frameList;
        //write the image
        for(int i=0;i<bufferedImages.length;i++)
        {
            File outputfile = new File(outputPath.getPath()+"/img"+i+".png");
            ImageIO.write(bufferedImages[i], "png", outputfile);

        }


    }


}