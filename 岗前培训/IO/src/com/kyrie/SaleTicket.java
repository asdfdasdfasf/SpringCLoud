package com.kyrie;

/**
 * @author KyrieStudy
 * @version 1.0
 * @date 2022/3/21 13:22
 */
public class SaleTicket {

    public static void main(String[] args) {
        PersonThread thread=new PersonThread();
        for(int i=1;i<=108;i++){
            Thread thread1 = new Thread(thread, "第"+i+"个买票的人");
            thread1.start();
        }
    }

}

class Ticket {
    private int ticket = 100;

    public  int  sale() throws TicketEmptyException {
        if(ticket<=0){
            throw new TicketEmptyException(Thread.currentThread().getName()+"票已经售空了");
        }
        System.out.println(Thread.currentThread().getName()+"买到了最后第"+ticket--+"张票!");
        return ticket;
    }
}

class PersonThread implements Runnable {
    Ticket ticket=new Ticket();
    @Override
    public void run() {
        try {
            ticket.sale();
        } catch (TicketEmptyException e) {
            e.printStackTrace();
        }
    }
}

class TicketEmptyException extends Exception {
    public TicketEmptyException() {
    }

    public TicketEmptyException(String message) {
        super(message);
    }

    public TicketEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public TicketEmptyException(Throwable cause) {
        super(cause);
    }

    public TicketEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
