package com.chiksmedina.solar.boldduotone.weather

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
import com.chiksmedina.solar.boldduotone.WeatherGroup

public val WeatherGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(22.0f, 14.3529f)
                curveTo(22.0f, 17.4717f, 19.4416f, 20.0f, 16.2857f, 20.0f)
                horizontalLineTo(10.4995f)
                curveTo(9.5579f, 18.7465f, 9.0f, 17.1884f, 9.0f, 15.5f)
                curveTo(9.0f, 11.3579f, 12.3579f, 8.0f, 16.5f, 8.0f)
                curveTo(17.009f, 8.0f, 17.5062f, 8.0507f, 17.9868f, 8.1474f)
                curveTo(18.0649f, 8.4284f, 18.1216f, 8.7182f, 18.1551f, 9.015f)
                curveTo(20.393f, 9.7802f, 22.0f, 11.8811f, 22.0f, 14.3529f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4762f, 4.0f)
                curveTo(9.3203f, 4.0f, 6.7619f, 6.5283f, 6.7619f, 9.6471f)
                curveTo(6.7619f, 10.3369f, 6.8871f, 10.9978f, 7.1162f, 11.6089f)
                curveTo(6.8475f, 11.5567f, 6.5698f, 11.5294f, 6.2857f, 11.5294f)
                curveTo(3.9188f, 11.5294f, 2.0f, 13.4256f, 2.0f, 15.7647f)
                curveTo(2.0f, 18.1038f, 3.9188f, 20.0f, 6.2857f, 20.0f)
                horizontalLineTo(10.4995f)
                curveTo(9.5579f, 18.7465f, 9.0f, 17.1884f, 9.0f, 15.5f)
                curveTo(9.0f, 11.3579f, 12.3579f, 8.0f, 16.5f, 8.0f)
                curveTo(17.009f, 8.0f, 17.5062f, 8.0507f, 17.9868f, 8.1474f)
                curveTo(17.9721f, 8.0944f, 17.9566f, 8.0418f, 17.9403f, 7.9895f)
                curveTo(17.2237f, 5.6796f, 15.0484f, 4.0f, 12.4762f, 4.0f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
