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
    private int size1;

    /**
     * Добавление элементов с проверкой и увелечением размерности массива.
     *
     * @param contracts
     */
    public void add(Contract[] contracts) {
        if (contracts == null) {
            throw new RuntimeException("0");
        }
        while (checkIfArrayFull(contracts.length)) {
            size1 += size1 * 2;
        }
        this.contracts = Arrays.copyOf(this.contracts, this.size1);
        System.arraycopy(contracts, 0, this.contracts, size, contracts.length);
        size+=contracts.length;
    }

    public boolean checkIfArrayFull(int newElements) {
        return size1 < size + newElements;
    }

    /**
     * Поиск по id.
     *
     * @param index
     * @return
     */
    public Contract getByIndex(int index) {
        return contracts[index];
    }

    /**
     * Удаление по id.
     *
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
        size = 0;
        contracts = new Contract[10];
        size1 = contracts.length;
    }
}

