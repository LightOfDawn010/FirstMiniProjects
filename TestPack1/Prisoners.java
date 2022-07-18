package TestPack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Prisoners {
        public static void main(String[] args) {
            ArrayList<Float> list = new ArrayList<>();{
                list = new ArrayList<>();
                list.add(1.41f);
                list.add(1.40f);
                list.add(1.91f);
                list.add(1.71f);
                list.add(1.71f);
                list.add(1.69f);
                list.add(1.91f);
                list.add(1.91f);
                list.add(1.50f);
                list.add(1.51f);
                list.add(1.80f);
                list.add(1.46f);
                list.add(1.72f);
                list.add(1.57f);
                list.add(1.55f);
                list.add(1.91f);
                HashSet<Float> hs = new HashSet<>();
                hs.addAll(list);
                int totalDuplicates =list.size() - hs.size();
                System.out.println("Prisoners Before on line by Height" + " :" + list);
                System.out.println("We have" + " " + totalDuplicates + " " + "Big guys in prison" );
                System.out.println("Okaay boys go to the line !!");
            }
            list.sort(Collections.reverseOrder());
            System.out.println("Prisoners After on line by height : " + list);


        }

    }

