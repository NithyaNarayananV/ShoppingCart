//package ShoppingCart;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.xml.namespace.QName;

//import sun.tools.asm.Label;
import javax.swing.border.EmptyBorder;

class Class1
{
        int FlagA = -1;
        int FlagS = -1;
        int FlagAOver = 0;
 
        Label Title = new Label("       3 Star Shopping Mart"); 
        Label Star = new Label("\t\t***");
        Label Test0 = new Label(" ");
        Label Test1 = new Label(" ");
        Label Test2 = new Label(" ");

        Label P2_W0 = new Label(" This Project  ");
        Label P2_W1 = new Label("  is Coded in  ");
        Label P2_W2 = new Label("   ~~JAVA~~    ");
        Label P2_E0 = new Label("By 3 Star Team ");
        Label P2_E1 = new Label(" ~ NITHYA NARAYANAN ");
        Label P2_E2 = new Label(" ~ THAMARAI SELVAN");
        Label P2_E3 = new Label(" ~ KATHIRVEL");
        Label P2_E4 = new Label(" ~ MADHESH");

        Label TitleFront = new Label("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
        Label TitleBack = new Label("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~"); 
        //Star.setForeground(Color.WHITE);

        String ItemButtonText[] = {"  Fruits ","  Vegitables ","  Books ","  Stationary ","  Bevarages ","  Dress ","  Sports ","  Provision ","  Electronics ","  Mobiles "};
        
        //Fruits
        int PAGE=0;
        int TotalItem=0;
        String Item00[]     = {" Orange      "," Apple       "," Watermelon  "," Pomegranate "," Mango       "," Grapes      "," Pine        "," Gova        "," Litchi      "," Kirni       "};
        double[] R00 = {100,150,200,130,160,90,70,80,210,220};
        double[] Q00 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price0 = {0,0,0,0,0,0,0,0,0,0};

        //Vegitables
        String Item01[]     = {" Tomato      "," Brinjal     "," Ladiesfinger"," Potato      "," Onion       "," Ginger      "," Garlic      "," Drumstick   "," Cucumber    "," Beans       "};
        double[] R01 = {100,150,200,130,160,90,70,80,210,220};
        double[] Q01 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price1 = {0,0,0,0,0,0,0,0,0,0};

        //Books
        String Item02[]     = {" Mahabharata "," Ramayanam   "," BhagavadGita"," Thirukural  "," Freedom fighters"," Spoken English"," Spoken Tamil"," Spoken Hindi"," 7 Habitats book"," Moral"," Indian Traditional Books"};
        double[] R02 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q02 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price2 = {0,0,0,0,0,0,0,0,0,0};
        double PriceTotal=0;

        //Stationary
        String Item03[]     = {" Pencil      "," Pen         "," Eraser      "," Sharpener   "," Long scale  "," Marker      "," Writing Pad "," Stick File  "," Paper Clips "," Glue        "};
        double[] R03 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q03 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price3 = {0,0,0,0,0,0,0,0,0,0};

        //Bevarages
        String Item04[]     = {" Bovonto"," Maa Juice "," B Natural","Safal Juice"," Freedom fighters"," Spoken English"," Spoken Tamil"," Spoken Hindi"," 7 Habitats book"," Moral"," Indian Traditional Books"};
        double[] R04 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q04 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price4 = {0,0,0,0,0,0,0,0,0,0};

        //Dress
        String Item05[]     = {" Tamil story"," English story  "," Generalknowledge"," Indian History"," Freedom fighters"," Spoken English"," Spoken Tamil"," Spoken Hindi"," 7 Habitats book"," Moral"," Indian Traditional Books"};
        double[] R05 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q05 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price5 = {0,0,0,0,0,0,0,0,0,0};

        //Sports
        String Item06[]     = {"Bat","Ball","Stump","FootBall","VollyBall","HockeyBat","HockeyBall","TenniesBat","TenniesBall","SportsCap"};
        double[] R06 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q06 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price6 = {0,0,0,0,0,0,0,0,0,0};

        //Provision
        String Item07[]     = {" Tamil story"," English story  "," Generalknowledge"," Indian History"," Freedom fighters"," Spoken English"," Spoken Tamil"," Spoken Hindi"," 7 Habitats book"," Moral"," Indian Traditional Books"};
        double[] R07 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q07 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price7 = {0,0,0,0,0,0,0,0,0,0};

        //Electronics
        String Item08[]     = {" Tamil story"," English story  "," Generalknowledge"," Indian History"," Freedom fighters"," Spoken English"," Spoken Tamil"," Spoken Hindi"," 7 Habitats book"," Moral"," Indian Traditional Books"};
        double[] R08 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q08 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price8 = {0,0,0,0,0,0,0,0,0,0};

        //Mobiles
        String Item09[]     = {" Galaxy M10 "," Galaxy M20 "," Galaxy A10"," Galaxy A20"," Galaxy S10"," Galaxy S20"," Iphone X"," Iphone Xs"," Iphone 11"," Iphone 11 +"};
        double[] R09 = {80,90,100,120,140,180,200,240,250,260};
        double[] Q09 = {0,0,0,0,0,0,0,0,0,0};
        double[] Price9 = {0,0,0,0,0,0,0,0,0,0};


        double[] QTemp = {0,0,0,0,0,0,0,0,0,0};
       
        String Price[] =  {" 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"};// Price
        String Quant[] =  {"   ","   ","   ","   ","   ","   ","   ","   ","   ","   ",};
        //String Quant[] =  {"   ","   ","   ","   ","   ","   ","   ","   ","   ","   ",};
               
        String ItemTemp[]       = {" 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"};
        String ItemTempP[]      = {" 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"," 0"};

        JButton Page1Cart = new JButton("                       Your Cart                 ");
        Label Page1Total = new Label();

        //JLabel[] labels=new JLabel[10]

        JLabel[] ACItemName    = new JLabel[20];
        JLabel[] ACIteamQy     = new JLabel[20];
        JLabel[] ACItemTotPric = new JLabel[20];

        JLabel[] L_QTY = new JLabel[10]; // Page2 TextField
        JLabel[] L_Item = new JLabel[10];
        JLabel[] L_Price = new JLabel[10];
        


        ///Cart Page1 Items Up
        JButton Back = new JButton("Main Page");
        JButton Bill = new JButton("Bill");
        JButton Exit = new JButton(" EXIT ");

        //JButton[] P0_B_Cat = new JButton[0];
        JButton B00 = new JButton();
        JButton B01 = new JButton();
        JButton B02 = new JButton();
        JButton B03 = new JButton();
        JButton B04 = new JButton();
        JButton B05 = new JButton();
        JButton B06 = new JButton();
        JButton B07 = new JButton();
        JButton B08 = new JButton();
        JButton B09 = new JButton();

        JButton[] ButtonAdd = new JButton[10];
        JButton[] ButtonSub = new JButton[10];
    
        Label Category;
        Label ThankYou = new Label();
        
        JPanel panel0 = new JPanel(new BorderLayout());
        JPanel P0 = new JPanel(new GridLayout(2, 4, 50, 40));        

        JPanel panel2 = new JPanel(new BorderLayout());
        JPanel panel2ThankYou = new JPanel(new GridLayout(1,3,200,200));
        
        JPanel panel2_WEST = new JPanel(new GridLayout(3,1));
        JPanel panel2_EAST = new JPanel(new GridLayout(5,1));


        JPanel Panel11;
        JPanel Panel12;
        JPanel Panel10;

        JPanel Panel1Bill = new JPanel();
        JPanel Panel1BillList = new JPanel();
        JPanel Panel2BillMemo = new JPanel();
        String PayStringAddCart[]={"","   ","   ","   ","   ","   ","   ","   ","   ","   ","   ","   ","   "}; 

        JPanel TitleCenter;

        int C,AC=0;

        Label BillTxt;

}
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^ PreClass Over ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    

public class Shopping extends Class1
{
    static JFrame F;
    public static void main(String args[])
    {
        new Shopping();
    }
    public Shopping()
    {
        //******************************* */
        F = new JFrame();
        F.setLayout(new BorderLayout()); 
        F.add(panel0,BorderLayout.CENTER);
        F.add(Bill,BorderLayout.SOUTH);
        F.setVisible(true);
        F.setSize(1300, 800);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //******************************* */
        Bill.setVisible(false);


        /////////////////////////////////
        
        /////////////////////////////////


        //**************Category***************** */
        panel0.setBorder(new EmptyBorder(30, 40, 200, 50));
        panel0.setBackground(Color.DARK_GRAY);

        P0.setFont(new Font("Arial", Font.BOLD, 25));
        P0.setBackground(Color.DARK_GRAY);
        panel0.add(P0,BorderLayout.SOUTH);
        ADDPage0();
        //**************END-Category***************** */
        
        Panel1BillList.setLayout(new GridBagLayout());
        Panel1BillList.setBorder(new EmptyBorder(100, 10, 20, 30));
        Panel1BillList.setBackground(Color.GRAY);
        

        Panel2BillMemo.setLayout(new GridBagLayout());
        Panel2BillMemo.setBorder(new EmptyBorder(40, 200, 5, 200));
        Panel2BillMemo.setBackground(Color.GRAY);
        //Panel2BillMemo.setForeground(Color.WHITE);

        TITLE();
        Page1();
        ButtonPress();
    }
//==========================================================================
    void Page2Layout()
    {
        //TitleCenter.setVisible(false);
        PAGE=1;
        //******************************* */ items and qty show
        Panel11 = new JPanel(new GridBagLayout());
        //Panel11.setBorder(new EmptyBorder(5, 200, 5, 150));
        Panel11.setBackground(Color.DARK_GRAY);
        //Panel11.setFont(new Font("Arial", Font.ITALIC, 15));
        //P1Con.getContentPane().add(Panel11); 
  
//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&        

        //******************************* */


        //******************************* */
        Panel12 = new JPanel(new GridLayout(1,3,200,300)); //for back, catogory name
        Panel12.setBorder(new EmptyBorder(10, 10, 10, 10));
        Panel12.setBackground(Color.DARK_GRAY);
        //******************************* */


        //*************Page 1** Your Cart****************** */
        Panel1Bill.setLayout(new BorderLayout());  
        Panel1Bill.setBorder(new EmptyBorder(10, 5, 20, 30));
        Panel1Bill.add(Page1Cart,BorderLayout.NORTH);
        Panel1Bill.setBackground(Color.DARK_GRAY);
        //Panel1Bill.add(Page1Total,BorderLayout.SOUTH);
        //Panel1Bill.add(TestLabel0);
        //******************************* */

        
        //******************************* */        
        for(int x = 0; x< 20;x++)
        {
            ACItemName[x]    = new JLabel("   ");//.setText("   ");
            ACIteamQy[x]     = new JLabel("   ");//.setText("   ");
            ACItemTotPric[x] = new JLabel("  ");//.setText("   ");
        }
        //ACItemName[20]    = new JLabel(" ITEM ");//.setText("   ");
        //ACIteamQy[20]     = new JLabel("QTY");//.setText("   ");
        //ACItemTotPric[20] = new JLabel("PRICE");

        //******************************* */


        //******************************* */
        Panel1Bill.add(Panel1BillList,BorderLayout.CENTER);
        Page1AddCart();
        AddToBill();
        //******************************* */


        //******************************* */
        Panel10 = new JPanel(new BorderLayout());
        Panel10.add(Panel12,BorderLayout.NORTH);
        Panel10.add(Panel11,BorderLayout.CENTER);//, BorderLayout.CENTER);   //Panel
        Panel10.add(Panel1Bill,BorderLayout.EAST);//******* */
        //******************************* */
        

        Category=new Label("\t\t\t\t"+ItemButtonText[C]); 
        Category.setForeground(Color.WHITE);
        Star.setForeground(Color.WHITE);
        Panel12.setFont(new Font("Arial", Font.BOLD, 35));
        Panel12.add(Back);
        Panel12.add(Category);
        Panel12.add(Star);
        

        F.add(Panel10,BorderLayout.CENTER);
        //Panel10.setVisible(true);
        //Panel11.add

        Back.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {   PAGE=0;
                QTempToQ();
                Panel10.setVisible(false);
                Bill.setVisible(true);
            }  
        }); 
        ADDPage1();
        Bill.setVisible(true);
    }
    void PageBill()
    {
        panel0.setVisible(false);
        panel2ThankYou.add(Back);
        ThankYou.setText(" Thank You");
        panel2ThankYou.add(ThankYou);
        panel2ThankYou.add(Exit);
        Exit.setFont(new Font("Arial", Font.BOLD, 25));
        panel2.add(panel2ThankYou,BorderLayout.NORTH);
        panel2ThankYou.setFont(new Font("Cooper", Font.BOLD, 30));
        panel2ThankYou.setBackground(Color.DARK_GRAY);
        ThankYou.setForeground(Color.WHITE);
        panel2.setBackground(Color.DARK_GRAY);


        panel2ThankYou.setBorder(new EmptyBorder(0, 50, 10, 50));
        //ThankYou.setBorder(new EmptyBorder(10, 50, 10, 50));
        Back.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        panel2.setBorder(new EmptyBorder(30, 10, 30, 1));
        F.add(panel2);

        
        //Panel2BillMemo.setForeground(Color.white);
        //Panel2BillMemo.setFont(new Font("Arial", Font.BOLD, 15));

        panel2.add(Panel2BillMemo,BorderLayout.CENTER);
        Panel2BillMemo.setForeground(Color.WHITE);

        //BillTxt.setText("Bill Memo Here");
        //Panel2BillMemo.add(BillTxt);
        PageBill_Memo();

        panel2_EAST.setBorder(new EmptyBorder(180, 10, 180, 5));
        panel2_WEST.setBorder(new EmptyBorder(200, 5, 200, 10));
        
        panel2_WEST.setFont(new Font("Courier", Font.BOLD , 30));
        panel2_EAST.setFont(new Font("Courier", Font.BOLD , 30));


        
        
        
        P2_W0.setBackground(Color.DARK_GRAY);
        P2_W1.setBackground(Color.DARK_GRAY);
        P2_W2.setBackground(Color.DARK_GRAY);
        P2_E0.setBackground(Color.DARK_GRAY);
        P2_E1.setBackground(Color.DARK_GRAY);
        P2_E2.setBackground(Color.DARK_GRAY);
        P2_E3.setBackground(Color.DARK_GRAY);
        P2_E4.setBackground(Color.DARK_GRAY);
        
        P2_W0.setForeground(Color.CYAN);
        P2_W1.setForeground(Color.CYAN);
        P2_W2.setForeground(Color.CYAN);
        P2_E0.setForeground(Color.CYAN);
        P2_E1.setForeground(Color.CYAN);
        P2_E2.setForeground(Color.CYAN);
        P2_E3.setForeground(Color.CYAN);
        P2_E4.setForeground(Color.CYAN);

        panel2_WEST.add(P2_W0);
        panel2_WEST.add(P2_W1);
        panel2_WEST.add(P2_W2);
        panel2_EAST.add(P2_E0);
        panel2_EAST.add(P2_E1);
        panel2_EAST.add(P2_E2);
        panel2_EAST.add(P2_E3);
        panel2_EAST.add(P2_E4);

        panel2.add(panel2_EAST,BorderLayout.EAST);
        panel2.add(panel2_WEST,BorderLayout.WEST);

        panel2_EAST.setBackground(Color.DARK_GRAY);
        panel2_WEST.setBackground(Color.DARK_GRAY);
        
    }

