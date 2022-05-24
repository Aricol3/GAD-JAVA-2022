package Lab3DesignPatterns.Builder;

public class Helicopter {
    private String ID;
    private int maxHeight;
    private HelicopterTypes type;
    private String color;
    private int weight;
    private int maxSpeed;

    private Helicopter() {

    }

    public static class Builder {
        private String ID;
        private int maxHeight;
        private HelicopterTypes type;
        private String color;
        private int weight;
        private int maxSpeed;

        public Builder(String ID) {
            this.ID = ID;
        }

        public Helicopter build() {
            Helicopter instance = new Helicopter();
            instance.ID = this.ID;
            instance.type = this.type;
            instance.maxHeight = this.maxHeight;
            instance.color = this.color;
            instance.weight = this.weight;
            instance.maxSpeed = this.maxSpeed;

            return instance;
        }

        public Builder setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Builder setType(HelicopterTypes type) {
            this.type = type;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "ID='" + ID + '\'' +
                ", maxHeight=" + maxHeight +
                ", type=" + type +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}