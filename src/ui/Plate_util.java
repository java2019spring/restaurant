package ui;

public class Plate_util 
{
	public int width = 800, height = 600, num_plate = 7, plate_w = 100, plate_h = 100;
    public String[] colors = { "blue", "green", "purple", "yellow", "orange", "red", "coffee" };
    public String[] colors_CN = { "蓝色", "绿色", "紫色", "黄色", "橙色", "红色", "咖啡" };
    public int[] prices = { 8, 10, 12, 16, 18, 20, 24 };

    public static int p_per_disk(String col) 
    {
    	System.out.println("in p_per_disk");
        int index = 0;
        for (int i = 0; i < num_plate; i++) 
        {
            if (col.equals(colors[i])) 
            {
                index = i;
                break;
            }
        }
        return prices[index];
    }

}