//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^No Need To GO Beyond^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    

    void Page1AddCart()
    {
        AC=0;
        PriceTotal=0;
        for(int i=0;i<10;i++)
        {
            
            if(Q00[i]>0)
            {
                ACItemName[AC].setText(Item00[i]);
                ACIteamQy[AC].setText(""+Q00[i]);
                Price0[i]=R00[i]*Q00[i];
                ACItemTotPric[AC].setText(""+(Price0[i]));
                PriceTotal+=Price0[i];
                AC+=1;
            }
            if(Q01[i]>0)
            {
                ACItemName[AC].setText(Item01[i]);
                ACIteamQy[AC].setText(""+Q01[i]);
                Price1[i]=R01[i]*Q01[i];
                ACItemTotPric[AC].setText(""+(Price1[i]));
                PriceTotal+=Price1[i];
                AC+=1;
            }
            if(Q02[i]>0)
            {
                ACItemName[AC].setText(Item02[i]);
                ACIteamQy[AC].setText(""+Q02[i]);
                Price2[i]=R02[i]*Q02[i];
                ACItemTotPric[AC].setText(""+(Price2[i]));
                PriceTotal+=Price2[i];
                AC+=1;
            }
            if(Q03[i]>0)
            {
                ACItemName[AC].setText(Item03[i]);
                ACIteamQy[AC].setText(""+Q03[i]);
                Price3[i]=R03[i]*Q03[i];
                ACItemTotPric[AC].setText(""+(Price3[i]));
                PriceTotal+=Price3[i];
                AC+=1;
            }
            if(Q04[i]>0)
            {
                ACItemName[AC].setText(Item04[i]);
                ACIteamQy[AC].setText(""+Q04[i]);
                Price4[i]=R04[i]*Q04[i];
                ACItemTotPric[AC].setText(""+(Price4[i]));
                PriceTotal+=Price4[i];
                AC+=1;
            }
            if(Q05[i]>0)
            {
                ACItemName[AC].setText(Item05[i]);
                ACIteamQy[AC].setText(""+Q05[i]);
                Price5[i]=R05[i]*Q05[i];
                ACItemTotPric[AC].setText(""+(Price5[i]));
                PriceTotal+=Price5[i];
                AC+=1;
            }
            if(Q06[i]>0)
            {
                ACItemName[AC].setText(Item06[i]);
                ACIteamQy[AC].setText(""+Q06[i]);
                Price6[i]=R06[i]*Q06[i];
                ACItemTotPric[AC].setText(""+(Price6[i]));
                PriceTotal+=Price6[i];
                AC+=1;
            }
            if(Q07[i]>0)
            {
                ACItemName[AC].setText(Item07[i]);
                ACIteamQy[AC].setText(""+Q07[i]);
                Price7[i]=R07[i]*Q07[i];
                ACItemTotPric[AC].setText(""+(Price7[i]));
                PriceTotal+=Price7[i];
                AC+=1;
            }
            if(Q08[i]>0)
            {
                ACItemName[AC].setText(Item08[i]);
                ACIteamQy[AC].setText(""+Q08[i]);
                Price8[i]=R08[i]*Q08[i];
                ACItemTotPric[AC].setText(""+(Price8[i]));
                PriceTotal+=Price8[i];
                AC+=1;
            }
            if(Q09[i]>0)
            {
                ACItemName[AC].setText(Item09[i]);
                ACIteamQy[AC].setText(""+Q09[i]);
                Price9[i]=R09[i]*Q09[i];
                ACItemTotPric[AC].setText(""+(Price9[i]));
                PriceTotal+=Price9[i];
                AC+=1;
            }
            TotalItem=AC;//For getting Total Quatity every time
            if(TotalItem==15 )
            {
                for(int j=0;j<10;j++)
                {   
                    if(QTemp[j]==0)
                    {
                    ButtonAdd[j].setText(" FULL ");
                    ButtonAdd[j].setForeground(Color.DARK_GRAY);
                    FlagAOver = 1;
                    }
                }            }
            else
            {
                for(int j=0;j<10;j++)
                {   
                    //if(QTemp[j]==0)
                    ButtonAdd[j].setText(" Add ");
                    ButtonAdd[j].setForeground(Color.WHITE);
                    FlagAOver = 0;
                }
            }
            Page1Total.setText("Tot I: "+AC+"| Total Amount : "+ PriceTotal);
        }
    }
