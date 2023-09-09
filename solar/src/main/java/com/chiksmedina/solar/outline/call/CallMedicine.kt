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

public val CallGroup.CallMedicine: ImageVector
    get() {
        if (_callMedicine != null) {
            return _callMedicine!!
        }
        _callMedicine = Builder(name = "CallMedicine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 2.75f)
                curveTo(14.6528f, 2.75f, 12.75f, 4.6528f, 12.75f, 7.0f)
                curveTo(12.75f, 7.6812f, 12.9097f, 8.323f, 13.1931f, 8.8919f)
                curveTo(13.3521f, 9.2111f, 13.4179f, 9.6022f, 13.3131f, 9.9942f)
                lineTo(13.06f, 10.94f)
                lineTo(14.0058f, 10.6869f)
                curveTo(14.3978f, 10.5821f, 14.7889f, 10.6479f, 15.1082f, 10.8069f)
                curveTo(15.677f, 11.0903f, 16.3188f, 11.25f, 17.0f, 11.25f)
                curveTo(19.3472f, 11.25f, 21.25f, 9.3472f, 21.25f, 7.0f)
                curveTo(21.25f, 4.6528f, 19.3472f, 2.75f, 17.0f, 2.75f)
                close()
                moveTo(11.25f, 7.0f)
                curveTo(11.25f, 3.8244f, 13.8244f, 1.25f, 17.0f, 1.25f)
                curveTo(20.1756f, 1.25f, 22.75f, 3.8244f, 22.75f, 7.0f)
                curveTo(22.75f, 10.1756f, 20.1756f, 12.75f, 17.0f, 12.75f)
                curveTo(16.0815f, 12.75f, 15.2114f, 12.5341f, 14.4394f, 12.1496f)
                curveTo(14.4221f, 12.141f, 14.4082f, 12.1376f, 14.3998f, 12.1366f)
                curveTo(14.3959f, 12.1361f, 14.3935f, 12.1362f, 14.3926f, 12.1362f)
                lineTo(13.2805f, 12.4338f)
                curveTo(12.2399f, 12.7122f, 11.2878f, 11.7601f, 11.5662f, 10.7195f)
                lineTo(11.8638f, 9.6074f)
                curveTo(11.8639f, 9.6065f, 11.8639f, 9.6041f, 11.8634f, 9.6002f)
                curveTo(11.8624f, 9.5918f, 11.859f, 9.5779f, 11.8504f, 9.5606f)
                curveTo(11.4659f, 8.7887f, 11.25f, 7.9185f, 11.25f, 7.0f)
                close()
                moveTo(3.7177f, 4.0921f)
                curveTo(4.9439f, 2.8012f, 6.9721f, 3.0431f, 7.9857f, 4.4766f)
                lineTo(9.2466f, 6.2601f)
                curveTo(10.0574f, 7.4068f, 9.9889f, 9.0009f, 9.0213f, 10.0196f)
                lineTo(8.7765f, 10.2774f)
                curveTo(8.7758f, 10.2792f, 8.7751f, 10.2811f, 8.7743f, 10.2832f)
                curveTo(8.7614f, 10.3196f, 8.7287f, 10.4354f, 8.7609f, 10.6551f)
                curveTo(8.8276f, 11.1106f, 9.1793f, 12.0363f, 10.6069f, 13.5394f)
                curveTo(12.0391f, 15.0472f, 12.9077f, 15.4025f, 13.3103f, 15.4679f)
                curveTo(13.484f, 15.4961f, 13.5748f, 15.4716f, 13.6037f, 15.4614f)
                lineTo(14.0124f, 15.0312f)
                curveTo(14.8861f, 14.1113f, 16.2485f, 13.93f, 17.347f, 14.5623f)
                lineTo(19.2575f, 15.662f)
                curveTo(20.8904f, 16.6019f, 21.2705f, 18.901f, 19.9655f, 20.2749f)
                lineTo(18.5449f, 21.7705f)
                curveTo(18.1016f, 22.2373f, 17.497f, 22.6357f, 16.75f, 22.7095f)
                curveTo(14.9261f, 22.8895f, 10.701f, 22.655f, 6.2716f, 17.9917f)
                curveTo(2.1384f, 13.6403f, 1.3532f, 9.8554f, 1.254f, 8.0061f)
                curveTo(1.2049f, 7.0925f, 1.6122f, 6.3088f, 2.1481f, 5.7446f)
                lineTo(2.6919f, 6.2611f)
                lineTo(2.1481f, 5.7446f)
                lineTo(3.7177f, 4.0921f)
                close()
                moveTo(6.7609f, 5.3426f)
                curveTo(6.2485f, 4.6179f, 5.3281f, 4.5747f, 4.8053f, 5.1252f)
                lineTo(3.2357f, 6.7776f)
                curveTo(2.9043f, 7.1265f, 2.7304f, 7.5264f, 2.7518f, 7.9257f)
                curveTo(2.8329f, 9.4355f, 3.483f, 12.8778f, 7.3592f, 16.9587f)
                curveTo(11.4233f, 21.2375f, 15.1676f, 21.3584f, 16.6026f, 21.2167f)
                curveTo(16.8864f, 21.1887f, 17.1783f, 21.0313f, 17.4573f, 20.7375f)
                lineTo(18.8779f, 19.2419f)
                curveTo(19.4907f, 18.5968f, 19.33f, 17.4345f, 18.5092f, 16.962f)
                lineTo(16.5987f, 15.8623f)
                curveTo(16.086f, 15.5672f, 15.4854f, 15.6584f, 15.1f, 16.0642f)
                lineTo(14.6445f, 16.5437f)
                lineTo(14.1007f, 16.0272f)
                curveTo(14.6445f, 16.5437f, 14.6438f, 16.5444f, 14.6431f, 16.5452f)
                lineTo(14.6417f, 16.5467f)
                lineTo(14.6387f, 16.5497f)
                lineTo(14.6324f, 16.5562f)
                lineTo(14.6181f, 16.5703f)
                curveTo(14.6077f, 16.5803f, 14.5959f, 16.5913f, 14.5824f, 16.6031f)
                curveTo(14.5556f, 16.6266f, 14.5223f, 16.6535f, 14.4823f, 16.6819f)
                curveTo(14.4022f, 16.7387f, 14.2955f, 16.8012f, 14.1606f, 16.8544f)
                curveTo(13.8846f, 16.9632f, 13.5201f, 17.0216f, 13.0698f, 16.9485f)
                curveTo(12.1923f, 16.806f, 11.0422f, 16.1757f, 9.5193f, 14.5724f)
                curveTo(7.992f, 12.9644f, 7.4074f, 11.7647f, 7.2767f, 10.8726f)
                curveTo(7.2102f, 10.4185f, 7.2634f, 10.0549f, 7.3611f, 9.7803f)
                curveTo(7.4092f, 9.6453f, 7.4659f, 9.5376f, 7.5182f, 9.4559f)
                curveTo(7.5443f, 9.4151f, 7.5692f, 9.381f, 7.5912f, 9.3532f)
                curveTo(7.6022f, 9.3393f, 7.6124f, 9.327f, 7.6218f, 9.3162f)
                lineTo(7.6351f, 9.3013f)
                lineTo(7.6412f, 9.2946f)
                lineTo(7.6441f, 9.2915f)
                lineTo(7.6455f, 9.29f)
                curveTo(7.6462f, 9.2893f, 7.6469f, 9.2886f, 8.1907f, 9.8051f)
                lineTo(7.6469f, 9.2886f)
                lineTo(7.9337f, 8.9866f)
                curveTo(8.3793f, 8.5175f, 8.444f, 7.7231f, 8.0219f, 7.1261f)
                lineTo(6.7609f, 5.3426f)
                close()
                moveTo(17.0f, 4.25f)
                curveTo(17.4142f, 4.25f, 17.75f, 4.5858f, 17.75f, 5.0f)
                verticalLineTo(6.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 6.25f, 19.75f, 6.5858f, 19.75f, 7.0f)
                curveTo(19.75f, 7.4142f, 19.4142f, 7.75f, 19.0f, 7.75f)
                horizontalLineTo(17.75f)
                verticalLineTo(9.0f)
                curveTo(17.75f, 9.4142f, 17.4142f, 9.75f, 17.0f, 9.75f)
                curveTo(16.5858f, 9.75f, 16.25f, 9.4142f, 16.25f, 9.0f)
                verticalLineTo(7.75f)
                lineTo(15.0f, 7.75f)
                curveTo(14.5858f, 7.75f, 14.25f, 7.4142f, 14.25f, 7.0f)
                curveTo(14.25f, 6.5858f, 14.5858f, 6.25f, 15.0f, 6.25f)
                lineTo(16.25f, 6.25f)
                verticalLineTo(5.0f)
                curveTo(16.25f, 4.5858f, 16.5858f, 4.25f, 17.0f, 4.25f)
                close()
            }
        }
        .build()
        return _callMedicine!!
    }

private var _callMedicine: ImageVector? = null
