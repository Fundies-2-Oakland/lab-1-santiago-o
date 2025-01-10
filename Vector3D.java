public class Vector3D {
    private final float x;
    private final float y;
    private final float z;

    public Vector3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    public String toString() {
        return String.format("(%f, %f, %f)", this.x, this.y, this.z);
    }

    public double getMagnitude() {
        return Math.abs(Math.sqrt((x * x) + (y * y) + (z * z)));
    }

    public Vector3D normalize() {
        float mag = (float) this.getMagnitude();
        if (mag == 0 ) {
            throw new IllegalArgumentException("Magnitude is zero!");
        }

        return new Vector3D(x / mag, y / mag, z / mag);
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3D multiply(float constant) {
        return new Vector3D(this.x * constant, this.y * constant, this.z * constant);
    }

    public float dotProduct(Vector3D other) {
        return (this.x * other.x) + (this.y * other.y) + (this.z * other.z);
    }
}