//============================================================================
    void AddToBill()
    {
        GridBagConstraints P1Bill = new GridBagConstraints();
        P1Bill.insets = new Insets(2, 2, 2, 2);

        for(int I=0;I<20;I++)
        {
            
            P1Bill.gridy = I;

            P1Bill.gridx = 0; 
            P1Bill.ipadx = 20;
            P1Bill.ipady = 3;

            Panel1BillList.add(ACItemName[I],P1Bill);
            P1Bill.gridx = 1; 
            P1Bill.ipadx = 10;
            Panel1BillList.add(ACIteamQy[I],P1Bill);
            P1Bill.gridx = 2;
            P1Bill.ipadx = 10; 
            //if(ACIteamQy[I]>1)
            Panel1BillList.add(ACItemTotPric[I],P1Bill);
        }
        Panel1Bill.add(Page1Total,BorderLayout.SOUTH);
        Page1Total.setForeground(Color.WHITE);
    }
//============================================================================
    void Page1RemoveCart()
    {
        for(int I=0;I<20;I++)
        {
            Panel1BillList.remove(ACItemName[I]);
            Panel1BillList.remove(ACIteamQy[I]);
            Panel1BillList.remove(ACItemTotPric[I]);

            Panel2BillMemo.remove(ACItemName[I]);
            Panel2BillMemo.remove(ACIteamQy[I]);
            Panel2BillMemo.remove(ACItemTotPric[I]);
        }
        //Panel1Bill.remove(Page1Total);
    }
