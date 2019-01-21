package lab8;

import lab3.Bank;

import java.util.List;
import java.util.stream.Collectors;

public class BanksService {
    private BankRepository bankRepository;

    public BanksService() {
        this.bankRepository = new BankRepository();
        bankRepository.init();
    }

    public void create() {
        bankRepository.create();
    }

    public List<Bank> getAll(){
        return bankRepository.readAll();
    }

    public void insert(Bank bank) {
        List<Bank> bankList = bankRepository.readAll();
        bankList.add(bank);
        bankRepository.writeAll(bankList);
    }

    public void modify(Bank newBank, int position) {
        List<Bank> bankList = bankRepository.readAll();
        if(bankList.size() >= position){
            bankList.remove(position);
            bankList.add(position, newBank);
            bankRepository.writeAll(bankList);
        }else {
            System.out.println("Element doesn\'t exist.");
        }
    }

    public void delete(int position) {
        List<Bank> bankList = bankRepository.readAll();
        bankList.remove(position);
        bankRepository.writeAll(bankList);
    }

    public List<Bank> process() {
        return bankRepository.readAll()
                .stream()
                .filter(bank -> bank.getValueEU() < 20.5)
                .collect(Collectors.toList());
    }
}
