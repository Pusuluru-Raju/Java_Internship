import java.util.*;
public class TreasureHuntGame {

public static void main(String[] args) {
// TODO Auto-generated method stub
	TreasureHunt ob = new TreasureHunt();
	Scanner sc = new Scanner(System.in);
	System.out.println("In this game , you have to choose a character and guide that character to reach the treasure");	
	String name = ob.Name();
//	System.out.println(name);
	ob.pathToTreasure(name);

		}	

	}

class TreasureHunt
{
public String Name()
{
String name = "";
Scanner sc = new Scanner(System.in);
System.out.println("Choose Your Character for this game !!\n1.Indiana Jones\n2.Dwayne\n3.Ken MIles\n4.Jack Sparrow ");
int ch = sc.nextInt();
switch(ch)
{
case 1 : name = "Indiana Jones";break;
case 2 : name = "Dwayne";break;
case 3 : name = "Ken Miles";break;
case 4 : name = "JackSparrow";break;
}
// System.out.println(name);
return name;

}
public void pathToTreasure(String name)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the Treasure Hunt Mr."+name);
	System.out.println("Choose your Starting point/ starting location to reach treasure");
	System.out.println("-->North of the city  \n-->East of the city  \n-->West of the city  \n-->South of the city  \n(type direction name ex : north,south)");
	String stp = sc.next().toLowerCase();
	