//============================================================================
    void Page1CartInz()
    {
        for(int x = 0; x< 20;x++)
        {
            ACItemName[x].setText("   ");
            ACIteamQy[x].setText("   ");
            ACItemTotPric[x].setText("   ");
        }
    }

//============================================================================
    void TITLE()
    {
        Title.setFont(new Font("Serif", Font.BOLD, 30));
        TitleFront.setFont(new Font("Serif", Font.BOLD, 40));
        TitleBack.setFont(new Font("Serif", Font.BOLD, 40));
        
        TitleCenter = new JPanel(new GridLayout(1,3,30,30));
        TitleCenter.setBorder(new EmptyBorder(20, 20, 2, 20));
        
        TitleCenter.add(TitleFront);
        TitleCenter.add(Title);
        TitleCenter.add(TitleBack);
        F.add(TitleCenter,BorderLayout.NORTH);
        TitleCenter.setBackground(Color.DARK_GRAY);
        
        TitleFront.setBackground(Color.DARK_GRAY);
        Title.setBackground(Color.DARK_GRAY);
        TitleBack.setBackground(Color.DARK_GRAY);

        TitleFront.setForeground(Color.BLUE);
        Title.setForeground(Color.RED);
        TitleBack.setForeground(Color.BLUE);
        //Panel1BillList.setVisible(false);
    }
    void ADDPage0()
    {
        P0.add(B00);
        P0.add(B01);
        P0.add(B02);
        P0.add(B03);
        P0.add(B04);
        P0.add(B05);
        P0.add(B06);
        P0.add(B07);
        P0.add(B08);
        P0.add(B09);
    }
    void ADDPage1()
    {
        //Initializing The Front Q value to Back Q value
        Quant[0]="   "+QTemp[0];
        Quant[1]="   "+QTemp[1];
        Quant[2]="   "+QTemp[2];
        Quant[3]="   "+QTemp[3];
        Quant[4]="   "+QTemp[4];
        Quant[5]="   "+QTemp[5];
        Quant[6]="   "+QTemp[6];
        Quant[7]="   "+QTemp[7];
        Quant[8]="   "+QTemp[8];
        Quant[9]="   "+QTemp[9];

        for(int I=0;I<10;I++)
        {
            L_Item[I] = new JLabel(ItemTemp[I]);
            L_Price[I]=new JLabel(ItemTempP[I]);
            L_QTY[I] = new JLabel(Quant[I]);
            L_Item[I].setForeground(Color.WHITE);
            L_Item[I].setFont((new Font("Arial", Font.BOLD, 25)));
            L_Price[I].setForeground(Color.WHITE);
            L_Price[I].setFont((new Font("Arial", Font.BOLD, 25)));
            L_QTY[I].setForeground(Color.WHITE);
            L_QTY[I].setFont((new Font("Arial", Font.BOLD, 25)));
        }
        GridBagConstraints P1Con = new GridBagConstraints();

        P1Con.insets = new Insets(2, 2, 2, 2);
        for( int Y =0;Y<10;Y++)
        {
            P1Con.gridy = Y;

            P1Con.gridx = 0; 
            P1Con.ipadx = 30;
            P1Con.ipady = 10;

            Panel11.add(L_Item[Y], P1Con);  
            P1Con.gridx = 1; 
            Panel11.add(L_Price[Y], P1Con);
            P1Con.gridx = 2; 
            P1Con.ipadx = 20;
            Panel11.add(ButtonAdd[Y], P1Con); 
            P1Con.gridx = 3; 
            Panel11.add(L_QTY[Y], P1Con); 
            P1Con.gridx = 4; 
            //if(QTemp[Y]>0)
            Panel11.add(ButtonSub[Y], P1Con);
            if(QTemp[Y]==0)
            {
                ButtonSub[Y].setText(" -EMPTY- ");
                ButtonSub[Y].setForeground(Color.DARK_GRAY);//setVisible(false);
            }
            if(QTemp[Y]!=0)
            {
                ButtonSub[Y].setText(" REMOVE ");
                ButtonSub[Y].setForeground(Color.WHITE);//setVisible(false);
            }
        }
    
  
    }

