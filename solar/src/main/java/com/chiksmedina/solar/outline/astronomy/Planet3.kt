package com.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.AstronomyGroup

public val AstronomyGroup.Planet3: ImageVector
    get() {
        if (_planet3 != null) {
            return _planet3!!
        }
        _planet3 = Builder(name = "Planet3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.1923f, 9.1659f)
                curveTo(2.9051f, 10.059f, 2.75f, 11.0114f, 2.75f, 12.0f)
                curveTo(2.75f, 12.4327f, 2.7797f, 12.8585f, 2.8372f, 13.2755f)
                curveTo(2.874f, 13.2673f, 2.912f, 13.2619f, 2.9508f, 13.2593f)
                lineTo(3.0f, 14.0075f)
                curveTo(2.9508f, 13.2593f, 2.9506f, 13.2593f, 2.9508f, 13.2593f)
                lineTo(2.9527f, 13.2592f)
                lineTo(2.9553f, 13.259f)
                lineTo(2.9629f, 13.2586f)
                lineTo(2.9871f, 13.2573f)
                curveTo(3.0073f, 13.2563f, 3.0353f, 13.2551f, 3.071f, 13.2539f)
                curveTo(3.1423f, 13.2516f, 3.2439f, 13.2496f, 3.3733f, 13.2501f)
                curveTo(3.632f, 13.2511f, 4.002f, 13.2624f, 4.4615f, 13.3025f)
                curveTo(5.3799f, 13.3827f, 6.6605f, 13.5785f, 8.1283f, 14.0403f)
                curveTo(8.5789f, 14.1821f, 9.0272f, 14.4137f, 9.4553f, 14.6459f)
                curveTo(9.5549f, 14.6998f, 9.6541f, 14.7542f, 9.7536f, 14.8089f)
                curveTo(10.1001f, 14.9989f, 10.4512f, 15.1916f, 10.8406f, 15.3783f)
                curveTo(11.8205f, 15.8482f, 12.9853f, 16.25f, 14.5093f, 16.25f)
                curveTo(17.3331f, 16.25f, 19.5635f, 15.1904f, 20.8698f, 14.3658f)
                curveTo(20.8982f, 14.3479f, 20.9274f, 14.3321f, 20.9571f, 14.3184f)
                curveTo(21.1483f, 13.5775f, 21.25f, 12.8006f, 21.25f, 12.0f)
                curveTo(21.25f, 10.8563f, 21.0424f, 9.7612f, 20.663f, 8.7501f)
                curveTo(20.4635f, 8.7509f, 20.166f, 8.7605f, 19.7896f, 8.7963f)
                curveTo(19.0359f, 8.868f, 17.97f, 9.0447f, 16.7432f, 9.4652f)
                curveTo(16.48f, 9.5554f, 16.1799f, 9.7177f, 15.7851f, 9.9509f)
                curveTo(15.7057f, 9.9978f, 15.6228f, 10.0474f, 15.5365f, 10.099f)
                curveTo(15.2143f, 10.2916f, 14.8463f, 10.5117f, 14.4491f, 10.7193f)
                curveTo(13.4191f, 11.2575f, 12.1264f, 11.75f, 10.4372f, 11.75f)
                curveTo(8.0191f, 11.75f, 6.0306f, 10.9463f, 4.6563f, 10.1535f)
                curveTo(4.0476f, 9.8023f, 3.5546f, 9.4507f, 3.1923f, 9.1659f)
                close()
                moveTo(3.7969f, 7.7214f)
                curveTo(3.8558f, 7.7723f, 3.9242f, 7.8299f, 4.0019f, 7.8929f)
                curveTo(4.3223f, 8.153f, 4.7975f, 8.5033f, 5.4058f, 8.8542f)
                curveTo(6.6251f, 9.5575f, 8.3552f, 10.25f, 10.4372f, 10.25f)
                curveTo(11.8108f, 10.25f, 12.8623f, 9.8559f, 13.7544f, 9.3898f)
                curveTo(14.1095f, 9.2043f, 14.4293f, 9.0131f, 14.7469f, 8.8233f)
                curveTo(14.8386f, 8.7685f, 14.93f, 8.7138f, 15.0221f, 8.6594f)
                curveTo(15.4144f, 8.4277f, 15.8328f, 8.1916f, 16.2568f, 8.0463f)
                curveTo(17.6129f, 7.5814f, 18.797f, 7.384f, 19.6475f, 7.3031f)
                curveTo(19.7556f, 7.2928f, 19.8583f, 7.2844f, 19.9553f, 7.2775f)
                curveTo(18.3426f, 4.5665f, 15.3834f, 2.75f, 12.0f, 2.75f)
                curveTo(8.4351f, 2.75f, 5.3412f, 4.7667f, 3.7969f, 7.7214f)
                close()
                moveTo(20.0853f, 16.4969f)
                curveTo(18.6481f, 17.1634f, 16.748f, 17.75f, 14.5093f, 17.75f)
                curveTo(12.6961f, 17.75f, 11.3066f, 17.2653f, 10.1921f, 16.7308f)
                curveTo(9.7618f, 16.5245f, 9.3637f, 16.306f, 9.0128f, 16.1134f)
                curveTo(8.9185f, 16.0617f, 8.8276f, 16.0118f, 8.7404f, 15.9645f)
                curveTo(8.311f, 15.7317f, 7.9762f, 15.565f, 7.6781f, 15.4712f)
                curveTo(6.3316f, 15.0475f, 5.1606f, 14.8693f, 4.331f, 14.7968f)
                curveTo(3.9165f, 14.7606f, 3.5883f, 14.7509f, 3.3674f, 14.7501f)
                curveTo(3.285f, 14.7497f, 3.2176f, 14.7506f, 3.1662f, 14.7518f)
                curveTo(4.3377f, 18.5166f, 7.8497f, 21.25f, 12.0f, 21.25f)
                curveTo(15.4764f, 21.25f, 18.505f, 19.3322f, 20.0853f, 16.4969f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
            }
        }
        .build()
        return _planet3!!
    }

private var _planet3: ImageVector? = null
