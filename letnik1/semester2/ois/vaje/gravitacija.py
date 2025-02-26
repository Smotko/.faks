import math

def main():
    # Constants
    c = 6.674 * math.pow(10, -11)  # Gravitational constant
    m = 5.972 * math.pow(10, 24)   # Mass of the Earth
    r = 6.371 * math.pow(10, 6)    # Radius of the Earth

    # User input
    input_height = int(input("Enter the height above the Earth's surface (in meters): "))

    # Calculate gravitational force
    output = (c * m) / math.pow(r + input_height, 2)

    # Print the result
    print(output)

if __name__ == "__main__":
    main()