//============================================================================
    void Page1()
    {
        //P0_B_Cat[0].setText("Testing");
        B00.setText(ItemButtonText[0]);
        B01.setText(ItemButtonText[1]);
        B02.setText(ItemButtonText[2]);
        B03.setText(ItemButtonText[3]);
        B04.setText(ItemButtonText[4]);
        B05.setText(ItemButtonText[5]);
        B06.setText(ItemButtonText[6]);
        B07.setText(ItemButtonText[7]);
        B08.setText(ItemButtonText[8]);
        B09.setText(ItemButtonText[9]);

///////////////////////////////////////////////////////////////////////////////
        Back.setFont(new Font("Arial", Font.BOLD, 25));
        Bill.setFont(new Font("Arial", Font.BOLD, 25));
        
///////////////////////////////////////////////////////////////////////////////

        //P0_B_Cat[0].setFont(new Font("Arial", Font.BOLD, 25));
        B00.setFont(new Font("Arial", Font.BOLD, 25));
        B01.setFont(new Font("Arial", Font.BOLD, 25));
        B02.setFont(new Font("Arial", Font.BOLD, 25));
        B03.setFont(new Font("Arial", Font.BOLD, 25));
        B04.setFont(new Font("Arial", Font.BOLD, 25));
        B05.setFont(new Font("Arial", Font.BOLD, 25));
        B06.setFont(new Font("Arial", Font.BOLD, 25));
        B07.setFont(new Font("Arial", Font.BOLD, 25));
        B08.setFont(new Font("Arial", Font.BOLD, 25));
        B09.setFont(new Font("Arial", Font.BOLD, 25));
        
        //for(int X=0;X<10;X++)
        //{
         //   ButtonAdd[0].setFont(new Font("Arial", Font.BOLD, 15));
         //   
        //}
        Page1Total.setFont(new Font("Arial", Font.BOLD, 15));
    }
    //**************Action Listener***************** */
    //**************Action Listener***************** */
    //**************Action Listener***************** */
    //**************Action Listener***************** */
    void ButtonPress()
    {
        Back.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                //TitleCenter.setVisible(false);
                //Panel1BillList.setVisible(false);
                panel2.setVisible(false);
                Page1();
                F.add(panel0);
                panel0.setVisible(true);
                Page1RemoveCart();
                Bill.setBackground(Color.white);
                Bill.setVisible(true);
            }  
        });
        Bill.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                
                Panel10.setVisible(false);
                panel2.setVisible(true);
                PageBill();
                Bill.setBackground(Color.darkGray);
                Bill.setVisible(false);

            }  
        }); 
        Exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });


