class ComputerFacade {
    public void Start() {
        cpu_.Freeze();
        long kBootAddress = 0;
        long kBootSector = 0;
        int kSectorSize = 0;
        memory_.Load(kBootAddress, hard_drive_.Read(kBootSector, kSectorSize));
        cpu_.Jump(kBootAddress);
        cpu_.Execute();
    }

    private CPU cpu_;
    private Memory memory_;
    private HardDrive hard_drive_;
};
