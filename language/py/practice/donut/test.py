import math
import time
import os

def render_frame(A, B):
    width, height = 40, 20
    zbuffer = [0] * (width * height)
    output = [' '] * (width * height)
    sinA, cosA = math.sin(A), math.cos(A)
    sinB, cosB = math.sin(B), math.cos(B)

    for theta in range(0, 628, 10):  # 0 to 2π in steps
        theta /= 100
        for phi in range(0, 628, 5):  # 0 to 2π in steps
            phi /= 100
            sin_theta, cos_theta = math.sin(theta), math.cos(theta)
            sin_phi, cos_phi = math.sin(phi), math.cos(phi)

            # 3D coordinates of the torus
            circle_x = cos_theta + 2
            circle_y = sin_theta
            x = circle_x * (cosB * cos_phi + sinA * sinB * sin_phi) - circle_y * cosA * sinB
            y = circle_x * (sinB * cos_phi - sinA * cosB * sin_phi) + circle_y * cosA * cosB
            z = circle_x * cosA * sin_phi + circle_y * sinA
            ooz = 1 / (z + 5)  # "one over z" for depth

            # Project to 2D
            xp = int(width / 2 + 15 * ooz * x)
            yp = int(height / 2 - 8 * ooz * y)
            pos = xp + width * yp

            # Calculate luminance and clamp it
            L = cos_phi * cos_theta * sinB - cosA * cos_theta * sin_phi - sinA * sin_theta + cosB * (cosA * sin_theta - cos_theta * sin_phi)
            luminance = int(8 * L)
            # Ensure luminance stays between 0 and 11
            luminance = max(0, min(11, luminance if L > 0 else 0))
            if 0 <= xp < width and 0 <= yp < height and ooz > zbuffer[pos]:
                zbuffer[pos] = ooz
                output[pos] = "733visual#$@"[luminance] #".,-~:;=!*#$@"

    # Clear screen and print frame
    os.system('cls' if os.name == 'nt' else 'clear')
    print('\n'.join(''.join(output[i:i+width]) for i in range(0, len(output), width)))

# Animation loop
A, B = 0, 0
while True:
    render_frame(A, B)
    A += 0.07
    B += 0.03
    time.sleep(0.03)