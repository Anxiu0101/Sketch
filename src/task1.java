import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Please give a rotation degree in \"0, 45, 90, 135, 180, 225, 270, 315, 360\" ");


        String exit = "exit";
        byte[][] gameCharts = new byte[12][12];

        while (scr.hasNextLine())
        {
            //renew the array, or not it will be influent by last behaviour.
            for (int i=0; i<12; i++)
            {
                for (int j=0; j<12; j++)   gameCharts [i][j] = 1;

            }// i for end
            String s    = scr.nextLine();
            if (!s.equals(exit))
            {
                int num = Integer.parseInt(s);

                // When charts is horizontal,
                if (num == 0 || num == 180 || num == 360)
                {
                    // write the location of bar when angle == 0
                    for (int i=0; i<12; i++)
                    {
                        gameCharts [5][i] = 0;
                        gameCharts [6][i] = 0;
                    }// i for end

                    //print the charts
                    for (int i=0; i<12; i++)
                    {
                        ;
                        for (int j=0; j<12; j++)
                        {
                            System.out.print(gameCharts [i][j] + " ");
                        }
                        System.out.println();

                    }// i for end
                    continue;
                }// horizontal if end

                // When the charts is vertical,
                if (num == 90 || num == 270 )
                {
                    // write the location of bar
                    for (int i=0; i<12; i++)
                    {
                        gameCharts [i][5] = 0;
                        gameCharts [i][6] = 0;
                    }// i for end

                    //print the charts
                    for (int i=0; i<12; i++)
                    {
                        ;
                        for (int j=0; j<12; j++)
                        {
                            System.out.print(gameCharts [i][j] + " ");
                        }
                        System.out.println();

                    }// i for end
                    continue;
                }//  if end

                // When the charts is Tilt 45 degrees to the left,
                if (num == 45 || num == 225 )
                {
                    // write the location of bar
                    for (int i=0; i<12; i++)
                    {
                        for (int j=0; j<12; j++)
                        {
                            if(Math.abs(j-i)==1)
                            {
                                gameCharts [j][i] = 0;
                                gameCharts [j][i] = 0;
                            }
                        }
                    }// i for end

                    //print the charts
                    for (int i=0; i<12; i++)
                    {

                        for (int j=0; j<12; j++)
                        {
                            System.out.print(gameCharts [i][j] + " ");
                        }
                        System.out.println();

                    }// i for end
                    continue;
                }//  if end

                // When the charts is Tilt 135 degrees to the left,
                if (num == 135 || num == 315 )
                {
                    // write the location of bar
                    for (int i=0; i<12; i++)
                    {
                        for (int j=0; j<12; j++)
                        {
                            if(Math.abs(11-j-i)==1)
                            {
                                gameCharts [i][j] = 0;
                            }
                        }
                    }// i for end

                    //print the charts
                    for (int i=0; i<12; i++)
                    {

                        for (int j=0; j<12; j++)
                        {
                            System.out.print(gameCharts [i][j] + " ");
                        }
                        System.out.println();

                    }// i for end
                    continue;
                }//  if end


            }

            else if(Integer.parseInt(s)%45 != 0)
            {
                System.out.println("error input!Please give a new number:");
                continue;
            }

            else
            {
                System.out.println("End");
                scr.close();
                break;
            }
        }// hasNextLine while end


    }

}
