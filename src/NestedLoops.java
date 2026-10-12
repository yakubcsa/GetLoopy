public class NestedLoops
{
    static void main()
    {
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col <= row; col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        for(int row = 5; row > 0; row--)
        {
            for(int col = 0; col < row; col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}