package com.chiksmedina.solar.linear.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.WeatherGroup

public val WeatherGroup.CloudWaterdrops: ImageVector
    get() {
        if (_cloudWaterdrops != null) {
            return _cloudWaterdrops!!
        }
        _cloudWaterdrops = Builder(name = "CloudWaterdrops", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.381f, 8.0272f)
                curveTo(14.9767f, 7.8191f, 15.6178f, 7.7059f, 16.2857f, 7.7059f)
                curveTo(16.9404f, 7.7059f, 17.5693f, 7.8147f, 18.1551f, 8.015f)
                moveTo(7.1162f, 10.6089f)
                curveTo(6.8475f, 10.5567f, 6.5698f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(3.9188f, 10.5294f, 2.0f, 12.4256f, 2.0f, 14.7647f)
                curveTo(2.0f, 16.6611f, 3.2612f, 18.2664f, 5.0f, 18.8061f)
                moveTo(7.1162f, 10.6089f)
                curveTo(6.8871f, 9.9978f, 6.7619f, 9.3369f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 5.5283f, 9.3203f, 3.0f, 12.4762f, 3.0f)
                curveTo(15.4159f, 3.0f, 17.8371f, 5.1937f, 18.1551f, 8.015f)
                moveTo(7.1162f, 10.6089f)
                curveTo(7.6806f, 10.7184f, 8.2053f, 10.9374f, 8.6667f, 11.2426f)
                moveTo(18.1551f, 8.015f)
                curveTo(20.393f, 8.7802f, 22.0f, 10.8811f, 22.0f, 13.3529f)
                curveTo(22.0f, 15.6958f, 20.5562f, 17.7055f, 18.5f, 18.5604f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 20.3331f)
                curveTo(11.0f, 21.2536f, 10.3284f, 21.9998f, 9.5f, 21.9998f)
                curveTo(8.6716f, 21.9998f, 8.0f, 21.2536f, 8.0f, 20.3331f)
                curveTo(8.0f, 19.8282f, 8.4512f, 19.1753f, 8.8587f, 18.6885f)
                curveTo(9.1983f, 18.2829f, 9.8017f, 18.2829f, 10.1413f, 18.6885f)
                curveTo(10.5488f, 19.1753f, 11.0f, 19.8282f, 11.0f, 20.3331f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 20.3331f)
                curveTo(16.0f, 21.2536f, 15.3284f, 21.9998f, 14.5f, 21.9998f)
                curveTo(13.6716f, 21.9998f, 13.0f, 21.2536f, 13.0f, 20.3331f)
                curveTo(13.0f, 19.8282f, 13.4512f, 19.1753f, 13.8587f, 18.6885f)
                curveTo(14.1983f, 18.2829f, 14.8017f, 18.2829f, 15.1413f, 18.6885f)
                curveTo(15.5488f, 19.1753f, 16.0f, 19.8282f, 16.0f, 20.3331f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 15.3331f)
                curveTo(13.5f, 16.2536f, 12.8284f, 16.9998f, 12.0f, 16.9998f)
                curveTo(11.1716f, 16.9998f, 10.5f, 16.2536f, 10.5f, 15.3331f)
                curveTo(10.5f, 14.8282f, 10.9512f, 14.1753f, 11.3587f, 13.6885f)
                curveTo(11.6983f, 13.2829f, 12.3017f, 13.2829f, 12.6413f, 13.6885f)
                curveTo(13.0488f, 14.1753f, 13.5f, 14.8282f, 13.5f, 15.3331f)
                close()
            }
        }
        .build()
        return _cloudWaterdrops!!
    }

private var _cloudWaterdrops: ImageVector? = null