	switch(stp)
	{
	case "north" : System.out.println("Choose the path \n-->Fire\n-->Sea\n-->Forest");
	  String npath = sc.next().toLowerCase();
	  switch(npath)
	  {
	  case "fire" : System.out.println("Choose your path \n-->Forest\n-->Desert");
	                String npath1 = sc.next().toLowerCase() ;
	                switch(npath1)
	                {
	                case "forest" : System.out.println("Oops ! Mr."+name+"You reached DeadEnd");break;
	                case "desert" :System.out.println("Choose your path \n-->Dig Oasis (type dig)\n-->Climb Palm Tree(type Tree)");
	                                String npath2 = sc.next().toLowerCase();
	                                System.out.println(npath2.equals("dig")? "Sorry!Better luck next time":"Congrats Mr."+name+", you found the treasure");
	                                break ;
	                }
	                break;
	                
	  case "sea" : System.out.println("Choose your path \n-->Mountain\n-->SnakeLand");
	               String npath3 =  sc.next().toLowerCase();
	               switch(npath3)
	               {
	               case "mountain": System.out.println("Choose your path \n-->Caves\n-->River");
	                                String npath4 = sc.next().toLowerCase();
	                                System.out.println(npath4.equals("caves")?"sorry Mr. "+name+", you reached deadend.":"Mr."+name+", you entered into tribal village !!");
	                                break;
	               case "snakeland": System.out.println("Choose your path \n-->Crocodile River (type cr)\n-->Plane Way");
	                                 String npath5 = sc.next().toLowerCase();
	                                 System.out.println(npath5.equals("cr")? "Cograts Mr. "+name+", you found the treasure":"oops ! Better Luck Next Time Mr . "+name );
	                                 break;
	               }
	               break;
	  case "forest" : System.out.println("Sorry Mr. "+name+"You reached Deadend");;break;
	  }
	              break;

	case "east"  : System.out.println("Choose your path \n-->Forest\n-->SnakeLand");
	               String epath = sc.next().toLowerCase();
	               switch(epath)
	               {
	               case "forest": System.out.println("Choose your path \n-->Plane Way (type pw) \n-->Thores Land (type tl)"); 
	                              String epath1 = sc.next().toLowerCase();
	                              switch(epath1)
	                              {
	                              case "pw": System.out.println("Better Luck Next Time");break;
	                              case "tl":System.out.println("Better Luck Next Time");break;
	                              }
	               break;
	               case "snakeland": System.out.println("Choose your path \n-->Mountain \n-->Desert"); 
	               					 String epath2 = sc.next().toLowerCase();
	               					 switch(epath2)
	               					 {
	               					 case "mountain" : System.out.println("sorry Mr . "+name+"You reached DeadEnd");
	               					 break;
	               					 case "desert" : System.out.println("Choose your path \n-->Fire \n-->Thornes Land (type tl)\n-->Plane Way(type pw)"); 
	               					                 String epath3 = sc.next().toLowerCase() ;
	               					                 switch(epath3)
	               					                 {
	               					                 case "fire" : System.out.println("Choose your path \n-->bushes \n-->Desert");
	               					                               String epath4 = sc.next().toLowerCase();
	               					                               System.out.println("Sorry Mr. "+name+" ,You reached deadend");
	               					                 break;
	               					                 
	               					                 case "tl"   : System.out.println("Choose your path \n-->Crocodile River(type cr) \n-->Caves");
	               					                               String epath5 = sc.next().toLowerCase();
	               					                               switch(epath5)
	               					                               {
	               					                               case  "cr" : System.out.println("Congrats Mr. "+name+", you found the treasure"); break;
	               					                               case  "caves" : System.out.println("Sorry Mr. "+name+", you reached deadend"); break;
	               					                               }
	               					                 break;
	               					                 
	               					                 case "pw"   : System.out.println("Sorry Mr."+name+" ,You reached Deadend"); 
	               					                 break;
	               					                 }
	               					 break;
	               					 }
	               break;
	               }
	break;

	case "west"  : System.out.println("Choose your path \n-->Crocodile River(type cr)\n-->SnakeLand");
	               String wpath = sc.next().toLowerCase();
	               switch(wpath)
	               {
	               case "cr": System.out.println("Choose your path \n-->Mountain\n-->Sea");
	                          String wpath1 = sc.next().toLowerCase();
	                          switch(wpath1)
	                          {
	                          case "Mountain": System.out.println("Sorry Mr."+name+", You reached deadend"); break;
	                          case "Sea" : System.out.println("Sorry Mr."+name+", You reached deadend"); break;
	                          }
	               break;
	               case "snakeland" : System.out.println("Choose ypur path \n-->Bushes\n-->LandMines"); 
	                                  String wpath2 = sc.next().toLowerCase();
	                                  switch(wpath2)
	                                  {
	                                  case "bushes" :System.out.println("Choose your path \n-->Fire\n-->Desert");
	                                                 String wpath3 = sc.next().toLowerCase();
	                                                 switch(wpath3)
	                                                 {
	                                                 case "fire" : System.out.println("Congrats Mr. "+name+" , you found the treasure "); break;
	                                                 case "desert" : System.out.println("Sorry Mr."+name+", you reached deadend");  break;
	                                                 }
	                                  break;
	                                  case "landmines":System.out.println("Sorry Mr. "+name+", You reached Deadend"); ;
	                                  break;
	                                  }
	               break;
	               }
	break;

	case "south" : System.out.println("Choose your path \n-->Forest\n-->River");
	               String spath = sc.next().toLowerCase();
	               switch(spath)
	               {
	               case "forest" :System.out.println("choose your path \n-->Sea\n-->LandMines"); 
	                              String spath1 = sc.next().toLowerCase();
	                              switch(spath1)
	                              {
	                              case "sea": System.out.println("Choose your path \n-->crocodile River(type cr)\n-->Mountain");
	                                          String spath2 = sc.next().toLowerCase();
	                                          switch(spath2)
	                                          {
	                                          case "cr":System.out.println("Congrats Mr. "+name+", you found the treasure");  
	                                          break;
	                                          case "mountain" :System.out.println("Sorry Mr. "+name+", you reched deadend") ; 
	                                          break;
	                                          }
	                              break;
	                              case "landmines" : System.out.println("Sorry Mr . "+name+"you reched deadend") ; 
	                            	  break;
	                              }
	               break;
	               case "river" : System.out.println("Sorry Mr."+name+", you reached deadend");break;
	               }
	break;
	}

  }
}
