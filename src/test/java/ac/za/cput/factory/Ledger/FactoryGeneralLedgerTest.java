package ac.za.cput.factory.Ledger;

import ac.za.cput.domain.Ledger.GeneralLedger;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryGeneralLedgerTest {

    @Test
    public void getGeneralLedger() {
        String date= "03/11/2016";
        String generalLId="gl051";
        int totalTransaction=6;
        double totalAmount=20000;

        GeneralLedger gl=FactoryGeneralLedger.getGeneralLedger(date,generalLId,totalTransaction,totalAmount);
        System.out.println(gl);
        Assert.assertNotNull(gl.getDate()+"\n"+gl.getGeneralLId()+"\n"+
                gl.getTotalTrans()+"\n"+gl.getTotalAmount());
    }
}