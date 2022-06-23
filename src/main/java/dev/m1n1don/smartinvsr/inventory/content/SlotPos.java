package dev.m1n1don.smartinvsr.inventory.content;

public record SlotPos(int row, int column)
{
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        SlotPos slotPos = (SlotPos) obj;

        return row == slotPos.row && column == slotPos.column;
    }

    public static SlotPos of(int row, int column)
    {
        return new SlotPos(row, column);
    }
}