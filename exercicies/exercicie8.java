"#123456"
"#234567"

nao passa!
"#fkvdvknkk"
"kmckdncn"
"#fff"
"1234567"
"#12345u"


public static boolean isColorValid (String color)
{
  if(color.length == 7 && color.charAt(0) == "#")
  {
    for (int i = 1; i <= 6; i++)
    {
      if(!isHexadecimal(color.charAt(i)))
      {
        return false;
      }

    }

    return true;
  }
  else
  {
    return false;

  }
}


//////////
public void callThing()
{
  thing(6);
}


public boolean thing(int thong)
{
  if(thong > 5)
  {
    return true;
  }

  return false;
}