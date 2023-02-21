package com.example.headfirstdesignpatterns.solid.ISP;

public class Document {
}

/**
 * this breaks the interface segregation principle because we can have classes that do not to implement all the methods
 */
interface Machine {
    void print(Document document);
    void fax(Document document);
    void scan(Document document);
}

class MultiFunctionPrinter implements Machine {
    @Override
    public void print(Document document) {
        //
    }

    @Override
    public void fax(Document document) {
        //
    }

    @Override
    public void scan(Document document) {
        //
    }
}

class OldFashionPrinter implements Machine {

    @Override
    public void print(Document document) {
        //
    }

    @Override
    public void fax(Document document) {
        // throw new Exception();
    }

    @Override
    public void scan(Document document) {
        // throw new Exception();
    }
}

interface Printer {
    void print(Document document);
}

interface Scanner {
    void scan(Document document);
}

// YAGNI = you ain't going to need it
class JustAPrinter implements Printer {
    @Override
    public void print(Document document) {
        //
    }
}

class Photocopier implements Printer, Scanner {
    @Override
    public void print(Document document) {
        //
    }

    @Override
    public void scan(Document document) {
        //
    }
}

interface MultiFunctionDevice extends Printer, Scanner {
}

class MultiFunctionMachine implements MultiFunctionDevice {
    // we can use decorator pattern
    private Printer printer;
    private Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document document) {
        printer.print(document);
    }

    @Override
    public void scan(Document document) {
        scanner.scan(document);
    }
}