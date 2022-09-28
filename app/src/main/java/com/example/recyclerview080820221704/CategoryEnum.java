package com.example.recyclerview080820221704;

import androidx.annotation.NonNull;

public enum CategoryEnum {
    RESTAURANT("Nhà hàng"),
    BIRTH_DAY("Sinh nhật"),
    FAMILY("Gia đình"),
    GROUP("Hội nhóm"),
    STORE("Cửa hàng"),
    SHOP_ONLINE("Shop Online"),
    STREET_FOOD("Đồ ăn đường phố"),
    BUFFET("Buffer");

    private final String name;

    CategoryEnum(String s) {
        name = s;
    }

    @NonNull
    public String toString() {
        return name;
    }
}