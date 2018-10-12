using System;

namespace StringCalculator
{
    public class Addition
    {
        public int Add(String numbers)
        {
            if (String.IsNullOrEmpty(numbers))
                return 0;
            else
            {
                int sum = 0;
                String[] numbersAsArray = numbers.Split(',');
                foreach(var number in numbersAsArray)
                    sum += Int32.Parse(number);
                return sum;
            }
                
        }
    }
}
