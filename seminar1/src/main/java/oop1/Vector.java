package oop1;

public class Vector {
    private Double x;
    private Double y;
    private Double z;

    public Vector(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return Длина вектора
     */
    public Double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param v2 - второй вектор
     * @return Скалярное произведение
     */
    public Double scalar(Vector v2) {
        return x * v2.x + y * v2.y + z * v2.z;
    }

    /**
     * @param v2 - второй вектор
     * @return Векторное произведение
     */
    public Vector power(Vector v2) {
        return new Vector(
                y * v2.z - z * v2.y,
                z * v2.x - x * v2.z,
                x * v2.y - y * v2.x);
    }

    /**
     * @param v2 - второй вектор
     * @return Косинус угла между векторами
     */
    public Double cosinus(Vector v2) {
        return scalar(v2) / (length() * v2.length());
    }

    /**
     * @param v2 - второй вектор
     * @return Сумма двух векторами
     */
    public Vector summ(Vector v2) {
        return new Vector(
                x + v2.x,
                y + v2.y,
                z + v2.z);
    }

    /**
     * @param v2 - второй вектор
     * @return Разность двух векторами
     */
    public Vector diff(Vector v2) {
        return new Vector(
                x - v2.x,
                y - v2.y,
                z - v2.z);
    }
}
