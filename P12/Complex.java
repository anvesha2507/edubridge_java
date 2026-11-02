package P12;
class Complex {

    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    Complex multiply(Complex c) {
        double r = real * c.real - imaginary * c.imaginary;
        double i = real * c.imaginary + imaginary * c.real;

        return new Complex(r, i);
    }

    void compareMagnitude(Complex c) {
        double m1 = Math.sqrt(real * real + imaginary * imaginary);
        double m2 = Math.sqrt(c.real * c.real + c.imaginary * c.imaginary);

        if (m1 > m2)
            System.out.println("First complex number has greater magnitude");
        else if (m1 < m2)
            System.out.println("Second complex number has greater magnitude");
        else
            System.out.println("Both have equal magnitude");
    }

    Complex copy() {
        return new Complex(real, imaginary);
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        System.out.print("First complex number: ");
        c1.display();

        System.out.print("Second complex number: ");
        c2.display();

        Complex sum = c1.add(c2);
        System.out.print("Addition: ");
        sum.display();

        Complex product = c1.multiply(c2);
        System.out.print("Multiplication: ");
        product.display();

        c1.compareMagnitude(c2);

        Complex copy = c1.copy();

        c1.real = 10;
        c1.imaginary = 20;

        System.out.print("Modified original: ");
        c1.display();

        System.out.print("Copied object: ");
        copy.display();
    }
}