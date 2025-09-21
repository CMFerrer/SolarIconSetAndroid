package dev.chiksmedina.solar.bold.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.WeatherGroup

val WeatherGroup.CloudyMoon: ImageVector
    get() {
        if (_cloudyMoon != null) {
            return _cloudyMoon!!
        }
        _cloudyMoon = Builder(
            name = "CloudyMoon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.2857f, 22.0f)
                curveTo(13.3371f, 22.0f, 15.0f, 20.4198f, 15.0f, 18.4706f)
                curveTo(15.0f, 16.9257f, 13.9554f, 15.6126f, 12.5008f, 15.1344f)
                curveTo(12.2941f, 13.3711f, 10.7203f, 12.0f, 8.8095f, 12.0f)
                curveTo(6.7582f, 12.0f, 5.0952f, 13.5802f, 5.0952f, 15.5294f)
                curveTo(5.0952f, 15.9605f, 5.1766f, 16.3736f, 5.3255f, 16.7555f)
                curveTo(5.1509f, 16.723f, 4.9704f, 16.7059f, 4.7857f, 16.7059f)
                curveTo(3.2472f, 16.7059f, 2.0f, 17.891f, 2.0f, 19.3529f)
                curveTo(2.0f, 20.8149f, 3.2472f, 22.0f, 4.7857f, 22.0f)
                horizontalLineTo(11.2857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.716f, 15.7231f)
                curveTo(2.994f, 15.5747f, 3.2896f, 15.4555f, 3.5978f, 15.3691f)
                curveTo(3.6861f, 12.5991f, 6.0557f, 10.5f, 8.8095f, 10.5f)
                curveTo(8.9818f, 10.5f, 9.1526f, 10.5082f, 9.3214f, 10.5242f)
                curveTo(9.1128f, 9.8872f, 9.0f, 9.2067f, 9.0f, 8.5f)
                curveTo(9.0f, 6.1385f, 10.2594f, 4.0711f, 12.1432f, 2.9328f)
                curveTo(12.5392f, 2.6935f, 12.4627f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 13.3159f, 2.2541f, 14.5724f, 2.716f, 15.7231f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 16.2658f, 19.3289f, 19.9078f, 15.5681f, 21.3447f)
                curveTo(16.1527f, 20.5383f, 16.5f, 19.5527f, 16.5f, 18.4706f)
                curveTo(16.5f, 17.0996f, 15.9372f, 15.8789f, 15.0434f, 14.9842f)
                curveTo(15.1942f, 14.9947f, 15.3465f, 15.0f, 15.5f, 15.0f)
                curveTo(17.8615f, 15.0f, 19.9289f, 13.7406f, 21.0672f, 11.8568f)
                curveTo(21.3065f, 11.4608f, 22.0f, 11.5373f, 22.0f, 12.0f)
                close()
            }
        }
            .build()
        return _cloudyMoon!!
    }

private var _cloudyMoon: ImageVector? = null
