#version 400

in vec2 position;

uniform vec3 modelColor;

out vec4 out_Color;

void main(void)	{
    out_Color = vec4(modelColor, 1.0f);
}
