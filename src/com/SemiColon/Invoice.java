package com.SemiColon;

public class Invoice {
    private String partnumber;
    private String partdescription;
    private int quantity;
    private int price;

    public String getPartNumber() { return  partnumber;
    }

    public String getPartDescription() { return partdescription;
    }

    public Integer getQuantity() { return  quantity; 
    }

    public int getPrice() {
        return price;
    }

    public double getInvoiceAmount() {
        return quantity * price;
    }
}
