
/**
 * class for practicing some arrays.
 * 
 * @author (Samuel Lowry) 
 * @version (2015.04.24)
 */
public class ArrayPractice
{
    
    private String[] letters = { "G", "o", " ", "B", "u", "l", "l", "d", "o", "g", "s", "!" };
    
    private int[] numbers;
    
    private String[][] cell; 
    
    public ArrayPractice()
    {
        numbers = new int[20];
        
        cell = new String[5][5];
        
    }
    
    public void printVertical()
    {
        for(int row = 0; row < letters.length; row++)
        {
            System.out.println(letters[row]);
        }
        
        
    }
    
    public void printHorizontal()
    {
        for(int row = 0; row < letters.length; row++)
        {
            System.out.print(letters[row]);
        }
        
        
    }
    
    public void createFibonacci()
    {
        
        numbers[0] = 0;
        numbers[1] = 1;
            for(int row = 2; row < numbers.length; row++)
            {
                 
                
            
            }
    }
        
    public void initStars()
    {
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                cell[row][col] = "*";
            }
       
        }
    }    
    public void printTable()
    {
        
            for(int row = 0; row < 5; row++)
            {
                System.out.println();
                
                for(int col = 0; col < 5; col++)
                {
                    System.out.print("|" + cell[row][col] +"|");
                    
                }
            
            }

    }
    
    public void initDiag()
    {
        for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                if(row == col)
                {
                    cell[row][col] = "*";
                }
                else
                {
                    cell[row][col] = " ";
                }
            }
       
        }
        
    }
    
    public void initCross()
    {
       for(int row = 0; row < 5; row++)
        {
            for(int col = 0; col < 5; col++)
            {
                if(row == 2 || col == 2)
                {
                    cell[row][col] = "*";
                }
                else
                {
                    cell[row][col] = " ";
                }
            }
       
        }
        
    }
        
}
    
    
    
