package dev.chiksmedina.solar.outline.search

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SearchGroup

val SearchGroup.MagniferZoomIn: ImageVector
    get() {
        if (_magniferZoomIn != null) {
            return _magniferZoomIn!!
        }
        _magniferZoomIn = Builder(
            name = "MagniferZoomIn", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.5f, 2.75f)
                curveTo(6.6675f, 2.75f, 2.75f, 6.6675f, 2.75f, 11.5f)
                curveTo(2.75f, 16.3325f, 6.6675f, 20.25f, 11.5f, 20.25f)
                curveTo(16.3325f, 20.25f, 20.25f, 16.3325f, 20.25f, 11.5f)
                curveTo(20.25f, 6.6675f, 16.3325f, 2.75f, 11.5f, 2.75f)
                close()
                moveTo(1.25f, 11.5f)
                curveTo(1.25f, 5.8391f, 5.8391f, 1.25f, 11.5f, 1.25f)
                curveTo(17.1609f, 1.25f, 21.75f, 5.8391f, 21.75f, 11.5f)
                curveTo(21.75f, 14.0605f, 20.8111f, 16.4017f, 19.2589f, 18.1982f)
                lineTo(22.5303f, 21.4697f)
                curveTo(22.8232f, 21.7626f, 22.8232f, 22.2374f, 22.5303f, 22.5303f)
                curveTo(22.2374f, 22.8232f, 21.7626f, 22.8232f, 21.4697f, 22.5303f)
                lineTo(18.1982f, 19.2589f)
                curveTo(16.4017f, 20.8111f, 14.0605f, 21.75f, 11.5f, 21.75f)
                curveTo(5.8391f, 21.75f, 1.25f, 17.1609f, 1.25f, 11.5f)
                close()
                moveTo(11.5f, 8.25f)
                curveTo(11.9142f, 8.25f, 12.25f, 8.5858f, 12.25f, 9.0f)
                verticalLineTo(10.75f)
                horizontalLineTo(14.0f)
                curveTo(14.4142f, 10.75f, 14.75f, 11.0858f, 14.75f, 11.5f)
                curveTo(14.75f, 11.9142f, 14.4142f, 12.25f, 14.0f, 12.25f)
                horizontalLineTo(12.25f)
                verticalLineTo(14.0f)
                curveTo(12.25f, 14.4142f, 11.9142f, 14.75f, 11.5f, 14.75f)
                curveTo(11.0858f, 14.75f, 10.75f, 14.4142f, 10.75f, 14.0f)
                verticalLineTo(12.25f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 12.25f, 8.25f, 11.9142f, 8.25f, 11.5f)
                curveTo(8.25f, 11.0858f, 8.5858f, 10.75f, 9.0f, 10.75f)
                horizontalLineTo(10.75f)
                verticalLineTo(9.0f)
                curveTo(10.75f, 8.5858f, 11.0858f, 8.25f, 11.5f, 8.25f)
                close()
            }
        }
            .build()
        return _magniferZoomIn!!
    }

private var _magniferZoomIn: ImageVector? = null
