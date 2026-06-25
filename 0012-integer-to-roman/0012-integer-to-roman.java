class Solution 
{
    public String intToRoman(int num) 
    {
        String in="";
        int t=num/1000;
        if(t>0)
        for(int i=0;i<t;i++)
        in+="M";
        int h=num%1000;
        if(h>=900)
        in+="CM";
        else if(h>=400&&h<500)
        in+="CD";
        else if(h>=500&&h<900)
        {
            int n=h/100-5;
            in+="D";
            for(int i=0;i<n;i++)
            in+="C";
        }
        else
        {
        for(int i=0;i<h/100;i++)
        in+="C";
        }
        int te=num%100;
        if(te>=90)
        in+="XC";
        else if(te>=40&&te<50)
        in+="XL";
        else if(te>=50&&te<90)
        {
            int n1=te/10-5;
            in+="L";
            for(int i=0;i<n1;i++)
            in+="X";
        }
        else
        for(int i=0;i<te/10;i++)
        in+="X";
        int o=num-(num/10)*10;
        if(o==9)
        in+="IX";
        else if(o==4)
        in+="IV";
        else if(o>=5&&o<9)
        {
        in+="V";
        int n2=o-5;
        for(int i=0;i<n2;i++)
        in+="I";
        }
        else
        for(int i=0;i<o;i++)
        in+="I";

        return in;
    }
}