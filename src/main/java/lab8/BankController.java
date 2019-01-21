package lab8;

import lab3.Bank;

import java.util.List;

public class BankController {
    private BanksService banksService;
    private DetailsProvider detailsProvider;

    public BankController() {
        this.banksService = new BanksService();
        this.detailsProvider = new DetailsProvider();
    }

    public void create() {
        banksService.create();
    }

    public void print() {
        List<Bank> bankList = banksService.getAll();

        bankList.forEach(b -> {
            System.out.println("\t" + bankList.indexOf(b) + "\t" + b);
        });
    }

    public void insert() {
        Bank bank = detailsProvider.getABank();
        banksService.insert(bank);
    }

    public void modify() {
        Bank bank = detailsProvider.getABank();
        int position = detailsProvider.getAPosition();
        banksService.modify(bank, position);
    }

    public void delete() {
        int position = detailsProvider.getAPosition();
        banksService.delete(position);
    }

    public void process() {
        banksService.process().forEach(System.out::println);
    }
}
