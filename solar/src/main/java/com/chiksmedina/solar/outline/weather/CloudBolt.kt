package com.chiksmedina.solar.outline.weather

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
import com.chiksmedina.solar.outline.WeatherGroup

public val WeatherGroup.CloudBolt: ImageVector
    get() {
        if (_cloudBolt != null) {
            return _cloudBolt!!
        }
        _cloudBolt = Builder(name = "CloudBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.4762f, 2.75f)
                curveTo(9.7261f, 2.75f, 7.5119f, 4.9508f, 7.5119f, 7.6471f)
                curveTo(7.5119f, 8.1092f, 7.5766f, 8.5555f, 7.6973f, 8.9781f)
                curveTo(8.1945f, 9.1216f, 8.6599f, 9.3389f, 9.0805f, 9.6171f)
                curveTo(9.4259f, 9.8456f, 9.5207f, 10.3109f, 9.2922f, 10.6564f)
                curveTo(9.0637f, 11.0019f, 8.5983f, 11.0967f, 8.2529f, 10.8681f)
                curveTo(7.8721f, 10.6162f, 7.4392f, 10.4355f, 6.9733f, 10.3451f)
                curveTo(6.7515f, 10.3021f, 6.5216f, 10.2794f, 6.2857f, 10.2794f)
                curveTo(4.3246f, 10.2794f, 2.75f, 11.8482f, 2.75f, 13.7647f)
                curveTo(2.75f, 15.6812f, 4.3246f, 17.25f, 6.2857f, 17.25f)
                curveTo(6.6999f, 17.25f, 7.0357f, 17.5858f, 7.0357f, 18.0f)
                curveTo(7.0357f, 18.4142f, 6.6999f, 18.75f, 6.2857f, 18.75f)
                curveTo(3.513f, 18.75f, 1.25f, 16.5264f, 1.25f, 13.7647f)
                curveTo(1.25f, 11.0605f, 3.4199f, 8.8721f, 6.1135f, 8.7823f)
                curveTo(6.0467f, 8.4136f, 6.0119f, 8.0341f, 6.0119f, 7.6471f)
                curveTo(6.0119f, 4.1057f, 8.9145f, 1.25f, 12.4762f, 1.25f)
                curveTo(15.6343f, 1.25f, 18.2724f, 3.4937f, 18.8314f, 6.4713f)
                curveTo(21.1313f, 7.4475f, 22.75f, 9.7093f, 22.75f, 12.3529f)
                curveTo(22.75f, 15.4269f, 20.5623f, 17.9843f, 17.6568f, 18.6057f)
                curveTo(17.2518f, 18.6923f, 16.8532f, 18.4341f, 16.7666f, 18.0291f)
                curveTo(16.68f, 17.624f, 16.9381f, 17.2254f, 17.3432f, 17.1388f)
                curveTo(19.5829f, 16.6598f, 21.25f, 14.693f, 21.25f, 12.3529f)
                curveTo(21.25f, 10.2162f, 19.8607f, 8.3909f, 17.9124f, 7.7246f)
                curveTo(17.4038f, 7.5507f, 16.8568f, 7.4559f, 16.2857f, 7.4559f)
                curveTo(15.7031f, 7.4559f, 15.1455f, 7.5546f, 14.6283f, 7.7353f)
                curveTo(14.2372f, 7.8719f, 13.8095f, 7.6656f, 13.6729f, 7.2745f)
                curveTo(13.5363f, 6.8835f, 13.7426f, 6.4557f, 14.1336f, 6.3192f)
                curveTo(14.8079f, 6.0836f, 15.5326f, 5.9559f, 16.2857f, 5.9559f)
                curveTo(16.5812f, 5.9559f, 16.8723f, 5.9756f, 17.1577f, 6.0137f)
                curveTo(16.477f, 4.1163f, 14.6422f, 2.75f, 12.4762f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.4538f, 13.7829f)
                curveTo(11.8147f, 13.5871f, 11.3356f, 14.0316f, 11.1123f, 14.2637f)
                lineTo(10.2029f, 15.4116f)
                lineTo(10.1712f, 15.4545f)
                lineTo(9.0229f, 17.0081f)
                lineTo(8.9937f, 17.0477f)
                lineTo(8.4387f, 17.8667f)
                curveTo(8.3044f, 18.1189f, 8.1267f, 18.5628f, 8.3702f, 19.0328f)
                curveTo(8.3759f, 19.0439f, 8.3818f, 19.0548f, 8.3878f, 19.0656f)
                curveTo(8.6382f, 19.5151f, 9.094f, 19.625f, 9.3741f, 19.6641f)
                curveTo(9.6524f, 19.703f, 10.0095f, 19.703f, 10.384f, 19.7029f)
                lineTo(10.4317f, 19.7029f)
                curveTo(10.5254f, 19.7029f, 10.6023f, 19.7029f, 10.6691f, 19.7039f)
                curveTo(10.6697f, 19.7605f, 10.6697f, 19.8251f, 10.6697f, 19.9022f)
                lineTo(10.6697f, 20.0183f)
                lineTo(10.6697f, 20.073f)
                curveTo(10.6696f, 20.6419f, 10.6696f, 21.1457f, 10.7197f, 21.5175f)
                curveTo(10.7622f, 21.8332f, 10.8905f, 22.4882f, 11.5462f, 22.6891f)
                curveTo(12.1852f, 22.885f, 12.6643f, 22.4404f, 12.8877f, 22.2084f)
                curveTo(13.1508f, 21.935f, 13.4531f, 21.5258f, 13.7971f, 21.0604f)
                lineTo(14.9771f, 19.4639f)
                lineTo(15.0063f, 19.4244f)
                lineTo(15.0466f, 19.3699f)
                curveTo(15.2475f, 19.0979f, 15.4391f, 18.8349f, 15.5613f, 18.6054f)
                curveTo(15.6956f, 18.3532f, 15.8733f, 17.9093f, 15.6298f, 17.4392f)
                lineTo(15.6122f, 17.4064f)
                curveTo(15.3617f, 16.9569f, 14.906f, 16.8471f, 14.6259f, 16.8079f)
                curveTo(14.3476f, 16.769f, 13.9905f, 16.7691f, 13.616f, 16.7692f)
                lineTo(13.5683f, 16.7692f)
                curveTo(13.4746f, 16.7692f, 13.3977f, 16.7691f, 13.3309f, 16.7682f)
                curveTo(13.3303f, 16.7116f, 13.3303f, 16.647f, 13.3303f, 16.5698f)
                verticalLineTo(16.4537f)
                lineTo(13.3303f, 16.399f)
                curveTo(13.3303f, 15.8301f, 13.3304f, 15.3264f, 13.2803f, 14.9546f)
                curveTo(13.2377f, 14.6388f, 13.1094f, 13.9838f, 12.4538f, 13.7829f)
                close()
                moveTo(11.8267f, 15.7451f)
                curveTo(11.7013f, 15.9085f, 11.5543f, 16.1068f, 11.3775f, 16.3461f)
                lineTo(10.2292f, 17.8997f)
                curveTo(10.1451f, 18.0135f, 10.072f, 18.1125f, 10.008f, 18.2011f)
                curveTo(10.1255f, 18.2026f, 10.2648f, 18.2029f, 10.4317f, 18.2029f)
                lineTo(10.4648f, 18.2029f)
                curveTo(10.6666f, 18.2028f, 10.8826f, 18.2027f, 11.0648f, 18.226f)
                curveTo(11.2751f, 18.2528f, 11.5487f, 18.3215f, 11.7841f, 18.543f)
                lineTo(11.7899f, 18.5484f)
                lineTo(11.8032f, 18.5612f)
                curveTo(12.0381f, 18.7918f, 12.1151f, 19.0667f, 12.1449f, 19.2824f)
                curveTo(12.1699f, 19.4634f, 12.1698f, 19.6765f, 12.1697f, 19.8684f)
                lineTo(12.1697f, 19.9023f)
                lineTo(12.1697f, 20.0183f)
                curveTo(12.1697f, 20.2975f, 12.17f, 20.531f, 12.1733f, 20.7269f)
                curveTo(12.2986f, 20.5635f, 12.4457f, 20.3652f, 12.6225f, 20.126f)
                lineTo(13.7708f, 18.5724f)
                curveTo(13.8549f, 18.4585f, 13.928f, 18.3596f, 13.992f, 18.271f)
                curveTo(13.8745f, 18.2694f, 13.7352f, 18.2692f, 13.5683f, 18.2692f)
                lineTo(13.5351f, 18.2692f)
                curveTo(13.3334f, 18.2692f, 13.1174f, 18.2693f, 12.9352f, 18.2461f)
                curveTo(12.7249f, 18.2193f, 12.4513f, 18.1505f, 12.2159f, 17.9291f)
                lineTo(12.2101f, 17.9236f)
                lineTo(12.1968f, 17.9108f)
                curveTo(11.9619f, 17.6802f, 11.8849f, 17.4054f, 11.8551f, 17.1896f)
                curveTo(11.8301f, 17.0087f, 11.8302f, 16.7956f, 11.8303f, 16.6037f)
                lineTo(11.8303f, 16.5698f)
                verticalLineTo(16.4537f)
                curveTo(11.8303f, 16.1745f, 11.83f, 15.9411f, 11.8267f, 15.7451f)
                close()
            }
        }
        .build()
        return _cloudBolt!!
    }

private var _cloudBolt: ImageVector? = null
