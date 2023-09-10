package com.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.CallGroup

val CallGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(
            name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.7326f, 2.043f)
                curveTo(6.95f, 0.8326f, 8.9543f, 1.048f, 9.9736f, 2.4096f)
                lineTo(11.2346f, 4.094f)
                curveTo(12.064f, 5.2019f, 11.9908f, 6.7503f, 11.0063f, 7.7292f)
                lineTo(10.7676f, 7.9667f)
                curveTo(10.7571f, 7.9969f, 10.7318f, 8.0921f, 10.7599f, 8.2731f)
                curveTo(10.8231f, 8.6806f, 11.1634f, 9.545f, 12.5919f, 10.9654f)
                curveTo(14.0199f, 12.3853f, 14.8905f, 12.7253f, 15.3037f, 12.7887f)
                curveTo(15.491f, 12.8174f, 15.589f, 12.7906f, 15.6193f, 12.78f)
                lineTo(16.0273f, 12.3743f)
                curveTo(16.9025f, 11.5041f, 18.2474f, 11.3414f, 19.331f, 11.9305f)
                lineTo(21.2415f, 12.9691f)
                curveTo(22.8775f, 13.8584f, 23.2908f, 16.0821f, 21.9505f, 17.4148f)
                lineTo(20.5299f, 18.8273f)
                curveTo(20.0824f, 19.2723f, 19.4805f, 19.6434f, 18.7459f, 19.7119f)
                curveTo(16.9369f, 19.8806f, 12.7186f, 19.6654f, 8.2865f, 15.2584f)
                curveTo(4.1486f, 11.144f, 3.3546f, 7.556f, 3.2541f, 5.7882f)
                lineTo(4.0029f, 5.7456f)
                lineTo(3.2541f, 5.7882f)
                curveTo(3.2033f, 4.8943f, 3.6257f, 4.138f, 4.163f, 3.6037f)
                lineTo(5.7326f, 2.043f)
                close()
                moveTo(8.7729f, 3.3086f)
                curveTo(8.2662f, 2.6318f, 7.3219f, 2.578f, 6.7903f, 3.1067f)
                lineTo(5.2207f, 4.6674f)
                curveTo(4.8907f, 4.9954f, 4.732f, 5.3569f, 4.7517f, 5.7031f)
                curveTo(4.8315f, 7.1077f, 5.4728f, 10.3453f, 9.3442f, 14.1947f)
                curveTo(13.4056f, 18.2331f, 17.1568f, 18.3536f, 18.6067f, 18.2184f)
                curveTo(18.9029f, 18.1908f, 19.1975f, 18.0369f, 19.4723f, 17.7636f)
                lineTo(20.8928f, 16.3511f)
                curveTo(21.4703f, 15.777f, 21.3429f, 14.7315f, 20.5251f, 14.2869f)
                lineTo(18.6146f, 13.2484f)
                curveTo(18.0871f, 12.9616f, 17.469f, 13.0562f, 17.085f, 13.438f)
                lineTo(16.6295f, 13.8909f)
                lineTo(16.1007f, 13.359f)
                curveTo(16.6295f, 13.8909f, 16.6288f, 13.8916f, 16.6281f, 13.8923f)
                lineTo(16.6266f, 13.8937f)
                lineTo(16.6236f, 13.8967f)
                lineTo(16.6171f, 13.903f)
                lineTo(16.6024f, 13.9166f)
                curveTo(16.5919f, 13.9262f, 16.5799f, 13.9367f, 16.5663f, 13.948f)
                curveTo(16.5392f, 13.9705f, 16.5057f, 13.9959f, 16.4658f, 14.0227f)
                curveTo(16.3857f, 14.0763f, 16.28f, 14.1347f, 16.1472f, 14.1841f)
                curveTo(15.8763f, 14.285f, 15.5192f, 14.3392f, 15.0763f, 14.2713f)
                curveTo(14.2095f, 14.1384f, 13.0613f, 13.5474f, 11.5343f, 12.0291f)
                curveTo(10.0078f, 10.5113f, 9.4119f, 9.3683f, 9.2776f, 8.5031f)
                curveTo(9.209f, 8.0606f, 9.2638f, 7.7033f, 9.3659f, 7.4323f)
                curveTo(9.4159f, 7.2994f, 9.4749f, 7.1938f, 9.529f, 7.1139f)
                curveTo(9.556f, 7.074f, 9.5817f, 7.0407f, 9.6044f, 7.0137f)
                curveTo(9.6157f, 7.0002f, 9.6263f, 6.9882f, 9.636f, 6.9777f)
                lineTo(9.6497f, 6.9631f)
                lineTo(9.656f, 6.9567f)
                lineTo(9.659f, 6.9536f)
                lineTo(9.6604f, 6.9522f)
                curveTo(9.6612f, 6.9515f, 9.6619f, 6.9507f, 10.1907f, 7.4826f)
                lineTo(9.6619f, 6.9507f)
                lineTo(9.9487f, 6.6656f)
                curveTo(10.3773f, 6.2394f, 10.4373f, 5.5319f, 10.0338f, 4.993f)
                lineTo(8.7729f, 3.3086f)
                close()
            }
        }
            .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
