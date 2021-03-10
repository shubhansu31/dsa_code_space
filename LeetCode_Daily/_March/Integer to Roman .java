class Solution {
    public String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int index = 0;
        
        while(num > 0)
        {
            if(value[index] <= num)
            {
                answer.append(roman[index]);
                num -= value[index];
            }
            else
                index++;
        }
        return answer.toString();
    }
}