//==============================================================================================
        B00.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item00;
                QTemp = Q00;
                C=0;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R00[i];
                }
                ItemTempP= Price;
                //QTempToQ();
                Page2Layout();
                Page1AddCart();
                //AddToBill();
            }  
        }); 
        B01.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item01;
                QTemp = Q01;
                C=1;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R01[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
                //AddToBill();
            }  
        });
        B02.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item02;
                QTemp = Q02;
                C=2;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R02[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
                //AddToBill();
            }
        });
        B03.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                //panel0.setVisible(false);
               panel0.setVisible(false);
                ItemTemp = Item03;
                QTemp = Q03;
                C=3;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R03[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
                //AddToBill();
            }  
        }); 
        B04.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item04;
                QTemp = Q04;
                C=4;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R04[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
            }  
        }); 
        B05.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item05;
                QTemp = Q05;
                C=5;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R05[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
            }  
        }); 
        B06.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item06;
                QTemp = Q06;
                C=6;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R06[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
            }  
        });
        B07.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item07;
                QTemp = Q07;
                C=7;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R07[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
            }  
        });        
        B08.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item08;
                QTemp = Q08;
                C=8;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R08[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
            }  
        });
        B09.addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                panel0.setVisible(false);
                ItemTemp = Item09;
                QTemp = Q09;
                C=9;
                for ( int i = 0; i<10;i++)
                {
                    Price[i] = "Rs. "+R09[i];
                }
                ItemTempP= Price;
                Page2Layout();
                Page1AddCart();
            }  
        });
