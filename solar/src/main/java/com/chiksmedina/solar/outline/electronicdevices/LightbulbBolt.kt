package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

public val ElectronicDevicesGroup.LightbulbBolt: ImageVector
    get() {
        if (_lightbulbBolt != null) {
            return _lightbulbBolt!!
        }
        _lightbulbBolt = Builder(name = "LightbulbBolt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.75f)
                curveTo(8.2721f, 2.75f, 5.25f, 5.7721f, 5.25f, 9.5f)
                curveTo(5.25f, 11.4985f, 6.1176f, 13.2934f, 7.4991f, 14.5304f)
                lineTo(7.5034f, 14.5343f)
                curveTo(8.0601f, 15.0328f, 8.483f, 15.4114f, 8.7853f, 15.6886f)
                curveTo(9.0699f, 15.9495f, 9.2954f, 16.1628f, 9.4135f, 16.3086f)
                lineTo(9.4264f, 16.3244f)
                curveTo(9.6476f, 16.5974f, 9.8405f, 16.8353f, 9.9676f, 17.1199f)
                curveTo(10.0948f, 17.4044f, 10.1434f, 17.7067f, 10.1992f, 18.0537f)
                lineTo(10.2024f, 18.0738f)
                curveTo(10.231f, 18.2517f, 10.2425f, 18.4701f, 10.247f, 18.75f)
                horizontalLineTo(13.753f)
                curveTo(13.7575f, 18.4701f, 13.769f, 18.2517f, 13.7976f, 18.0738f)
                lineTo(13.8008f, 18.0537f)
                curveTo(13.8566f, 17.7067f, 13.9052f, 17.4044f, 14.0324f, 17.1199f)
                curveTo(14.1596f, 16.8353f, 14.3524f, 16.5974f, 14.5736f, 16.3244f)
                lineTo(14.5865f, 16.3086f)
                curveTo(14.7046f, 16.1628f, 14.9301f, 15.9495f, 15.2147f, 15.6886f)
                curveTo(15.5171f, 15.4114f, 15.94f, 15.0327f, 16.4966f, 14.5343f)
                lineTo(16.5009f, 14.5304f)
                curveTo(17.8824f, 13.2934f, 18.75f, 11.4985f, 18.75f, 9.5f)
                curveTo(18.75f, 5.7721f, 15.7279f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(13.7436f, 20.25f)
                horizontalLineTo(10.2564f)
                curveTo(10.2597f, 20.3542f, 10.2646f, 20.4453f, 10.2721f, 20.5273f)
                curveTo(10.2925f, 20.7524f, 10.3269f, 20.8341f, 10.3505f, 20.875f)
                curveTo(10.4163f, 20.989f, 10.511f, 21.0837f, 10.625f, 21.1495f)
                curveTo(10.6659f, 21.1731f, 10.7476f, 21.2075f, 10.9727f, 21.2279f)
                curveTo(11.2082f, 21.2493f, 11.5189f, 21.25f, 12.0f, 21.25f)
                curveTo(12.4811f, 21.25f, 12.7918f, 21.2493f, 13.0273f, 21.2279f)
                curveTo(13.2524f, 21.2075f, 13.3341f, 21.1731f, 13.375f, 21.1495f)
                curveTo(13.489f, 21.0837f, 13.5837f, 20.989f, 13.6495f, 20.875f)
                curveTo(13.6731f, 20.8341f, 13.7075f, 20.7524f, 13.7279f, 20.5273f)
                curveTo(13.7354f, 20.4453f, 13.7403f, 20.3542f, 13.7436f, 20.25f)
                close()
                moveTo(3.75f, 9.5f)
                curveTo(3.75f, 4.9436f, 7.4436f, 1.25f, 12.0f, 1.25f)
                curveTo(16.5563f, 1.25f, 20.25f, 4.9436f, 20.25f, 9.5f)
                curveTo(20.25f, 11.9428f, 19.1874f, 14.1384f, 17.5016f, 15.6479f)
                curveTo(16.9397f, 16.151f, 16.5234f, 16.5238f, 16.2284f, 16.7942f)
                curveTo(16.0809f, 16.9295f, 15.9681f, 17.0351f, 15.8849f, 17.1162f)
                curveTo(15.8434f, 17.1566f, 15.8117f, 17.1886f, 15.788f, 17.2134f)
                curveTo(15.7763f, 17.2256f, 15.7675f, 17.2352f, 15.7611f, 17.2423f)
                curveTo(15.7546f, 17.2496f, 15.7519f, 17.2529f, 15.7519f, 17.2529f)
                curveTo(15.4917f, 17.574f, 15.4354f, 17.6568f, 15.4019f, 17.7319f)
                curveTo(15.3683f, 17.8069f, 15.3442f, 17.9041f, 15.2786f, 18.3121f)
                curveTo(15.2527f, 18.4732f, 15.25f, 18.7491f, 15.25f, 19.5f)
                verticalLineTo(19.5322f)
                curveTo(15.25f, 19.972f, 15.25f, 20.3514f, 15.2218f, 20.6627f)
                curveTo(15.192f, 20.9918f, 15.1259f, 21.3178f, 14.9486f, 21.625f)
                curveTo(14.7511f, 21.967f, 14.467f, 22.2511f, 14.125f, 22.4486f)
                curveTo(13.8178f, 22.6259f, 13.4918f, 22.692f, 13.1627f, 22.7218f)
                curveTo(12.8514f, 22.75f, 12.472f, 22.75f, 12.0322f, 22.75f)
                horizontalLineTo(11.9678f)
                curveTo(11.528f, 22.75f, 11.1486f, 22.75f, 10.8374f, 22.7218f)
                curveTo(10.5082f, 22.692f, 10.1822f, 22.6259f, 9.875f, 22.4486f)
                curveTo(9.533f, 22.2511f, 9.2489f, 21.967f, 9.0514f, 21.625f)
                curveTo(8.8741f, 21.3178f, 8.808f, 20.9918f, 8.7782f, 20.6627f)
                curveTo(8.75f, 20.3514f, 8.75f, 19.972f, 8.75f, 19.5322f)
                lineTo(8.75f, 19.5f)
                curveTo(8.75f, 18.7491f, 8.7473f, 18.4732f, 8.7214f, 18.3121f)
                curveTo(8.6558f, 17.9041f, 8.6317f, 17.8069f, 8.5981f, 17.7319f)
                curveTo(8.5646f, 17.6568f, 8.5083f, 17.574f, 8.2481f, 17.2529f)
                curveTo(8.2481f, 17.2529f, 8.2451f, 17.2493f, 8.2389f, 17.2423f)
                curveTo(8.2325f, 17.2352f, 8.2237f, 17.2256f, 8.212f, 17.2134f)
                curveTo(8.1883f, 17.1886f, 8.1566f, 17.1566f, 8.1151f, 17.1162f)
                curveTo(8.0319f, 17.0351f, 7.9191f, 16.9295f, 7.7716f, 16.7942f)
                curveTo(7.4766f, 16.5238f, 7.0603f, 16.151f, 6.4984f, 15.6479f)
                curveTo(4.8126f, 14.1384f, 3.75f, 11.9428f, 3.75f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.2215f, 7.8897f)
                curveTo(13.5586f, 8.1305f, 13.6366f, 8.5989f, 13.3959f, 8.9359f)
                lineTo(12.1001f, 10.75f)
                horizontalLineTo(13.6427f)
                curveTo(13.9237f, 10.75f, 14.181f, 10.907f, 14.3096f, 11.1568f)
                curveTo(14.4382f, 11.4066f, 14.4163f, 11.7073f, 14.253f, 11.9359f)
                lineTo(12.1102f, 14.9359f)
                curveTo(11.8694f, 15.273f, 11.401f, 15.3511f, 11.0639f, 15.1103f)
                curveTo(10.7269f, 14.8695f, 10.6488f, 14.4011f, 10.8896f, 14.0641f)
                lineTo(12.1853f, 12.25f)
                horizontalLineTo(10.6427f)
                curveTo(10.3618f, 12.25f, 10.1044f, 12.093f, 9.9759f, 11.8432f)
                curveTo(9.8473f, 11.5934f, 9.8691f, 11.2927f, 10.0324f, 11.0641f)
                lineTo(12.1753f, 8.0641f)
                curveTo(12.416f, 7.727f, 12.8844f, 7.6489f, 13.2215f, 7.8897f)
                close()
            }
        }
        .build()
        return _lightbulbBolt!!
    }

private var _lightbulbBolt: ImageVector? = null
