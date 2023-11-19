graph TD;
    Start --> MakeReservation;
    MakeReservation --> {CustomerArrives};
    MakeReservation --> {CheckAvailability};
    CheckAvailability -- Available --> BookSlot;
    CheckAvailability -- NotAvailable --> InformCustomer;
    BookSlot --> NotifyCustomer;
    InformCustomer --> End;
    NotifyCustomer --> End;
