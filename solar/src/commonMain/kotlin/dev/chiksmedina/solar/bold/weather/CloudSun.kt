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

val WeatherGroup.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) {
            return _cloudSun!!
        }
        _cloudSun = Builder(
            name = "CloudSun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.2857f, 20.0f)
                curveTo(19.4416f, 20.0f, 22.0f, 17.4717f, 22.0f, 14.3529f)
                curveTo(22.0f, 11.8811f, 20.393f, 9.7802f, 18.1551f, 9.015f)
                curveTo(17.8371f, 6.1937f, 15.4159f, 4.0f, 12.4762f, 4.0f)
                curveTo(9.3203f, 4.0f, 6.7619f, 6.5283f, 6.7619f, 9.6471f)
                curveTo(6.7619f, 10.3369f, 6.8871f, 10.9978f, 7.1162f, 11.6089f)
                curveTo(6.8475f, 11.5567f, 6.5698f, 11.5294f, 6.2857f, 11.5294f)
                curveTo(3.9188f, 11.5294f, 2.0f, 13.4256f, 2.0f, 15.7647f)
                curveTo(2.0f, 18.1038f, 3.9188f, 20.0f, 6.2857f, 20.0f)
                horizontalLineTo(16.2857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.9395f, 2.9549f)
                curveTo(9.1145f, 2.3543f, 8.0986f, 2.0f, 7.0f, 2.0f)
                curveTo(4.2386f, 2.0f, 2.0f, 4.2386f, 2.0f, 7.0f)
                curveTo(2.0f, 8.4545f, 2.6211f, 9.764f, 3.6125f, 10.6776f)
                curveTo(4.1274f, 10.4112f, 4.6874f, 10.2195f, 5.2773f, 10.1165f)
                curveTo(5.2671f, 9.9612f, 5.2619f, 9.8047f, 5.2619f, 9.6471f)
                curveTo(5.2619f, 6.5739f, 7.2135f, 3.9699f, 9.9395f, 2.9549f)
                close()
            }
        }
            .build()
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
