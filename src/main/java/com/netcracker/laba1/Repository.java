package com.netcracker.laba1;

import java.util.Arrays;

/**
 * Класс репозиторий.
 */
public class Repository {
    /**
     * size-начальный размер массива, size2- текущий.
     */
    private Contract[] contracts;
    private int size;
    private int size2;

    /**
     * Добавление элементов с проверкой и увелечением размерности массива.
     * @param contracts
     */
    public void add(Contract[] contracts) {
        if (contracts == null) {
            throw new RuntimeException("0");
        }
        x2:
        if(!checkIfArrayFull()) {
            this.size+=this.size*2;
            if(!checkIfArrayFull())
                break x2;
            if(checkIfArrayFull())
                size2=this.size;
            this.contracts = Arrays.copyOf(this.contracts, this.size);
            System.arraycopy(contracts, 0, this.contracts, size2, contracts.length);
        }
    }
    public boolean checkIfArrayFull() {
        return this.contracts.length <= this.size2;
    }

    /**
     * Поиск по id.
     * @param index
     * @return
     */
    public Contract getByIndex(int index){
        return contracts[index];
    }

    /**
     * Удаление по id.
     * @param index
     */
    public void remove(int index) {
        if (index == this.size - 1) {
            this.contracts[this.size - 1] = null;
            return;
        }
        System.arraycopy(this.contracts, index + 1, this.contracts, index, contracts.length - 1 - index);
        this.contracts[this.size - 1] = null;
    }
    public Repository() {
        contracts = new Contract[size];
        size = 10;
    }
}

