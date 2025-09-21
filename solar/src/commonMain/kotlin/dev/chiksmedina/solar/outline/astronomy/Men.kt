package dev.chiksmedina.solar.outline.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.AstronomyGroup

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
                pathFillType = EvenOdd
            ) {
                moveTo(16.25f, 2.0f)
                curveTo(16.25f, 1.5858f, 16.5858f, 1.25f, 17.0f, 1.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 1.25f, 22.75f, 1.5858f, 22.75f, 2.0f)
                verticalLineTo(7.0f)
                curveTo(22.75f, 7.4142f, 22.4142f, 7.75f, 22.0f, 7.75f)
                curveTo(21.5858f, 7.75f, 21.25f, 7.4142f, 21.25f, 7.0f)
                verticalLineTo(3.8107f)
                lineTo(16.6949f, 8.3658f)
                curveTo(17.9773f, 9.888f, 18.75f, 11.8538f, 18.75f, 14.0f)
                curveTo(18.75f, 18.8325f, 14.8325f, 22.75f, 10.0f, 22.75f)
                curveTo(5.1675f, 22.75f, 1.25f, 18.8325f, 1.25f, 14.0f)
                curveTo(1.25f, 9.1675f, 5.1675f, 5.25f, 10.0f, 5.25f)
                curveTo(12.1462f, 5.25f, 14.112f, 6.0227f, 15.6342f, 7.3051f)
                lineTo(20.1893f, 2.75f)
                horizontalLineTo(17.0f)
                curveTo(16.5858f, 2.75f, 16.25f, 2.4142f, 16.25f, 2.0f)
                close()
                moveTo(10.0f, 6.75f)
                curveTo(5.9959f, 6.75f, 2.75f, 9.9959f, 2.75f, 14.0f)
                curveTo(2.75f, 18.0041f, 5.9959f, 21.25f, 10.0f, 21.25f)
                curveTo(14.0041f, 21.25f, 17.25f, 18.0041f, 17.25f, 14.0f)
                curveTo(17.25f, 9.9959f, 14.0041f, 6.75f, 10.0f, 6.75f)
                close()
            }
        }
            .build()
        return _men!!
    }

private var _men: ImageVector? = null