//===============================================================================

    for( int I=0;I<10;I++)
    {
        ButtonAdd[I] = new JButton(" Add ");
        ButtonAdd[I].setFont(new Font("Arial", Font.BOLD, 20));
        ButtonSub[I] = new JButton(" Remove ");
        ButtonSub[I].setFont(new Font("Arial", Font.BOLD, 20));
        ButtonAdd[I].setBackground(Color.DARK_GRAY);
        ButtonAdd[I].setForeground(Color.WHITE);
        ButtonSub[I].setBackground(Color.DARK_GRAY);
        ButtonSub[I].setForeground(Color.WHITE);
    }
        ButtonAdd[0].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagA = 0;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[0].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagS = 0;
                Action_MethodSUB(FlagS);
            }
        });        
        ButtonAdd[1].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {   FlagA = 1;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[1].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 1;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[2].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 2;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[2].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 2;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[3].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 3;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[3].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 3;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[4].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagA = 4;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[4].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagS = 4;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[5].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 5;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[5].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 5;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[6].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 6;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[6].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 6;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[7].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {
                FlagA = 7;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[7].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 7;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[8].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 8;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[8].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 8;
                Action_MethodSUB(FlagS);
            }
        });
        ButtonAdd[9].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagA = 9;
                Action_MethodADD(FlagA);
            }
        });
        ButtonSub[9].addActionListener(new ActionListener()
        {   @Override
            public void actionPerformed(ActionEvent e)
            {  
                FlagS = 9;
                Action_MethodSUB(FlagS);
            }         
        });
    }

    void QTempToQ()
    {
        switch(C)
        {
            case 0: Q00 = QTemp; break;
            case 1: Q01 = QTemp; break;
            case 2: Q02 = QTemp; break;
            case 3: Q03 = QTemp; break;
            case 4: Q04 = QTemp; break;
            case 5: Q05 = QTemp; break;
            case 6: Q06 = QTemp; break;
            case 7: Q07 = QTemp; break;
            case 8: Q08 = QTemp; break;
            case 9: Q09 = QTemp; break;
        }
    }
    int Action_MethodADD(int FlagA)
    {
        /*if (QTemp[FlagA]==0 && TotalItem==5)
        {
            QTemp[FlagA]=0;    
            ButtonAdd[FlagA].setText(" Full ");
            ButtonAdd[FlagA].setForeground(Color.DARK_GRAY);
        }*/
        if(FlagAOver==0 || QTemp[FlagA]!=0)
        {
        QTemp[FlagA]++;
        ButtonAdd[FlagA].setText(" Add ");
        ButtonAdd[FlagA].setForeground(Color.WHITE);
        ButtonSub[FlagA].setText(" REMOVE ");
        ButtonSub[FlagA].setForeground(Color.WHITE);
        Quant[FlagA] = "   "+QTemp[FlagA];
        QTempToQ();
        Page1AddCart();////////////
        AddToBill();
        L_QTY[FlagA].setText(Quant[FlagA]);
        }
        return 0;
    }
    int Action_MethodSUB(int FlagS)
    {
        if(QTemp[FlagS]>0)
        QTemp[FlagS]--;
        Quant[FlagS] = "   "+QTemp[FlagS];
        L_QTY[FlagS].setText(Quant[FlagS]);
        QTempToQ();
        Page1CartInz();
        Page1RemoveCart();
        Page1AddCart();
        AddToBill();
        if(QTemp[FlagS]==0)
        {
        ButtonSub[FlagS].setText(" -EMPTY- ");
        ButtonSub[FlagS].setForeground(Color.DARK_GRAY);
        }//ButtonSub[0].setVisible(false);
        return 0;
    }

    void PageBill_Memo()
    {
        GridBagConstraints P2Bill = new GridBagConstraints();
        P2Bill.insets = new Insets(2, 2, 2, 2);


            //Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 35);
            //ACItemName[15].setFont(font);
            ACItemName[15].setFont(new Font("Courier", Font.BOLD , 30));
            //ACItemName[15].setFont(Font.ITALIC);
            ACItemName[15].setForeground(Color.WHITE);
            ACIteamQy[15].setFont(new Font("Courier", Font.BOLD , 30));
            ACIteamQy[15].setForeground(Color.WHITE);
            ACItemTotPric[15].setFont(new Font("Courier", Font.BOLD ,30));
            ACItemTotPric[15].setForeground(Color.WHITE);
            P2Bill.gridy = 0;

            P2Bill.gridx = 0; 
            P2Bill.ipadx = 20;
            P2Bill.ipady = 5;

            //ACItemName[I].setFont(new Font("Serif", Font.BOLD, 20));
            Panel2BillMemo.add(ACItemName[15],P2Bill);
            P2Bill.gridx = 1; 
            P2Bill.ipadx = 10;
            Panel2BillMemo.add(ACIteamQy[15],P2Bill);
            P2Bill.gridx = 2;
            P2Bill.ipadx = 10; 
            //if(ACIteamQy[I]>1)
            Panel2BillMemo.add(ACItemTotPric[15],P2Bill);

        ACItemName[15].setText(" ITEMS ");//.setText("   ");
        ACIteamQy[15].setText("QTY");//.setText("   ");
        ACItemTotPric[15].setText("PRICE");
        int I;
        for( I=0;I<15;I++)
        {
            ACItemName[I].setFont(new Font("Arial", Font.ITALIC, 13));
            ACItemName[I].setForeground(Color.WHITE);
            ACIteamQy[I].setFont(new Font("Arial", Font.ITALIC, 13));
            ACIteamQy[I].setForeground(Color.WHITE);
            ACItemTotPric[I].setFont(new Font("Arial", Font.ITALIC, 13));
            ACItemTotPric[I].setForeground(Color.WHITE);
            P2Bill.gridy = I+1;

            P2Bill.gridx = 0; 
            P2Bill.ipadx = 20;
            P2Bill.ipady = 5;

            //ACItemName[I].setFont(new Font("Serif", Font.BOLD, 20));
            Panel2BillMemo.add(ACItemName[I],P2Bill);
            P2Bill.gridx = 1; 
            P2Bill.ipadx = 10;
            Panel2BillMemo.add(ACIteamQy[I],P2Bill);
            P2Bill.gridx = 2;
            P2Bill.ipadx = 10; 
            //if(ACIteamQy[I]>1)
            Panel2BillMemo.add(ACItemTotPric[I],P2Bill);
        }

        Test0.setFont(new Font("Arial", Font.BOLD, 25));
        Test1.setFont(new Font("Arial", Font.BOLD, 25));
        Test2.setFont(new Font("Arial", Font.BOLD, 25));
            P2Bill.gridy = I+2;

            P2Bill.gridx = 0; 
            P2Bill.ipadx = 50;
            P2Bill.ipady = 50;
            Test0.setText("  ");
            Panel2BillMemo.add(Test0,P2Bill);
            P2Bill.gridx = 1; 
            Test1.setText("  Total  Amount : ");
            Panel2BillMemo.add(Test1,P2Bill);
            P2Bill.gridx = 2; 
            Test2.setText(" "+PriceTotal);
            Panel2BillMemo.add(Test2,P2Bill);


    }
}
