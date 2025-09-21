package dev.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.WeatherGroup

val WeatherGroup.CloudStorm: ImageVector
    get() {
        if (_cloudStorm != null) {
            return _cloudStorm!!
        }
        _cloudStorm = Builder(
            name = "CloudStorm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.8539f, 14.5104f)
                curveTo(11.1243f, 14.8242f, 11.0891f, 15.2978f, 10.7753f, 15.5682f)
                lineTo(8.0195f, 17.9426f)
                horizontalLineTo(10.2857f)
                curveTo(10.5992f, 17.9426f, 10.8797f, 18.1376f, 10.9888f, 18.4315f)
                curveTo(11.0979f, 18.7254f, 11.0128f, 19.0562f, 10.7752f, 19.2608f)
                lineTo(6.4895f, 22.9531f)
                curveTo(6.1757f, 23.2235f, 5.7021f, 23.1883f, 5.4318f, 22.8744f)
                curveTo(5.1614f, 22.5606f, 5.1967f, 22.0871f, 5.5105f, 21.8167f)
                lineTo(8.2661f, 19.4426f)
                horizontalLineTo(6.0f)
                curveTo(5.6865f, 19.4426f, 5.4061f, 19.2476f, 5.2969f, 18.9537f)
                curveTo(5.1878f, 18.6598f, 5.2729f, 18.3291f, 5.5104f, 18.1244f)
                lineTo(9.7962f, 14.4318f)
                curveTo(10.11f, 14.1614f, 10.5835f, 14.1966f, 10.8539f, 14.5104f)
                close()
                moveTo(15.5303f, 14.9697f)
                curveTo(15.8232f, 15.2626f, 15.8232f, 15.7374f, 15.5303f, 16.0303f)
                lineTo(13.5303f, 18.0303f)
                curveTo(13.2374f, 18.3232f, 12.7626f, 18.3232f, 12.4697f, 18.0303f)
                curveTo(12.1768f, 17.7374f, 12.1768f, 17.2626f, 12.4697f, 16.9697f)
                lineTo(14.4697f, 14.9697f)
                curveTo(14.7626f, 14.6768f, 15.2374f, 14.6768f, 15.5303f, 14.9697f)
                close()
                moveTo(17.5303f, 18.4697f)
                curveTo(17.8232f, 18.7626f, 17.8232f, 19.2374f, 17.5303f, 19.5303f)
                lineTo(15.5303f, 21.5303f)
                curveTo(15.2374f, 21.8232f, 14.7626f, 21.8232f, 14.4697f, 21.5303f)
                curveTo(14.1768f, 21.2374f, 14.1768f, 20.7626f, 14.4697f, 20.4697f)
                lineTo(16.4697f, 18.4697f)
                curveTo(16.7626f, 18.1768f, 17.2374f, 18.1768f, 17.5303f, 18.4697f)
                close()
                moveTo(13.5303f, 19.4697f)
                curveTo(13.8232f, 19.7626f, 13.8232f, 20.2374f, 13.5303f, 20.5303f)
                lineTo(11.5303f, 22.5303f)
                curveTo(11.2374f, 22.8232f, 10.7626f, 22.8232f, 10.4697f, 22.5303f)
                curveTo(10.1768f, 22.2374f, 10.1768f, 21.7626f, 10.4697f, 21.4697f)
                lineTo(12.4697f, 19.4697f)
                curveTo(12.7626f, 19.1768f, 13.2374f, 19.1768f, 13.5303f, 19.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.1238f, 18.2553f)
                curveTo(19.0157f, 17.9463f, 18.8381f, 17.6561f, 18.5911f, 17.409f)
                curveTo(18.1184f, 16.9363f, 17.4876f, 16.7179f, 16.8689f, 16.7538f)
                curveTo(17.4572f, 15.8791f, 17.3646f, 14.6825f, 16.5911f, 13.909f)
                curveTo(15.7124f, 13.0304f, 14.2878f, 13.0304f, 13.4091f, 13.909f)
                lineTo(12.5263f, 14.7918f)
                curveTo(12.4849f, 14.3418f, 12.3079f, 13.8999f, 11.9904f, 13.5314f)
                curveTo(11.1793f, 12.59f, 9.7586f, 12.4844f, 8.8172f, 13.2955f)
                lineTo(4.5314f, 16.9881f)
                curveTo(4.1522f, 17.3148f, 3.9025f, 17.7487f, 3.8012f, 18.2161f)
                curveTo(2.7109f, 17.4482f, 2.0f, 16.1885f, 2.0f, 14.7647f)
                curveTo(2.0f, 12.4256f, 3.9188f, 10.5294f, 6.2857f, 10.5294f)
                curveTo(6.5698f, 10.5294f, 6.8475f, 10.5567f, 7.1162f, 10.6089f)
                curveTo(6.8871f, 9.9978f, 6.7619f, 9.3369f, 6.7619f, 8.6471f)
                curveTo(6.7619f, 5.5283f, 9.3203f, 3.0f, 12.4762f, 3.0f)
                curveTo(15.4159f, 3.0f, 17.8371f, 5.1937f, 18.1551f, 8.015f)
                curveTo(20.393f, 8.7802f, 22.0f, 10.8811f, 22.0f, 13.3529f)
                curveTo(22.0f, 15.4509f, 20.8423f, 17.2816f, 19.1238f, 18.2553f)
                close()
            }
        }
            .build()
        return _cloudStorm!!
    }

private var _cloudStorm: ImageVector? = null
