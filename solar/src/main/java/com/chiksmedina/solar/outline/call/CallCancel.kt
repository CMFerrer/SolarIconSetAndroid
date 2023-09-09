package com.chiksmedina.solar.outline.call

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.CallGroup

public val CallGroup.CallCancel: ImageVector
    get() {
        if (_callCancel != null) {
            return _callCancel!!
        }
        _callCancel = Builder(name = "CallCancel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.9856f, 3.4766f)
                curveTo(7.972f, 2.0431f, 5.9438f, 1.8012f, 4.7176f, 3.0921f)
                lineTo(3.148f, 4.7446f)
                curveTo(2.6122f, 5.3088f, 2.2049f, 6.0925f, 2.2539f, 7.0061f)
                curveTo(2.3532f, 8.8554f, 3.1384f, 12.6403f, 7.2715f, 16.9917f)
                curveTo(11.7009f, 21.655f, 15.9261f, 21.8895f, 17.7499f, 21.7095f)
                curveTo(18.497f, 21.6358f, 19.1015f, 21.2373f, 19.5449f, 20.7705f)
                lineTo(20.9654f, 19.275f)
                curveTo(22.2704f, 17.9011f, 21.8904f, 15.6019f, 20.2574f, 14.662f)
                lineTo(18.3469f, 13.5623f)
                curveTo(17.2485f, 12.9301f, 15.8861f, 13.1113f, 15.0123f, 14.0312f)
                lineTo(14.6037f, 14.4614f)
                curveTo(14.5748f, 14.4716f, 14.4839f, 14.4961f, 14.3103f, 14.4679f)
                curveTo(13.9077f, 14.4025f, 13.039f, 14.0472f, 11.6069f, 12.5394f)
                curveTo(10.1792f, 11.0364f, 9.8276f, 10.1107f, 9.7608f, 9.6551f)
                curveTo(9.7286f, 9.4354f, 9.7614f, 9.3196f, 9.7743f, 9.2832f)
                lineTo(9.7764f, 9.2774f)
                lineTo(10.0213f, 9.0197f)
                curveTo(10.9889f, 8.001f, 11.0573f, 6.4068f, 10.2466f, 5.2601f)
                lineTo(8.9856f, 3.4766f)
                close()
                moveTo(5.8052f, 4.1252f)
                curveTo(6.3281f, 3.5747f, 7.2485f, 3.618f, 7.7608f, 4.3426f)
                lineTo(9.0218f, 6.1261f)
                curveTo(9.444f, 6.7232f, 9.3792f, 7.5175f, 8.9337f, 7.9866f)
                lineTo(8.6469f, 8.2886f)
                lineTo(9.1785f, 8.7936f)
                curveTo(8.6469f, 8.2886f, 8.6462f, 8.2893f, 8.6455f, 8.29f)
                lineTo(8.6441f, 8.2915f)
                lineTo(8.6412f, 8.2947f)
                lineTo(8.6351f, 8.3013f)
                lineTo(8.6218f, 8.3163f)
                curveTo(8.6124f, 8.327f, 8.6021f, 8.3393f, 8.5911f, 8.3532f)
                curveTo(8.5692f, 8.381f, 8.5443f, 8.4151f, 8.5182f, 8.4559f)
                curveTo(8.4659f, 8.5377f, 8.4092f, 8.6453f, 8.3611f, 8.7803f)
                curveTo(8.2634f, 9.0549f, 8.2102f, 9.4185f, 8.2767f, 9.8726f)
                curveTo(8.4074f, 10.7647f, 8.992f, 11.9644f, 10.5193f, 13.5724f)
                curveTo(12.0422f, 15.1757f, 13.1923f, 15.806f, 14.0698f, 15.9485f)
                curveTo(14.5201f, 16.0216f, 14.8846f, 15.9633f, 15.1606f, 15.8544f)
                curveTo(15.2955f, 15.8012f, 15.4022f, 15.7387f, 15.4823f, 15.6819f)
                curveTo(15.5223f, 15.6535f, 15.5555f, 15.6266f, 15.5824f, 15.6031f)
                curveTo(15.5958f, 15.5913f, 15.6077f, 15.5803f, 15.618f, 15.5704f)
                lineTo(15.6324f, 15.5562f)
                lineTo(15.6387f, 15.5498f)
                lineTo(15.6417f, 15.5467f)
                lineTo(15.6431f, 15.5452f)
                curveTo(15.6438f, 15.5445f, 15.6445f, 15.5438f, 15.1173f, 15.043f)
                lineTo(15.6445f, 15.5437f)
                lineTo(16.0999f, 15.0642f)
                curveTo(16.4854f, 14.6584f, 17.086f, 14.5673f, 17.5987f, 14.8624f)
                lineTo(19.5092f, 15.962f)
                curveTo(20.33f, 16.4345f, 20.4907f, 17.5968f, 19.8779f, 18.2419f)
                lineTo(18.4573f, 19.7375f)
                curveTo(18.1783f, 20.0313f, 17.8863f, 20.1887f, 17.6026f, 20.2167f)
                curveTo(16.1676f, 20.3584f, 12.4233f, 20.2375f, 8.3591f, 15.9587f)
                curveTo(4.483f, 11.8779f, 3.8328f, 8.4356f, 3.7518f, 6.9258f)
                curveTo(3.7304f, 6.5265f, 3.9042f, 6.1266f, 4.2356f, 5.7777f)
                lineTo(5.8052f, 4.1252f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5303f, 3.4697f)
                curveTo(16.2374f, 3.1768f, 15.7625f, 3.1768f, 15.4696f, 3.4697f)
                curveTo(15.1767f, 3.7626f, 15.1767f, 4.2375f, 15.4696f, 4.5304f)
                lineTo(16.9393f, 6.0f)
                lineTo(15.4696f, 7.4697f)
                curveTo(15.1768f, 7.7626f, 15.1768f, 8.2375f, 15.4696f, 8.5303f)
                curveTo(15.7625f, 8.8232f, 16.2374f, 8.8232f, 16.5303f, 8.5303f)
                lineTo(18.0f, 7.0607f)
                lineTo(19.4696f, 8.5303f)
                curveTo(19.7625f, 8.8232f, 20.2374f, 8.8232f, 20.5303f, 8.5303f)
                curveTo(20.8232f, 8.2374f, 20.8232f, 7.7626f, 20.5303f, 7.4697f)
                lineTo(19.0606f, 6.0f)
                lineTo(20.5303f, 4.5304f)
                curveTo(20.8232f, 4.2375f, 20.8232f, 3.7626f, 20.5303f, 3.4697f)
                curveTo(20.2374f, 3.1768f, 19.7625f, 3.1768f, 19.4696f, 3.4697f)
                lineTo(18.0f, 4.9394f)
                lineTo(16.5303f, 3.4697f)
                close()
            }
        }
        .build()
        return _callCancel!!
    }

private var _callCancel: ImageVector? = null
