package dev.chiksmedina.solar.bold.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.AstronomyGroup

val AstronomyGroup.Men: ImageVector
    get() {
        if (_men != null) {
            return _men!!
        }
        _men = Builder(
            name = "Men", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0001f, 1.25f)
                curveTo(16.5858f, 1.25f, 16.2501f, 1.5858f, 16.2501f, 2.0f)
                curveTo(16.2501f, 2.4142f, 16.5858f, 2.75f, 17.0001f, 2.75f)
                horizontalLineTo(20.1894f)
                lineTo(15.1018f, 7.8376f)
                curveTo(13.717f, 6.6899f, 11.9391f, 6.0f, 10.0f, 6.0f)
                curveTo(5.5817f, 6.0f, 2.0f, 9.5817f, 2.0f, 14.0f)
                curveTo(2.0f, 18.4183f, 5.5817f, 22.0f, 10.0f, 22.0f)
                curveTo(14.4183f, 22.0f, 18.0f, 18.4183f, 18.0f, 14.0f)
                curveTo(18.0f, 12.0609f, 17.3101f, 10.283f, 16.1624f, 8.8983f)
                lineTo(21.2501f, 3.8107f)
                verticalLineTo(7.0f)
                curveTo(21.2501f, 7.4142f, 21.5858f, 7.75f, 22.0001f, 7.75f)
                curveTo(22.4143f, 7.75f, 22.7501f, 7.4142f, 22.7501f, 7.0f)
                verticalLineTo(2.0f)
                curveTo(22.7501f, 1.5858f, 22.4143f, 1.25f, 22.0001f, 1.25f)
                horizontalLineTo(17.0001f)
                close()
            }
        }
            .build()
        return _men!!
    }

private var _men: ImageVector? = null
