package World;

import Utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class World {

    private static final int TILE_WIDTH= 50;
    private static final int TILE_HEIGHT = 50;
    private List<Tile> tiles = new ArrayList<>();


    public World() {
    }

    public void createWorld(String fileName) {//todo Sam if you make textures we can uncomment this code
//        String contents = FileUtils.getFileAsString(fileName);
//        String[] tokens = contents.split("\\s");//split at space
//        int width = Integer.parseInt(tokens[0]);
//        int height = Integer.parseInt(tokens[1]);
//
//        for (int y = 0; y < height; y++) {
//            for (int x = 0; x < width; x++) {
//
//                int id  = Integer.parseInt(tokens[(x + y * width + 2)]);
//                String texture = "";
//                if (id == 1) {
//                    texture = "brown_block";
//                } else if (id != 0) {
//                    System.out.println("Tile not found");
//                }
//
//                if (!texture.isEmpty()){
//                    tiles.add(new Tile(x * TILE_WIDTH, y*TILE_HEIGHT, texture));
//                }
//            }
//        }
    }

}
