package com.chiksmedina.solar.linear.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.WeatherGroup

val WeatherGroup.CloudBolt: ImageVector
    get() {
        if (_cloudBolt != null) {
            return _cloudBolt!!
        }
        _cloudBolt = Builder(
            name = "CloudBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.2857f, 18.0f)
                curveTo(3.9188f, 18.0f, 2.0f, 16.1038f, 2.0f, 13.7647f)
                curveTo(2.0f, 11.4256f, 3.9188f, 9.5294f, 6.2857f, 9.5294f)
                curveTo(6.5698f, 9.5294f, 6.8475f, 9.5567f, 7.1162f, 9.6089f)
                moveTo(14.381f, 7.0272f)
                curveTo(14.9767f, 6.8191f, 15.6178f, 6.7059f, 16.2857f, 6.7059f)
                curveTo(16.9404f, 6.7059f, 17.5693f, 6.8147f, 18.1551f, 7.015f)
                moveTo(7.1162f, 9.6089f)
                curveTo(6.8871f, 8.9978f, 6.7619f, 8.3369f, 6.7619f, 7.6471f)
                curveTo(6.7619f, 4.5283f, 9.3203f, 2.0f, 12.4762f, 2.0f)
                curveTo(15.4159f, 2.0f, 17.8371f, 4.1937f, 18.1551f, 7.015f)
                moveTo(7.1162f, 9.6089f)
                curveTo(7.6806f, 9.7184f, 8.2053f, 9.9374f, 8.6667f, 10.2426f)
                moveTo(18.1551f, 7.015f)
                curveTo(20.393f, 7.7802f, 22.0f, 9.8811f, 22.0f, 12.3529f)
                curveTo(22.0f, 15.0599f, 20.0726f, 17.3221f, 17.5f, 17.8722f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.6261f, 17.4539f)
                lineTo(10.7744f, 15.9003f)
                curveTo(11.5166f, 14.896f, 11.8878f, 14.3939f, 12.234f, 14.5f)
                curveTo(12.5803f, 14.6061f, 12.5803f, 15.222f, 12.5803f, 16.4537f)
                verticalLineTo(16.5699f)
                curveTo(12.5803f, 17.0141f, 12.5803f, 17.2362f, 12.7222f, 17.3756f)
                lineTo(12.7297f, 17.3828f)
                curveTo(12.8748f, 17.5192f, 13.106f, 17.5192f, 13.5683f, 17.5192f)
                curveTo(14.4004f, 17.5192f, 14.8165f, 17.5192f, 14.9571f, 17.7715f)
                curveTo(14.9594f, 17.7757f, 14.9617f, 17.7799f, 14.9639f, 17.7842f)
                curveTo(15.0966f, 18.0404f, 14.8557f, 18.3663f, 14.3739f, 19.0182f)
                lineTo(13.2256f, 20.5718f)
                curveTo(12.4833f, 21.5761f, 12.1122f, 22.0782f, 11.7659f, 21.9721f)
                curveTo(11.4197f, 21.866f, 11.4197f, 21.2501f, 11.4197f, 20.0184f)
                lineTo(11.4197f, 19.9023f)
                curveTo(11.4197f, 19.458f, 11.4197f, 19.2359f, 11.2778f, 19.0965f)
                lineTo(11.2703f, 19.0893f)
                curveTo(11.1252f, 18.9529f, 10.894f, 18.9529f, 10.4317f, 18.9529f)
                curveTo(9.5996f, 18.9529f, 9.1835f, 18.9529f, 9.0429f, 18.7006f)
                curveTo(9.0406f, 18.6964f, 9.0384f, 18.6922f, 9.0361f, 18.6879f)
                curveTo(8.9034f, 18.4317f, 9.1443f, 18.1058f, 9.6261f, 17.4539f)
                close()
            }
        }
            .build()
        return _cloudBolt!!
    }

private var _cloudBolt: ImageVector? = null
