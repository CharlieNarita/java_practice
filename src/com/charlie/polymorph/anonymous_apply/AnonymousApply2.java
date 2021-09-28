package com.charlie.polymorph.anonymous_apply;

public class AnonymousApply2 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("get up to school");
            }
        });

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("learn computer");
            }
        });

    }
}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmClock(Bell bell) {
        System.out.println(bell.getClass());
        bell.ring();
    }
}
