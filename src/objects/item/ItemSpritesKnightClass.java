package objects.item;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ItemSpritesKnightClass {

    private BufferedImage mainImage;
    private boolean firstImage = true;

    private BufferedImage[] allSprites;
    private BufferedImage[] commonSprites;
    private BufferedImage[] rareSprites;
    private BufferedImage[] legendarySprites;

    public ItemSpritesKnightClass(String fileName) {
        try {
            this.mainImage = ImageIO.read(new File(fileName));
        } catch (IOException e) {
            System.out.println("can't load the mainImage for the sprites");
        }

        readAllSprites();


    }

    private void readAllSprites(){

        this.allSprites = new BufferedImage[100];
        int counter = 0;
        for(int y = 0; y < 5; y++){
            this.firstImage = true;

            for(int x = 0 ; x < 20; x++){
                if(this.firstImage){
                    BufferedImage image = this.mainImage.getSubimage((x * 38) + 6, (y * 96) + 4, 38, 96);
                    this.allSprites[counter] = image;
                    counter++;
                } else{
                    BufferedImage image = this.mainImage.getSubimage((x * 38) + 4, (y * 96) + 4, 38, 96);
                    this.allSprites[counter] = image;
                    counter++;
                }

            }
        }

    }

    public BufferedImage[] getCommonSprites(){

        this.commonSprites = new BufferedImage[3];

        this.commonSprites[0] = this.allSprites[0]; //basic sword
        this.commonSprites[1] = this.allSprites[48]; //rapier
        this.commonSprites[2] = this.allSprites[64]; //dagger

        return this.commonSprites;
    }

    public BufferedImage[] getRareSprites() {

        this.rareSprites = new BufferedImage[3];

        this.rareSprites[0] = this.allSprites[10]; //'dragon' sword
        this.rareSprites[1] = this.allSprites[26]; //skull sword
        this.rareSprites[2] = this.allSprites[71]; //dark-red sword

        return this.rareSprites;
    }

    public BufferedImage[] getLegendarySprites() {

        this.legendarySprites = new BufferedImage[3];

        this.legendarySprites[0] = this.allSprites[47]; //health sword
      //  this.legendarySprites[1] = this.allSprites[96]; //attack sword
        this.legendarySprites[1] = this.allSprites[27]; //crit sword
        this.legendarySprites[2] = this.allSprites[58]; //block sword

        return this.legendarySprites;
    }
}
