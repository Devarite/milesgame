#version 140

in vec3 position;

uniform mat4 transformation;
uniform mat4 view;
uniform mat4 projection;

void main(void) {
    vec4 worldPos = transformation * vec4(position, 1.0f);
    vec4 cameraSpace = worldPos * view;
    gl_Position = cameraSpace * projection;
}
