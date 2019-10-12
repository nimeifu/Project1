



import javax.swing.*;


public class project1 {

    public static void main(String[] args) {
        String day;
        String itemName;
        String[] itemList = {"banana", "bacon", "milk", "tomato", "egg", "java coffee"};
        double[] priceList = {0.99, 3.99, 5.99, 1.99, 2.99, 199.99};
        int[] numItems = {0, 0, 0, 0, 0, 0};
        double[] finalPrices = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        String decide = "yes";
        String title="Please select an item";
        int quantity = 0;
        double price = 0;
        int whole;
        int decimal;
        int price100;

        JOptionPane.showMessageDialog(null, "Welcome to my grocery store.");
        JList jlist=new JList(itemList);
        day = JOptionPane.showInputDialog("Price of an item may vary on different days, please enter today's day.");
        day = determineDay(day);

        while (decide.equalsIgnoreCase("yes")) {
            JOptionPane.showMessageDialog(null,jlist,title,1);
            itemName =(String)jlist.getSelectedValue();
            quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of quantity."));
            numItems = updateNumItem(itemList, itemName, quantity, numItems,priceList);
            decide = JOptionPane.showInputDialog(null, "Do you want to purchase more? Type yes otherwise no");

        }

        price=calculate(day,price,priceList,numItems,finalPrices);


        price = (double) Math.round(price * 100) / 100;

       // String fprice=Double.toString(price);
        //dot=fprice.indexOf(".");
        //decimal=fprice.substring(dot+1);
        //wholeNum=fprice.substring(0,dot);
        //JOptionPane.showMessageDialog(null, "The total cost are: "+wholeNum+" dollars and "+decimal+" cents.");
        whole=(int)(price);
        decimal=(int)((price-whole)*100);

        JOptionPane.showMessageDialog(null, "The total cost are: "+whole+" dollars and "+decimal+" cents.");
        JOptionPane.showMessageDialog(null,"Thank you see you next time.");

    }

    public static String determineDay(String day) {
        if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Friday")) {
            JOptionPane.showMessageDialog(null, "Today is a regular price day");
            return (day = "regular");
        } else if (day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Thursday")) {
            JOptionPane.showMessageDialog(null, "10% off your total purchase when you buy three or more items");
            return (day = "10Off");
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            JOptionPane.showMessageDialog(null, "Weekend! Buy three get one free!");
            return (day = "weekend");
        }
        return null;
    }

    public static int[] updateNumItem(String[] itemList, String itemName, int quantity, int[] numItem,double[]priceList) {
        for (int i = 0; i < itemList.length; i++) {
            if (itemName.equalsIgnoreCase(itemList[i])) {
                numItem[i] += quantity;
                JOptionPane.showMessageDialog(null,"Price per piece: "+priceList[i]);

            }
        }
        return (numItem);
    }


    public static double calculate(String day, double price, double[] priceList, int[] numItem, double[] finalpricelist) {
        for (int j = 0; j < numItem.length; j++) {
            if (numItem[j] > 0 && day == "regular") {

                finalpricelist[j] = numItem[j] * priceList[j];
                price+=finalpricelist[j];

            }
            else if(numItem[j]>0 && day=="10Off" && numItem[j]>=3)
            {
                finalpricelist[j]=numItem[j]*priceList[j]*0.9;
                price+=finalpricelist[j];

            }
            else if(numItem[j]>0 && day=="weekend" && numItem[j]>=3)
            {
                finalpricelist[j]=(numItem[j]-numItem[j]/3)*priceList[j];
                price+=finalpricelist[j];

            }

        }
        return price;
    }
}


